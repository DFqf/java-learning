public class Day10_Encapsulation {
    public static void main(String[] args)
    {
        LearningPlan plan=new LearningPlan("Java后端开发",2);
        plan.setStudyHours(3);
        plan.setStudyHours(-1);
        System.out.println("目标岗位："+plan.getTargetJob());
        System.out.println("每日学习时长："+plan.getStudyHours());
    }
}

class LearningPlan
{
    private String targetJob;
    private int studyHours;

    LearningPlan(String targetJob,int studyHours)
    {
        this.targetJob=targetJob;
        setStudyHours(studyHours);
    }

    public String getTargetJob()
    {
        return targetJob;
    }

    public int getStudyHours()
    {
        return studyHours;
    }

    public void setStudyHours(int studyHours)
    {
        if(studyHours>=0&&studyHours<=24)
            this.studyHours=studyHours;
        else
            System.out.println("学习时长必须在0-24之间，修改失败");
    }

}
