import java.util.ArrayDeque;
import java.util.Queue;


public class Day18_Queue {
    public static void main(String[] args)
    {
        Queue<String> tasks=new ArrayDeque<>();

        tasks.offer("学习Java");
        tasks.offer("练习算法");
        tasks.offer("完成项目");

        System.out.println("当前任务队列："+tasks);
        System.out.println("下一个任务："+tasks.peek());

        while(!tasks.isEmpty()){
            String currentTask=tasks.poll();
            System.out.println("正在处理："+currentTask);
        }

        System.out.println("队列是否为空："+ tasks.isEmpty());
    }
}
