import java.util.Scanner;

public class Quizlet {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );

        char[] userAns = new char[5];

        //no. 1 ans = c
        System.out.println("1. HOW MUCH DOES THE VANDAL COST?");
        System.out.println("A. 1600");
        System.out.println("B. 3200");
        System.out.println("C. 2900")
;        System.out.print("ANSWER: ");
        userAns[0] = scan.next().charAt(0);
        userAns[0] = Character.toLowerCase(userAns[0]);

        //no. 2 ans = a
        System.out.println("\n2. WHICH GUN IS NOT A SHOTGUN?");
        System.out.println("A. FRENZY");
        System.out.println("B. SHORTY");
        System.out.println("C. BUCKY");
        System.out.print("ANSWER: ");
        userAns[1] = scan.next().charAt(0);
        userAns[1] = Character.toLowerCase(userAns[1]);

        //no. 3 ans = c
        System.out.println("\n3. WHICH AGENT CAN PUT THREE SMOKES AT THE SAME TIME?");
        System.out.println("A. VIPER");
        System.out.println("B. OMEN");
        System.out.println("C. BRIMSTONE");
        System.out.print("ANSWER: ");
        userAns[2] = scan.next().charAt(0);
        userAns[2] = Character.toLowerCase(userAns[2]);

        //no. 4 ans = b
        System.out.println("\n4. WHICH AGENT HAS AN ABILITY CALLED \"UPDRAFT\"?");
        System.out.println("A. RAZE");
        System.out.println("B. JETT");
        System.out.println("C. SAGE");
        System.out.print("ANSWER: ");
        userAns[3] = scan.next().charAt(0);
        userAns[3] = Character.toLowerCase(userAns[3]);

        //no. 5 ans = a
        System.out.println("\n5. WHAT MAP HAS THREE BOMBSITES?");
        System.out.println("A. HAVEN");
        System.out.println("B. BREEZE");
        System.out.println("C. SPLIT");
        System.out.print("ANSWER: ");
        userAns[4] = scan.next().charAt(0);
        userAns[4] = Character.toLowerCase(userAns[4]);    

        result(userAns);
    }

    public static void result(char[] ans){
        char[] correctAns = {'c', 'a', 'c', 'b', 'a'};
        int score = 0;

        for(int x = 0; x < 5; x++){
            if(correctAns[x] == ans[x]){
                score++;
            }
        }
        System.out.println("-----------");
        System.out.println("SCORE: " + score + "/5");
    }

}