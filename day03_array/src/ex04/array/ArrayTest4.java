/*/
package ex04.array;

public class ArrayTest4 {
	public static void main(String[] args) {
		//1. 행렬의 크기
		int [][]a = new int[2][3];//행크기 열크기
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		//2. 
		int [][] a2 = new int[][]{{1,2,3},{4,5,6}};
		//3.
		int [][] a3 = {{1,2,3},{4,5,6}};
		//4.
		int [][]a4 = new int[2][3];//행크기 열크기
		int count =1;
		for(int i=0; i<2; i++){
			for(int j=0;j<3; j++)
				{a[i][j]=count;
			count++;
			System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		// 배열 값 출력
		
		System.out.println("a3[1][1] = " + a3[1][1]);
		System.out.println("a3[0][1] = " + a3[0][1]);
		System.out.println("행렬의 행크기 : " + a3.length);
		System.out.println("행렬의 열크기 : " + a3[0].length);
		
		for(int i =0; i<a3.length; i++){
			for(int j=0; j<a3[i].length;j++)
			{
				System.out.print(a3[i][j]+"\t");
			}//j end
			System.out.println();
		}//i end
	}
}
//*/

//*/
package ex04.array;

import java.util.Scanner;

public class ArrayTest4 {
	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		int sum =0;
		//입력받기
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("배열 데이터 값을 입력하시오.a["+i+"]["+j+"] 입니다.");
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
			System.out.println();
		}
		//출력받기
		for(int i =0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++)
			{

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("sum : " + sum);
	}
}
//*/