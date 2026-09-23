import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Day27_DateTime {
    public static void main(String[] args)
    {
        //只表示日期：年、月、日
        LocalDate today=LocalDate.now();
        System.out.println("今天是："+today);

        //创建一个指定日期:2026年10月1日
        LocalDate deadline=LocalDate.of(2026,10,1);
        System.out.println("项目截止日期："+deadline);

        //日期加7天，得到一个新的日期对象
        LocalDate nextWeek=today.plusDays(7);
        System.out.println("七天后是："+nextWeek);

        //判断today是否在deadline之前
        boolean isBeforeDeadline=today.isBefore(deadline);
        System.out.println("今天是否还在截止日期前："+isBeforeDeadline);

        //表示日期+时间：年 月 日 时 分 秒
        LocalDateTime now=LocalDateTime.now();
        System.out.println("当前时间："+now);

        //定义显示格式
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //按照指定格式把时间转为字符串
        String formattedTime =now.format(formatter);
        System.out.println("格式化后的当前时间："+formattedTime);

    }
}
