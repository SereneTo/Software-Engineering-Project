import java.io.Serializable;

public class ParkingLot implements Serializable{

  private  int parkingNumInA;
  private  int parkingNumInB;
  private  int parkingNumInC;

    int bikeOnTheWay;

    public ParkingLot(){

    }

    public ParkingLot(int parkingNumInA,int parkingNumInB,int parkingNumInC){
      this.parkingNumInA=parkingNumInA;
      this.parkingNumInB=parkingNumInB;
      this.parkingNumInC=parkingNumInC;
    }

    public int getBikeInA(){
      return this.parkingNumInA;
    }

    public int getBikeInB(){
      return this.parkingNumInB;
    }

    public int getBikeInC(){
      return this.parkingNumInC;
    }

    public void setBikeOnTheWay(int bikeOnTheWay){
      this.bikeOnTheWay=bikeOnTheWay;
    }

    public int getBikeOnTheWay(){
      return this.bikeOnTheWay;
    }

    public void takeBikeFromA(){
      this.parkingNumInA=this.parkingNumInA-1;
      this.bikeOnTheWay=this.bikeOnTheWay+1;
    }

    public void takeBikeFromB(){
      this.parkingNumInB=this.parkingNumInB-1;
      this.bikeOnTheWay=this.bikeOnTheWay+1;
    }

    public void takeBikeFromC(){
      this.parkingNumInC=this.parkingNumInC-1;
      this.bikeOnTheWay=this.bikeOnTheWay+1;
    }

    public void returnBikeToA(){
      this.parkingNumInA=this.parkingNumInA+1;
      this.bikeOnTheWay=this.bikeOnTheWay-1;
    }

    public void returnBikeToB(){
      this.parkingNumInB=this.parkingNumInB+1;
      this.bikeOnTheWay=this.bikeOnTheWay-1;
    }

    public void returnBikeToC(){
      this.parkingNumInC=this.parkingNumInC+1;
      this.bikeOnTheWay=this.bikeOnTheWay-1;
    }
}
