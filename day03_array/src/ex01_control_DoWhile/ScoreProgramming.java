package ex01_control_DoWhile;

import java.util.Scanner;

public class ScoreProgramming {
	public static void main(String[] args) {
		
		// 1. ����� ���� ����
		int kor=0 , eng=0 , com=0 , total;
		char grade;
		String name;
		double avg  = 0; // ���-�Ҽ��� 2�ڸ����� ǥ��
		Scanner sc = new Scanner(System.in);
		
		//2-1. �Է¹��� ������ do~while�� �̿��ؼ� 0~100�� ���� ������ �Է��ϼ���.
		System.out.println(" �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		do{
			System.out.println(" ���������� �Է��ϼ��� : ");
			kor = sc.nextInt();
		}while(kor<0 || kor>100);
		do{
			System.out.println(" ��ǻ�������� �Է��ϼ��� : ");
			com = sc.nextInt();
		}while(com<0 || com>100);
		do{
			System.out.println(" ���������� �Է��ϼ��� : ");
			eng = sc.nextInt();
		}while(eng<0 || eng>100);
	
		
		//3. ó��(���)
		total = kor + eng + com;
		avg = ((double)total/3);
		
		// 3-1 ���(����)���ϱ� (if, switch �̿�)
			
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

		
		//4. ������
		System.out.println(name +"���� ����ǥ");
		System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
		System.out.printf("total : " + total +"\taverage : %.2f " ,avg );
		System.out.println();
		System.out.println("your Grade is  " + grade);
	}
	
}
