package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

public class GroupEdit extends TestBase {

    @Test
    public void testGroupEditionTestCase(){
        app.getNavigationHelp().gotoGroupPage();
        int before=app.getGroupHelp().getGroupCount();
        if (! app.getGroupHelp().isThereAGroup()) {
            app.getGroupHelp().createGroup(new GruopData("test1", null, null));
        }
        app.getGroupHelp().selectGruop(before-1);
        app.getGroupHelp().initGroupModification();
        app.getGroupHelp().fillGruopForm(new GruopData("testEdit1", "testEdit2", "testEdit3"));
        app.getGroupHelp().submitGroupModification();
        app.getGroupHelp().returntoGroupPage();
        int after=app.getGroupHelp().getGroupCount();
        Assert.assertEquals(after,before);

    }
}
