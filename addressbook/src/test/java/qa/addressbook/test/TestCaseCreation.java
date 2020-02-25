package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;
import qa.addressbook.model.GruopData;

public class TestCaseCreation extends TestBase {

  @Test
  public void test1GroupCreation()  {
    app.getNavigationHelp().gotoGroupPage();
    int before=app.getGroupHelp().getGroupCount();
    app.getGroupHelp().createGroup(new GruopData("test1", null, null));
    int after=app.getGroupHelp().getGroupCount();
    Assert.assertEquals(after,before+1);
  }

  @Test
  public void test2AddBookCreation()   {
    app.getNavigationHelp().gotoEditAddBook();
    app.getBookHelp().createBook(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
            "testEdit1"),true);
  }
}
