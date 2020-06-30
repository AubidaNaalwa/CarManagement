package classes;

public class CArFactory {

	public Car createACar(int speed , int year , int cost , String ID , int gazliter , float length , float width , 
			float wight , String company, String companyKind ,gearType g ,
		int TankV ,String CarColor , String led ,String Sound ,String Pad)
	{
			return new Car(speed ,  year ,  cost ,  ID ,  gazliter ,  length ,  width , 
					 wight ,  company,  companyKind , g,TankV, CarColor, led, Sound, Pad);
	
	}
	public SportCar CreateASportCar(int speed , int year , int cost , String ID , int gazliter , float length , float width , 
			float wight , String company, String companyKind ,gearType g ,
		int TankV ,String CarColor , String led ,String Sound ,String Pad , int Turbo , int Acc) {
		return new SportCar(speed ,  year ,  cost ,  ID ,  gazliter ,  length ,  width , 
				 wight ,  company,  companyKind , g,TankV, CarColor, led, Sound, Pad ,Turbo,Acc );
	}
}
