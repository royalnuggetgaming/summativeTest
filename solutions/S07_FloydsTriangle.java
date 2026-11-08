// SOLUTION to P07: Floyd's Triangle
// Try the problem yourself first. If you are stuck, read the explanation below,
// close this file, and try again from a blank method.
//
// How it works:
//   - num is declared outside both loops, so it keeps counting from row to row.
//   - Row i prints i numbers, then println() starts the next row.
public class S07_FloydsTriangle {

    public static void floydsTriangle(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check.header("SOLUTION P07 Floyd's Triangle");
        Check.printed("floydsTriangle(1)",
                () -> floydsTriangle(1),
                "1",
                "1");
        Check.printed("floydsTriangle(2)",
                () -> floydsTriangle(2),
                "1\n2 3",
                "1\n23");
        Check.printed("floydsTriangle(3)",
                () -> floydsTriangle(3),
                "1\n2 3\n4 5 6",
                "1\n23\n456");
        Check.printed("floydsTriangle(5)",
                () -> floydsTriangle(5),
                "1\n2 3\n4 5 6\n7 8 9 10\n11 12 13 14 15",
                "1\n23\n456\n78910\n1112131415");
        Check.printed("floydsTriangle(6)",
                () -> floydsTriangle(6),
                "1\n2 3\n4 5 6\n7 8 9 10\n11 12 13 14 15\n16 17 18 19 20 21",
                "1\n23\n456\n78910\n1112131415\n161718192021");
        Check.summary();
    }
}
