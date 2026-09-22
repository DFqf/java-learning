import java.util.HashMap;

public class Day16_HashMap {
    public static void main(String[] args)
    {
        HashMap<String,Integer> jobCounts=new HashMap<>();

        jobCounts.put("北京",120);
        jobCounts.put("天津",50);
        jobCounts.put("西安",80);

        System.out.println("全部数据："+jobCounts);
        System.out.println("北京岗位数量："+jobCounts.get("北京"));

        jobCounts.put("天津",60);
        System.out.println("修改天津后的数据："+jobCounts);

        System.out.println("是否有西安："+jobCounts.containsKey("西安"));

        jobCounts.remove("天津");
        System.out.println("删除天津后："+jobCounts);

        for(String city: jobCounts.keySet()){
            System.out.println(city+"的岗位数量是："+jobCounts.get(city));
        }

    }
}
