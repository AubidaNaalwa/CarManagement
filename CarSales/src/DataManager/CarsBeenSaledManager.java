package DataManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;




public class CarsBeenSaledManager {
	public static ArrayList<String> ReadFromFile() {
		ArrayList<String> A = new ArrayList<String>();
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("CarSaled.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			while(true) {
				try {
					A.add((String)ois.readObject());
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

	public static void WriteIntoFile(String S) {
		File F = new File("CarSaled.txt");
		try {
			if(F.createNewFile()) {
				System.out.println("File Created Suuccessfully");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> A = ReadFromFile();
		int flag = 1;
		for(String C : A) {
			if(C.equals(S)) {
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
			fos = new FileOutputStream (new File("CarSaled.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(String C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

	public static int numberOfsaledCars() {
		ArrayList<String> A = ReadFromFile();
		return A.size();
	}

	public static boolean LicenseExist(String Id) {
		
		ArrayList<String> A = ReadFromFile();
		for(String S : A) {
			if(S.equals(Id))
				return true;
		}
		return  false;
		}
	
	public static void removeALicense(String S) {
		ArrayList<String> A = ReadFromFile();
		int i = 0;
		for(i=0;i<A.size();i++ ) {
			if(A.get(i).equals(S)) {
				A.remove(i);
				break;
			}
		}
		FileOutputStream fos;
		try {
			fos = new FileOutputStream (new File("CarSaled.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(String C : A) {
				oos.writeObject(C);
			}
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
}
