package icehs.science.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount fund = new FundAccount("111-2222","ȫ�浿",5000000,4.70);
		fund.openAccount();
		fund.earnMoney();
		
		System.out.println();
		
		FundAccount fund2 = new FundAccount("666-7777","ȫ�浿",1000000,2.9);
		fund2.openAccount();
	}

}
