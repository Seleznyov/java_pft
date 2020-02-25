package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

public class GruopDeletionTest extends TestBase {

  @Test
  public void testgruopDeletionTestCase() throws Exception {
    app.getNavigationHelp().gotoGroupPage();
    int before=app.getGroupHelp().getGroupCount();
    if (! app.getGroupHelp().isThereAGroup()) {
      app.getGroupHelp().createGroup(new GruopData("test1", null, null));
    }
    app.getGroupHelp().selectGruop(before-1);
    app.getGroupHelp().deleteSelectedGruops();
    app.getNavigationHelp().gotoGroupPage();
    int after=app.getGroupHelp().getGroupCount();
    Assert.assertEquals(after,before-1);

  }
}