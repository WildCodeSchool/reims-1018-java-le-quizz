import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;

class QuestionQuizz {
  private static String QUIZZ_PATH = "quizz.json";
  private ArrayList <Question> questionsTable ;

  public QuestionQuizz(){
  //  System.out.println("ça marche ou pas?");
    FileReader jsonFile = null;
    try {
      // lecture du fichier json
      jsonFile = new FileReader(QUIZZ_PATH);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    JSONParser parser = new JSONParser();
    Object jsonParsed = null;
    try {
      jsonParsed = parser.parse(jsonFile);
    } catch (ParseException | IOException e) {
      e.printStackTrace();
    }
    if (jsonParsed != null){
      System.out.println("le parse a réussi!");
    }

    JSONArray root = (JSONArray) jsonParsed;
    this.questionsTable = new ArrayList <Question>();
    for (int i=0;i<root.size();i++){
      List<String> answers = new ArrayList<String>();
      JSONObject questionObject = (JSONObject)root.get(i);
      String realQuestion = (String) questionObject.get("content");
      int idQuestion= Math.toIntExact ( (long) questionObject.get("id") );
      JSONArray answersQuestion = (JSONArray) questionObject.get("answers");
      for (int j = 0; j < answersQuestion.size(); j++) {
          String answer = (String) answersQuestion.get(j);
          answers.add(answer);
        }
      Question question= new Question (idQuestion, realQuestion, answers);
      this.questionsTable.add(question);

    }
  }
  public Question getFirstQuestion (){
//    return null;
    return this.questionsTable.get(0);
  }


  public Question getQuestionById (int id){
    for (var question: this.questionsTable){
      if (question.getId() == id){
      return question;
      }
    }
    return null;
  }
}
