package ex04.array;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		int Num =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer data Input : ");
		Num = sc.nextInt();
		
		int [] arr = new int[Num]; // �迭ũ��� ���� �ԷµǾ�� ��
		int sum =0 ;
		
		for(int i =0 ; i<arr.length;i++)
		{
			System.out.println((i+1)+"�� ° ������ �Է� : ");
			arr[i] = sc.nextInt();
			sum+=arr[i];	
		}
		for(int i =0 ; i<arr.length;i++)
		{			
			System.out.println("arr["+i+"] = " + arr[i]);
		}
		System.out.println("array ���� �� : " +sum);
	}
}
