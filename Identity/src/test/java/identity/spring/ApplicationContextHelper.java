package identity.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chaoyuan on 03/11/2016.
 */
public class ApplicationContextHelper {
    final private static ApplicationContextHelper helper = new ApplicationContextHelper();

    private ApplicationContext context;
    private boolean initialized;

    static public ApplicationContextHelper instance() {
        return helper;
    }

    public void init() {
        synchronized (helper) {
            if (!helper.initialized) {
                context = new ClassPathXmlApplicationContext(new String[]{
                        "/spring/spring-context.xml",
                        "/spring/test-context.xml",
                        "/spring/identity-servlet.xml"
                });
                initialized = true;
            }
        }
    }

    public ApplicationContext getContext() {
        return context;
    }

}
