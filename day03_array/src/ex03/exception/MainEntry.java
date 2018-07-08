/*/
package ex03.exception;

public class MainEntry {
public static void main(String[] args) {
	int x = 5, y=0;
	int result = x/y; // 예외처리
	
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
		int result = x/y; // 예외처리
		
		System.out.println("result = "+result);
	
	}catch(Exception e){
		e.printStackTrace();// 단계적으로 예외를 찾아서 출력
		//System.out.println(e.getMessage());
		//System.out.println("0으로 나눌수 없습니다..."); // 사용자 메세지
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
		int result = x/y; // 예외처리
		
		System.out.println("result = "+result);
	}catch(ArithmeticException e){
		System.out.println("error>.ArithmeticException.............");
	}catch(Exception e){
		//e.printStackTrace();// 단계적으로 예외를 찾아서 출력
		//System.out.println(e.getMessage());
		System.out.println("0으로 나눌수 없습니다...Exception"); // 사용자 메세지
	}finally{
		System.out.println("Finally 무조건 출력됩니다.");
	}
	}
}
//*/