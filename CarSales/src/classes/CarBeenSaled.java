package classes;

public class CarBeenSaled {
	public CarBeenSaled(String ID){
		this.ID = new String(ID);
	}
	public CarBeenSaled(CarBeenSaled ID){
		this.ID = new String(ID.getID());
	}
	public String getID() {
		return ID;
	}
	private final String  ID;
}
