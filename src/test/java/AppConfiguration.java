import com.blxt.qjava.properties.inter.Configuration;
import com.blxt.qjava.properties.inter.Value;

import java.io.File;

/***
 * 插件通用配置
 * @author 张家磊
 */
@Configuration("../src/test/resources/app.properties")
public class AppConfiguration   {

    @Value("test.string_t")
    private String string_t = "Default";

    @Value("test.int_t" )
    private int int_t;

    @Value("test.float_t" )
    private float float_t ;
    @Value("test.double_t" )
    private double double_t ;
    @Value("test.boolean_t" )
    private boolean boolean_t ;


    @Override
    public String toString() {
        return "AppConfiguration{" +
                "int_t=" + int_t +
                ", string_t='" + string_t + '\'' +
                ", float_t=" + float_t +
                ", double_t=" + double_t +
                ", boolean_t=" + boolean_t +
                '}';
    }
}
