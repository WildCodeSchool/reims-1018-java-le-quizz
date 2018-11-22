class Question{
  private int id;
  private String content;
//  private JSONArray answers;

  public Question(int id, String content /*, JSONArray answers*/){
    this.id = id;
    this.content = content;
  //  this.answers = answers;
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
/*  public JSONArray getAnswers(){
    return this.answers;
  }
  public void setAnswers (JSONArray){
    this.answers=answers;
  }*/
}
