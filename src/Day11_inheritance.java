public class Day11_inheritance {
    public static void main(String[] args)
    {
        StudentApplicant student=new StudentApplicant("闫仕玉","北京","软件工程");
        student.introduce();
        student.study();
    }
}

class Applicant{
    private String name;
    private String targetCity;

    Applicant(String name,String targetCity) {
        this.name=name;
        this.targetCity=targetCity;
    }

    public void introduce(){
        System.out.println("姓名："+name);
        System.out.println("目标城市："+targetCity);
    }

    public String getName(){
        return name;
    }
}

class StudentApplicant extends Applicant{
    private String major;

    StudentApplicant(String name,String targetCity,String major){
        super(name,targetCity);
        this.major=major;
    }

    public void study(){
        System.out.println(getName()+"的专业是："+major);
        System.out.println("正在准备java求职");
    }

}


