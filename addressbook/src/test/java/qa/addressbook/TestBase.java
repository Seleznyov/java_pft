package qa.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      System.setProperty("webdriver.gecko.driver", "c:\\Users\\Admin\\Desktop\\geckodriver-v0.26.0-win64\\geckodriver.exe");
      driver = new FirefoxDriver();
      baseUrl = "https://www.katalon.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://localhost/addressbook/");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.id("LoginForm")).click();
      driver.findElement(By.id("LoginForm")).click();
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    protected void returntoGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGruopForm(GruopData gruopData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(gruopData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(gruopData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(gruopData.getFooter());
    }

    protected void initGroupCretion() {
      driver.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    protected void returntoContentPage() {
      driver.findElement(By.id("content")).click();
    }

    protected void submitAddBook() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillAddBookForm(AddressData addressData) {
      driver.findElement(By.name("firstname")).click();
      driver.findElement(By.name("firstname")).clear();
      driver.findElement(By.name("firstname")).sendKeys(addressData.getFirstname());
      driver.findElement(By.name("middlename")).click();
      driver.findElement(By.name("middlename")).clear();
      driver.findElement(By.name("middlename")).sendKeys(addressData.getMidlename());
      driver.findElement(By.name("lastname")).click();
      driver.findElement(By.name("lastname")).clear();
      driver.findElement(By.name("lastname")).sendKeys(addressData.getLastname());
      driver.findElement(By.name("nickname")).click();
      driver.findElement(By.name("nickname")).clear();
      driver.findElement(By.name("nickname")).sendKeys(addressData.getNickname());
      driver.findElement(By.name("address")).click();
      driver.findElement(By.name("address")).clear();
      driver.findElement(By.name("address")).sendKeys(addressData.getAddress());
      driver.findElement(By.name("home")).click();
      driver.findElement(By.name("home")).clear();
      driver.findElement(By.name("home")).sendKeys(addressData.getPhoneHome());
      driver.findElement(By.name("email")).click();
      driver.findElement(By.name("email")).clear();
      driver.findElement(By.name("email")).sendKeys(addressData.getEmail());
    }

    protected void gotoEditAddBook() {
      driver.findElement(By.linkText("add new")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      driver.quit();
    }

    protected void deleteSelectedGruops() {
      driver.findElement(By.name("delete")).click();
    }

    protected void selectGruop() {
      driver.findElement(By.name("selected[]")).click();
    }
}
