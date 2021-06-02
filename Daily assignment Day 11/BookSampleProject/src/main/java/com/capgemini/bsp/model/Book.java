package com.capgemini.bsp.model;

import com.capgemini.bsp.exceptions.BookIDCannotBeNegativeException;
import com.capgemini.bsp.exceptions.BookNameCannotBeNullException;
import com.capgemini.bsp.exceptions.PriceNotValidException;

public class Book {
	private int bid;
	private String bname;
	private double price;
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
//	Validate methods
	public void validateBookID() throws BookIDCannotBeNegativeException {
		if (this.bid < 0)
			throw new BookIDCannotBeNegativeException("Book ID cannot be negative");
	}
	public void validateBookName() throws BookNameCannotBeNullException {
		if (this.bname.isBlank())
			throw new BookNameCannotBeNullException("Book Name cannot be null");
	}
	public void validatePriceValidity() throws PriceNotValidException {
		if (this.price == 0 || this.price < 0 )
			throw new PriceNotValidException("Price cannot be 0 or Negative");
	}
	
	public void checker(Book b) throws Exception {
		b.validateBookID();
		b.validateBookName();
		b.validatePriceValidity();
	}
	
}