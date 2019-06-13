//Haley Powers
//MaryKate Sullivan

import java.util.Scanner;
class craps {
    public static void main(String[] args) {
        Scanner kin = new Scanner(System.in);
        int Dice1 = (int)((Math.random()*6) +1);
        int Dice2 = (int)((Math.random()*6) +1);

        System.out.println("Let's Play craps");
        System.out.println("");
        int d1 = (Dice1 + Dice2);
        System.out.println("First Roll: " + d1);

        
        if (d1 == 7 || d1 == 11){
            System.out.println("You Win");
        }
        if (d1 == 2 || d1 == 3 || d1 == 12) {
            System.out.println("You lose");
        }
        if (d1 == 4 || d1==5 || d1==6 || d1==8 || d1==9 || d1==11 || d1 == 10) {
            
            Dice1 = (int)((Math.random()*6) +1);
            Dice2 = (int)((Math.random()*6) +1);
            
            int di = -1;
            while (di != 7 && di != d1) {
                System.out.println("Roll Again");
                Dice1 = (int)((Math.random()*6) +1);
                Dice2 = (int)((Math.random()*6) +1);
                
                di = (Dice1 + Dice2);
                System.out.println("Next Roll " + di);
                
                if (di == 7) {
                    System.out.println("You lose!");
                }
                
                if (di == d1) {
                    System.out.println("You Win!");
                
                }
                    
                
            }
        }
    }
}