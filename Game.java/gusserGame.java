import java.util.Scanner;

class Guesser{
    int gusNum;
    public int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Afzal plz guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class player 
{
    int pguessNum;
    public int guessNumber()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Player Guess the number plz!");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}

class Umpair
{
    int numFromGuesser, numFromPlayer1, numFromPlayer2, numFromPlayer3;
    public void collectNumFromGesser()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        numFromPlayer1=p1.guessNumber;
        numFromPlayer1=p2.guessNumber;
        numFromPlayer1=p3.guessNumber;
    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            System.out.println("You are right bro");
        }
        else
        {
            System.out.println("try again !");
        }
        if(numFromGuesser==numFromPlayer2)
        {
            System.out.println("Player 2 Correct answer");
        }
        else
        {
            System.out.println("Not Good !");
        }
        if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Number 3 OSM !");
        }
        else
        {
            System.out.println("Bad Luck");
        }
    }
}

public class gusserGame {
    public static void main(String[] args) {
        Umpair u=new Umpair();
        u.CollectNumFromAfzal();
        u.collectNumFromPlayer();
        u.compare();
    }