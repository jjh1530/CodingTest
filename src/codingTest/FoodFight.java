package codingTest;

public class FoodFight {

	public static void main(String[] args) {

		int[] food = {1,3,4,6}; //0 �� �� 1�� 3�� 2�� 4 �� 3�� 6�� 1223330333221
		String half = "";
		for(int i =1; i<food.length; i++) {
			for(int j =0; j<food[i]/2; j++) {
				half += i;
			}
		}
		StringBuilder sb = new StringBuilder(half);
		String revereHalf =sb.reverse().toString();
		String answer = half + "0" +revereHalf; 
		System.out.println(answer);
	}

}
