import nl.utwente.di.Quoter;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by tim on 20-4-15.
 */
public class TestQouter {

    @Test
    public void testBook1() throws Exception {
        Quoter qouter = new Quoter();
        double price = qouter.getBookPrice("1");
        Assert.assertEquals("Price of book 1", 10.0, price, 0.0);

    }
}
