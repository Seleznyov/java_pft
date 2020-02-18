package qa.addressbook.test;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import qa.addressbook.appmanager.ApplicationManager;

public class TestBase  {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeClass(alwaysRun = true)
    public void setUp()  {
        app.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown()  {
        app.stop();
    }
}
