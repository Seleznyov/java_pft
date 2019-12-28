package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

  public void fillAddBookForm(AddressData addressData) {
    type(By.name("firstname"),addressData.getFirstname());
    type(By.name("middlename"),addressData.getMidlename());
    type(By.name("lastname"),addressData.getLastname());
    type(By.name("nickname"),addressData.getNickname());
    type(By.name("address"),addressData.getAddress());
    type(By.name("home"),addressData.getPhoneHome());
    type(By.name("email"),addressData.getEmail());
  }
}
