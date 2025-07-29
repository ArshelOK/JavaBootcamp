package lesson1;

public class Battery1 {
    public static void main(String[] args) {
        byte battery1=33;
        if(battery1<=20) System.out.println("red");
        else if(battery1<=50) System.out.println("yellow");
        else if(battery1<=100) System.out.println("green");
    }
}
