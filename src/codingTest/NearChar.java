package codingTest;

public class NearChar {

	public static void main(String[] args) {

		String s = "banana";
		int[] answer = new int[s.length()];
		answer[0] = -1;
		for(int i =1; i<s.length(); i++) { // b a n a n a
			int x= s.lastIndexOf(s.charAt(i),i-1); // 5��°��� a�� 5��° a�� ������ ���� �ε��� ��ȣ�� ã��
			if (x!= -1) {
					answer[i] = i-x;  // i�� 5�̸�  5 - 3(ã�� �ε���) 
			}else {
				answer[i] = x; // ��ã���� -1
			}
		}
		
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
