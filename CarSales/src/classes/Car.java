package classes;
import java.io.Serializable;

public class Car implements Vechile , Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int Speed;
	private final int  yearProduction;
	private final int carCost;
	private final String CarID;
	private final int Gazforliter;
	private final float length;
	private final float width;
	private final float wight;
	private final String CompanyName;
	private final String companyKind;
	private final gearType Gear ;
	private final int TankVol;
	private Accessories Acc;
	
	@Override
	public String toString() {
		return "Car [Speed=" + Speed + ", yearProduction=" + yearProduction + ", carCost=" + carCost + ", CarID="
				+ CarID + ", Gazforliter=" + Gazforliter + ", length=" + length + ", width=" + width + ", wight="
				+ wight + ", CompanyName=" + CompanyName + ", companyKind=" + companyKind + ", Gear=" + Gear
				+ ", TankVol=" + TankVol + ", Acc=" + Acc + "]";
	}


	public Car(int speed , int year , int cost , String ID , int gazliter , float length , float width , 
		float wight , String company, String companyKind ,gearType g ,
		int TankV ,String CarColor , String led ,String Sound ,String Pad) {
		this.Speed = speed;
		this.yearProduction=year;
		this.carCost=cost;
		this.CarID=new String(ID);
		this.Gazforliter=gazliter;
		this.length=length;
		this.width=width;
		this.wight=wight;
		this.CompanyName=new String(company);
		this.companyKind=new String(companyKind);
		this.Gear=g;
		this.TankVol = TankV;
		if(led != null && CarColor != null && Sound != null && Pad != null )
		Acc = new Accessories(led , CarColor , Sound ,Pad);
		else 
			Acc =null;
		
	}
	
	public boolean equal(Car C ) {
		if(C.CarID.contains(CarID) ) {
			return true;
		}
		return false;
	}
	
	public Car(Car o) {
		this.Speed = o.Speed;
		this.yearProduction=o.yearProduction;
		this.carCost=o.carCost;
		this.CarID=new String(o.CarID);
		this.Gazforliter=o.Gazforliter;
		this.length=o.length;
		this.width=o.width;
		this.wight=o.wight;
		this.CompanyName=new String(o.CompanyName);
		this.companyKind=new String(o.companyKind);
		this.Gear=o.Gear;
		this.TankVol = o.TankVol;
		this.Acc = new Accessories(o.Acc);
	}

	@Override
	public int GetSpeed() {
			return this.Speed;
	}

	@Override
	public int GetCarCost() {
			return this.carCost;
			
	}

	@Override
	public int GazForLiter() {		
		return this.carCost;
	}

	@Override
	public String CarId() {
			return this.CarID;
			
	}

	@Override
	public float GetLength() {
		return this.length;
	}

	@Override
	public float Getwidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int GetYearOfpruduction() {
		// TODO Auto-generated method stub
		return this.yearProduction;
	}

	@Override
	public float GetWight() {
		// TODO Auto-generated method stub
		return this.wight;
	}

	@Override
	public int GetCost() {
		if (Acc != null) {
			return Acc.CostAllStaff() + this.carCost;
		}
		return this.carCost;
	}

	@Override
	public String CompanyName() {
		// TODO Auto-generated method stub
		return this.CompanyName;
	}

	@Override
	public Vechile GetInstance() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public gearType GetGearType() {
		// TODO Auto-generated method stub
		return this.Gear;
	}

	@Override
	public int TankVolume() {
		// TODO Auto-generated method stub
		return this.TankVol;
	}

	@Override
	public String CompanyKind() {
		// TODO Auto-generated method stub
		return this.companyKind;
	}
	
	
	
	
}