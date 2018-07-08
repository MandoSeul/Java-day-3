package ex04.array;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		int Num =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer data Input : ");
		Num = sc.nextInt();
		
		int [] arr = new int[Num]; // 배열크기는 숫자 입력되어야 함
		int sum =0 ;
		
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.println((i+1)+"번 째 데이터 입력 : ");
			arr[i] = sc.nextInt();
			sum+=arr[i];	
		}
		for(int i =0 ; i<arr.length;i++)
		{			
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		System.out.println("array 누적 합 : " +sum);
	}
}
