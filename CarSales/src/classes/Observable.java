package classes;
// Observable interface class 
public interface Observable {
	public void Notify();
	public void Attach(Observer O);
	public void Delete(Observer O);
}
