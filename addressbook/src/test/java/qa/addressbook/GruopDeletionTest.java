package qa.addressbook;

import org.testng.annotations.Test;

public class GruopDeletionTest extends TestBase {

  @Test
  public void testgruopDeletionTestCase() throws Exception {
    gotoGroupPage();
    selectGruop();
    deleteSelectedGruops();
    gotoGroupPage();
  }
}