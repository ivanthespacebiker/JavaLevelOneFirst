package geekbrains.java_lavel_one;

public class variables {

    private static int sum(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int a = 7;
        int b =2;
        a = sum(a,b);
        a++;
        a += b;
        System.out.println(a);
        char c = 'Z';
        System.out.println(c);
        String s = "string";
        System.out.println(s);
    }
}
