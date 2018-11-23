import java.util.*;

class Question{
  private int id;
  private String content;
  private List <String> answers;

  public Question(int id, String content , List <String> answers){
    this.id = id;
    this.content = content;
    this.answers = answers;
  }
  public int getId(){
    return this.id;
  }
  public void setId (int id){
    this.id=id;
  }
  public String getContent(){
    return this.content;
  }
  public void setContent (String content){
    this.content=content;
  }
  public List<String> getAnswers(){
    return this.answers;
  }
  public void setAnswers (List<String> answers){
    this.answers=answers;
  }
}
