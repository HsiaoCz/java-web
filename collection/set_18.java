package collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class set_18 {
    public static void main(String[] args) {
        // 迭代器
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Set<String> keys = map.keySet();

        for (String key : keys) {
            if ("c".equals(key)) {
                map.remove(key);
            }
        }
        // 迭代器
        Iterator<String> iterator = keys.iterator();
        // hashnext 方法用于判断是否存在下一条数据
        while (iterator.hasNext()) {
            // 获取下一条数据
            String key = iterator.next();
            if ("c".equals(key)) {
                // remove方法只能对当前数据删除，不能对其他数据删除
                iterator.remove();
            }
            System.out.println(map.get(key));
        }

    }
}
