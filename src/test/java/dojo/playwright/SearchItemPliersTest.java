package dojo.playwright;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchItemPliersTest  extends BaseTest {


    @Test
    void searchItemPliers() {
         page.navigate("https://practicesoftwaretesting.com/");
         page.locator("input[placeholder='Search']").fill("pliers");
         page.locator("button[type='submit']").click();

         int matchResults = page.locator(".card").count();
        Assertions.assertTrue(matchResults > 0);
    }

}
