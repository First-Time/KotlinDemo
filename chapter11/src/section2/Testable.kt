package section2

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
//定义@Testable注解被文档工具所提取
@MustBeDocumented
annotation class Testable