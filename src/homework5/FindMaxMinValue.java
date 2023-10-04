package homework5;

public class FindMaxMinValue {
    public static void main(String[]args){
        int[] values = new int[5];
        values[0] = 77;
        values[1] = 55;
        values[2] = 33;
        values[3] = 99;
        values[4] = 11;

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
