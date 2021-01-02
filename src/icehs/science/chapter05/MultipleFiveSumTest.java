package icehs.science.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (sum < 100) {
			int number = i * 5;
			sum += number;
			System.out.println(i++ + ".(+"+ number +")"+sum);
		}
	}

}
