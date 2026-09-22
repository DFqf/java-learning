import java.io.IOException;   //表示文件读写时可能发生的异常
import java.nio.file.Files;   //提供读文件、写文件等工具方法
import java.nio.file.Path;    //表示文件的位置/路径

public class Day21_FileReadWrite {
    public static void main(String[] args)
    {


//        创建文件路径
//        准备要写入的文字
//        将文字写入文件
//        再从文件读取文字
//        输出读取结果

        // 创建一个 Path 类型变量，表示文件名为 study-plan.txt
        // 文件会保存在当前项目的运行目录中
        Path filePath = Path.of("study-plan.txt");

        // try 中放“可能出错”的代码
        try {

            // 创建 String 类型变量 content，保存多行文字
            // """ 和 """ 之间可以直接写多行内容
            String content = """
                    学习计划
                    1. Java 基础
                    2. 算法练习
                    3. 后端项目
                    """;

            // 将 content 中的文字写入 filePath 指定的文件
            // 如果文件不存在，会创建它；如果已经存在，会覆盖原内容
            Files.writeString(filePath, content);

            // 从 filePath 指定的文件中，读取全部文字
            // 读取结果保存到 readContent 变量中
            String readContent = Files.readString(filePath);

            // 在控制台输出提示文字
            System.out.println("文件内容：");

            // 在控制台输出刚刚从文件中读取的内容
            System.out.println(readContent);

            // 如果 try 中发生 IOException，就执行这里的代码
        } catch (IOException e) {

            // 文件读写失败时，输出提示信息
            System.out.println("文件读写失败。");
        }
    }
}
