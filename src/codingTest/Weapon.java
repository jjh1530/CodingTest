package codingTest;

import java.util.ArrayList;

public class Weapon {

	public static void main(String[] args) {

		int number = 10; // 1
		int limit = 3; // 4를 못함 
		int power = 2; 
		int answer =0;
		int[] arr = new int[number+1];
		
		int count = 0;
		int x= 0;
		
		for(int i =1; i<=number; i++) { // 1~10번 기사
			count = 0;
			for(int j =1; j<=number; j++) {
				if (i%j ==0) {
					count++;
				}
			}
			arr[x] = count; // 약수 넣음 1 2 2 3 2 4 2 4 3 4
			x++;
		}
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>limit) {
				arr[i] = power;
			}
			answer += arr[i];
		}
	
		System.out.println(answer);
	}

}
