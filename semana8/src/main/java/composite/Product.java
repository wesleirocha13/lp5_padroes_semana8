package composite;

/**
 *
 * @author Weslei
 */
public class Product {
    private Information informations;

    public void setProduct(Information informations) {
        this.informations = informations;
    }

    public String getProduct() {
        if (this.informations == null) {
            throw new NullPointerException("Produto sem informacoes");
        }
        return this.informations.getInformation();
    }
}
