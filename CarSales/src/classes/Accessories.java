package classes;
import java.io.Serializable;

public class Accessories implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Accessories(String CarColor , String led , String Sound , String Pad) {
		this.CarColor = new String(CarColor);
		LedType = new String(led);
		SoundSpeakers = new String(Sound);
		ChairsPadding = new String(Pad);
	}
	public Accessories(Accessories A) {
		this.CarColor = new String(A.CarColor);
		this.LedType = new String(A.LedType);
		this.SoundSpeakers= new String(A.SoundSpeakers);
		this.ChairsPadding = new String(A.ChairsPadding);
	}
	
	public String getCarColor() {
		return CarColor;
	}
	public String getLedType() {
		return LedType;
	}
	public String getSoundSpeakers() {
		return SoundSpeakers;
	}
	public String getChairsPadding() {
		return ChairsPadding;
	}
	
	public int CostAllStaff()
	{
		return 2500;
	}
	@Override
	public String toString() {
		return "Accessories [CarColor=" + CarColor + ", LedType=" + LedType + ", SoundSpeakers=" + SoundSpeakers
				+ ", ChairsPadding=" + ChairsPadding + "]";
	}
	private final String CarColor;
	private final String LedType;
	private final String SoundSpeakers;
	private final String ChairsPadding;
	
	
	
}
