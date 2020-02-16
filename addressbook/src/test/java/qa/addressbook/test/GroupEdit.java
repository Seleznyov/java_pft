package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.GruopData;

public class GroupEdit extends TestBase {

    @Test
    public void testGroupEditionTestCase(){
        app.getNavigationHelp().gotoGroupPage();
        if (! app.getGroupHelp().isThereAGroup()) {
            app.getGroupHelp().createGroup(new GruopData("test1", null, null));
        }
        app.getGroupHelp().selectGruop();
        app.getGroupHelp().initGroupModification();
        app.getGroupHelp().fillGruopForm(new GruopData("testEdit1", "testEdit2", "testEdit3"));
        app.getGroupHelp().submitGroupModification();
        app.getGroupHelp().returntoGroupPage();

    }
}
