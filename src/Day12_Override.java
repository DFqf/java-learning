public class Day12_Override {
    public static void main(String[] args)
    {
        GraduateCandidate candidate =new GraduateCandidate("闫仕玉","北京","太原理工大学");
        candidate.introduce();
    }
}

class Candidate{
    private String name;
    private String targetCity;

    Candidate(String name,String targetCity){
        this.name=name;
        this.targetCity=targetCity;
    }

    public void introduce(){
        System.out.println("姓名："+name);
        System.out.println("目标城市:"+targetCity);
    }
    public String getName(){
        return name;
    }
}

class GraduateCandidate extends Candidate{
    private String school;

    GraduateCandidate(String name,String targetCity,String school){
        super(name,targetCity);
        this.school=school;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("学校："+school);
        System.out.println("软件工程研究生");
    }

}