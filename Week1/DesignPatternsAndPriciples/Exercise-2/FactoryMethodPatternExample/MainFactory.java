package com.FactoryMethodPatternExample;

public class MainFactory extends DocumentFactory {
	@Override
	public Document createDocument(String type) {
		Document doc = null;
		if(type.equalsIgnoreCase("pdf")) {
			doc = new PdfDocument();
		}
		else if(type.equalsIgnoreCase("word")) {
			doc = new WordDocument();
		}
		else if(type.equalsIgnoreCase("excel")) {
			doc = new ExcelDocument();
		}
		return doc;
	}
}
