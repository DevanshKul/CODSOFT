import java.util.Random;
import java.util.Scanner;

    class Guess_Game{
        public int randomNumber;
        public int inputNumber;
        public int noOfGuesses;
        String play;

        public int getNoOfGuesses(){
            return noOfGuesses;
        }
        public void setNoOfGuesses(int noOfGuesses){
            this.noOfGuesses = noOfGuesses;
        }

        Guess_Game(){
            Random ran = new Random();
            this.randomNumber = ran.nextInt(100);
        }
        void takeUserInput(){
            System.out.print("Guess the number: ");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
        }
        boolean isCorrectNumber(){
            noOfGuesses++;
            if (inputNumber > 100) {
                System.out.println("Please enter number between 1 - 100.");
            }
            else if (inputNumber == randomNumber){
                System.out.println("Booyah! You guessed it right, it was " + randomNumber + "."+ "\nYou guessed it in " + noOfGuesses + " attempts.");
                System.out.println("Do you want to play again? (y/n)");
                Scanner sc = new Scanner(System.in);
                play = sc.nextLine();
                if (play == "y"){
                    isCorrectNumber();
                }

            }
            else if(inputNumber > randomNumber){
                System.out.println("Too High.....");
            }
            else if (inputNumber < randomNumber) {
                System.out.println("Too Low.....");
            }
            if (noOfGuesses == 10) {
                System.out.println("Sorry, you ran out of attempts. The number was: " + randomNumber);
            }

            return false;
        }
    }

    public class Number_Game {
        public static void main(String[] args) {
            Guess_Game g = new Guess_Game();
            boolean b = false;
            while (!b){
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
        }
    }