import com.sun.nio.sctp.Notification;

public class Day22_Interface {
    public static void main(String[] args)
    {
        NotificationSender sender=new EmailSender();
        sender.send("你有一条新的Java学习任务");

        sender=new AppSender();
        sender.send("你有一条新的算法练习任务");
    }
}

// 接口：规定所有通知发送方式都必须有 send 方法
interface NotificationSender{
    void send(String message);
}

//邮件发送方式
class EmailSender implements NotificationSender{
    @Override
    public void send(String message){
        System.out.println("邮件通知："+message);
    }
}

//APP发送方式
class AppSender implements NotificationSender{
    @Override
    public void send(String message){
        System.out.println("App通知："+message);
    }
}
