package build;

public class WesternFood implements Food {

	private String chicken;
	private String breff;
	private String vegs;
	private String sauce;
	private String soup;
	public String getChicken() {
		return chicken;
	}
	public void setChicken(String chicken) {
		this.chicken = chicken;
	}
	public String getBreff() {
		return breff;
	}
	public void setBreff(String breff) {
		this.breff = breff;
	}
	public String getVegs() {
		return vegs;
	}
	public void setVegs(String vegs) {
		this.vegs = vegs;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String getSoup() {
		return soup;
	}
	public void setSoup(String soup) {
		this.soup = soup;
	}
	@Override
	public String toString() {
		return String.format("WesternFood [chicken=%s, breff=%s, vegs=%s, sauce=%s, soup=%s]", chicken, breff, vegs,
				sauce, soup);
	}
	
}
