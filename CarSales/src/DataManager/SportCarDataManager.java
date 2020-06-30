package DataManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import classes.Observer;
import classes.SportCar;

public class SportCarDataManager implements Observer{

	@Override
	public void Update(DataSender O) {
		if(O.getSpCar() != null) {
			SportCarDataManager.WriteIntoFile(O.getSpCar());
		}
		
	}
	public static int numberOfSportCars() {
		ArrayList<SportCar> A = ReadFromFile();
		return A.size();
	}
	
	public static ArrayList<SportCar> ReadFromFile() {
		ArrayList<SportCar> A = new ArrayList<SportCar>();
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("SportCar.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(true) {
				try {
					A.add((SportCar)ois.readObject());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
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

	public static void WriteIntoFile(SportCar S) {
		ArrayList<SportCar> A = ReadFromFile();
		int flag = 1;
		for(SportCar C : A) {
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
			fos = new FileOutputStream (new File("SportCar.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(SportCar C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

	public static void removeACar(String S) {
		ArrayList<SportCar> A = ReadFromFile();
		int i = 0;
		for(i=0;i<A.size();i++ ) {
			if(A.get(i).CarId().equals(S)) {
				A.remove(i);
				break;
			}
		}
	
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream (new File("SportCar.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(SportCar C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	public static SportCar ReturnTheCar(String Id) {
		
		ArrayList<SportCar> A = ReadFromFile();
		for(SportCar S : A) {
			if(S.CarId().equals(Id))
				return S;
		}
		
		return null;
	}
	

}
