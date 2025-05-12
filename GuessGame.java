import java.util.Scanner;


class Guesser{
    int guessNum;

    public int  guesserNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Guesser kindly guess the number in beetween 1-9 : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player{
    int pguessNum;

    public int  playerNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.println("player kindly guess the number in beetween 1-9 : ");
        pguessNum = sc.nextInt();
        return pguessNum;
    }
}

class Umpire{

    int guesserNumber;
    int playerNumber1;
    int playerNumber2;
    int playerNumber3;
        
    public void collectionOfGuesserNum(){
        Guesser guessNum = new Guesser();
        guesserNumber =guessNum.guesserNumber();
        
        
     
        
}

    public void collectionOfPlayerNum(){
        Player pguessNum1 = new Player();
        Player pguessNum2 = new Player();
        Player pguessNum3 = new Player();


        playerNumber1 = pguessNum1.playerNumber();
        playerNumber2 = pguessNum2.playerNumber();
        playerNumber3= pguessNum3.playerNumber();
}
    public void Compare(){
        
       if(guesserNumber == playerNumber1){
            if(guesserNumber == playerNumber2 && guesserNumber == playerNumber3 ){
                System.out.println("Tied the game all player answered correctly");
            }
            else if(guesserNumber == playerNumber2){
            System.out.println(" Player 1 and 2 Won the game");
            }
            else if(guesserNumber == playerNumber3){
                System.out.println("player 1 and 3 won the game");
            } 
            else{
                System.out.println(" Player 1 Won the game");
            }
        }
        
       else if(guesserNumber == playerNumber2){
            if(guesserNumber == playerNumber1 && guesserNumber == playerNumber3 ){
                System.out.println("Tied the game all player answered correctly");
            }
            else if(guesserNumber == playerNumber1){
            System.out.println(" Player 1 and 2 Won the game");
            }
            else if(guesserNumber == playerNumber3){
                System.out.println("player 2 and 3 won the game");
            }

            else{
                System.out.println(" Player 2 Won the game");
            }
       }
       else if(guesserNumber == playerNumber3){
            if(guesserNumber == playerNumber1 && guesserNumber == playerNumber2 ){
                System.out.println("Tied the game all player answered correctly");
            }
            else if(guesserNumber == playerNumber1){
            System.out.println(" Player 1 and 3 Won the game");
            }
            else if(guesserNumber == playerNumber2){
                System.out.println("player 2 and 3 won the game");
            }
            else{
                System.out.println(" Player 3 Won the game");
            }
        }
      else{
        System.out.println("Lost Game ! Try Again");
      }
    }


}

public class GuessGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectionOfGuesserNum();
        umpire.collectionOfPlayerNum();
        umpire.Compare();
        
    }
}
