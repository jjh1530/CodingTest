package codingTest;

public class OverlapString {

	public static void main(String[] args) {
		String s = "ssssdddd";
		String answer ="";
		for(int i =0; i<s.length(); i++) {
			//indexOf ó�� ���� �ε��� �� return ������ -1
			if (s.indexOf(s.charAt(i))==i) {
				answer += s.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
