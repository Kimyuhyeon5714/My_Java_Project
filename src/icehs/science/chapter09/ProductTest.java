package icehs.science.chapter09;

public class ProductTest {
	public static void main(String[] args) {
		Product tong = new Product("통돌이 ", 450000 , 8 );
		tong.printProductInfo();
		System.out.println("---------------------");
		
		Television tv = new Television("시네마Tv ", 3000000,10,"화면크기 151cm");
		tv.printProductInfo();
		System.out.println("비고 : "+tv.getDescription());
		
		System.out.println("[공지] 한인율을 모두 15%로 변경합니다 .");
		tong.setDiscountRate(15);
		tong.setDiscountRate(15);
		
		System.out.println("통돌이 판매가 : "+tong.calculateDiscountprice());
		System.out.println("시네마 Tv 판매가 : "+ tv.calculateDiscountprice());
	}

}
