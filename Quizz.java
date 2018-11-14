import java.util.Scanner; 
import java.util.*;

class Quizz {

  public static void main (String[] args) {
      QuizzDisplay.homePage();
      String nickname = QuizzDisplay.askForNickname();
      nickname = "joueur/joueuse " + nickname;

      QuizzDisplay.displayNickname(nickname);
  }

}
