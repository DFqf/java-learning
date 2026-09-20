public class Day6_Array {
    public static void main(String[] args)
    {
        int[] studyMinutes={120,90,150,0,60};
        System.out.println("第一天学习时长："+studyMinutes[0]);
        System.out.println("数组长度："+studyMinutes.length);

        int totalMinutes=0;
        for(int i=0;i<studyMinutes.length;i++)
        {
            totalMinutes=totalMinutes+studyMinutes[i];
            System.out.println("第"+(i+1)+"天学习："+studyMinutes[i]+"分钟");
        }

        double averageMinutes=(double)totalMinutes/studyMinutes.length;

        System.out.println("总学习分钟数："+totalMinutes);
        System.out.println("平均每天学习分钟数"+averageMinutes);
    }
}
