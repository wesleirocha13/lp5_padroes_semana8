package facade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class OrderTest {
    
    @Test
    public void mustReturnPendingStock() {
        Order order = new Order();
        Stock.getInstance().addPendingOrders(order);

        assertEquals(false, order.approve());
    }
    
    @Test
    public void mustReturnPendingFinantial() {
        Order order = new Order();
        Financial.getInstance().addPendingOrders(order);

        assertEquals(false, order.approve());
    }
    
    @Test
    public void mustReturnApproveOrder() {
        Order order = new Order();

        assertEquals(true, order.approve());
    }
    
}
