package sort;


/*
선택정렬(Selection Sort)

선택정렬은 오름차순으로 정렬할 때,
배열중에 가장 작은 원소들을 왼쪽부터 채워나가면서 숫자를 정렬하는 방법입니다.

최소원소를 찾은 후, 

최소원소를 맨 왼쪽원소와 교환(즉, 왼쪽부터 정렬된 원소로 채워진다.)

왼쪽원소를 제외하고 원소가 하나남을때 까지 이단계를 반복

---------------------------------
선택정렬의 비교횟수를 구해보면

1단계 => n개의 원소 비교

2단계 => n-1 개의 원소 비교

3단계 => n-2 개의 원소 비교
.
.
.
를 하여 비교 횟수는

n(n-1) /2 가 됩니다.

즉, 시간복잡도는 O(n^2)이 됩니다.
 */
public class 선택정렬 {
	public static void main(String[] args) {
		int[] arr= {66, 10, 1, 99, 5};
		int select=0;
		int select_idx=0;
		
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false; //교환이 일어나는지 지표
			select=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(select>arr[j]) { //선택한 값이 더 크면
					select=arr[j];
					select_idx=j;
					flag=true;
				}
			}
			if(!flag) //더 이상 교환이 이루어지지 않으면(다 정렬되어있다는 것)
				break;
			
			int temp=arr[i];
			arr[i]=arr[select_idx];
			arr[select_idx]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

/*
 더 간결한 풀이!
 		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			select=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[select]>arr[j]) { //선택한 값이 더 크면
					select=j;
					flag=true;
				}
			}
			if(!flag) //더 이상 교환이 이루어지지 않으면(다 정렬되어있다는 것)
				break;
			
			int temp=arr[i];
			arr[i]=arr[select];
			arr[select]=temp;
		}
 */
