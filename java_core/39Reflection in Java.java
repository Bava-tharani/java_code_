import java.lang.reflect.Method;

public class ReflectionDemo {
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Method greetMethod = cls.getDeclaredMethod("greet", String.class);
        greetMethod.invoke(obj, "Chithra");
    }
}
