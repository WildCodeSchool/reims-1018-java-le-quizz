import java.util.Scanner; 

class QuizzDisplay {

	public static void displayHello () {
    	System.out.println("Hello World! It's time to play!");
  	}

	public static String askForNickname () {
		System.out.println("Please enter nickname and press enter before starting the quizz ");

		Scanner sc = new Scanner(System.in);
		String toto = sc.nextLine();
		return toto;
	}

	public static void displayNickname (String nick) {
      System.out.println("Welcome " + nick + " , are you ready to face our quizz ?");
	}

}
