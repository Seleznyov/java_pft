package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelp extends HelperBase {
    public SessionHelp(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"),password);
        click(By.xpath("//input[@value='Login']"));
    }
}
