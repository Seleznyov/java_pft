package qa.addressbook.test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.addressbook.model.AddressData;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BookDeletionTest extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        app.goTo().Homepage();
        if (app.Book().List().size()==0) {
            app.goTo().Edit();
            app.Book().create(new AddressData("stas", "stas", "seleznev", "stefler", "minsk", "911", "stefler@gmail.com",
                    "[none]"), true);
        }
    }

    @Test
    public  void testbooKDeletionTestCase() {
        List<AddressData> before = app.Book().List();
        int index =before.size()-1;
        app.Book().selectBook(index);
        app.Book().deleteSelectedBooks();
        assertTrue(app.closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
        app.goTo().Homepage();

        List<AddressData> after = app.Book().List();
        Assert.assertEquals(after.size(), before.size() - 1);


// Редактировать надо найти ошибку (Не правильно составлен список)
//        before.remove(index);
//        Assert.assertEquals(before,after);
    }
}

