package lesson1;

public class Racers {
    public static void main(String[] args) {
        int racer1=12;
        int racer2=14;
        int racer3=33;
        int mijin=(racer1+racer2+racer3)/3;
        if(racer1<mijin){
            if(racer2>racer3) System.out.println(racer2);
            else System.out.println(racer3);
        }
        else if(racer2<mijin){
            if(racer1>racer3) System.out.println(racer1);
            else System.out.println(racer3);
        }
        else if(racer3<mijin){
            if(racer1>racer2) System.out.println(racer1);
            else System.out.println(racer2);
        }
    }
}
