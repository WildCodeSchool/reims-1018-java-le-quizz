import java.util.Scanner; 

class Nickname {

	Scanner sc = new Scanner(System.in);

	public String enterLogin () {

	return "Please enter nickname and press enter before starting the quizz ";


	}

	public String loginFeedback () {

	String nick = sc.nextLine();

	return "Welcome " + nick + " , are you ready to face our quizz ?";

	}

}

