package src.dynamic;

public class 최소비용계단오르기 {
    public static int minCostClimbingStairs(int[] cost) {//계단별 비용이 들어간 배열
        int case1 = 0, case2 = 0, current; //계단 오를 때 비교할 경우의 수 2가지, current:임시저장변수

        for (int i = cost.length - 1; i >= 0; --i) { //거꾸로 비용계산을 한다.
            current = cost[i] + Math.min(case1, case2);//현재값+최소비용
            case2 = case1;
            case1 = current;
        }
        return Math.min(case1, case2);
    }

    public static void main(String[] args) {
//        int[] cost = new int[]{1, 2, 3, 4, 5, 6, 7};
//        int[] cost = new int[]{10,15,20};
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        int result = minCostClimbingStairs(cost);
        System.out.println(result);

    }
}
