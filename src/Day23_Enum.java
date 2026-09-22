public class Day23_Enum {
    public static void main(String[] args)
    {

//        ApplicationStatus.values()	获取全部枚举值，返回数组
//        status.name()	获取枚举值名字，例如 "INTERVIEWING"
        ApplicationStatus status=ApplicationStatus.INTERVIEWING;
        System.out.println("当前状态："+status);

        if(status==ApplicationStatus.INTERVIEWING){
            System.out.println("准备技术面试！");
        }

        ApplicationStatus[] allStatuses=ApplicationStatus.values();

        for(int i=0;i<allStatuses.length;i++){
            System.out.println("状态："+allStatuses[i]);
        }
    }
}

enum ApplicationStatus{
    NOT_APPLIED,
    APPLIED,
    INTERVIEWING,
    OFFER,
    REJECTED
}
