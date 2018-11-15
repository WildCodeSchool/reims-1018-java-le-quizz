import java.util.Scanner;
import java.util.*;

class QuizzDisplay{

  	public static void homePage (){
  	System.out.println("Welcome to the quizz");
    System.out.println("Who wants to win Galleons ?");
    System.out.println("");
    System.out.println("To start playing, first enter your nickname. The questions will appear as one goes along.");
    System.out.println("");
    System.out.println("Answers will be offered, choose the right one! If you hesitate, you can always use one of the 3 jockers");
    System.out.println("that you can only use once.");
    System.out.println("");
    System.out.println("Felix Felicis : You're lucky: it eliminates two wrong answers.");
    System.out.println("The chicaneur: He will suggest the answer he thinks is the right one ... but would not it be a rumor ...");
    System.out.println("The golden snitch: Catch it and you win! Go to the next question. Do not catch it anytime!");
    System.out.println("");
    System.out.println("Whenever you get the right answer, you win one gallion and move on to the next question.");
    System.out.println("At any time you can get out of the game and go with the galleys you got.");
    System.out.println("The game will end when you get 15 galleons (7,395 noises !!)");
    System.out.println("Good luck!");
  }

  
    public static String askForNickname () {
      System.out.println("Please enter nickname and press enter before starting the quizz ");
      Scanner sc = new Scanner(System.in);
      String toto = sc.nextLine();
      return toto;
    }

    public static void displayNickname (String nick) {
        System.out.println("Welcome " + nick + " , are you ready to face our quizz ?");
      
      public static void displayLaunch (){
    System.out.println("Enter 'play' to start the quizz");
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    System.out.println("Here we go!");
    }

}
