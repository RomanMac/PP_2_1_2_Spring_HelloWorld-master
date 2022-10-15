
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld hello = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hello.getMessage());

        Cat cat = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat.getMessage());

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getMessage());
        System.out.println("Переменные HelloWorld ссылаются на один обьект?" + (bean == hello));
        System.out.println("Переменные Cat ссылаются на один обьект?" + (cat == cat1));
    }


}