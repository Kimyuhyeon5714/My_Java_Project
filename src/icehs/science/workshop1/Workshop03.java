package icehs.science.workshop1;

//문제 3.
//두 개의 주사위를 던졌을 때,
//눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class Workshop03 {
 
	public static void main( String[] args ) {
		
		int i = 0;
		int j = 0;
		
		for (i = 1; i <= 6; i++) {
			
			for(j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j + " = 6");
				}
			}
		}
     
     
 	}
}