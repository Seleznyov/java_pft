package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;
import qa.addressbook.model.GruopData;

public class TestCaseCreation extends TestBase {

  @Test
  public void test1GroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCretion();
    app.fillGruopForm(new GruopData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returntoGroupPage();
  }

  @Test
  public void test2AddBookCreation() throws Exception {
    app.gotoEditAddBook();
    app.fillAddBookForm(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com"));
    app.submitAddBook();
    app.returntoContentPage();
  }
}
