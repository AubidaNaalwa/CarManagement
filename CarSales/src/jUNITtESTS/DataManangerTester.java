package jUNITtESTS;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import DataManager.DataCarManager;
import DataManager.DataCustomerManager;
import DataManager.DataSender;
import DataManager.SportCarDataManager;
import classes.Car;
import classes.CarType;
import classes.Customer;
import classes.SportCar;
import classes.gearType;

class DataManangerTester {
	@Test
	// in this test we test all the data Managers if they are working 
	//by adding elements into data base and deleting them from the data base 
	//also we test the sender observer pattern 
	void testSender() {
		DataSender Sender = new DataSender();
		Sender.setDataCustomer(new Customer (99999 ,"NULL","NULL","NULL","NULL","NULL","NULL",99999,CarType.carSport,99999));
		Sender.setDataVechile(new Car (0,0,0,"0",0,0,0,0,"0","0",gearType.Automatic,0,"0","0","0","0"));	
		Sender.setSpCar(new SportCar(99999,99999,99999,"99999",99999,99999,99999,99999,"99999","99999",gearType.Automatic,99999,"99999","99999","99999","99999" , 99999 ,99999));
		Sender.Notify();
		Car s = DataCarManager.ReturnTheCar("0");
		SportCar d = SportCarDataManager.ReturnTheCar("99999");
		ArrayList<Customer> u = new ArrayList<Customer>();
		u=DataCustomerManager.ReadFromFile();
		
		assertEquals(0 , Integer.parseInt(s.CarId()));
		assertEquals(99999 , Integer.parseInt(d.CarId()));
		for (Customer S : u) {
			if(S.getCarID().equals("99999"))
				{
				assertEquals(99999 , Integer.parseInt(S.getID()));
				break;
				}
		}
		DataCarManager.removeACar("0");
		SportCarDataManager.removeACar("99999");
		DataCustomerManager.removeACustomer("NULL");
		
		d = SportCarDataManager.ReturnTheCar("99999");
		s = DataCarManager.ReturnTheCar("0");
		
		assertEquals(d, null);
		assertEquals(s,null);
		u = DataCustomerManager.ReadFromFile();
		for (Customer S : u) {
			if(S.getCarID().equals("99999"))
				{
				assertEquals(99999 , Integer.parseInt(S.getID()));
				break;
				}
		}
		
	}
	

	
	
	
	
	
	
	
	
	
}
