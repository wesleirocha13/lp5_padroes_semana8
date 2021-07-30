package facade;

/**
 *
 * @author Weslei
 */
public class Stock extends Stage{
    private static Stock stock = new Stock();

    private Stock() {};
    public static Stock getInstance() {
        return stock;
    }
}
