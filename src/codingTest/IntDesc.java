package codingTest;

import java.util.Arrays;

public class IntDesc {

	public static void main(String[] args) {

		long n = 117872;
		String[] list = String.valueOf(n).split("");
		
		Arrays.sort(list);
		StringBuilder sb= new StringBuilder();
		for(int i =0; i<list.length; i++) {
			sb.append(list[i]);
		}
		String answer = "";
		answer = sb.reverse().toString();
		System.out.println(answer);
		/*
		String answer ="";
		String sn = String.valueOf(n);
		
		int[] arr = new int[sn.length()];
		for(int i =0; i<sn.length(); i++) {
			String s = sn.substring(i , i+1);
			arr[i] = Integer.parseInt(s);
		}
		
		//��������
		for(int i =0; i<sn.length()-1; i++) { //1
			for(int j =0; j<sn.length()-1; j++) {  // 1 1 7 8 7 2
				if (arr[j]<arr[j+1]) { // arr[1]�� arr[2]���� ������ tmp = arr[2]
					int tmp = arr[j+1]; //  7 8 �� �� 8�� tmp
					arr[j+1] = arr[j]; // 7�� �ڷ� ��ġ
					arr[j] = tmp; 
				}
				
			}
		}
		
		for(int i = 0; i < sn.length(); i++){
			System.out.println(arr[i]);
			answer += arr[i];
        }
		Long.parseLong(answer);
		*/
		
	}

}
