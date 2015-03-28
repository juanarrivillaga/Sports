
public class Sport {
	private String countryOfOrigin;
	public Sport(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	
	public Sport() {
		this("Not Yet Specified");
	}
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public String toString(){
		return String.format("Country of Origin: %s", getCountryOfOrigin());
	}

}
