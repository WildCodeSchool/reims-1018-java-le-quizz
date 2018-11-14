import java.util.Scanner;
import java.util.*;

class QuizzDisplay{
  public static void homePage (){
    System.out.println("Hello World! It's time to play!");
    }
  public static void displayLaunch (){
    System.out.println("Enter 'play' to start the quizz");
    Scanner sc = new Scanner (System.in);
    String str = sc.nextLine();
    System.out.println("Here we go!");
    }
}
