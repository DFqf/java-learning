import java.util.ArrayList;
import java.util.List;


public class Day33_SortComparator {
    public static void main(String[] args)
    {
        List<Integer> studyMinutes=new ArrayList<>();
        studyMinutes.add(120);
        studyMinutes.add(45);
        studyMinutes.add(90);
        studyMinutes.add(20);
        studyMinutes.add(150);

        System.out.println("原始顺序："+studyMinutes);

        //从小到大排序
        studyMinutes.sort((first,second)->Integer.compare(first,second));
        System.out.println("从小到大："+studyMinutes);

        //从大到小排序
        studyMinutes.sort((first,second)->Integer.compare(second,first));
        System.out.println("从大到小："+studyMinutes);
    }
}
