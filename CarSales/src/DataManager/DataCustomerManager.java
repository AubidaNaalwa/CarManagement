package DataManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import classes.Customer;
import classes.Observer;

public class DataCustomerManager implements Observer {

///---------------------------------------------------------------------------------------///////////////////////////
public static ArrayList<Customer> ReadFromFile() {
	ArrayList<Customer> A = new ArrayList<Customer>();
	FileInputStream fis;
	try {
		fis = new FileInputStream(new File("Customer.txt"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		while(true) {
			try {
				A.add((Customer)ois.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("End OF File\n");
				break;
			}
		}
		ois.close();
		fis.close();

	} catch (FileNotFoundException e1) {
			
	}
	catch (IOException e) {
		
	}
	return A;

}

public static void WrightIntoFile(Customer S) {
	ArrayList<Customer> A = ReadFromFile();
	int flag = 1;
	for(Customer C : A) {
		if(C.equal(S)) {
			flag = 0 ; 
			break;
		}
	}
	if(flag == 0 ) {
		return;
	}
	A.add(S);
	
	FileOutputStream fos;
	try {
		fos = new FileOutputStream (new File("Customer.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(Customer C : A) {
			oos.writeObject(C);
		}
		oos.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	}

}

@Override
public  void Update(DataSender O) {
	// TODO Auto-generated method stub
	if(O.getDataCustomer() != null) {
		DataCustomerManager.WrightIntoFile(O.getDataCustomer());
	}
}

public static int numberOfCustomers() {
	ArrayList<Customer> A = ReadFromFile();
	return A.size();
}

public static void removeACustomer(String S) {
	ArrayList<Customer> A = ReadFromFile();
	int i = 0;
	for(i=0;i<A.size();i++ ) {
		if(A.get(i).getID().equals(S)) {
			A.remove(i);
			break;
		}
	}
	FileOutputStream fos;
	try {
		fos = new FileOutputStream (new File("Customer.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(Customer C : A) {
			oos.writeObject(C);
		}
		oos.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
	} catch (IOException e) {
	}
}



}
