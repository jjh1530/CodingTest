package codingTest;

import java.util.ArrayList;

public class FailePercent {

	public static void main(String[] args) {

		int n = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		int[] answer = new int[stages.length];
		int[] num = new int[500];
		
		for(int i =0; i<num.length; i++) {
			try {
				num[stages[i]] ++;
			} catch (Exception e) {
				break;
			}
		}
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i =0; i<num.length; i++) {
			if (num[i] != 0) {
				arr.add(num[i]);
			}
		}
		int people = stages.length;
		
		for(int i =0; i<arr.size(); i++) { // ���ʴ�� 1�ܰ���� 1�� 3�� 2�� 1�� 1��
			System.out.println((double)arr.get(i)/people * 1000);
			people = people - arr.get(i);
			
		}
		
	}

}
