package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;
import qa.addressbook.model.GruopData;

public class TestCaseCreation extends TestBase {

  @Test
  public void test1GroupCreation() throws Exception {
    app.getNavigationHelp().gotoGroupPage();
    app.getGroupHelp().initGroupCretion();
    app.getGroupHelp().fillGruopForm(new GruopData("test1", "test2", "test3"));
    app.getGroupHelp().submitGroupCreation();
    app.getGroupHelp().returntoGroupPage();
  }

  @Test
  public void test2AddBookCreation() throws Exception {
    app.getNavigationHelp().gotoEditAddBook();
    app.getBookHelp().fillAddBookForm(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com"));
    app.getBookHelp().submitAddBook();
    app.getBookHelp().returntoContentPage();
  }
}
