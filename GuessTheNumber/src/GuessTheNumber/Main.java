package GuessTheNumber;
import java.util.Random;
import java.util.Scanner;
class Game{
    public int Number;
    public int InputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rand=new Random();
this.Number=rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the Number: ");
        Scanner sc=new Scanner(System.in);
        InputNumber=sc.nextInt();
}
boolean IsCorrectNumber(){
    noOfGuesses++;
    if (InputNumber==Number){
        System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", Number, noOfGuesses);
    return true;
}
    else if(InputNumber<Number){
        System.out.println("Too low...");
    }
    else if(InputNumber>Number){
        System.out.println("Too high...");
    }
    return false;
}
}
public class Main {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.IsCorrectNumber();
        }

    }
}