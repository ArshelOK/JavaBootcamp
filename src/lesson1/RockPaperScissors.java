package lesson1;

public class RockPaperScissors {
    public static void main(String[] args) {
        String myMove="rock";
        String yourMove="paper";
        if(yourMove=="rock") System.out.println("tie");
        else if(yourMove=="paper") System.out.println("you won");
        else if(yourMove=="scissors") System.out.println("I won");
    }
}
