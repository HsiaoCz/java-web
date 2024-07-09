package cause.annotation;

@MyTest1(aaa = "niumo", ccc = { "HTML", "JAVA" })
public class test_01 {
    @MyTest1(aaa = "铁扇公主", bbb = false, ccc = { "python", "go" })
    public void test1() {

    }
}

@MyTest2(value = "hello")
class hello {

}
