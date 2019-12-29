package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;

public class BookEdit extends TestBase {

    @Test
    public void testBooKEditionTestCase(){
        app.getNavigationHelp().gotoHomepage();
        app.getBookHelp().selectBook();
        app.getBookHelp().initBookModificatiom();
        app.getBookHelp().fillAddBookForm(new AddressData("StasE", "StasE", "SeleznevE", "stefler", "minsk", "911", "stefler@gmail.com"));
        app.getBookHelp().submitAddBookModification();
    }
}
