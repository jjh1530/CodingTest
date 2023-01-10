package codingTest;

import java.util.ArrayList;
import java.util.Stack;

public class Crain {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},
						{0,0,1,0,3},
						{0,2,5,0,1},
						{4,2,4,4,2},
						{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		 // 1. ���ӵ� �������� ���ŵ� Ƚ��.
        int answer = 0;
        // 2. ������ ���� stack �ٱ���.
        Stack<Integer> stack = new Stack<>();       
        
        // 3. moves�� ũ��� ũ������ �� �̵�Ƚ��.
        for(int i =0;i<moves.length;i++){
            // 3-1. j �ε����� �̿��� ������ ���� Ž��. ���� moves�� ���Ҹ� �̿��� Ž��.
            for(int j=0;j<board.length;j++){
                // 3-2. j���� moves�� ũ������ġ ���� �ش��ϴ� ���� ������ �����Ѵٸ�.
                if(board[j][moves[i]-1] != 0 ) {   //ũ������ ���� ���ڵ�      
                    // 3-3. stack�� ������� �ʰ�, ���� ������ �ֻ�ܿ� �ִ� ������ ũ�������� ���� ������ ���ٸ�
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){
                        // �������� �����ϴ� Ƚ�� ����.
                        answer+=2;
                        // �ٱ��Ͽ� �ִ� ������ ����.
                        stack.pop();
                        // ũ�������� ���� ������ 0���� ����� �����ش�.
                        board[j][moves[i]-1] = 0;
                        break;
                    // 3-4. �� ���� ���� ������ �ٱ��Ͽ� ���� �� 0���� �����ش�.    
                    }else{
                        stack.push(board[j][moves[i]-1]);                      
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }                        
            }
        }
		
	}

}
