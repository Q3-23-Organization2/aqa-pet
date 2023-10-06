package homework5;

public class DiagonalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 13, 6, 7}, {-2, 12, 5, 7}, {3, -1, 9, 21}, {4, -12, -8, 14}};
        int count = 0;
        int sum = 0;
        int n = twoDimArray.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (twoDimArray[i][j] < 0) {
                    count++;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (twoDimArray[i][j] % 2 != 0) {
                    sum += twoDimArray[i][j];

                }

            }
        }
        System.out.println("Count of negative numbers: " + count);
        System.out.println("Sum of odd numbers: " + sum);
    }
}
