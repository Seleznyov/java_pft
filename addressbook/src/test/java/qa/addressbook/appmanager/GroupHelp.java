package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.addressbook.model.GruopData;

import java.util.ArrayList;
import java.util.List;

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

    public void selectGruop(int index) {
        driver.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void create(GruopData group) {
        initGroupCretion();
        fillGruopForm(group);
        submitGroupCreation();
        returntoGroupPage();
    }

    public void modify(int index, GruopData gruop) {
        selectGruop(index);
        initGroupModification();
        fillGruopForm(gruop);
        submitGroupModification();
        returntoGroupPage();
    }

    public void delete(int index) {
        selectGruop(index);
        deleteSelectedGruops();
        returntoGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
      return  driver.findElements(By.name("selected[]")).size();
    }

    public List<GruopData> list() {
        List<GruopData> groups= new ArrayList<GruopData>();
        List<WebElement> elements= driver.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String name=element.getText();
            int id=Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value")) ;
            GruopData group=new GruopData(id,name, null,null);
            groups.add(group);
            System.out.println(groups);
         }
        return groups;
    }
}
