###SpringBoot的Web开发示例
1. 本例的日志用的是logback
2. thymeleaf 设置不校验html标签配置
3. 使用WebJars
4. 某些html文件直接放行???
5. 统一异常处理:页面和json形式
6. Swagger2的RESTful API文档
访问路径:http://ip:port/swagger-ui.html
7. 同步调用和异步调用
主程序在异步调用之后，主程序并不会理会这三个函数是否执行完成了，由于没有其他需要执行的内容，所以程序就自动结束了，导致了不完整或是没有输出任务相关内容的情况。
@Async所修饰的函数不要定义为static类型，这样异步调用不会生效