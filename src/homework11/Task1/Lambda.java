package homework11.Task1;

import java.util.function.Supplier;

public class Lambda
{
    public static void main(String[] args) {


        Supplier<String> supplier = () -> {
            String s = "Text from Supplier by Lambda";
            return s;
        };

        System.out.println(supplier.get());
    }
}
