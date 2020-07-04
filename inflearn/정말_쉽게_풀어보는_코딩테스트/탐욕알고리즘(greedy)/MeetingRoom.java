import java.util.Arrays;
import java.util.Comparator;

// 그리디 알고리즘
//200702 풀이완료
class Interval {
    int start;
    int end;

    Interval() {
        this.start = 0;
        this.end = 0;
    }

    Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}

public class MeetingRoom {

    public boolean solve(Interval[] intervals) {
        if (intervals == null)
            return false;


        Arrays.sort(intervals, comp);
        print(intervals); //start : 0,5,15

        //겹치는 겹치는 범위가 있으면 false
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }
        return true;
    }

    Comparator<Interval> comp = new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {

            return o1.start - o2.start; //오름차순
//            return o2.start - o1.start; //내림차순
        }
    };

    public void print(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }

    public static void main(String[] args) {
        // int input[][]={{0,30},{5,10},{15,20}};
        // int input[][]={{7,10},{2,4}};
        // solution(input);
        System.out.println("hello");
        MeetingRoom mr = new MeetingRoom();

        Interval int1 = new Interval(15, 20);
        Interval int2 = new Interval(5, 10);
        Interval int3 = new Interval(0, 30);

//        Interval int1=new Interval(7,10);
//        Interval int2=new Interval(2,4);


        Interval[] intervals = {int2, int1, int3};
//        Interval[] intervals = { int2, int1 };
        // System.out.println(intervals);
        // mr.solove(intervals);
        System.out.println(mr.solve(intervals));


    }
}