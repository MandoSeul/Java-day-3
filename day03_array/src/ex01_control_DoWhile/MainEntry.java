/*
package ex01_control_DoWhile;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1;
		do{
			System.out.println("a");
			a++;
		}while(a<=2);
	}
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//0~100���� ���ڸ� �Է� �޴� ���α׷� �ۼ�
		int su = 0;
		do{
			System.out.println("Score(0~100) : ");
			su = new Scanner(System.in).nextInt();
		}while(su<0 || su>100);
		System.out.println(su);
		
	}
	
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//���ϴ� �� �Է� �޾Ƽ� ������ ����ϴ� ���α׷�
		int multi = 0, i=1;
		System.out.println("�������� ���� ���� ���� �Է��ϼ��� : ");
		multi = new Scanner(System.in).nextInt();
		do{
			System.out.println(multi +"*"+i +"="+(i*multi));
			i++;
		}while(i<10);
		
		int j=1;
		while(j<10){
			System.out.println(multi +"*"+j +"="+(j*multi));
			i++;
		}
	}
	
}
//*/

/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//���� �Է� �޾Ƽ� ��  �Է� ���� ���� ���� �˱�
		Scanner sc = new Scanner(System.in);
		char ch =' ';
		String str = null;
		int count =0;
		System.out.println("�ƹ� ���̳� �Է��ϼ���: '!'�� ������ Ż���մϴ�. ");
		while(true){ // ���ѷ���
			str = sc.next();
			//str = sc.nextLine();
			ch = str.charAt(0);
			
			if(ch =='!') break;
			
			count++;
			//count = str.length();
		}
	System.out.println("�� �Է� ���� ���� ������ : " + count + "�Դϴ�.");
}
}
//*/
/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// ������ ����ϴ� ���α׷�
	 int i=1, j=1;
		do{
			j=1;
			do{System.out.printf(j+"\t");
			j++;
			}while(j<=3);
			i++;
			System.out.println();
		}while(i<=2);
	}
}
//*/
/*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// ������ ����ϴ� ���α׷�
	 int i=1, j=1;
		while(i<10){
			while(j<10)
			{
				System.out.printf(j+"*"+i+"="+(j*i)+"\t");
				j++;	
			}
			i++;
			j=1;
			System.out.println();
		}
	}
	
}
//*/

//*
package ex01_control_DoWhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// ������ ����ϴ� ���α׷�
	 int i=1, j=1;
	 do{
		 j=1;
		 do{
			 System.out.printf(j+"*"+i+"="+(j*i)+"\t");
				j++;
		 }while(j<10);
		 i++;
		 System.out.println();
	 }while(i<10);
	}
}
//*/