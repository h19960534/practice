package v2ch08.annotation;

@MyTestAnnotation(name = "father", age = 50)
public class Father {
    @Age(35)
    final static int  age = 35;
}
