package icehs.science.chapter08;

public class Chocolate {
	String name;
	String type;
	int price;
	
	public Chocolate(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	String getName() {
		return name;
		
	}
	int calculateTotalPrice(int count) {
		return count * price;
	}
	
	void changeChocolateInfo(String newName , int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	
	}
	
	void printChocolateInfo( ) {
		System.out.println("이름 : "+ name +",종류 : "+ type + "가격 : "+price);
	}

}



