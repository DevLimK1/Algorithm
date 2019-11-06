# 문제 목록

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

# 알고리즘 분류

- ### [stack](https://github.com/DevLimK1/Algorithm/tree/master/stack)
- ### [tree](https://github.com/DevLimK1/Algorithm/tree/master/tree)

# 문법

## JAVA

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
> > -> 예외 처리를 꼭 해줘야한다. readLine()을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업
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

<!-- https://coding-factory.tistory.com/251 -->

---
