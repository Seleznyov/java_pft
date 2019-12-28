package qa.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    private NavigationHelp navigationHelp;
    private BookHelp bookHelp;
    private GroupHelp groupHelp;
    private SessionHelp sessionHelp;
    public String baseUrl;

    public void init() {
        System.setProperty("webdriver.gecko.driver", "c:\\Users\\Admin\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/");
        groupHelp = new GroupHelp(driver);
        bookHelp = new BookHelp(driver);
        sessionHelp=new SessionHelp(driver);
        navigationHelp=new NavigationHelp(driver);

        sessionHelp.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
    }

    public GroupHelp getGroupHelp() {
        return groupHelp;
    }

    public BookHelp getBookHelp() {
        return bookHelp;
    }

    public NavigationHelp getNavigationHelp() {
        return navigationHelp;
    }
}
