package com.capgemini.phc.sevices;

import java.util.Comparator;

import com.capgemini.phc.model.Product;

public class ProductIDComparator implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if(p1.getPid()==p2.getPid())
			return 0;
		if(p1.getPid()>p2.getPid()) 
			return 1;
		return -1;
	}
}
