package lesson1;

public class Num9Num10 {
    public static void main(String[] args) {
        int num9=9;
        int num10=12;
        if(Math.abs(num9-10) > Math.abs(num10-10)) System.out.println(num10);
        else if(Math.abs(num9-10) < Math.abs(num10-10)) System.out.println(num9);
        else System.out.println("=");
    }
}
