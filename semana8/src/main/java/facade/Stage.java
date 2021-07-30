package facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Weslei
 */
public abstract class Stage {
    private List<Order> pendingOrders = new ArrayList<Order>();

    public void addPendingOrders(Order order) {
        this.pendingOrders.add(order);
    }

    public boolean verifyPendingOrders(Order order) {
        return pendingOrders.contains(order);
    }
}
