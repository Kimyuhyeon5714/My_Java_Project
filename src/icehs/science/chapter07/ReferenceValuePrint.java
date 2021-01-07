package icehs.science.chapter07;

public class ReferenceValuePrint {

	public static void main(String[] args) {
		Publiccation pub1 = new Publiccation("만화 삼국지 ", 5000, 300);
		System.out.println(pub1.numberOfObjects);
		
		Publiccation pub2 = new Publiccation();
		System.out.println(pub1.numberOfObjects);
		System.out.println(pub1.numberOfObjects);
		System.out.println(Publiccation.numberOfObjects);
		int value = 10;
		System.out.println("Pub1 객체 참조 주소값");
		System.out.println(pub1);
		
		System.out.println("Pub2 객체 참조 주소값");
		System.out.println(pub2);
		
		System.out.println("int 변수 저장값 : "+value);
		

	}

}
