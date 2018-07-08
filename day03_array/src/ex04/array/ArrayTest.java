/*/
package ex04.array;

import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) {
	int[]a = new int[5];

	for(int i = 0; i<5; i++)
	{
	
		a[i] = i+1;
//		System.out.println(a[i]);
	}
	
	for(int i = 0; i<a.length; i++)
		System.out.println(a[i]);
}
}
//*/


//*/
package ex04.array;

import java.util.Scanner;

public class ArrayTest {
public static void main(String[] args) { 
	int[]a = new int[5];
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i<5; i++)
	{

		System.out.println("숫자를 입력하세요 : ");
		a[i]=sc.nextInt();

	}
	
	for(int i = 0; i<a.length; i++)
		System.out.println(a[i]);

}
}
//*/
