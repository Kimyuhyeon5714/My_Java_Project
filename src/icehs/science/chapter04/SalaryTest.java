package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal = 1000000;
		int yearlySal = monthlySal *12;
		int bonus = monthlySal *2/10;
		int yearBonus = bonus*4;
		int yearlSalAfterTax = yearlySal - yearlySal /10;
		int yearlBonusAfterTax = yearBonus - yearBonus * 55/1000;
		int yearIncome = yearlSalAfterTax + yearlBonusAfterTax;
		
		System.out.println("����  : "+yearlySal+",���� ���� : "
				+yearlSalAfterTax);
		System.out.println("���ʽ� : "+yearBonus + ",���� ���ʽ� : "+ yearlBonusAfterTax);
		System.out.println("���޾� : "+ yearIncome);

	}

}
