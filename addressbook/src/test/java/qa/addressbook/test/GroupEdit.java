package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

import java.util.HashSet;
import java.util.Set;

public class GroupEdit extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().GroupPage();
        if ( app.group().all().size()==0) {
            app.group().create(new GruopData("test1", null, null));
        }
    }

    @Test
    public void testGroupEditionTestCase(){
        Set<GruopData> before=app.group().all();
        GruopData modifiedGroup = before.iterator().next();
        GruopData gruop=new GruopData(modifiedGroup.getId(),"testEdit1", "testEdit2", "testEdit3");
        app.group().modify(gruop);

        Set<GruopData> after=app.group().all();
        Assert.assertEquals(after.size(),before.size());

        before.remove(modifiedGroup);
        before.add(gruop);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
