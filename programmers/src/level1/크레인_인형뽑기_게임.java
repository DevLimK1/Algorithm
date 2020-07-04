package level1;

import java.util.Stack;

/**
 * 크레인_인형뽑기_게임
 */

 //스택의 개념이 나왔으니, 스택을 직접 구현해보기 (참고해도 좋음)
public class 크레인_인형뽑기_게임 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> st=new Stack<>();
        
        //풀이 과정
        // 1.moves의 요소에 해당하는 번호로 크레인이 board에 이동해서 인형을 뽑는다.
        // 2.board에 인형이 있으면 뽑은 후 board의 값은 0으로 변경하고, 바구니(스택)에 담기 전(스택top)에 똑같은 인형이 있으면 바구니에서 pop해주고, answer 2개 더해준다.
        //3.반대로, 바구니 상단(스택 top)에 똑같은 인형이 아니면 바구니(스택)에 push해서 담아준다.

        for(int num : moves){
            for(int i=0;i<board.length;i++){

                if(board[i][num-1]!=0){ //board에 인형이 있고,
                   
                    if(st.empty()){//바구니(스택)에 인형이 하나도 없으면
                        st.push(board[i][num-1]);
                        board[i][num-1]=0;// 인형을 뽑았으니 board값은 0 변경
                        break;
                    }

                    if(board[i][num-1]==st.peek()){ //뽑은 인형이랑 바구니에 있는 인형이랑 같으면
                        st.pop(); 
                        answer+=2;
                        board[i][num-1]=0;// 인형을 뽑았으니 board값은 0 변경
                        break;
                    }else{ //바구니에 있는 인형이랑 다르면 
                        st.push(board[i][num-1]); //바구니(스택)에 담기
                        // board[i][num-1]=0; 
                        board[i][num-1]=0;// 인형을 뽑았으니 board값은 0 변경
                        break;
                    }
                  
                } //~end of if
            }//~end of for
        }// ennd of for in
        
        return answer;
    }
    public static void main(String[] args) {
        int[][] board={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves={1,5,3,5,1,2,1,4};
        solution(board,moves);
    }
}