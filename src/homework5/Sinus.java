package homework5;

import java.lang.Math;
public class Sinus {
    public static void main(String[] args) {
        int array = 37;
        double[] sinusArray = new double[array];

        for (int i = 0, step = 0; i < array; i++, step+=10) {
            double sinValue = Math.sin(step);
            sinusArray[i] = sinValue;

            System.out.println(sinusArray[i]);

        }

    }
}
