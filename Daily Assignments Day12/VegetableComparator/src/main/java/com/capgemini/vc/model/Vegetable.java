package com.capgemini.vc.model;

public class Vegetable implements Comparable<Vegetable> {
	private int vegId;
	private String vegName;
	private Float vegPrice;
	
//	Constructors
	public Vegetable() {
		super();
	}
	public Vegetable(int vegId, String vegName, Float vegPrice) {
		super();
		this.vegId = vegId;
		this.vegName = vegName;
		this.vegPrice = vegPrice;
	}
	
//	Getters and Setters
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public double getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(Float vegPrice) {
		this.vegPrice = vegPrice;
	}
	
//	HashCode and equals override
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vegId;
		result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(vegPrice);
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
		Vegetable other = (Vegetable) obj;
		if (vegId != other.vegId)
			return false;
		if (vegName == null) {
			if (other.vegName != null)
				return false;
		} else if (!vegName.equals(other.vegName))
			return false;
		if (Double.doubleToLongBits(vegPrice) != Double.doubleToLongBits(other.vegPrice))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Vegetable v) {
		return vegPrice.compareTo(v.vegPrice);
	}
	
	@Override
	public String toString() {
		return "Vegetable Id : " + vegId + ", Name : " + vegName + ", Price : " + vegPrice;
	}
	
}
