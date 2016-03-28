package identity.spring;

import org.testng.annotations.Test;

/**
 * Created by chaoyuan on 03/11/2016.
 */
public class TestApplicationContext {

    @Test
    public void testApplicationContext() {
        ApplicationContextHelper.instance().init();
    }
}
