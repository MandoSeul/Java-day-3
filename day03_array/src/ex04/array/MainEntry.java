package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		char[] ch ; // 배열 선언
		ch = new char[4]; // 배열 생성
		
		//2.
		char[] ch2 = new char[3];//배열선언 및 생성
		
		//배열초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		// 3.
		char[] ch3 = {'J','A','V','A'};
		
		// 배열의 길이
		System.out.println("배열의 길이 : " + ch3.length);
		
		// 배열의 내용 출력
		System.out.println(ch[2]);
		for(int i =0; i<ch3.length; i++)
			System.out.println(ch3
					[i]);
	}
}
