# <center> 목차 </center>

- [문제 목록](#문제-목록)
- [알고리즘 분류](#알고리즘-분류)
- [문법](#문법)

---

## [문제 목록]

- 2019-10-30
  - [problem_9093_java.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9093_java.md) : 백준 온라인저지 9093번 - 단어뒤집기 [https://www.acmicpc.net/problem/9093]<br>
    [알고리즘 분류: stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)
  - [problem_10828_java.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_10828_java.md) : 백준 온라인저지 10828번 - 스택 [https://www.acmicpc.net/problem/10828]<br>
    [알고리즘 분류: stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)
- 2019-11-02

  - [problem_AVLtree_C(except removeTree).md](<https://github.com/DevLimK1/Algorithm/blob/master/tree/problem_AVLtree_C(except%20removeTree)191102.md>) : AVL-tree(균형트리) 문제 (except removeTree) [학교 알고리즘 실습문제]<br>
    [알고리즘 분류: tree](https://github.com/DevLimK1/Algorithm/tree/master/tree)

- 2019-11-05

  - [problem_AVLtree_C_191105.md](https://github.com/DevLimK1/Algorithm/blob/master/tree/problem_AVLtree_C_191105.md) : AVL-tree(균형트리) 문제 [학교 알고리즘 실습문제] <br>
    [알고리즘 분류: tree](https://github.com/DevLimK1/Algorithm/tree/master/tree)

- 2019-11-06

  - [problem_9012_java_191106.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9012_java_191106.md) : 백준 온라인저지 9012번 - 괄호
    [https://www.acmicpc.net/problem/9012]<br>
    [알고리즘 분류: stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)

- 2019-11-07

  - [problem_1874_java_191107.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_1874_java_191107.md) : 백준 온라인저지 1874번 - 스택 수열 <br>
    [https://www.acmicpc.net/problem/1874]<br>
    [알고리즘 분류: stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)

- 2019-11-21
  - [problem_graphAdjacencyList_C.md](https://github.com/DevLimK1/Algorithm/blob/master/graph/problem_graphAdjacencyList_C.md) : Graph AdjacencyList(무방향그래프 인접리스트) 문제 [학교 알고리즘 실습문제] <br>
    [알고리즘 분류 : graph](https://github.com/DevLimK1/Algorithm/tree/master/graph)
  - [problem_graphAdjacencyMatrix_C.md](https://github.com/DevLimK1/Algorithm/blob/master/graph/problem_graphAdjacencyMatrix_C.md) : Graph AdjacencyMatrix(무방향그래프 인접행렬) 문제 [학교 알고리즘 실습문제] <br>
    [알고리즘 분류 : graph](https://github.com/DevLimK1/Algorithm/tree/master/graph)

---

## [알고리즘 분류]

- #### [stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)
- #### [tree](https://github.com/DevLimK1/Algorithm/tree/master/tree)
- #### [graph](https://github.com/DevLimK1/Algorithm/tree/master/graph)

---

## [문법]

- [JAVA](#<JAVA>)
- [C](#<C>)

## `<JAVA>`

> ### [Split함수를 활용하여 단어를 String배열에 한글자씩 저장]
>
> ```java
> String word = "POWER"; //스트링 문자 POWER
> String[] array_word; // 스트링을 담을 배열
>
> array_word = word.split(""); //배열에 한글자씩 저장하기
>
> for(int i=0;i<array_word.length;i++) { //출력
>    System.out.println(array_word[i]);
> }
> ```
>
> 활용 문제: [problem_9012_java](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9012_java_191106.md) , [problem_9093_java](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9093_java.md)

---

> ### [charAt 함수를 활용하여 단어를 char배열에 한글자씩 저장]
>
> ```java
> String word = "POWER"; //스트링 문자 POWER
> char[] array_word = new char[word.length()]; // 스트링을 담을 배열
>
> for(int i=0;i<array_word.length;i++){
> 	array_word[i]=(word.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
> 	System.out.println(array_word[i]); //출력
> }
> ```
>
> 활용 예제:[problem_1874_java_191107.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_1874_java_191107.md)

<!-- https://coding-factory.tistory.com/73 -->

---

> ### [BufferedReader]
>
> - Scanner를 통해 입력을 받을경우 Space Enter를 모두 경계로 인식해서 데이터를 입력받음
> - BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정됨
> - 많은 양의 데이터를 입력받은 경우 BufferedReader를 통해 입력받는 것이 작업속도가 빠름
>
> ```java
> BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
> String s = bf.readLine(); //String
> int i = Integer.parseInt(bf.readLine()); //Int
> ```
>
> > -> readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른타입으로 입력을 받을려면 형변환을 해주어야한다.<br>
> > -> 예외 처리를 꼭 해줘야한다. readLine()을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업 **_(public static void main(String[] args) throws IOException)_**
>
> 활용 예제: [problem_9012_java](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9012_java_191106.md) , [problem_9093_java](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9093_java.md)
>
> ### [BufferedWriter]
>
> ```java
> BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
> String s = "abcdefg";//출력할 문자열
> bw.write(s+"\n");//출력
> bw.flush();//남아있는 데이터를 모두 출력시킴
> bw.close();//스트림을 닫음
> ```
>
> > -> BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush()/ close() 를 반드시 호출해 주어 뒤처리를 해주어야한다.<br>
> > -> bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야한다.
>
> 활용 예제: [problem_9093_java.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_9093_java.md)

<!-- https://coding-factory.tistory.com/251 -->

---

> ### [String에 문자를 덧붙일 때 String + String 말고 StringBuilder를 사용하자]
>
> - String에 +=을 하는 건 기존 String의 내용에 뒤의 String의 내용을 이어붙인 새로운 문자열을 만들어서 담고, 원래의 문자열은 더 참조하는 레퍼런스가 없으면 GC에 들어감
> - 버려진 문자열이 정확히 언제 메모리에서 완전히 해제되는지는 모르겠지만, 그 전까지는 계속 메모리상에 누적되어 큰 용량을 차지함
> - 문자열을 길게 계속 이어붙이려면 StringBuilder를 사용하는게 성능면에서 좋음
>
> ```java
> StringBuilder sb=new StringBuilder();
> sb.append("A");
> sb.append("B");
> System.out.println(sb);
>
> 결과:
> AB
> ```
>
> 활용 예제:[problem_1874_java_191107.md](https://github.com/DevLimK1/Algorithm/blob/master/stack/problem_1874_java_191107.md)

<!-- https://hardlearner.tistory.com/288 -->
<!-- https://www.acmicpc.net/board/view/37647 -->

---

## `<C>`

> ### [2차원배열 동적할당]
>
> ```C
> int matrix**; //2차원 배열선언
> matrix = (int **)malloc(sizeof(int *)*(max_vertex+1));//인접행렬 메모리 할당
>
> for (i = 0; i <= max_vertex; i++) {
>   matrix[i] = (int *)malloc(sizeof(int)*(max_vertex+1));//i행 메모리 할당
>    }
>
> ```
>
> 활용 예제:[problem_graphAdjacencyMatrix_C.md](https://github.com/DevLimK1/Algorithm/blob/master/graph/problem_graphAdjacencyMatrix_C.md)

---

> ### [memset함수]
>
> - 어떤 메모리의 시작점부터 연속된 범위를 어떤 값으로(바이트 단위) 모두 지정하고 싶을 때 사용하는 함수
>
> ```C
> void * memset(void *ptr,int value,size_t num);
> ```
>
> `->` _ptr_: 채우고자 하는 메모리의 시작 포인터(시작주소)<br> `->` _value_: 메모리에 채우고하는 값 (int형이지만 내부에서는 unsigned char(1byte)로 변환되어서 저장됨)<br> `->` _num_: 채우고자 하는 바이트의 수(메모리의 크기)
>
> ```C
> for (i = 0; i <= max_vertex; i++) {
>   graph->matrix[i] = (int *)malloc(sizeof(int)*(max_vertex+1));//i행 메모리 할당
>   memset(graph->matrix[i], 0, sizeof(int)*(max_vertex+1)); //메모리 0으로 초기화
> }
> ```
>
> 활용 예제:[problem_graphAdjacencyMatrix_C.md](https://github.com/DevLimK1/Algorithm/blob/master/graph/problem_graphAdjacencyMatrix_C.md)
