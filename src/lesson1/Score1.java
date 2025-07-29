package lesson1;

public class Score1 {
    public static void main(String[] args) {
        byte score1=33;
        if(score1>=90) System.out.println("gold");
        else if(score1>=75) System.out.println("silver");
        else if(score1>=60) System.out.println("bronze");
        else System.out.println("none");
    }
}
