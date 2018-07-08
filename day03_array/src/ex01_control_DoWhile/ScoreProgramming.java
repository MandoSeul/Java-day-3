package ex01_control_DoWhile;

import java.util.Scanner;

public class ScoreProgramming {
	public static void main(String[] args) {
		
		// 1. 사용할 변수 선언
		int kor=0 , eng=0 , com=0 , total;
		char grade;
		String name;
		double avg  = 0; // 평균-소수점 2자리까지 표현
		Scanner sc = new Scanner(System.in);
		
		//2-1. 입력받은 점수를 do~while을 이용해서 0~100점 사이 점수만 입력하세요.
		System.out.println(" 이름을 입력하세요 : ");
		name = sc.nextLine();
		do{
			System.out.println(" 국어점수를 입력하세요 : ");
			kor = sc.nextInt();
		}while(kor<0 || kor>100);
		do{
			System.out.println(" 컴퓨터점수를 입력하세요 : ");
			com = sc.nextInt();
		}while(com<0 || com>100);
		do{
			System.out.println(" 영어점수를 입력하세요 : ");
			eng = sc.nextInt();
		}while(eng<0 || eng>100);
	
		
		//3. 처리(계산)
		total = kor + eng + com;
		avg = ((double)total/3);
		
		// 3-1 평균(학점)구하기 (if, switch 이용)
			
		if((avg<=100)&&(avg>=90))
			grade = 'A';
		else if((avg<=89)&&(avg>=80))
			grade = 'B';
		else if((avg<=79)&&(avg>=70))
			grade = 'C';
		else if((avg<=69)&&(avg>=60))
			grade = 'D';
		else
			grade = 'F';

		
		//4. 결과출력
		System.out.println(name +"님의 성적표");
		System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
		System.out.printf("total : " + total +"\taverage : %.2f " ,avg );
		System.out.println();
		System.out.println("your Grade is  " + grade);
	}
	
}
