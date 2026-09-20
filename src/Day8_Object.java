public class Day8_Object {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "闫仕玉";
        student.school = "太原理工大学";
        student.targetJob = "java 后端";
        student.studyHours = 2;

        student.printInfo();
    }
}

    class Student
    {
        String name;
        String school;
        String targetJob;
        int studyHours;

        void printInfo()
        {
            System.out.println("姓名："+name);
            System.out.println("学校："+school);
            System.out.println("目标岗位："+targetJob);
            System.out.println("学习时长："+studyHours);
        }
    }

