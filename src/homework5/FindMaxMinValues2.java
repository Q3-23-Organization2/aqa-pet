package homework5;

public class FindMaxMinValues2 {
    public static void main(String[]args){
        int[] values = {23, 0, 12, 58, 93, 97, 113, 43};

        int max = values[0];
        int min = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }

            else if (values[i] < min) {
                min = values[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);

    }
}
