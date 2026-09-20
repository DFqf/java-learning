import java.security.PublicKey;

public class Day7_Methods {
    public static void main(String[] args)
    {
        printWelcome();

        int totalMinutes=sumStudyMinutes(120,90);
        System.out.println("两天总学习时长："+totalMinutes);

        boolean reachedGoal=isGoalReached(totalMinutes,180);
        System.out.println("是否完成目标："+reachedGoal);
    }

    //没有返回值，只负责输出内容
    public static void printWelcome()
    {
        System.out.println("开始学习：Java方法");
    }

    //接受两个整数，返回他们的和
    public static int sumStudyMinutes(int firstDay,int secondDay)
    {
        return firstDay+secondDay;
    }

    //接受总时长和目标时长，返回true 或 false
    public static boolean isGoalReached(int totalMinutes,int goalMinutes)
    {
        return totalMinutes>=goalMinutes;
    }
}
