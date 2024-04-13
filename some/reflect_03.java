package some;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reflect_03 {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 获取类的构造器
        // 反射第一步，得到类的class对象
        Class<?> c1 = Cat.class;

        // 获取类的全部构造器
        Constructor<?>[] constructors = c1.getConstructors();
        // 遍历数组中的每个构造对象
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
            constructor.getName(); // 获取构造器的名字
            constructor.getParameterCount(); // 获取构造器的参数个数
        }

        // 获取构造器，只要有就能拿到
        Constructor<?>[] cons = c1.getDeclaredConstructors();
        for (Constructor<?> constructor : cons) {
            String cName = constructor.getName();
            int cCount = constructor.getParameterCount();
            System.out.println(cName);
            System.out.println(cCount);
        }

        // 获取构造器，只能获取public
        // 这是获取没有参数的
        Constructor<?> cst = c1.getConstructor();
        cst.setAccessible(true); // 禁止检查访问权限
        Cat c = (Cat) cst.newInstance();
        System.out.println(c);
        System.out.println(cst.getName());
        System.out.println(cst);

        // 获取构造器，只要有就能获取
        // 获取有参数的
        Constructor<?> csss = c1.getDeclaredConstructor(String.class, int.class);
        Cat cc1 = (Cat) csss.newInstance("张三", 12);
        System.out.println(cc1);
        System.out.println(csss);
    }
}

class Cat {
    private String name;
    private int age;

    public Cat() {
        System.out.println("无参构造函数");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}