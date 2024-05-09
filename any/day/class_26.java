package any.day;

public class class_26 {
    public static void main(String[] args) {
        // java 中不允许外部类使用private修饰
        // 所谓的外部类 就是在源代码中直接声明的类
        // 内部类 类中声明的类

        // 内部类就当成外部类的属性使用即可
        // 它需要将外部类创建出来再使用
        OuterClass oClass = new OuterClass();
        OuterClass.InnerClass innerClass = oClass.new InnerClass();
        System.out.println(innerClass);
    }
}

class OuterClass {
    public class InnerClass {

    }
}