package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

import java.util.HashSet;
import java.util.List;

public class GroupEdit extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().GroupPage();
        if ( app.group().list().size()==0) {
            app.group().create(new GruopData("test1", null, null));
        }
    }

    @Test
    public void testGroupEditionTestCase(){
        List<GruopData> before=app.group().list();
        int index =before.size()-1;
        GruopData gruop=new GruopData(before.get(index).getId(),"testEdit1", "testEdit2", "testEdit3");
        app.group().modify(index, gruop);

        List<GruopData> after=app.group().list();
        Assert.assertEquals(after.size(),before.size());

        before.remove(index);
        before.add(gruop);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
