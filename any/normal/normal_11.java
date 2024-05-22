package any.normal;

public class normal_11 {
    public static void main(String[] args) {
        // 字符串的替换操作
        String s = "hello world";
        String m = s.replace("world", "java");
        System.out.println(m);

        // replace 会将所有重复的也替换
        String mm = "hello world zhangsan lisi";
        String mmr = mm.replaceAll("world|zhangsan", "java");
        System.out.println(mmr);
    }
}
