package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.addressbook.model.GruopData;

public class GroupHelp {
    private WebDriver driver;

    public GroupHelp(WebDriver driver) {
        this.driver=driver;
    }

    public void returntoGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void fillGruopForm(GruopData gruopData) {
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

    public void initGroupCretion() {
      driver.findElement(By.name("new")).click();
    }

    public void deleteSelectedGruops() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGruop() {
      driver.findElement(By.name("selected[]")).click();
    }
}
