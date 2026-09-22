public class Day20_ExceptionHandling {
    public static void main(String[] args)
    {

//  核心结构
//        try {
//            // 可能出错的代码
//        } catch (异常类型 变量名) {
//            // 出错后怎么处理
//        }

        try{
            String studyHoursText="two";
            int studyHours=Integer.parseInt(studyHoursText);
            System.out.println("学习时长："+studyHours);
        }catch (NumberFormatException e){
            System.out.println("学习时长必须是整数，请重新输入。");
        }

        int[] studyMinutes={120,90,150};
        try {
            System.out.println(studyMinutes[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标不存在，不能访问第六个数据");
        }

        System.out.println("程序仍然正常结束。");

    }
}
