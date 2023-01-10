package codingTest;

import java.util.Arrays;
import java.util.HashSet;

public class HealthClothes {

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		// 5���� �л� 2���� �Ҿ���� 1���� ���������� 5-2+1
		
		int answer = n - lost.length; // �⺻ answer = ���ο� - �Ҿ���� �л�
        
		 Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // ���� ü������ ������ �л��� �������� ���
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){ 
                if(lost[i] == reserve[j]){ // �Ҿ���� �л� == ���� �л��� �ֿ��
                    answer++;
                    lost[i] = -1; // 2�� �л��� �Ҿ������ 2�� ����
                    reserve[j] = -1;  // �����ϳ��� ����
                    break; 
                }
            }
        }
        // �������� �л����� ü���� �����ִ� ���
        for(int i=0; i<lost.length; i++){ 
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){ // ���� ������
                    answer++;
                    reserve[j] = -1; //reserve�ϳ� ����
                    break; 
                }
            }
        }
		
		
		
	}
}
