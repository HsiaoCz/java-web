package cause.some;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_02 {
    public static void main(String[] args) {
        // 日期类
        // 时间戳
        System.out.println(System.currentTimeMillis());

        // date:日期类
        // Calendar:日历类
        Date d = new Date();
        System.out.println(d);

        // java格式化日期格式
        // y (Y) ->年 yyyy
        // m (M) ->M 月份MM m 分钟mm
        // d (D) -> d: 一个月份中的日期dd D:一年中的日期
        // h (H) ->h :12进制 HH:24进制
        // s (S) ->s :秒 S:毫秒

        // 将日期转换成一个字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dataFormaString = sdf.format(d);
        System.out.println(dataFormaString);

        // String --> Date
        String dateString = "2022-06-01";
        Date parseDate = sdf.parse(dateString, null);
        System.out.println(parseDate);

        // 根据时间戳构建知道的日期对象
        d.setTime(System.currentTimeMillis());
        // 获取时间戳
        d.getTime();

        System.out.println(parseDate.before(d));
        System.out.println(parseDate.after(d));
    }
}
