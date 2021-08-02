package services;

public class Drzava {
	
	private String name;
	private String capital;
	private Integer number;
	
	
	public Drzava(String name, String capital, Integer number) {
		super();
		this.name = name;
		this.capital = capital;
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}
}
