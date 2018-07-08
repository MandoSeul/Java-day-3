package ex05.practice;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		//과목수, 인원수
		//배열을 이용하여 처리하기
		// 1. 사용할 변수 선언
		
		int subjectnum=3, studentnum=4;
		int [][]Score = new int[studentnum][subjectnum];
		int []total = new int[studentnum];
		char grade = 0;
		double[] avg  = new double[studentnum]; // 평균-소수점 2자리까지 표현
		Scanner sc = new Scanner(System.in);
		
		//2-1. 입력받은 점수를 do~while을 이용해서 0~100점 사이 점수만 입력하세요.
		for(int i =0; i<Score.length; i++){
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"번째 학생의" +(j+1)+"번째 과목의 성적을 입력하시오 : ");
				Score[i][j] = sc.nextInt();
				total[i] +=Score[i][j];
				avg[i] = ((double)total[i]/3);
				
			}
			if((avg[i]<=100)&&(avg[i]>=90))
				grade = 'A';
			else if((avg[i]<=89)&&(avg[i]>=80))
				grade = 'B';
			else if((avg[i]<=79)&&(avg[i]>=70))
				grade = 'C';
			else if((avg[i]<=69)&&(avg[i]>=60))
				grade = 'D';
			else
				grade = 'F';
		}
		//3. 처리(계산)
		
		
		//4. 결과출력
		for(int i =0; i<Score.length; i++){
			System.out.println((i+1)  +"님의 성적표 입니다");
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"님의 "+(j+1)+"번째 과목의 점수는 : " +Score[i][j]+"입니다" );
			}
			System.out.printf((i+1)+ "번째님의 total 점수는 : " + total[i] +"\taverage은 : %.2f " ,avg[i],"입니다" );
			System.out.println();
			System.out.println((i+1)+"님의 Grade is  " + grade);
		}
	}
}
