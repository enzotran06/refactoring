package theater;

/**
 * Represents a play in the theater system, including its name and type.
 * A play's type (such as "comedy" or "tragedy") determines how costs
 * and volume credits are computed during invoice generation.
 *
 * <p>This class is a simple data holder used by other components when
 * determining pricing and formatting statements.</p>
 */

public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
