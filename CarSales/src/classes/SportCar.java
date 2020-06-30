package classes;
import java.io.Serializable;

public class SportCar extends Car implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private final int turbo;
private final int Accelerate;

	public SportCar(int speed , int year , int cost , String ID , int gazliter , float length , float width , 
			float wight , String company, String companyKind ,gearType g ,
		int TankV ,String CarColor , String led ,String Sound ,String Pad,int turbo,int Accelerate)  {
		super(speed,year,cost,ID,gazliter,length,width,wight,company,companyKind,g,TankV,CarColor,led,Sound,Pad);
		this.turbo=turbo;
		this.Accelerate=Accelerate;
		
	}



@Override
	public String toString() {
		return "SportCar [turbo=" + turbo + ", Accelerate=" + Accelerate + ", GetSpeed()=" + GetSpeed()
				+ ", GetCarCost()=" + GetCarCost() + ", GazForLiter()=" + GazForLiter() + ", CarId()=" + CarId()
				+ ", GetLength()=" + GetLength() + ", Getwidth()=" + Getwidth() + ", GetYearOfpruduction()="
				+ GetYearOfpruduction() + ", GetWight()=" + GetWight() + ", GetCost()=" + GetCost() + ", CompanyName()="
				+ CompanyName() + ", GetGearType()=" + GetGearType() + ", TankVolume()=" + TankVolume()
				+ ", CompanyKind()=" + CompanyKind() + "]";
	}



public SportCar(Car c,int turbo,int Accelerate) {
	super(c);
	this.turbo=turbo;
	this.Accelerate=Accelerate;
	
}
public SportCar(SportCar s) {

	super((Car)s);
	this.turbo=s.turbo;
	this.Accelerate =s.Accelerate;
}
	public int getTurbo() {
		return turbo;
	}

	public int getAccelerate() {
		return Accelerate;
	}
	public Vechile GetInstance() {
		return this;
	}
	
	
}
