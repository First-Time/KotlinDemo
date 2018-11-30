package section3.section01

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
//定义一个标记注解，不包含任何属性
annotation class Testable