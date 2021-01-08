package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3,"페르시안","야옹이");
		System.out.println("이름 : "+ c1.getName());
		System.out.println("종류 : "+c1.getKind());
		System.out.println("나이 : "+c1.getAge());
		c1.run();
		c1.hunt();
		c1.play();
		
	}

}
