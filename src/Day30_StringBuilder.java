public class Day30_StringBuilder {
    public static void main(String[] args)
    {
        //创建一个“可不断追加文字”的对象
        StringBuilder report =new StringBuilder();

        //append()表示：把内容追加到末尾
        report.append("----本周学习报告----\n");
        report.append("java学习时长").append(8).append("小时\n");
        report.append("算法完成题数:").append(5).append("道\n");
        report.append("下一步：学习Stream流\n");

        //StringBuilder 最后转成普通String 再输出
        String result=report.toString();
        System.out.println(result);

    }
}
