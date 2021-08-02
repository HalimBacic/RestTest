package services;

import java.util.ArrayList;

public class FakeMemory {
	
	private ArrayList<Drzava> memory = new ArrayList<Drzava>();
	
	public FakeMemory()
	{
		memory.add(new Drzava("BiH","Sarajevo",13));
		memory.add(new Drzava("Belgija","Brisel",32));
		memory.add(new Drzava("Mongolija","Ulan Bator",10));
	}

	public ArrayList<Drzava> getMemory() {
		return memory;
	}

	public void setMemory(ArrayList<Drzava> memory) {
		this.memory = memory;
	}
}
