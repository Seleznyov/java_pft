package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import qa.addressbook.model.AddressData;

public class BookHelp extends HelperBase {
  public BookHelp(WebDriver driver) {
    super(driver);
  }

  public void returntoContentPage() {
    click(By.id("content"));
  }
  public void submitAddBook()
  {
    click(By.name("submit"));
  }

  public void  fillAddBookForm(AddressData addressData, boolean creation) {
    type(By.name("firstname"),addressData.getFirstname());
    type(By.name("middlename"),addressData.getMidlename());
    type(By.name("lastname"),addressData.getLastname());
    type(By.name("nickname"),addressData.getNickname());
    type(By.name("address"),addressData.getAddress());
    type(By.name("home"),addressData.getPhoneHome());
    type(By.name("email"),addressData.getEmail());

    if (creation){
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(addressData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void selectBookByID() {click(By.id("6"));
  }
  public void initBookModificatiom() {click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='stefler@gmail.com'])[1]/following::img[2]"));
  }
  public void submitAddBookModification() {click(By.name("update"));
  }
  public void selectBook() { click(By.name("selected[]")); }
  public  void  deleteSelectedBooks(){
    driver.findElement(By.xpath("//input[@value='Delete']")).click();
  }

  public void createBook(AddressData book, boolean b) {
    fillAddBookForm((book),true);
    submitAddBook();
    returntoContentPage();
  }
  public boolean isThereABook() {
    return isElementPresent(By.name("selected[]"));
  }
}
