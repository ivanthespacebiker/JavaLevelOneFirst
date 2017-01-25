package geekbrains.java_lavel_one;

public class FirstHomework {

    private static boolean BooVariable = true;
    private static int IntVariable = 5;
    private static float FlVariable = 89.67f;
    private static double DbVariable = 1234567890.123;
    private static char ChVariable = 'l';
    private static int Year = 1988;

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean interval(int a){
        return (a >= 10 && a <= 20);
    }

    private static boolean isLeap(int Year){
        return (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0);
    }

    public static void main(String[] args) {

        float result = calculate(20,40,2,99);
        System.out.println("Результат вычисления: " + result);

        if (interval(IntVariable)){
            System.out.println("Число " + IntVariable + " входит в интервал 10..20");
        } else System.out.println("Число " + IntVariable + " не входит в интервал 10..20");

        if (isLeap(Year)){
            System.out.println("Год " + Year + " високосный");
        } else System.out.println("Год " + Year + " не високосный");

    }
}
