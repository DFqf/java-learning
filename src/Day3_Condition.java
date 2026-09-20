public class Day3_Condition {
    public static void main(String[] args)
    {
        int studyMinutes=100;
        boolean finishedExercise=true;

        if(studyMinutes>=120 && finishedExercise)
            System.out.println("今天完成学习任务，继续保持");
        else if (studyMinutes>=60)
            System.out.println("今天有进展");
        else
            System.out.println("今天先完成30分钟学习任务");
    }
}
