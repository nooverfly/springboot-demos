#SpringBoot的Mybatis开发示例
##1. 注意sql语句中使用#符号和$符号的不同
1. "#"将传入的数据都当成一个字符串，会对自动传入的数据加一个双引号。如：order by #user_id#，如果传入的值是111,那么解析成sql时的值为order by "111", 如果传入的值是id，则解析成的sql为order by "id".
 
2. $将传入的数据直接显示生成在sql中。如：order by $user_id$，如果传入的值是111,那么解析成sql时的值为order by user_id,  如果传入的值是id，则解析成的sql为order by id.
 
3. "#"方式能够很大程度防止sql注入。
 
4. $方式无法防止Sql注入。
 
5. $方式一般用于传入数据库对象，例如传入表名. 
 
6. 一般能用#的就别用$. 

MyBatis排序时使用order by 动态参数时需要注意，用$而不是#
字符串替换
默认情况下，使用#{}格式的语法会导致MyBatis创建预处理语句属性并以它为背景设置安全的值（比如?）。这样做很安全，很迅速也是首选做法，有时你只是想直接在SQL语句中插入一个不改变的字符串。比如，像ORDER BY，你可以这样来使用：
ORDER BY ${columnName}
这里MyBatis不会修改或转义字符串。

重要：接受从用户输出1的内容并提供给语句中不变的字符串，这样做是不安全的。这会导致潜在的SQL注入攻击，因此你不应该允许用户输入这些字段，或者通常自行转义并检查。

###将springboot自带的DataSourceAutoConfiguration禁掉，因为它会读取application.properties文件的spring.datasource.*属性并自动配置单数据源。在@SpringBootApplication注解中添加exclude属性即可