/*/
package ex04.array;

public class ArrayTest2 {
	public static void main(String[] args) {
		//int[] num = {3,7,5,9,6,4,566,23,6,3,55,3};
		int seek = 7, count =0;
		int [] nua = new int[10];
		
		for(int i=0; i<nua.length; i++)
		{
			 nua[i] = (int) (Math.random()*10);
			 System.out.printf(nua[i]+"\t");
				if(nua[i]==seek)
					count++;
		}
		
		System.out.println();
		System.out.println("ã�� ������ : " + count);
	}
	
}
//*/

//*/
package ex04.array;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int day;
		double sum = 0 ;
		double avg =0;
		int flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� ���� ��ü day�� ���� �Է��ϼ��� : ");
		day = sc.nextInt();
		sc.nextLine();
		double [] num = new double [day];
		System.out.println("�������� �������� ����Ͻðڽ��ϱ�? (1/0)");
		flag = sc.nextInt();
		if(flag==1)
		{
			for(int i=0; i<num.length; i++)
			{
				 num[i] = (double) (Math.random()*100);
				 System.out.printf(num[i]+"\t");
					sum += num[i]; 
			}
		}
		else if(flag==0)
		{
			for(int i=0; i<num.length; i++)
			{
				System.out.println("�������� �Է��Ͻÿ� : " + (i+1)+"day �Դϴ�.");
				num[i] = sc.nextDouble();
				sum += num[i]; 
			}
		}
		else System.out.println("error");
		
		avg = (double)(sum/day);
		
		System.out.println();
		System.out.printf("�������� ����� : %.2f " , avg,"�Դϴ�.");
	}
	
}
//*/