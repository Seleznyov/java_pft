package qa.addressbook.test;

import org.testng.annotations.Test;

public class GruopDeletionTest extends TestBase {

  @Test
  public void testgruopDeletionTestCase() throws Exception {
    app.getNavigationHelp().gotoGroupPage();
    app.getGroupHelp().selectGruop();
    app.getGroupHelp().deleteSelectedGruops();
    app.getNavigationHelp().gotoGroupPage();
  }
}