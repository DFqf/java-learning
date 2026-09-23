public class Day24_StaticFinal {
    public static void main(String[] args)
    {
        //创建两个学习记录对象
        LearningRecord first=new LearningRecord("Java基础");
        LearningRecord second=new LearningRecord("算法练习");

        //调用每个对象自己的普通方法
        first.printInfo();
        second.printInfo();

        // 不需要创建对象，直接通过类名访问静态方法
        System.out.println("当前总记录数："+LearningRecord.getCount());

        //常量：固定为每天学习2小时，不能被修改
        System.out.println("每日学习目标："+LearningRecord.DAILY_TARGET_HOURS+"小时");
    }
}

class LearningRecord{

    //static:所有LearningRecord对象共享同一份count
    private static int count=0;

    //static final 类共享，并且值不能修改；常量名全大写、单词用下划线连接
    public static final int DAILY_TARGET_HOURS=2;

    //非static：每个对象都有自己的一份content
    private String content;

    public LearningRecord(String content){
        this.content=content;

        //每创建一个对象，总数加一
        count++;
    }

    public void printInfo(){
        System.out.println("本次学习内容："+content);
    }

    //static方法只能访问static变量
    public static int getCount(){
        return count;
    }


}
