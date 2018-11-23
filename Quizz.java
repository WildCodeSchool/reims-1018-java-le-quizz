import java.util.Scanner;
import java.util.*;

/* Pour compiler:
javac -cp .:json-simple-1.1.1.jar Quizz.java
java -cp .:json-simple-1.1.1.jar Quizz
javac -cp .:quizz.json.jar Quizz.java
java -cp .:quizz.json.jar Quizz*/
class Quizz {

  public static void main (String[] args) {
    QuizzDisplay.homePage();
    String nickname = QuizzDisplay.askForNickname();
    nickname = "joueur/joueuse " + nickname;
    QuizzDisplay.displayNickname(nickname);
    QuizzDisplay.displayLaunch();
    var questionQuizz = new QuestionQuizz();
    System.out.println(questionQuizz.getFirstQuestion());
  }

}
