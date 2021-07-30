package facade;

/**
 *
 * @author Weslei
 */
public class Financial extends Stage{
    private static Financial financial = new Financial();

    private Financial() {};
    public static Financial getInstance() {
        return financial;
    }
}
