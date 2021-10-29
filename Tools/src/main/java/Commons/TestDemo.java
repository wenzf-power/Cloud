package Commons;

import com.sun.xml.internal.ws.util.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @Author: wenzf
 * @Date 2021-8-6
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        //首字母转大写
        String str = "wzfabc";
        String capitalize = StringUtils.capitalize(str);
        System.out.println(capitalize);

        // Date类型转String类型
        String date = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(date); // 输出 2021-05-01 01:01:01

    }
}
/**
 * 结果示例：
 *
 * Wzfabc
 * 2021-10-29 10:13:27
 */