package build;

public class ChineseFood implements Food {
	public String salt;
	public String water;
	public String veg;
	public String rice;
	public String others;
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
	public String getRice() {
		return rice;
	}
	public void setRice(String rice) {
		this.rice = rice;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	@Override
	public String toString() {
		return String.format("ChineseFood [salt=%s, water=%s, veg=%s, rice=%s, others=%s]", salt, water, veg, rice,
				others);
	}
}
