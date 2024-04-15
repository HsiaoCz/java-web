package some.collection;

import java.util.HashSet;

public class set_13 {
    public static void main(String[] args) {
        // hashset 底层数据结构是链表加数组
        // hashset 保存重复数据
        HashSet<User11> set = new HashSet<>();
        User11 user11 = new User11();
        user11.id = 1222;
        user11.name = "zhangsan";
        System.out.println(user11.hashCode());

        User11 user112 = new User11();
        user112.id = 2222;
        user112.name = "lisl";
        System.out.println(user112.hashCode());

        User11 user113 = new User11();
        user113.id = 12334;
        user113.name = "skssk";
        System.out.println(user113.hashCode());

        set.add(user113);
        set.add(user11);
        set.add(user112);
    }
}

class User11 {
    public int id;
    public String name;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User11) {
            User11 otheruser = (User11) obj;
            if (otheruser.id == this.id) {
                if (otheruser.name.equals(this.name)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}