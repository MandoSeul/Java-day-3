/*/
package ex03.exception;

public class MainEntry {
public static void main(String[] args) {
	int x = 5, y=0;
	int result = x/y; // ����ó��
	
	System.out.println("result = "+result);
	}
}
//*/

/*/
package ex03.exception;

public class MainEntry {
public static void main(String[] args) {
	try{
		int x = 5, y=0;
		int result = x/y; // ����ó��
		
		System.out.println("result = "+result);
	
	}catch(Exception e){
		e.printStackTrace();// �ܰ������� ���ܸ� ã�Ƽ� ���
		//System.out.println(e.getMessage());
		//System.out.println("0���� ������ �����ϴ�..."); // ����� �޼���
	}
	}
}
//*/

//*/
package ex03.exception;

public class MainEntry {
public static void main(String[] args) {
	try{
		int x = 5, y=0;
		int result = x/y; // ����ó��
		
		System.out.println("result = "+result);
	}catch(ArithmeticException e){
		System.out.println("error>.ArithmeticException.............");
	}catch(Exception e){
		//e.printStackTrace();// �ܰ������� ���ܸ� ã�Ƽ� ���
		//System.out.println(e.getMessage());
		System.out.println("0���� ������ �����ϴ�...Exception"); // ����� �޼���
	}finally{
		System.out.println("Finally ������ ��µ˴ϴ�.");
	}
	}
}
//*/