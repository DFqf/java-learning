import java.util.ArrayList;
import java.util.List;


public class Day25_List {
    public static void main(String[] args){

        //List是列表规则，ArrayList是具体实现
        List<String> studyTasks=new ArrayList<>();

        //添加元素：下标从0开始
        studyTasks.add("复习Java");
        studyTasks.add("完成一道算法题");
        studyTasks.add("阅读 Spring Boot 资料");
        studyTasks.add("完成一道算法题");

        //输出整个列表
        System.out.println("学习任务："+studyTasks);

        //根据下标获取元素
        System.out.println("第一个任务："+studyTasks.get(0));

        //修改下标为2的元素
        studyTasks.set(2,"学习MySQL基础");
        System.out.println("修改后："+studyTasks);

        //删除指定内容的元素：只会删掉找到的第一个
        studyTasks.remove("完成一道算法题");
        System.out.println("删除一次算法任务后:"+studyTasks);

        //列表长度
        System.out.println("剩余任务数："+studyTasks.size());

        //按顺序遍历列表
        for(String task:studyTasks){
            System.out.println("待完成："+task);
        }
    }
}
