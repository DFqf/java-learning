public class Day4_ForLoop {
    public static void main(String[] args)
    {
//        for(int day=1;day<=7;day++)
//        {
//            System.out.println("第"+day+"天：学习java 2小时");
//        }

        //输出1-10
        for(int i=1;i<=10;i++)
            System.out.println(i);

        //计算1-100的和
        int sum=0;
        for(int j=1;j<=100;j++)
            sum=sum+j;
        System.out.println("1-100的和："+sum);

        //输出2-20之间的所有偶数
        for(int k=2;k<=20;k++)
        {
            if(k%2==0)
                System.out.println(k);
        }


    }


}
