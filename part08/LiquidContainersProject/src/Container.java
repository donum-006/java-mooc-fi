public class Container {
    private int liquid;

    // Constructor: Starts at 0 units
    public Container() {
        this.liquid = 0;
    }

    // Returns the current liquid volume
    public int contains() {
        return this.liquid;
    }

    // Adds liquid up to a maximum ceiling of 100
    public void add(int amount) {
        if (amount > 0) {
            this.liquid += amount;
            if (this.liquid > 100) {
                this.liquid = 100;
            }
        }
    }

    // Removes liquid down to a absolute floor of 0
    public void remove(int amount) {
        if (amount > 0) {
            this.liquid -= amount;
            if (this.liquid < 0) {
                this.liquid = 0;
            }
        }
    }

    // Formatted output string representation of the object state
    @Override
    public String toString() {
        return this.liquid + "/100";
    }
}