package codingTest;

import java.util.Arrays;

public class HalFame {

	public static void main(String[] args) {

		int[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		int[] Hall = new int[k];
		int[] answer =  new int[score.length];
		int min = 9999;
		
		for(int i=0; i<score.length; i++) {
			try {
				Hall[i] = score[i]; // Hall�� 10 100 20 �־��
				if (min>Hall[i]) {
					min = Hall[i]; // min = 10
				}
				answer[i] = min; // 10 10 10 
			} catch (Exception e) { // score[3] ���ĺ���
				int hmin =9999;
				int a = 0;
				for(int j =0; j<Hall.length; j++) {
					if (Hall[j] == min) { // 100 ���� 2������ �� �Ѱ���
							if(score[i]>Hall[j]) {  // 150�� 10���� ũ��
								Hall[j] = score[i];  // 10�� 150����
								a = j;
								
						}
						
					}
					
					
				}
				if (hmin> Hall[a]) {  // hmin���� Hall�� �ּҰ�
					hmin = Hall[a];
				}
				Arrays.sort(Hall);
				min = Hall[0];
				answer[i] = hmin;
			}
			
		}
		for(int i =0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}

}
