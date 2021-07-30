package facade;

/**
 *
 * @author Weslei
 */
public class Order {
   public boolean approve() {
        return OrderFacade.checkPendingApprove(this);
    }
}
