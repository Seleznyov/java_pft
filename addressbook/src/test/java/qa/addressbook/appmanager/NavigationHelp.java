package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelp extends HelperBase {
    public NavigationHelp(WebDriver driver) {
        super(driver);
    }

    public void GroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }

    public void Edit() {
        click(By.linkText("add new"));
    }

    public void Homepage() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }
        click(By.linkText("home"));
    }
}
