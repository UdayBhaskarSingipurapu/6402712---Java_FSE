package com.Searching;

import java.util.*;

public class Test {
	
	public static Product linearSearch(List<Product> products, int targetId) {
		for(Product p: products) {
			if(p.productId == targetId) {
				return p;
			}
		}
		return null;
	}
	
	public static Product BinarySearch(List<Product> products, int targetId) {
		Collections.sort(products, Comparator.comparingInt(p -> p.productId));
		int low = 0, high = products.size();
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(products.get(mid).productId == targetId) {
				return products.get(mid);
			}
			else if(products.get(mid).productId < targetId) {
				low = mid + 1;
			}
			else high = mid;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		System.out.println("Enter Total Products");
		int productCnt = sc.nextInt();
		
		for(int i = 0; i < productCnt; i++) {
			System.out.print("Enter ID of Product : ");
			int id = sc.nextInt();
			
			System.out.print("Enter Name of Product: ");
			String name = sc.next();
			
			System.out.print("Enter Category5 of Product: ");
			String category = sc.next();
			
			products.add(new Product(id, name, category));
		}
		System.out.println();
		
		// Linear Search Implementation
		System.out.println("Enter Target Product Id");
		int targetId = sc.nextInt();
		Product linearProd = linearSearch(products, targetId);
		System.out.println("---------------Linear Search--------------");
		if(linearProd != null) {
			System.out.println("Product found");
			System.out.println(linearProd);
		}
		else {
			System.out.println("Product not found");
		}
		System.out.println();
		// Binary Search Implementation
		System.out.println("Enter Target Product Id");
		int reqId = sc.nextInt();
		Product binaryProd = BinarySearch(products, reqId);
		System.out.println("---------------Binary Search--------------");
		if(binaryProd != null) {
			System.out.println("Product found");
			System.out.println(binaryProd);
		}
		else {
			System.out.println("Product not found");
		}
	}

}
