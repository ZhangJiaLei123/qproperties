import com.blxt.qjava.properties.AutoValue;
import com.blxt.qjava.properties.inter.Configuration;
import com.blxt.qjava.properties.inter.Value;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zhang.Jialei
 * @Date: 2020/9/25 16:27
 */
public class test {

    public static void main(String[] args) throws IOException {
      //  setAllComponentsName(new AppConfiguration(new File("")));

        AutoValue.init(test.class);
     //   getClassComment(AppConfiguration.class);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    //    getMethods(AppConfiguration.class);
        AppConfiguration appConfiguration = new AppConfiguration();

        try {
            AutoValue.autoVariable(appConfiguration);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("自动注入结果:" + appConfiguration.toString());
        //    testJava(AppConfiguration.class);
    }

    /**
     * 获取方法的注释
     * @param printClass
     */
    public static void getMethods(Class<?> printClass){
        //java反射机制获取所有方法名
        Method[] declaredMethods = printClass.getDeclaredMethods();
        //遍历循环方法并获取对应的注解名称
        for (Method declaredMethod : declaredMethods) {
            String isNotNullStr = "";
            System.out.println(declaredMethod.toString());

            Value methodAnno = declaredMethod.getAnnotation(Value.class);
            if(methodAnno == null){
                continue;
            }
            // 根据对象获取注解值
            isNotNullStr = methodAnno.value();
            System.out.println("注解: key:" + methodAnno.value() + ",value:" + methodAnno.value() );

        }
    }

    /**
     * 获取类注解
     * @param cl1
     */
    public static void getClassComment(Class cl1){

        //获取Configuration注解
        Configuration anno = (Configuration) cl1.getAnnotation(Configuration.class);
        //获取类注解的value值
        String[] value = {anno.value()};

        for (String ele : value) {
            System.out.println(ele);
        }

    }

    /**
     * 获取类中的所有方法
     * @param printClass
     * @return
     */
    public static Method[] getClassMethods(Class<?> printClass){
        //java反射机制获取所有方法名
        return printClass.getDeclaredMethods();
    }

    /**
     * java反射机制获取所有方法名
     * @param printClass
     */
    public static void testJava(Class<?> printClass ) {

        //KeyValueDto是实体类方便返回也可以用map
        List<AppConfiguration> list = new ArrayList();
        try {
            //java反射机制获取所有方法名
            Method[] declaredMethods = printClass.getDeclaredMethods();
            //遍历循环方法并获取对应的注解名称
            for (Method declaredMethod : declaredMethods) {
                String isNotNullStr = "";
                // 判断是否方法上存在注解  MethodInterface
                boolean annotationPresent = declaredMethod.isAnnotationPresent(Value.class);
                if (annotationPresent) {
                    // 获取自定义注解对象
                    Value methodAnno = declaredMethod.getAnnotation(Value.class);
                    // 根据对象获取注解值
                    isNotNullStr = methodAnno.value();
                    System.out.println(isNotNullStr);
                }
             //   list.add(new AppConfiguration(declaredMethod.getName(),isNotNullStr));
            }
            //排序(按照方法名称排序)
           // Collections.sort(list);
          //  System.out.println(list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
