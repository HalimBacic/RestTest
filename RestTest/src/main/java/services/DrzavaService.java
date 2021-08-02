package services;

import java.util.ArrayList;

public class DrzavaService {
	
	private FakeMemory fakeMemory = new FakeMemory();
	
	public DrzavaService()
	{}
	
	public ArrayList<Drzava> getAll()
	{
		return fakeMemory.getMemory();
	}

	public Drzava getById(Integer id)
	{
		return fakeMemory.getMemory().get(id);
	}
}
