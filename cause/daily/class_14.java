package cause.daily;

public class class_14 {
    public static void main(String[] args) {
        // 继承 extends
        // 如果父类和子类含有相同的属性 可以使用两个关键字进行区分
        // super 和 this (super 表示父级属性，this当前属性)
        // 两个关键字都表示对象，在静态代码块中不能使用
        Child14 c = new Child14();
        System.out.println(c.name);
    }
}

/**
 * Innerclass_14
 */
class Parent03 {
    String name = "lis";

    void test() {
        System.out.println("hello");
    }
}

class Child14 extends Parent03 {
    String name = "wangwu";

    void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
