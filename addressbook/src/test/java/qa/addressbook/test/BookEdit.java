package qa.addressbook.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;

import java.util.List;

public class BookEdit extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        app.goTo().Homepage();
        if (app.Book().List().size()==0) {
            app.goTo().Edit();
            app.Book().create(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
                    "[none]"), true);
        }
    }

    @Test
    public void testBooKEditionTestCase() {
        app.goTo().Homepage();
        List<AddressData> before = app.Book().List();
        app.Book().initBookModificatiom();
        app.Book().fillAddBookForm(new AddressData("StasE", "StasE", "SeleznevE", "stefler", "minsk", "911", "stefler@gmail.com",
                "[none]"), false);
        app.Book().submitAddBookModification();
        app.goTo().Homepage();

        List<AddressData> after = app.Book().List();
        Assert.assertEquals(after.size(), before.size());
        // В приложении тут ошибка, списки должны быть равны, проверка работает верно.
    }
}