package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

public class GruopDeletionTest extends TestBase {

  @Test
  public void testgruopDeletionTestCase() throws Exception {
    app.getNavigationHelp().gotoGroupPage();
    if (! app.getGroupHelp().isThereAGroup()) {
      app.getGroupHelp().createGroup(new GruopData("test1", null, null));
    }
    app.getGroupHelp().selectGruop();
    app.getGroupHelp().deleteSelectedGruops();
    app.getNavigationHelp().gotoGroupPage();
  }
}