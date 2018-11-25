package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] arrayReverse1 = reverse("Hello World");
		printCharArray(arrayReverse1);
		
		char[] arrayReverse2 = reverse("Java Programming!");
		printCharArray(arrayReverse2);
	}

	//문자열을 뒤집어서 문자배열로 반환
	public static char[] reverse(String str) {
		
		//문자열의 문자를 담을 문자배열
		char[] chars = new char[str.length()];
		
		//문자열 길이
		int strLength = str.length();
		
		//문자열을 문자배열에 담는다.
		for(int i = 0; i < strLength; i++) {
			chars[i] = str.charAt(i);
		}
		
		//문자배열을 뒤집는다.
		for(int i = 0; i < strLength/2; i++) {
			char temp = chars[i];
			chars[i] = chars[strLength-i-1];
			chars[strLength-i-1] = temp;
		}
		
		return chars;
	}
	
	//문자배열의 문자를 출력한다.
	public static void printCharArray(char[] array) {
		
		//문자배열길이 만큼 반복
		for(int i = 0; i < array.length; i++) {
			//출력
			System.out.print(array[i]);
		}
		
		//개행
		System.out.println("");
	}
}
