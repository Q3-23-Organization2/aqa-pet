package homework5;

public class DiagonalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 13, 6, 7}, {-2, 12, 5, 7}, {3, -1, 9, 21}, {4, -12, -8, 14}};

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                if (i == j) {
                    System.out.print(twoDimArray[i][j] + ", ");
                }
            }
        }
    }
}
