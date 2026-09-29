import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day29_StudyTaskManager {

    // 所有学习任务放在这个列表中
    private static List<StudyTask> tasks = new ArrayList<>();

    // Scanner 用来读取你在控制台输入的文字
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 学习任务管理器 ===");

        // true 表示一直循环显示菜单，直到用户选择退出
        while (true) {
            printMenu();

            System.out.print("请输入菜单编号：");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;

                case "2":
                    showTasks();
                    break;

                case "3":
                    completeTask();
                    break;

                case "4":
                    printSummary();
                    break;

                case "0":
                    System.out.println("学习结束，继续加油！");
                    return; // 直接结束 main 方法，程序退出

                default:
                    System.out.println("输入无效，请输入 0 到 4。");
            }
        }
    }

    // 专门负责显示菜单的方法
    public static void printMenu() {
        System.out.println();
        System.out.println("1. 添加任务");
        System.out.println("2. 查看任务");
        System.out.println("3. 完成任务");
        System.out.println("4. 查看统计");
        System.out.println("0. 退出程序");
    }

    // 添加一个任务
    public static void addTask() {
        System.out.print("请输入学习任务名称：");
        String title = scanner.nextLine();

        // 防止用户直接按回车，创建空任务
        if (title.trim().isEmpty()) {
            System.out.println("任务名称不能为空。");
            return;
        }

        StudyTask task = new StudyTask(title);
        tasks.add(task);

        System.out.println("添加成功：" + title);
    }

    // 查看所有任务
    public static void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("当前没有学习任务。");
            return;
        }

        System.out.println("=== 当前学习任务 ===");

        // i 从 0 开始，但给用户展示时从 1 开始
        for (int i = 0; i < tasks.size(); i++) {
            System.out.print((i + 1) + ". ");
            tasks.get(i).printInfo();
        }
    }

    // 把某一个任务标记为已完成
    public static void completeTask() {
        if (tasks.isEmpty()) {
            System.out.println("当前没有任务可以完成。");
            return;
        }

        showTasks();
        System.out.print("请输入要完成的任务编号：");

        try {
            String input = scanner.nextLine();
            int taskNumber = Integer.parseInt(input);

            // 用户看到的编号从 1 开始，List 下标从 0 开始
            int index = taskNumber - 1;

            if (index < 0 || index >= tasks.size()) {
                System.out.println("任务编号不存在。");
                return;
            }

            StudyTask task = tasks.get(index);
            task.markCompleted();

            System.out.println("已完成：" + task.getTitle());

        } catch (NumberFormatException e) {
            System.out.println("请输入数字编号，例如：1。");
        }
    }

    // 统计已完成和未完成的任务数量
    public static void printSummary() {
        int completedCount = 0;

        for (StudyTask task : tasks) {
            if (task.getStatus() == TaskStatus.DONE) {
                completedCount++;
            }
        }

        System.out.println("任务总数：" + tasks.size());
        System.out.println("已完成：" + completedCount);
        System.out.println("未完成：" + (tasks.size() - completedCount));
    }
}

// 枚举：任务状态只能是 TODO 或 DONE 两种之一
enum TaskStatus {
    TODO,
    DONE
}

// 一个 StudyTask 对象，代表一条学习任务
class StudyTask {

    // 每个任务自己的数据，外部不能直接随便修改
    private String title;
    private TaskStatus status;
    private LocalDateTime createdAt;

    // 日期时间的显示格式
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    // 构造方法：创建任务时自动设置名称、状态和创建时间
    public StudyTask(String title) {
        this.title = title;
        this.status = TaskStatus.TODO;
        this.createdAt = LocalDateTime.now();
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    // 修改任务状态为已完成
    public void markCompleted() {
        status = TaskStatus.DONE;
    }

    // 输出一条任务的完整信息
    public void printInfo() {
        String formattedTime = createdAt.format(FORMATTER);

        System.out.println(
                "任务：" + title
                        + " | 状态：" + status
                        + " | 创建时间：" + formattedTime
        );
    }
}