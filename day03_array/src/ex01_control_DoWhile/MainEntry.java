/*
package ex01_control_DoWhile;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1;
		do{
			System.out.println("a");
			a++;
		}while(a<=2);
	}
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//0~100까지 숫자만 입력 받는 프로그램 작성
		int su = 0;
		do{
			System.out.println("Score(0~100) : ");
			su = new Scanner(System.in).nextInt();
		}while(su<0 || su>100);
		System.out.println(su);
		
	}
	
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//원하는 단 입력 받아서 구구단 출력하는 프로그램
		int multi = 0, i=1;
		System.out.println("구구단을 보고 싶은 값을 입력하세요 : ");
		multi = new Scanner(System.in).nextInt();
		do{
			System.out.println(multi +"*"+i +"="+(i*multi));
			i++;
		}while(i<10);
		
		int j=1;
		while(j<10){
			System.out.println(multi +"*"+j +"="+(j*multi));
			i++;
		}
	}
	
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//문자 입력 받아서 총  입력 받은 문자 객수 알기
		Scanner sc = new Scanner(System.in);
		char ch =' ';
		String str = null;
		int count =0;
		System.out.println("아무 값이나 입력하세요: '!'를 누르면 탈출합니다. ");
		while(true){ // 무한루프
			str = sc.next();
			//str = sc.nextLine();
			ch = str.charAt(0);
			
			if(ch =='!') break;
			
			count++;
			//count = str.length();
		}
	System.out.println("총 입력 받은 문자 객수는 : " + count + "입니다.");
}
}
//*/
/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 구구단 출력하는 프로그램
	 int i=1, j=1;
		do{
			j=1;
			do{System.out.printf(j+"\t");
			j++;
			}while(j<=3);
			i++;
			System.out.println();
		}while(i<=2);
	}
}
//*/
/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 구구단 출력하는 프로그램
	 int i=1, j=1;
		while(i<10){
			while(j<10)
			{
				System.out.printf(j+"*"+i+"="+(j*i)+"\t");
				j++;	
			}
			i++;
			j=1;
			System.out.println();
		}
	}
	
}
//*/

//*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 구구단 출력하는 프로그램
	 int i=1, j=1;
	 do{
		 j=1;
		 do{
			 System.out.printf(j+"*"+i+"="+(j*i)+"\t");
				j++;
		 }while(j<10);
		 i++;
		 System.out.println();
	 }while(i<10);
	}
}
//*/