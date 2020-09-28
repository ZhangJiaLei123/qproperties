
## value 自动加载工具 
> 没有其他依赖,没有其他框架依赖

## 使用方法 

* 初始化  
``` java

 // 初始化启动类 
 AutoValue.init(Mian.class);
 // 实现注解和spring的value使用方式一样  
 @Value("test.string_t")
 private String string_t = "Default";

 // 自定义配置类的properties位置,在类前面实现注解 Configuration, 可以自定义配置文件路径(支持绝对路径和相对路径), 
 @Configuration(value="../src/test/resources/app.properties")
 public class AppConfiguration   { ... } 

 // 使用,这里的AppConfiguration,是自定义的类,没有任何限制,只要对需要注入参数添加Value注释就行  
 AppConfiguration appConfiguration = new AppConfiguration();
 try {
    AutoValue.autoVariable(appConfiguration);
 } catch (IllegalAccessException e) {
    e.printStackTrace();
 }
 System.out.println("自动注入结果:" + appConfiguration.toString());

```


## 配置项说明 
* 默认配置文件,配置文件是以key = value形式存在的  
``` 
resources/application.properties
application.properties
../application.properties
../../application.properties
../../../application.properties

```

## TODO 

* 实现Configuration注解中的proxyBeanMethods,自定义的properties解析类 