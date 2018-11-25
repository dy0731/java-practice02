package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액: ");
		
		//입력받은 금액
		int price1 = scanner.nextInt();
		
		//나눌 가격단위
		int[] priceUnits = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		//남은 금액
		int price2 = price1;
		
		for(int i = 0; i < priceUnits.length; i++) {
			
			//남은 금액이 0이면 중지
			if(price2 == 0) {
				break;
			}
			
			//가격단위
			int priceUnit = priceUnits[i];
			
			//몫
			int share = price2 / priceUnit;
			
			if(share > 0) {
				System.out.println(priceUnit + "원 : " + share + "개");
			}
			
			//남은금액
			price2 = price2 - (priceUnit * share);
		}
		
		//자원해제
		scanner.close();
	}

}
