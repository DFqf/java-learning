import java.util.ArrayDeque;
import java.util.Deque;


public class Day19_Stack {
    public static void main(String[] args)
    {
        Deque<String> studyStack=new ArrayDeque<>();

        studyStack.push("Java基础");
        studyStack.push("算法练习");
        studyStack.push("项目开发");

        System.out.println("当前栈："+studyStack);
        System.out.println("栈顶内容："+studyStack.peek());

        String currentTask=studyStack.pop();
        System.out.println("刚完成的任务："+currentTask);

        System.out.println("剩余任务："+studyStack);

        while(!studyStack.isEmpty()){
            System.out.println("取出："+studyStack.pop());
        }
    }

}
