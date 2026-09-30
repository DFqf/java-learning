import java.util.ArrayList;
import java.util.List;

public class Day34_MethodReference {
    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        tasks.add("复习 Java");
        tasks.add("完成算法题");
        tasks.add("学习 Spring Boot");

        // Lambda 写法
        System.out.println("Lambda 输出：");
        tasks.forEach(task -> System.out.println(task));

        // 方法引用写法：效果完全相同
        System.out.println("方法引用输出：");
        tasks.forEach(System.out::println);

        // 把每个任务转换为大写
        List<String> upperTasks = tasks.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("大写后的任务：" + upperTasks);
    }
}