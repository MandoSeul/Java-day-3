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
		System.out.println("찾은 개수는 : " + count);
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
		System.out.println("강수량의 평균을 구할 전체 day의 수를 입력하세요 : ");
		day = sc.nextInt();
		sc.nextLine();
		double [] num = new double [day];
		System.out.println("강수량을 랜덤으로 출력하시겠습니까? (1/0)");
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
				System.out.println("강수량을 입력하시오 : " + (i+1)+"day 입니다.");
				num[i] = sc.nextDouble();
				sum += num[i]; 
			}
		}
		else System.out.println("error");
		
		avg = (double)(sum/day);
		
		System.out.println();
		System.out.printf("강수량의 평균은 : %.2f " , avg,"입니다.");
	}
	
}
//*/