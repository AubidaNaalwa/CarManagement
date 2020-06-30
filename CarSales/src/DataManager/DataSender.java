package DataManager;
import java.util.ArrayList;
import java.util.Iterator;

import classes.Car;
import classes.Customer;
import classes.Observable;
import classes.Observer;
import classes.SportCar;

public class DataSender implements Observable{

	
	private Customer  DataCustomer;
	private Car DataVechile;
	private SportCar SpCar;
	ArrayList<Observer> Observers ;
	
	
	
	public DataSender(){
		DataCustomer=null;
		DataVechile=null;
		setSpCar(null);
		Observers = new ArrayList<Observer>();
		Observers.add(new DataCarManager());
		Observers.add(new SportCarDataManager());
		Observers.add(new DataCustomerManager());

	}
			
	@Override
	public void Notify() {
		
	Iterator<Observer> ite=Observers.iterator();	
	while(ite.hasNext()) {
		Observer Ob = ite.next();
		Ob.Update(this);
	}
		setAllAttributesNull();
	}

	@Override
	public void Attach(Observer O) {
		// TODO Auto-generated method stub
		Observers.add(O);
	}

	@Override
	public void Delete(Observer O) {
		// TODO Auto-generated method stub
		Observers.remove(O);
	}

	public Car getDataVechile() {
		return DataVechile;
	}

	public void setDataVechile(Car dataVechile) {
		DataVechile = dataVechile;
	}

	public Customer getDataCustomer() {
		return DataCustomer;
	}

	public void setDataCustomer(Customer dataCustomer) {
		DataCustomer = dataCustomer;
	}

	private void setAllAttributesNull() {
		DataCustomer =null;
		DataVechile=null;
		SpCar = null;
	}

	public SportCar getSpCar() {
		return SpCar;
	}

	public void setSpCar(SportCar spCar) {
		SpCar = spCar;
	}
	
	
	
	
	
	

}
