import java.util.ArrayList;
import java.util.List;

public class Day31_StreamBasic {
    public static void main(String[] args)
    {
        List<String> studyTasks =new ArrayList<>();
        studyTasks.add("复习Java集合");
        studyTasks.add("完成数组算法题");
        studyTasks.add("学习 Java Stream");
        studyTasks.add("整理求职笔记");

        System.out.println("包含 Java 的任务：");


        // stream()：把 List 转成一条数据流
        // filter(...)：只保留符合条件的数据
        // forEach(...)：对每一条留下的数据执行一次操作
        studyTasks.stream().filter(task->task.contains("Java")).forEach(task-> System.out.println(task));
    }
}
