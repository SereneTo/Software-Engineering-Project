import java.io.Serializable;

public class Student implements Serializable{

  private String QMNum="161194886";
  private String name;
  private String email;
  private int currentTime=0;
  private int totalTime=0;
  private boolean differentDay=false;
  private int dataMonth=0;
  private int dataDay=0;

  public Student(){

  }

  public Student(String QMNum, String name, String email){
    this.QMNum=QMNum;
    this.name=name;
    this.email=email;
  }

  public void setQMNum(String QMNum){
    this.QMNum=QMNum;
  }

  public String getQMNum(){
    return this.QMNum;
  }

  public void setStudentName(String name){
    this.name=name;
  }

  public String getStudentName(){
    return this.name;
  }

  public void setEmail(String email){
    this.email=email;
  }

  public String getEmail(){
    return this.email;
  }

  public void setCurrentTime(int currentTime){
    this.currentTime=currentTime;
  }

  public int getCurrentTime(){
    return this.currentTime;
  }

  public void setTotalTime(int totalTime){
    this.totalTime=totalTime;
  }

  public int getTotalTime(){
    return this.totalTime;
  }

  public void setDifferentDay(boolean differentDay){
    this.differentDay=differentDay;
  }

  public boolean getDifferentDay(){
    return this.differentDay;
  }

  public boolean getDifferentDay(int dataMonth, int dataDay){
    if(this.dataMonth==dataMonth  &&  this.dataDay==dataDay)
      return false;
    else
      return true;
  }

  public void setDataMonth(int dataMonth){
    this.dataMonth=dataMonth;
  }

  public int getDataMonth(){
    return this.dataMonth;
  }

  public void setDataDay(int dataDay){
    this.dataDay=dataDay;
  }

  public int getDataDay(){
    return this.dataDay;
  }
}
