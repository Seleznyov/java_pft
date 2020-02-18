package qa.addressbook.test;


import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;

import static org.junit.Assert.assertTrue;


public class BookDeletionTes extends TestBase {

    @Test
    public  void testbooKDeletionTestCase() {
        app.getNavigationHelp().gotoHomepage();
        if (! app.getBookHelp().isThereABook()) {
            app.getNavigationHelp().gotoEditAddBook();
            app.getBookHelp().createBook(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
                    "testEdit1"), true);
        }

        app.getBookHelp().selectBook();
        app.getBookHelp().deleteSelectedBooks();
        assertTrue(app.closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
        app.getNavigationHelp().gotoHomepage();
    }
}

