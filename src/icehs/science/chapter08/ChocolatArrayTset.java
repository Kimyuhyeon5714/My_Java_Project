package icehs.science.chapter08;

public class ChocolatArrayTset {

	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("�Ƹ�����" , "��ũ" , 2200);
		chocos[1] = new Chocolate("ī�� Ŀ����" , "��ũ ", 2500);
		chocos[2] = new Chocolate("Ʈ���� ����", "ȭ��Ʈ ", 2300);
		
		chocos[0].printChocolateInfo();
		chocos[1].printChocolateInfo();
		chocos[2].printChocolateInfo();
		for(int i = 0; i<chocos.length; i++) {
			chocos[i].printChocolateInfo();
		}

	}

}