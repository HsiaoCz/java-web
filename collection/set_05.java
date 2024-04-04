package collection;

import java.util.LinkedList;

public class set_05 {
    public static void main(String[] args) {
        // LinkedList
        // 包含了一个linked+list
        // linked表示的是链接的意思
        // 构建集合对象

        LinkedList<String> list = new LinkedList<>();

        // 增加一个数据
        list.add("hello");
        list.addFirst("lisi");
        list.add(0, "zhaoliu");

        // 获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object obj : list) {
            System.out.println(obj);
        }

        // 修改数据
        list.set(0, "王五");

        // 删除数据
        list.remove("Hello");
        // 打印数据
        System.out.println(list);
    }
}
