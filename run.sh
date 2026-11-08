#!/usr/bin/env bash
# AP CSA practice runner. Run it from the project folder.

cd "$(dirname "$0")" || exit 1

usage() {
  cat <<'EOF'
Usage:
  bash run.sh 3              test YOUR code for problem 3
  bash run.sh all            test every problem (one summary line each)
  bash run.sh solution 3     run the sample solution for problem 3
  bash run.sh solution all   run every sample solution
EOF
}

DIR="src"
PREFIX="P"
if [ "${1:-}" = "solution" ]; then
  DIR="solutions"
  PREFIX="S"
  shift
fi

TARGET="${1:-}"
if [ -z "$TARGET" ]; then
  usage
  exit 1
fi

OUT="out/$DIR"
mkdir -p "$OUT"

# Compile one problem file together with the shared Check.java helper.
compile() {
  javac -d "$OUT" src/Check.java "$1" 2> "$OUT/errors.txt"
}

if [ "$TARGET" = "all" ]; then
  for file in "$DIR"/"$PREFIX"[0-9][0-9]_*.java; do
    cls="$(basename "$file" .java)"
    if compile "$file"; then
      line="$(java -cp "$OUT" "$cls" 2>&1 | grep 'tests passed' | head -1 | sed 's/^ *//')"
      printf '%-28s %s\n' "$cls" "${line:-ran, but printed no result}"
    else
      printf '%-28s %s\n' "$cls" "does not compile yet"
    fi
  done
  exit 0
fi

if ! [[ "$TARGET" =~ ^[0-9]+$ ]]; then
  usage
  exit 1
fi

NUM="$(printf '%02d' "$((10#$TARGET))")"
files=("$DIR"/"$PREFIX""$NUM"_*.java)
if [ ! -f "${files[0]}" ]; then
  echo "There is no problem number $TARGET in $DIR/."
  exit 1
fi

file="${files[0]}"
cls="$(basename "$file" .java)"
if compile "$file"; then
  java -cp "$OUT" "$cls"
else
  echo
  echo "=== $cls ==="
  echo "  This file did not compile. Fix these errors first:"
  grep -v '^Picked up' "$OUT/errors.txt" | sed 's/^/    /'
  exit 1
fi
