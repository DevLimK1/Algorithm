package math;

//Do it 알고리즘 입문 자바편 p.78
//소수-제곱근 이용
public class PrimeNumber_제곱근성질 {
	public static void main(String[] args) {
		int count=0;   //곱셈, 나눗셈 횟수
		int primeCnt=0;  //소수 개수
		int[] prime=new int[500]; //소수 저장하는 배열
		
		
		//2와 3은 소수
		prime[primeCnt++]=2;
		prime[primeCnt++]=3;
		
		for(int num=5;num<=100;num+=2) { //홀수만
			boolean flag=false;
			for(int i=1;prime[i]*prime[i]<=num;i++) {
				count+=2;
				if(num%prime[i]==0) { //소수로 나누어떨어지면 소수가 아님
					flag=true;
					break;
				}
			} //end of for i
			
			if(!flag) { //한번도 나누어떨어지지 않으면
				prime[primeCnt++]=num; //배열에 소수 저장
				count++; //prime[i]*prime[i]<=num 성립하지 않을시 곱셈 카운터
			}
		}// end of for num
		
		for(int i=0;i<primeCnt;i++)
			System.out.println(prime[i]);
		
		System.out.println("곱셈과 나눗셈 수행 횟수:"+ count);
	}
}
