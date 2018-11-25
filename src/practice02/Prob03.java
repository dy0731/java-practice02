package practice02;

public class Prob03 {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}
	
	//공백을 콤마(,)로 바꾼다.
	public static void replaceSpace(char a[]) {
		
		//문자배열만큼 반복
		for(int i = 0; i < a.length; i++) {
			
			//문자가 공백이면 콤마(,)로 변경
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	//문자배열의 문자를 출력한다.
	public static void printCharArray(char a[]) {
		
		//문자배열만큼 반복
		for(int i = 0; i < a.length; i++) {
			//문자 출력
			System.out.print(a[i]);
		}
		
		//개행
		System.out.println("");
	}
}
