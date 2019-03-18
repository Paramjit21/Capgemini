package com;

class Item 
{
	
	private int idNumber;
	private String title;
	private int numberOfCopies;
	
	public Item(int id,String title,int noc)
	{
		this.idNumber = id;
		this.title = title;
		numberOfCopies = noc;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public boolean equals(Object obj)
	{
		if( obj instanceof Item && this.title == ((Item)obj).title)
			return true;
		else
			return false;
		
	}
	@Override
	public String toString()
	{
		return this.title;
	}
	
	
}


public class LabPrac {
	

}
