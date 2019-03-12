import java.io.IOException;
import java.io.*;
import java.io.Serializable;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class IOTest{

static ParkingLot QM=new ParkingLot(8,8,8);
static ParkingLot QM1=new ParkingLot(); //用于传递qm 操作时对qm1操作
   public static void output(){
    // ParkingLot QM1=new ParkingLot(8,8,8); //该行用于重置
      QM1.takeBikeFromA();
      QM1.returnBikeToB();
      QM1.getBikeOnTheWay();
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
     System.out.println(QM.getBikeInA());
     System.out.println(QM.getBikeInB());
     System.out.println(QM.getBikeOnTheWay());
     QM1=QM;
   }catch(IOException e){
     e.printStackTrace();
   }



   }

       public static void main(String args[])throws IOException{
    try{
     input();
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }

    output();
  /*  try{
    input();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
    */
  }
}
