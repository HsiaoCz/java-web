package any.day;

public class class_01 {
    public static void main(String[] args) {
        // java 面向对象
        // 类：模板
        // 对象 类的实例
        // class
        // class 类名{
        // 特征(属性) 功能(方法)
        // }

        // 问题是做一道菜
        Cooking hsCooking = new Cooking();
        hsCooking.name = "红烧排骨";
        System.out.println(hsCooking.name);
        hsCooking.food = "hello";
        System.out.println(hsCooking.food);
        System.out.println(hsCooking.type);
        System.out.println(hsCooking.relish);
    }
}

// class cooking

class Cooking {
    // 声明属性
    String name;
    String type = "Hongs";
    String food;
    String relish = "cailiao";
}