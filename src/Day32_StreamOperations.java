import java.util.ArrayList;
import java.util.List;

//filter(...)	筛选符合条件的数据	Stream
//map(...)	把每条数据转换成另一种形式	Stream
//count()	统计当前还剩多少条数据	long
//toList()	把处理结果收集为 List	List

public class Day32_StreamOperations {
    public static void main(String[] args)
    {
        List<Integer> studyMinutes=new ArrayList<>();
        studyMinutes.add(120);
        studyMinutes.add(45);
        studyMinutes.add(90);
        studyMinutes.add(20);
        studyMinutes.add(150);

        // 筛选学习时长不少于 60 分钟的记录，然后统计数量
         long qualifiedCount=studyMinutes.stream().filter(minutes->minutes>=60).count();

        System.out.println("完成60分钟学习的天数："+qualifiedCount);

        //筛选后，把每一个证书转换为一段文字，最后收集成一个新的List
        List<String> studyReports=studyMinutes.stream().filter(minutes->minutes>=60).map(minutes->"当天学习了"+minutes+"分钟").toList();

        System.out.println("学习记录:"+studyReports);
    }
}
