import java.util.ArrayList;
import java.util.List;

public class Day28_Lambda {
    public static void main(String[] args)
    {
        List<String> studyTasks=new ArrayList<>();
        studyTasks.add("复习Java");
        studyTasks.add("完成算法题");
        studyTasks.add("学习MySQL");

        //写法1：你已经学过的增强for循环
        System.out.println("for循环输出：");
        for(String task:studyTasks){
            System.out.println("任务："+task);
        }

        //写法2：lambda+forEach
        System.out.println("Lambda输出：");
        studyTasks.forEach(task-> System.out.println("任务："+task));
    }
}
