package codingTest;

public class PlusMinus {
	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true, true, false};
		int answer =0;
		for(int i =0; i<absolutes.length; i++) {
			if (signs[i] == true) {
				answer += absolutes[i];
				System.out.println(absolutes[i]);
			}else {
				answer -= absolutes[i];
			}
		}
		System.out.println(answer);
	}
}
