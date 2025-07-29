package lesson1;

public class Grade {
    public static void main(String[] args) {
        byte grade=33;
        if(grade>=0 && grade<=19) System.out.println("F");
        else if(grade>=20 && grade<=39) System.out.println("D");
        else if(grade>=40 && grade<=59) System.out.println("C");
        else if(grade>=60 && grade<=79) System.out.println("B");
        else if(grade>=80 && grade<=99) System.out.println("A");
        else if(grade==100) System.out.println("excellent");
    }
}
