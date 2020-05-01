package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

import java.util.List;

public class GruopDeletionTest extends TestBase {
  @BeforeMethod
  public void ensurePrecondition() {
    app.goTo().GroupPage();
    if (app.group().list().size()==0) {
      app.group().create(new GruopData("test1", null, null));
    }
  }

  @Test
  public void testgruopDeletionTestCase(){
    List<GruopData> before=app.group().list();
    int index =before.size()-1;
    app.group().delete(index);
    List<GruopData> after=app.group().list();
    Assert.assertEquals(after.size(),before.size()-1);

    before.remove(index);
    Assert.assertEquals(before,after);
  }
}