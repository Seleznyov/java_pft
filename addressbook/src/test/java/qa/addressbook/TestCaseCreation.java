package qa.addressbook;

import org.testng.annotations.Test;

public class TestCaseCreation extends TestBase {

  @Test
  public void test1GroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCretion();
    fillGruopForm(new GruopData("test1", "test2", "test3"));
    submitGroupCreation();
    returntoGroupPage();
  }

  @Test
  public void test2AddBookCreation() throws Exception {
    gotoEditAddBook();
    fillAddBookForm(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com"));
    submitAddBook();
    returntoContentPage();
  }
}
