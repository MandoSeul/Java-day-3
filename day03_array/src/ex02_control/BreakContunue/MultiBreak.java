package ex02_control.BreakContunue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag=true;
		first:{
			second:{
				third:{
		int i =100;
		System.out.println("Befor the break");
		if(flag) break second; // break 식별자; 식별자 위치까지 탈출
		System.out.println("This won't execute");
				}//third end
		System.out.println("seul kee");
			}//second end
		System.out.println("Ths is after second block");
		} // first end
		System.out.println("haha");
	}
}
