package hello;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflect_04 {
    public static void main(String[] args)
            throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        // 反射获取类的成员方法
        // 反射第一步 class
        Class<?> c = Cat.class;

        // 获取类的全部成员方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getParameterCount()); // 获取方法参数的个数
        }

        // 获取某个方法对象
        // 拿到无参的方法
        Method m = c.getDeclaredMethod("Eat");
        System.out.println(m.getName());

        // 拿到有参数的方法
        Method mm = c.getDeclaredMethod("Eat", String.class);
        System.out.println(mm.getName());

        Cat ccc = new Cat("zhangsan", 12);
        mm.setAccessible(true);
        Object rs = mm.invoke(ccc, "hellokitty");
        System.out.println(rs.getClass());

        Method eat = c.getDeclaredMethod("eat", String.class);
        String sssss = (String) eat.invoke(ccc, "hellokitty");
        System.out.println(sssss);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Cat() {
        System.out.println("无参构造函数");
    }

    private void Eat() {
        System.out.println("猫吃鱼");
    }

    public void Eat(String name) {
        System.out.println("猫在吃:" + name);
    }

    public String eat(String name) {
        return "hello";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
