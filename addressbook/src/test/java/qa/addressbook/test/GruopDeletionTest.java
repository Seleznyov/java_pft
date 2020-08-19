package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

import java.util.Set;

public class GruopDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().GroupPage();
    if (app.group().all().size()==0) {
      app.group().create(new GruopData("test1", null, null));
    }
  }

  @Test
  public void testgruopDeletionTestCase(){
    Set<GruopData> before=app.group().all();
    GruopData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GruopData> after=app.group().all();
    Assert.assertEquals(after.size(),before.size()-1);

    before.remove(deletedGroup);
    Assert.assertEquals(before,after);
  }
}