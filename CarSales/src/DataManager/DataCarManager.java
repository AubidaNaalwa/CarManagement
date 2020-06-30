package DataManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import classes.Car;
import classes.Observer;

public class DataCarManager implements Observer {
	
	public static ArrayList<Car> ReadFromFile() {
		ArrayList<Car> A = new ArrayList<Car>();
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("Vechile.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(true) {
				try {
					A.add((Car)ois.readObject());
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

	public static void WriteIntoFile(Car S) {
		ArrayList<Car> A = ReadFromFile();
		int flag = 1;
		for(Car C : A) {
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
			fos = new FileOutputStream (new File("Vechile.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Car C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

	public static int numberOfRegularCars() {
		ArrayList<Car> A = ReadFromFile();
		return A.size();
	}

	@Override
	public void Update(DataSender O) {
		if(O.getDataVechile()!= null) {
			DataCarManager.WriteIntoFile(O.getDataVechile());
		}
	}

	
	
	public static Car ReturnTheCar(String Id) {
		
		ArrayList<Car> A = ReadFromFile();
		for(Car S : A) {
			if(S.CarId().equals(Id))
				return S;
		}
		return null;
		}
	
	
	public static void removeACar(String S) {
		ArrayList<Car> A = ReadFromFile();
		int i = 0;
		for(i=0;i<A.size();i++ ) {
			if(A.get(i).CarId().equals(S)) {
				A.remove(i);
				break;
			}
		}
	
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream (new File("Vechile.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Car C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}