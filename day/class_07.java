package day;

public class class_07 {
    public static void main(String[] args) {
        // class static
        // 针对具体的对象的属性称之为对象的属性，成员属性，实例属性
        // 针对具体对象的方法称为对象方法，成员方法，实例方法

        // 把和对象无关，只和类相关的属性，静态属性
        // 和类相关的方法 静态方法
        Chinese c = new Chinese();
        c.name = "张三";

        System.out.println("Hello" + c.name + c.nationality);

        Bird.fly();
    }
}

class Chinese {
    String name;

    // 国籍
    String nationality = "中国";
}

class Bird {
    // 静态方法，和对象无关
    static void fly() {
        System.out.println("Bird is flying");
    }
}