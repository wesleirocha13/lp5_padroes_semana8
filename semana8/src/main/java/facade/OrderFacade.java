package facade;

/**
 *
 * @author Weslei
 */
public class OrderFacade {
     public static boolean checkPendingApprove(Order order) {
        if (Stock.getInstance().verifyPendingOrders(order)) {
            return false;
        }
        if (Financial.getInstance().verifyPendingOrders(order)) {
            return false;
        }
        return true;
    }
}
