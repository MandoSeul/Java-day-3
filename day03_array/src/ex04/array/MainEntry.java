package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		char[] ch ; // �迭 ����
		ch = new char[4]; // �迭 ����
		
		//2.
		char[] ch2 = new char[3];//�迭���� �� ����
		
		//�迭�ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		// 3.
		char[] ch3 = {'J','A','V','A'};
		
		// �迭�� ����
		System.out.println("�迭�� ���� : " + ch3.length);
		
		// �迭�� ���� ���
		System.out.println(ch[2]);
		for(int i =0; i<ch3.length; i++)
			System.out.println(ch3
					[i]);
	}
}
