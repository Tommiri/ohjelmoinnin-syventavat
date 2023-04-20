import java.util.Formatter;

public class Volume implements ClampingParameter {
    public Volume() {
        this.setValue(this.getDefaultValue());
    }

    public Volume(int value) {
        this.setValue(value);
    }

    public void setValue(int value) {
        if (!this.isValid(value)) {
            if (this.isClamping()) {
                // If value is invalid but less than 100, it's always negative
                this.value = value > 100 ? 100 : 0;
                return;
            }
            StringBuilder sb = new StringBuilder();
            Formatter fmt = new Formatter(sb);
            fmt.format(
                    "%s must be between %d and %d (was %d)",
                    this.getName(),
                    this.getMinimumValue(),
                    this.getMaximumValue(),
                    value
            );
            fmt.close();
            throw new IllegalArgumentException(sb.toString());
        }
        this.value = value;
    }

    public int getMinimumValue() { return 0; }
    public int getMaximumValue() { return 100; }
    public int getDefaultValue() { return 50; }
    public int getValue() { return this.value; };
    public String getName() { return "Volume"; }

    public boolean isClamping() {
        return this.clamping;
    }
    public void setClamping(boolean c) {
        this.clamping = c;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getValue();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Parameter)) {
            return false;
        }
        Parameter other = (Parameter)object;
        return other.getValue() == this.getValue();
    }

    @Override
    public int hashCode() {
        return this.getValue();
    }

    private int value;
    private boolean clamping;
}
