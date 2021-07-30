package composite;

/**
 *
 * @author Weslei
 */
public abstract class Information {
     private String description;

    public Information(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getInformation();
}
