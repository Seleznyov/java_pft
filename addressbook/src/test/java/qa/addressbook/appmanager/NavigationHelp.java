package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelp {
    private WebDriver driver;

    public NavigationHelp(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void gotoEditAddBook() {
      driver.findElement(By.linkText("add new")).click();
    }
}
