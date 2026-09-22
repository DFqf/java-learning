import java.util.HashSet;

public class Day17_HashSet {
    public static void main(String[] args)
    {
        HashSet<String> skills=new HashSet<>();

        skills.add("Java");
        skills.add("MySQL");
        skills.add("Git");
        skills.add("Java");

        System.out.println("技能集合："+skills);
        System.out.println("是否有Java："+skills.contains("Java"));
        System.out.println("技能数量："+skills.size());

        skills.remove("Git");

        for(String skill:skills){
            System.out.println("技能："+skill);
        }

    }
}
