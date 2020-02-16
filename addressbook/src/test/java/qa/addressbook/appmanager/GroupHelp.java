package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.addressbook.model.GruopData;

public class GroupHelp extends HelperBase {
    public GroupHelp(WebDriver driver) {
        super(driver);
    }

    public void returntoGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGruopForm(GruopData gruopData) {
        type(By.name("group_name"), gruopData.getName());
        type(By.name("group_header"), gruopData.getHeader());
        type(By.name("group_footer"), gruopData.getFooter());
    }

    public void initGroupCretion() {
        click(By.name("new"));
    }

    public void deleteSelectedGruops() {
        click(By.name("delete"));
    }

    public void selectGruop() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GruopData group) {
        initGroupCretion();
        fillGruopForm(group);
        submitGroupCreation();
        returntoGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }
}
