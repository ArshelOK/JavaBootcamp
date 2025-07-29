package lesson1;

public class Year1 {
    public static void main(String[] args) {
        int year1=2025;
        if(year1%4==0 && year1%100!=0) System.out.println("leap");
        else System.out.println("normal year");
    }
}
