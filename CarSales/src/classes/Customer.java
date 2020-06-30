package classes;
import java.io.Serializable;



public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Customer(final int Age , final String FullName ,
			final String PhoneNumber,final String CreditCard , final String ID ,
			final String Address,final String CarId, final int DealCost  ,final CarType a ,int cs)
	{
		this.Address = new String(Address);
		this.Age =(Age);
		this.ID= new String(ID);
		this.FullName = new String(FullName);
		this.CreditCard = new String(CreditCard);
		this.PhoneNumber = new String(PhoneNumber);
		customerNumber=cs;
		this.DealCost = DealCost;
		this.CarT = a;
		this.CarID = new String(CarId);
		
		
		
	}
	public Customer(Customer C) {
		// TODO Auto-generated constructor stub
		this.Address = new String(C.Address);
		this.Age = C.Age;
		this.ID= new String(C.ID);
		this.FullName = new String(C.FullName);
		this.CreditCard = new String(C.CreditCard);
		this.PhoneNumber = new String(C.PhoneNumber);
		this.CarT = C.CarT;
		this.DealCost = C.DealCost;
		this.CarID= new String(C.CarID);
		
		customerNumber=C.customerNumber; 
		
		
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	@Override
	public String toString() {
		return "Customer [Age=" + Age + ", ID=" + ID + ", PhoneNumber=" + PhoneNumber + ", FullName=" + FullName
				+ ", CreditCard=" + CreditCard + ", Address=" + Address + ", CarID=" + CarID + ", DealCost=" + DealCost
				+ ", CarT=" + CarT + ", customerNumber=" + customerNumber + "]";
	}
	public String getID() {
		return ID;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public String getFullName() {
		return FullName;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	
	
	public String getAddress() {
		return Address;
	}



	public int GetDealCost() {
		return DealCost;
	}
	public CarType getCarType() {
		return CarT;
		
	}
	public String getCarID() {
		return CarID;
		
	}
	public int getCustomerNumber() {
		return customerNumber;
	}

	public boolean equal(Customer S) {
		if(S.Age == Age &&  S.CarID.contains(CarID) &&S.FullName.contains(FullName) && S.ID.contains(ID) && S.customerNumber == customerNumber ) {
			return true;
		}
		else 
			return false;
	}

	private int Age;
	private final String ID , PhoneNumber,FullName ,CreditCard,Address ;
	private String CarID ;
	private int DealCost;
	private CarType CarT;
	private int customerNumber;
	
}
