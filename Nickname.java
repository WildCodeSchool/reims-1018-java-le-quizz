import java.util.Scanner; 

class Nickname {

	public static void enterLogin () {

	System.out.println("Please enter nickname and press enter before starting the quizz ");
	}

	public static void loginFeedback () {

	Scanner sc = new Scanner(System.in);
	String nick = sc.nextLine();
	System.out.println("Welcome " + nick + " , are you ready to face our quizz ?");
	}

}

