import jdk.swing.interop.SwingInterOpUtils;

public class Day26_Switch {
    public static void main(String[] args)
    {
        String status="REJECTED1";

        switch (status){
            case "NOT_APPLIED":
                System.out.println("还没有投递简历。");
                break;
            case "APPLIED":
                System.out.println("简历已经投递，等待反馈");
                break;
            case "INTERVIEWING":
                System.out.println("正在准备面试");
                break;
            case "OFFER":
                System.out.println("拿到Offer，恭喜！");
                break;
            case "REJECTED":
                System.out.println("本次未通过，复盘后继续投递");
                break;

            default:
                System.out.println("未知状态");
        }
    }
}
