package jUNITtESTS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.CArFactory;
import classes.Car;
import classes.Insurance;
import classes.SportCar;
import classes.gearType;

class FactoryTest {

	@Test
	// in this test we tests if the factory pattern working 
	// by sending parameters to the factory and creating cars 
	void test() {
		CArFactory s = new CArFactory();
		Car u = s.createACar(0,0,0,"0",0,0,0,0,"0","0",gearType.Automatic,0,"0","0","0","0");
		SportCar d = s.CreateASportCar(0,0,0,"0",0,0,0,0,"0","0",gearType.Automatic,0,"0","0","0","0",0,0);
		assertEquals(d.CarId(),"0");
		assertEquals(u.CarId(),"0");

	}
	
	
	@Test 
	// we tests the singleton Pattern in this tests if he returns the same object
	
	void TestInsurance() {
		Insurance S = Insurance.getInstance();
		Insurance D = Insurance.getInstance();
		assertEquals(S,D);
	}
}
