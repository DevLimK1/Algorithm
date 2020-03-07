# 문제

```
https://programmers.co.kr/learn/courses/30/lessons/42748
 문제 설명)
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아
 return 하도록 solution 함수를 작성해주세요.

제한사항)
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.

입출력 예)
array							commands						return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	   [5, 6, 3]

입출력 예 설명)
[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 
```



# 첫 풀이(200307)

(생각&구현)

1)x번째`~` y번째의 인덱스 원소들을 따로 추출을 해서 또 다른 배열에 생성  
2)오름차순으로 정렬  
3) 해당 인덱스 번호 추출 --> answer 배열에 저장  
4) 1`~`3번의 과정을 주어진 2차원배열의 길이까지 반복

##### (No Library ver.)

```java

public class lv1_Ex03_k번째수 {
	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i=0;i<commands.length;i++) {
	        	int start=commands[i][0]-1; //원본 배열에서 추출 할 시작 인덱스
	        	int end=commands[i][1]-1; // 원본 배열에서 추출 할 끝 인덱스
	        	int target=commands[i][2]; //answer[]에 저장 될 숫자
	        	int count=0;
	        	int[] temp = new int[array.length]; //추출 한 원소들을 저장할 임시배열
	        	
	        	for(int j=start;j<=end;j++) { 
	        		temp[count]= array[j];//원본 배열에서 지정 범위 원소 따로 추출해서 저장
	        		count++; //임시배열 index
	        	} //end for j
	        	
	        	for(int p=0;p<count-1;p++) { 
	        		for(int q=0;q<count-1-p;q++) {
	        			if(temp[q]>temp[q+1]) { //임시 배열 오름차순 정렬하기(버블정렬)
	        				int tmp=temp[q];
	        				temp[q]=temp[q+1];
	        				temp[q+1]=tmp;
	        			}
	        		} // end for q
	        	}//end for p
	        	
	        	answer[i]=temp[target-1];
	        
	        } //end for i
	        
	        return answer;
	    }

	public static void main(String[] args) {
		int[] intArr= new int[50];
		intArr=solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
		System.out.print(Arrays.toString(intArr));
//		Arrays.deepToString(intArr)은 사용x 왜냐하면, 다차원 배열 출력일 때 쓰임
	} // end main
}
```

# 다른 사람 풀이

해당 코드의 사람은 라이브러리를 사용하여 문제를 풀었다.

라이브러리를 사용하니 굉장히 간결하게 풀리는데, 개인적인 생각으로는 라이브러리로 풀지 않고 구현해보는 것이 실력향상에 더 중요하다고 생각한다.

우선 다른 사람의 코드에서 사용한 내가 모르는 문법사항들은 정리를 해야겠다. 

##### (Library ver.)

```java

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
```

> ### (문법사항 체크 √)
>
> #### [Arrays.copyOfRange를 사용하여 범위를 지정하여 배열을 복사해보자]
>
> - 매개변수 배열의 **특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환**
>
> - **첫 번째 매개변수**로 복사의 대상이 될 원본 배열을 전달받음
>
> - **두 번째 매개변수**로는 원본 배열에서 복사할 **시작 인덱스**를 전달받고
> - **세 번째 매개변수**로는 세 번째 매개변수로 전달된 **인덱스 바로 전**까지의 배열 요소까지만 복사
>
> - 원본 배열과 같은 타입의 복사된 **새로운 배열을 반환**
>
> ```java
> int[] arr1 = {1, 2, 3, 4, 5};
> 
> int[] arr2 = Arrays.copyOfRange(arr1, 2, 4); // arr1 원본 배열을 index 2 ~ 3 까지 복사
> 
> for (int i = 0; i < arr2.length; i++) {
> 
>     System.out.print(arr2[i] + " ");
> }
> 
> 실행 결과
> 3 4 
> ```
>
> 활용 예제:
>
> > 참고(Reference): http://tcpschool.com/java/java_api_arrays

---

> #### [Arrays.sort() : 오름차순 정렬]
>
> - 전달받은 배열의 모든 요소를 **오름차순**으로 정렬
>- 매개변수로 정렬할 배열을 전달받으며, **전달받은 원본 배열의 순서를 변경**
> 
>```java
> int[] arr = {5, 3, 4, 1, 2};
> 
>Arrays.sort(arr);
> 
>for (int i = 0; i < arr.length; i++) {
> 
>     System.out.print(arr[i] + " ");
> 
> }
> 
> 실행 결과
> 1 2 3 4 5 
> ```
> 
> 활용 예제:
> 
> > 참고(Reference): http://tcpschool.com/java/java_api_arrays