package codingTest;

public class Cola {

	public static void main(String[] args) {
		int a = 3; // a�� �ָ�
		int b = 2; // b��ŭ ��
		int n = 720; //ó������
		
		int answer =0;
		while(true) {
			if(n < a) {
				break;
			}
			answer += (n/a) *b;
			System.out.println(answer);
			int remain = n%a;
			n= (n/a)*b + remain;
		}
		System.out.println(answer);
	}
}
