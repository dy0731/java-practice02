package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			Random r = new Random();
			int selectNumber = r.nextInt(100) + 1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			
			//범위 시작값
			int startNumber = 1;
			
			//범위 종료값
			int endNumber = 100;
			
			//도전횟수
			int tryCnt = 1;
			
			while(true) {
				System.out.println(startNumber + "-" + endNumber);
				System.out.print(tryCnt + ">>");
				
				//사용자로부터 숫자를 입력받는다.
				int inputNumber = scanner.nextInt();
				
				//입력한 숫자가 법위내에 없으면 continue
				if(inputNumber < startNumber || inputNumber > endNumber) {
					System.out.println("해당 범위의 숫자만 입력하세요.");
					continue;
				}
				
				//일치하면
				if(selectNumber == inputNumber) {
					System.out.println("맞았습니다.");
					break;
				} else if(selectNumber > inputNumber) { //입력한 수가 작으면
					System.out.println("더 높게");
					
					//범위 시작값을 입력한 수로 변경
					startNumber = inputNumber;
				} else if(selectNumber < inputNumber) { //입력한 수가 크면
					System.out.println("더 낮게");
					
					//범위 종료값 입력한 수로 변경
					endNumber = inputNumber;
				}
				
				//도전횟수 증가
				tryCnt++;
			}
			
			
			System.out.print("다시 하시겠습니까(y/n)>>");
			
			String answer = scanner.next();
			
			if(!answer.equals("y")) {
				//종료하도록 작성한다.
				break;
			}
		}
		
		System.out.println("게임이 종료되었습니다.");
		
		//자원해제
		scanner.close();
	}

}
