public class Day9_Constructor {
    public static void main(String[] args)
    {
        JobSeeker student=new JobSeeker(
                "闫仕玉",
                "太原理工大学",
                "Java 后端开发",
                2
        );

        student.printInfo();
    }
}

class JobSeeker{
    String name;
    String school;
    String targetJob;
    int studyHours;

    //构造方法：名字必须和类名完全一样
//    名字必须和类名相同；
//    没有返回类型，不能写 void；
//    创建对象时由 new 自动调用。
    JobSeeker(String name,String school,String targetJob,int studyHours)
    {
        this.name=name;
        this.school=school;
        this.targetJob=targetJob;
        this.studyHours=studyHours;
    }

    void printInfo()
    {
        System.out.println("姓名："+name);
        System.out.println("学校："+school);
        System.out.println("目标岗位："+targetJob);
        System.out.println("每日学习时长："+studyHours);
    }

}
