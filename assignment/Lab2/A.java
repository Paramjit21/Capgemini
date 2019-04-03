package com;

/**
 *
 * @author Param
 *
 */

abstract class Item{
	private int uid;
	private String title;
	private int copies;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public Item(int uid, String title, int copies) {
		super();
		this.uid = uid;
		this.title = title;
		this.copies = copies;
	}
	public Item() {
		
	}
	abstract void checkIn();
	abstract void checkOut();
	abstract void addItem();
	
	
	
}

abstract class WrittenItem extends Item{
	private String author;

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("CheckIn");
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Checkout");
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Items added");
	}
	public boolean equals() {
		return true;
	}
	public String toString() {
		return getTitle();
	}
	
}

class Book extends WrittenItem{

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Book Check In");
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Book Chekout");
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
	}
	
}

class JournalPaper extends WrittenItem{
	private int year;
}

class MediaItem extends Item{

	@Override
	void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Media Item Checkin");
		
	}

	@Override
	void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Media Item Check out");
	}

	@Override
	void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Media Item Items added");
	}
	
}

public class A {
	public static void main(String[] as) {
		
	}
}
