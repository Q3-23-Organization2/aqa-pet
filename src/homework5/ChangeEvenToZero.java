package homework5;

public class ChangeEvenToZero {
    public static void main(String[] args) {
        int[] numbers = {23, 4, 12, 58, 93, 56, 113, 43};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }

            System.out.println(numbers[i]);
        }
    }
}
