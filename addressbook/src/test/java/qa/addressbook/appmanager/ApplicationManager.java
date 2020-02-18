package qa.addressbook.appmanager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver driver;
    protected boolean acceptNextAlert = true;
    private NavigationHelp navigationHelp;
    private BookHelp bookHelp;
    private GroupHelp groupHelp;
    private SessionHelp sessionHelp;
    public String baseUrl;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        if(browser.equals(BrowserType.FIREFOX)){
            driver=new FirefoxDriver();
        } else if  (browser.equals(BrowserType.CHROME)) {
            driver= new ChromeDriver();
        }
       // System.setProperty("webdriver.gecko.driver", "c:\\Users\\Admin\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
       // driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost/addressbook/");
        groupHelp = new GroupHelp(driver);
        bookHelp = new BookHelp(driver);
        sessionHelp=new SessionHelp(driver);
        navigationHelp=new NavigationHelp(driver);

        sessionHelp.login("admin", "secret");
    }


    public void stop() { driver.quit(); }

    public GroupHelp getGroupHelp() {
        return groupHelp;
    }

    public BookHelp getBookHelp() { return bookHelp; }

    public NavigationHelp getNavigationHelp() {
        return navigationHelp;
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
