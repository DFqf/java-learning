import java.util.ArrayList;

public class Day15_ArrayList {
    public static void main(String[] args)
    {
        ArrayList<String> skills=new ArrayList<>();

        skills.add("Java");
        skills.add("MySQL");
        skills.add("Git");

        System.out.println("技能列表："+skills);
        System.out.println("第一个技能："+skills.get(0));

        skills.set(1,"Spring Boot");
        System.out.println("修改后的技能列表："+skills);

        skills.remove("Git");
        System.out.println("删除Git后："+skills);

        System.out.println("技能数量："+skills.size());

        for(int i=0;i<skills.size();i++){
            System.out.println("技能:"+skills.get(i));
        }



    }
}
