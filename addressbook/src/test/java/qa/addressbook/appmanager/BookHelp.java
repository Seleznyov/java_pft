package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import qa.addressbook.model.AddressData;

import java.util.ArrayList;
import java.util.List;

public class BookHelp extends HelperBase {
  public BookHelp(WebDriver driver) {
    super(driver);
  }

  public void returntoContentPage() {
    click(By.id("content"));
  }

  public void submitAddBook() {
    click(By.name("submit"));
  }

  public void fillAddBookForm(AddressData addressData, boolean creation) {
    type(By.name("firstname"), addressData.getFirstname());
    type(By.name("middlename"), addressData.getMidlename());
    type(By.name("lastname"), addressData.getLastname());
    type(By.name("nickname"), addressData.getNickname());
    type(By.name("address"), addressData.getAddress());
    type(By.name("home"), addressData.getPhoneHome());
    type(By.name("email"), addressData.getEmail());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(addressData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void selectBookByID() {
    click(By.id("6"));
  }

  public void initBookModificatiom() {
    click(By.xpath("//td[8]/a[1]/img[1]"));
  }

  public void submitAddBookModification() {
    click(By.name("update"));
  }

  public void selectBook(int index) {
    driver.findElements(By.name("selected[]")).get(index).click();
  }

  public void deleteSelectedBooks() {
    driver.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  public void create(AddressData book, boolean b) {
    fillAddBookForm((book), true);
    submitAddBook();
    returntoContentPage();
  }

  public boolean isThereABook() {
    return isElementPresent(By.name("selected[]"));
  }

  public List<AddressData> List() {
    List<AddressData> address = new ArrayList<AddressData>();
    List<WebElement> elements = driver.findElements(By.xpath("//td[2]"));
    List<WebElement> elements2 = driver.findElements(By.xpath("//td[3]"));
    for (WebElement element : elements) {
      String lastname = element.getText();
      for (WebElement element1 : elements2){
        String firstname = element1.getText();
        AddressData addres1 = new AddressData(firstname, null, lastname,
                null, null, null, null, null);
        address.add(addres1);
        break;
      }
    }
    return address;
  }
}
