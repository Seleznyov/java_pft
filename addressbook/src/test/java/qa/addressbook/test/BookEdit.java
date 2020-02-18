package qa.addressbook.test;

import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;

public class BookEdit extends TestBase {

    @Test
    public void testBooKEditionTestCase(){
        app.getNavigationHelp().gotoHomepage();
       // app.getBookHelp().selectBook();
        if (! app.getBookHelp().isThereABook()) {
            app.getNavigationHelp().gotoEditAddBook();
            app.getBookHelp().createBook(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
                    "testEdit1"), true);
        }

        app.getBookHelp().initBookModificatiom();
        app.getBookHelp().fillAddBookForm(new AddressData("StasE", "StasE", "SeleznevE", "stefler", "minsk", "911", "stefler@gmail.com",
                null),false);
        app.getBookHelp().submitAddBookModification();
    }
}
