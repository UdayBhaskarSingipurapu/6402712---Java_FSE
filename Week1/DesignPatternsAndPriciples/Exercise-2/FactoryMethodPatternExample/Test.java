package com.FactoryMethodPatternExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factory Method Pattern \n");
		
		MainFactory m = new MainFactory();
		
		Document pdf = m.createDocument("pdf");
		pdf.open();
		
		Document word = m.createDocument("word");
		word.open();
		
		Document excel = m.createDocument("excel");
		excel.open();
	}

}
