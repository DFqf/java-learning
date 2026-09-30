public class Day35_Generics {
    public static void main(String[] args) {

        // 这个盒子只能存 String
        LearningBox<String> contentBox =
                new LearningBox<>("Java 泛型");

        String content = contentBox.getValue();
        System.out.println("学习内容：" + content);

        // 这个盒子只能存 Integer
        LearningBox<Integer> minutesBox =
                new LearningBox<>(120);

        Integer minutes = minutesBox.getValue();
        System.out.println("学习时长：" + minutes + " 分钟");

        // 修改盒子内容
        contentBox.setValue("Spring Boot");
        System.out.println("修改后的内容：" + contentBox.getValue());
    }
}

// T 是一个“类型占位符”，表示这里未来由使用者决定具体类型
class LearningBox<T> {

    private T value;

    public LearningBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}