package composite;

/**
 *
 * @author Weslei
 */
public class Description extends Information{

    public Description(String description) {
        super(description);
    }

    public String getInformation() {
        return "Descricao: " + this.getDescription()+ "\n";
    }
}
