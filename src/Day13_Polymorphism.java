public class Day13_Polymorphism {
    public static void main(String[] args)
    {
        Notification[] notifications={
                new EmailNotification(),
                new AppNotification()
        };

        for(int i=0;i<notifications.length;i++){
            notifications[i].send();
        }
    }
}

class Notification
{
    public void send(){
        System.out.println("发送普通通知");
    }
}

class EmailNotification extends Notification{
    @Override
    public void send(){
        System.out.println("通过邮件发送求职提醒");
    }
}

class AppNotification extends Notification{
    @Override
    public void send(){
        System.out.println("通过app发送求职提醒");
    }
}

