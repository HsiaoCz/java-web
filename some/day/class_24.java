package some.day;

public class class_24 {
    public static void main(String[] args) {
        // 方法权限
        // public : 公共的 访问权限修饰符
        // java的源码 公共类只能有一个 而且必须和源文件名相同

        // main方法的访问权限也是公告的 必须加上 不加运行不了
        // main方法是由jvm调用的 JVM调用时应该可以任意调用,而不用考虑权限问题
        // java中的访问权限主要分为四种
        // 1. private : 私有的 同一个类中使用
        // 2. public : 公共的 任意使用
        // 3. default : 默认权限 当不设定权限的时候 jvm默认提供的权限 包权限 一个包内可以使用
        // 4. protected : 受保护的权限 子类可以访问
    }
}

class User24 {
    private String username;

    public String name;

    void test() {
        System.out.println(name);
        System.out.println(username);
    }
}