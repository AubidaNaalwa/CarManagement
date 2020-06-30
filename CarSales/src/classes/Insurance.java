package classes;

public class Insurance {

	private static final Insurance Instance = new Insurance();
	private final String CompanyName;
	private final int basicInsurance = 2000;
	private final int Tax = 17; 
	
	private Insurance () {
		CompanyName = new String("Insurance Company");
	}
	public static Insurance getInstance() {
		return Instance;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public int getBasicInsurance() {
		return basicInsurance;
	}
	
	public int thirdInsurance() {
		int sum ;
		sum =   Tax /100 *2500 + basicInsurance;
		return sum;
	}
	
	public int allInsurance() {
		return thirdInsurance() + 1000 ;
	}

}
