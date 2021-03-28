package v2ch08.annotation;

import java.lang.reflect.*;

public class Test {
    public static void main(String[] args) {

        /**
         * 获取类注解属性
         */
        Class<Father> fatherClass = Father.class;
        boolean annotationPresent = fatherClass.isAnnotationPresent(MyTestAnnotation.class);

        if (annotationPresent) {
            MyTestAnnotation annotation = fatherClass.getAnnotation(MyTestAnnotation.class);
            System.out.println(annotation.name());
            System.out.println(annotation.age());
        }

        /**
         * 获取方法注解属性
         */
        try {
            Field age = fatherClass.getDeclaredField("age");
            boolean annotationPresent1 = age.isAnnotationPresent(Age.class);
            if (annotationPresent1) {
                Age annotation = age.getAnnotation(Age.class);
                System.out.println(annotation.value());
            }
            Method play = PlayGame.class.getDeclaredMethod("play");
            if (play != null) {
                People annotation2 = play.getAnnotation(People.class);
                Game[] value = annotation2.value();
                for (Game game : value) {
                    System.out.println(game.value());
                }
            }

            } catch (NoSuchMethodException | NoSuchFieldException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }

    }
}
