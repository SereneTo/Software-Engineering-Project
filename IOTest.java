import java.io.IOException;
import java.io.*;
import java.io.Serializable;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Calendar;

public class IOTest{

public static ParkingLot QM=new ParkingLot(8,8,8);
public static ParkingLot QM1=new ParkingLot(); //用于传递qm 操作时对qm1操作

public static Calendar calendar=Calendar.getInstance();
public static int month =calendar.get(Calendar.MONTH);
public static int date =calendar.get(Calendar.DATE);
public static int hour = calendar.get(Calendar.HOUR_OF_DAY);
public static int minute = calendar.get(Calendar.MINUTE);
public static int time=((month*30+date)*24+hour)*60+minute;

public static Student student= new Student("161194886","Zeyuan Dong","Dongzeyuan@bupt.edu.cn");
public static Student student1=new Student();



   public static void getStudentDataFromChart(){
     student1.setQMNum("161194886");
     student1.setStudentName("Zeyuan Dong");
     student1.setEmail("jp161194886@qmul.ac.uk");
   }



   public static void studentInput() throws IOException,ClassNotFoundException{

     try{
     File file1=new File("/Users/dongzeyuan1/Desktop/"+student1.getQMNum());
     FileInputStream fis1= new FileInputStream(file1);
     ObjectInputStream iis1= new ObjectInputStream(fis1);

     Student student=(Student)iis1.readObject();
     iis1.close();
     System.out.println(student.getQMNum());
     System.out.println(student.getStudentName());
     System.out.println(student.getEmail());
     System.out.println(student.getCurrentTime());
     System.out.println(student.getTotalTime());
     System.out.println(student.getDifferentDay());
     student1=student;
   }catch(IOException e){
  //   File file1=new File("/Users/dongzeyuan1/Desktop/"+student1.getQMNum());
  //   file1.createNewFile();
  //   System.out.println("The txt file "+student1.getQMNum()+".txt is created!");
     e.printStackTrace();
    }
   }




   public static void studentOutput(){
     student=student1;

     try{
       FileOutputStream fos1= new FileOutputStream(new File("/Users/dongzeyuan1/Desktop/"+student1.getQMNum()));
      ObjectOutputStream oos1;
      oos1=new ObjectOutputStream(fos1);
      oos1.writeObject(student);
      oos1.close();
    }catch(IOException e){
      e.printStackTrace();
    }
   }




   public static void output(){
    // ParkingLot QM1=new ParkingLot(8,8,8); //该行用于重置
    //QM1.takeBikeFromA();
    //QM1.returnBikeToB();
    //QM1.getBikeOnTheWay();
      QM=QM1;

      try{
        FileOutputStream fos= new FileOutputStream(new File("/Users/dongzeyuan1/Desktop/Database"));
       ObjectOutputStream oos;
       oos=new ObjectOutputStream(fos);
       oos.writeObject(QM);
       oos.close();
     }catch(IOException e){
       e.printStackTrace();
     }
   }







   public static void input()throws IOException,ClassNotFoundException{
     try{
     File file=new File("/Users/dongzeyuan1/Desktop/Database");
     FileInputStream fis= new FileInputStream(file);
     ObjectInputStream iis= new ObjectInputStream(fis);

     ParkingLot QM=(ParkingLot)iis.readObject();
     iis.close();
     //System.out.println(QM.getBikeInA());
     //System.out.println(QM.getBikeInB());
     //System.out.println(QM.getBikeOnTheWay());
     QM1=QM;
   }catch(IOException e){
     e.printStackTrace();
   }
}




//从A地借车，并储存借车信息。成功借车返回1，A地无车返回0，输入为QMNum的字符串
  public static int borrowBikeFromA(){
    try{
      input();
    }catch(ClassNotFoundException | IOException e){
    e.printStackTrace();
    }

    if(QM1.getBikeInA()<=0){
      return 0;
    }
    else{
      QM1.takeBikeFromA();
      output();
      getStudentDataFromChart();
      try{
        studentInput();
      }catch(ClassNotFoundException | IOException e){
      e.printStackTrace();
      }
      student1.setCurrentTime(time);

      if(student1.getDifferentDay(month,date)==false){

      }
      else{
        student1.setDataMonth(month);
        student1.setDataDay(date);
        student1.setTotalTime(0);
      }
      studentOutput();
      return 1;
    }
  }








  public static void main(String args[])throws IOException{
    /*
    try{
     input();
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }

    output();
    */



  /*  try{
    input();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
    */
    int a;

    a=borrowBikeFromA();

    System.out.println( month+" "+date+" "+hour+" "+minute+" "+time);



    try{
      studentInput();
      }catch(ClassNotFoundException e){
    e.printStackTrace();
    }

    System.out.println(student1.getDifferentDay());
    System.out.println(student1.getCurrentTime());
    System.out.println(student1.getTotalTime());
    System.out.println(student1.getDataMonth());
    System.out.println(student1.getDataDay());
    System.out.println(QM1.getBikeInA());
    System.out.println(a);

  }
}
