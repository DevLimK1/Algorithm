package SourceCode.src.greedy;

import java.util.*;

/*
회의실배정
        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
        2 초	128 MB	47121	13254	9873	28.421%

        문제
        한 개의 회의실이 있는데 이를 사용하고자 하는 N개의 회의에 대하여 회의실 사용표를 만들려고 한다. 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자. 단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다. 회의의 시작시간과 끝나는 시간이 같을 수도 있다. 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.

        입력
        첫째 줄에 회의의 수 N(1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N+1 줄까지 각 회의의 정보가 주어지는데 이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 시작 시간과 끝나는 시간은 2^31-1보다 작거나 같은 자연수 또는 0이다.

        출력
        첫째 줄에 최대 사용할 수 있는 회의의 최대 개수를 출력한다.

        예제 입력 1
        11
        1 4
        3 5
        0 6
        5 7
        3 8
        5 9
        6 10
        8 11
        8 12
        2 13
        12 14
        예제 출력 1
        4
        힌트
        (1,4), (5,7), (8,11), (12,14) 를 이용할 수 있다.
*/
//200703풀이시작-풀이완료
public class main_1931 {
    /* solution 1)
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());	// 회의 수
        int[][] time = new int[N][2];	// 회의 시간
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1] == o1[1])	// 종료시간이 같으면
                    return o1[0] - o2[0];
                else return o1[1] - o2[1];
            }
        });

        int count = 1, com = time[0][1];
        for (int i = 1; i < N; i++) {
            if(com <= time[i][0]) {
                count++;	// 끝나기 전에 시작시간이 잡히면 패스
                com = time[i][1];
            }
        }
        System.out.println(count);
    }*/

    //solution2)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0; //회의실 이용 가능한 갯수

        ArrayList<MeetingRoom> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(new MeetingRoom(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(list, new Comparator<MeetingRoom>() { //회의가 종료되는 시간의 숫자가 작은 순으로 오름차순 정렬
            @Override
            public int compare(MeetingRoom o1, MeetingRoom o2) {
                if(o1.end==o2.end){
                    return o1.start-o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int currentEnd=list.get(0).end;
        count++;
        for(int i=1;i<list.size();i++){
            //현재 진행중인 회의가 끝나는 시간보다 다음에 진행할 회의 시작시간이 크거나 같으면
            if(currentEnd<=list.get(i).start){
                currentEnd=list.get(i).end;
                count++;
            }
        }

        System.out.println(count);


    }
}

class MeetingRoom {
    int start; //시작시간
    int end; //종료시간

    public MeetingRoom(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "MeetingRoom{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
