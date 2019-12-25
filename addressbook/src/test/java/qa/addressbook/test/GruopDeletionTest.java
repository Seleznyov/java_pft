package qa.addressbook.test;

import org.testng.annotations.Test;

public class GruopDeletionTest extends TestBase {

  @Test
  public void testgruopDeletionTestCase() throws Exception {
    app.gotoGroupPage();
    app.selectGruop();
    app.deleteSelectedGruops();
    app.gotoGroupPage();
  }
}