package composite;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class ProductTest {
    
    @Test
    public void testSetInformations() {
        Models model1 = new Models("Modelo1");

        Models model2 = new Models("Modelo2");
        Description description21 = new Description("Descricao1");
        model2.addInformation(description21);

        Models model3 = new Models("Modelo3");
        Description description31 = new Description("Descricao1");
        Description description32 = new Description("Descricao2");
        model3.addInformation(description31);
        model3.addInformation(description32);

        Models information = new Models("Celular");
        information.addInformation(model1);
        information.addInformation(model2);
        information.addInformation(model3);

        Product product = new Product();
        product.setProduct(information);
        
        System.out.println(product.getProduct());

        assertEquals("Modelo: Celular\n" +
                "Modelo: Modelo1\n" +
                "Modelo: Modelo2\n" +
                "Descricao: Descricao1\n" +
                "Modelo: Modelo3\n" +
                "Descricao: Descricao1\n" +
                "Descricao: Descricao2\n", product.getProduct());
    }

    @Test
    public void testGetInformations() {
        try {
            Product product = new Product();
            product.getProduct();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Produto sem informacoes", e.getMessage());
        }
    }
    
}
