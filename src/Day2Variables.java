public class Day2Variables {
    public static void main(String[] args) {
        String name = "闫仕玉";
        int age = 23;
        String school = "太原理工大学";
        String targetJob = "Java 后端开发";
        boolean isGraduateStudent = true;

        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("学校：" + school);
        System.out.println("目标岗位：" + targetJob);
        System.out.println("我是研究生吗？" + isGraduateStudent);

        int todayStudyMinutes = 120;
        int tomorrowStudyMinutes = 90;
        int totalStudyMinutes = todayStudyMinutes + tomorrowStudyMinutes;

        System.out.println("两天计划学习总分钟数：" + totalStudyMinutes);

        String city="天津";
        double annualSalary=250000;
        double weekHours=15;
        System.out.println("理想城市："+city);
        System.out.println("理想年薪："+annualSalary+"平均月薪："+annualSalary/12);
        System.out.println("周学习时间："+weekHours);
    }
}