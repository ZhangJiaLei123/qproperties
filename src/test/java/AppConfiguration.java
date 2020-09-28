import com.blxt.qjava.properties.inter.Configuration;
import com.blxt.qjava.properties.inter.Value;

import java.io.File;

/***
 * 插件通用配置
 * @author 张家磊
 */
@Configuration(value="../src/test/resources/app.properties")
public class AppConfiguration   {

    @Value(key="test.string_t")
    private String string_t = "Default";

    @Value(key="test.int_t" )
    private int int_t;

    @Value(key="test.float_t" )
    private float float_t ;
    @Value(key="test.double_t" )
    private double double_t ;
    @Value(key="test.boolean_t" )
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
