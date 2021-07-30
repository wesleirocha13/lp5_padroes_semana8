package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Weslei
 */
public class Models extends Information{
    
    private List<Information> informations;

    public Models(String description) {
        super(description);
        this.informations = new ArrayList<Information>();
    }

    public void addInformation(Information information) {
        this.informations.add(information);
    }

    public String getInformation() {
        String result = "";
        result = "Modelo: " + this.getDescription()+ "\n";
        for (Information information : informations) {
            result += information.getInformation();
        }
        return result;
    }
}
