package ex05.practice;

import java.util.Scanner;

public class ScoreProgram {
	public static void main(String[] args) {
		//�����, �ο���
		//�迭�� �̿��Ͽ� ó���ϱ�
		// 1. ����� ���� ����
		
		int subjectnum=3, studentnum=4;
		int [][]Score = new int[studentnum][subjectnum];
		int []total = new int[studentnum];
		char grade = 0;
		double[] avg  = new double[studentnum]; // ���-�Ҽ��� 2�ڸ����� ǥ��
		Scanner sc = new Scanner(System.in);
		
		//2-1. �Է¹��� ������ do~while�� �̿��ؼ� 0~100�� ���� ������ �Է��ϼ���.
		for(int i =0; i<Score.length; i++){
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"��° �л���" +(j+1)+"��° ������ ������ �Է��Ͻÿ� : ");
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
		//3. ó��(���)
		
		
		//4. ������
		for(int i =0; i<Score.length; i++){
			System.out.println((i+1)  +"���� ����ǥ �Դϴ�");
			for(int j =0; j<Score[i].length; j++)
			{
				System.out.println((i+1)+"���� "+(j+1)+"��° ������ ������ : " +Score[i][j]+"�Դϴ�" );
			}
			System.out.printf((i+1)+ "��°���� total ������ : " + total[i] +"\taverage�� : %.2f " ,avg[i],"�Դϴ�" );
			System.out.println();
			System.out.println((i+1)+"���� Grade is  " + grade);
		}
	}
}
