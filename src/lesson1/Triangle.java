package lesson1;

public class Triangle {
    public static void main(String[] args) {
        int a=3,b=3,c=3;
        if(a==b && b==c) System.out.println("equilateral");
        else if(a==b || a==c || b==c){
            if(a!=b || a!=c || b!=c) System.out.println("isosceles");
        }
        else System.out.println("scalene");
    }
}
