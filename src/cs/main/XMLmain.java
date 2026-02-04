package cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cs.stud.Stud;

public class XMLmain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("app.xml");
        Stud s = (Stud) context.getBean("s1");
		 s.display();

        
    }
}

