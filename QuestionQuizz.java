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

  public QuestionQuizz(){
    System.out.println("ça marche ou pas?");
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
    List<Question> arrayList = new ArrayList<Question>();

    JSONArray root = (JSONArray) jsonParsed;
    for (int i=0;i<root.size();i++){
      JSONObject questionObject = (JSONObject)root.get(i);
      String questionQuestion = (String) questionObject.get("content");

      arrayList.add(new Question(0,questionQuestion));
    //  List <String>=new ArrayList <String>(i);
    //  String answersQuestion = (String) answersQuestion.get("answers");

    }
    for(var question : arrayList) {
      System.out.println(question.getContent());
    }
  }
  public Question getFirstQuestion (){
    return null;
    //return this.questions.get(0);
  }
}
