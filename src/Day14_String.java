import java.util.Locale;

public class Day14_String {
    public static void main(String[] args)
    {
        String targetJob =" Java Backend Developer ";

        System.out.println("原始文字："+targetJob);
        System.out.println("长度："+targetJob.length());
        System.out.println("去除两边空格："+targetJob.trim());
        System.out.println("转小写："+targetJob.toLowerCase());
        System.out.println("是否包含Java:"+targetJob.contains("Java"));

        String targetCity="北京";

        if(targetCity.equals("北京")){
            System.out.println("目标城市是北京");
        }else {
            System.out.println("目标城市不是北京");
        }

        String skills="Java,SpringBoot,MySQL";
        String[] skillArray=skills.split(",");

        for(int i=0;i<skillArray.length;i++){
            System.out.println("技能:"+skillArray[i]);
        }
    }
}
