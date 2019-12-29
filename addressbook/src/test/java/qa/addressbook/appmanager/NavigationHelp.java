package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelp extends HelperBase {
    public NavigationHelp(WebDriver driver) {
        super(driver);
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoEditAddBook()
    {
        click(By.linkText("add new"));
    }

    public void gotoHomepage() { click(By.linkText("home"));
    }
}
