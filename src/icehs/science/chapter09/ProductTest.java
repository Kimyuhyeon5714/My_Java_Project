package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product tong = new Product("�뵹�� ", 450000 , 8 );
		tong.printProductInfo();
		System.out.println("---------------------");
		
		Television tv = new Television("�ó׸�Tv ", 3000000,10,"ȭ��ũ�� 151cm");
		tv.printProductInfo();
		System.out.println("��� : "+tv.getDescription());
		
		System.out.println("[����] �������� ��� 15%�� �����մϴ� .");
		tong.setDiscountRate(15);
		tong.setDiscountRate(15);
		
		System.out.println("�뵹�� �ǸŰ� : "+tong.calculateDiscountprice());
		System.out.println("�ó׸� Tv �ǸŰ� : "+ tv.calculateDiscountprice());
	}

}
