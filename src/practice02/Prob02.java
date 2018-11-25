package practice02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		
		//자원생성
		Scanner in = new Scanner( System.in );
        
		//입력받을 숫자배열
		int intArray[] = new int[5];
        
		//입력받을 숫자의 갯수
		int intArrayCnt = intArray.length;
		
		//입력받은 숫자의 합
		double sum = 0;
		
		System.out.println(intArrayCnt + "개의 숫자를 입력하세요.");
		
        /* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
        for(int i = 0; i < intArrayCnt; i++) {
        	intArray[i] = in.nextInt();
        }

        /* 배열에 저장된 정수 값 더하기 */
        for(int i = 0; i < intArrayCnt; i++) {
        	sum += intArray[i];
        }

        /* 출력 */
        System.out.println("평균은 " + (sum / intArrayCnt) + " 입니다.");
        
        //자원해제
        in.close();
	}

}
