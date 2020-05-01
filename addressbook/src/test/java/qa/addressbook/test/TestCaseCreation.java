package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;
import qa.addressbook.model.GruopData;

import java.util.HashSet;
import java.util.List;

public class TestCaseCreation extends TestBase {

  @Test
  public void test1GroupCreation()  {
    app.goTo().GroupPage();
    List<GruopData> before=app.group().list();
    GruopData group=new GruopData("test2", null, null);
    app.group().create(group);
    List<GruopData> after=app.group().list();
    Assert.assertEquals(after.size(),before.size()+1);

//    int max=0;
//    for (GruopData g: after){
//      if (g.getId()>max ){
//        max=g.getId();
//      }
//    }
    int max1=after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId();
    group.setId(max1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
  }

  @Test
  public void test2AddBookCreation()   {
    app.goTo().Homepage();
    List<AddressData> before=app.Book().List();
    app.goTo().Edit();
    app.Book().create(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
            "[none]"),true);
    app.goTo().Homepage();
    List<AddressData> after=app.Book().List();
    Assert.assertEquals(after.size(),before.size()+1);
  }
}
