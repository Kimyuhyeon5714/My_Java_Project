package icehs.science.chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		System.out.println("===== ���ǹ� ������ �����մϴ� =====");
		
		Publiccation pub1 = new Publiccation();
		pub1.setPrice(-100);
		pub1.setPage(-100);
		pub1.setPrice(5000);
		pub1.setPage(300);
		pub1.setTitle("��ȭ�ﱹ��");
		System.out.println("���ǹ� ���� : "+pub1.getTitle() 
		+ " ( " +pub1.getPrice()+"��,"+pub1.getPage()+" page)");

	}

}
