package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c1 = new Cat(3,"�丣�þ�","�߿���");
		System.out.println("�̸� : "+ c1.getName());
		System.out.println("���� : "+c1.getKind());
		System.out.println("���� : "+c1.getAge());
		c1.run();
		c1.hunt();
		c1.play();
		
	}

}
