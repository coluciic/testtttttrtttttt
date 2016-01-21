package lab1;

public class UserApp{
	public static void main(String[] args){
		Travel myTravel=new Travel();
		myTravel.setMiles();
		myTravel.setFuel();
		myTravel.setHours();
		myTravel.calcMPG();
		myTravel.calcMPH();
	}
}