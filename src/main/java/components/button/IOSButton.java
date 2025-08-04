package components.button;

public class IOSButton implements Button{
    private String label;

    public IOSButton(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering iOS button with label: " + label);
    }

    @Override
    public void onClick() {
        System.out.println("iOS button clicked: " + label);
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public void setLabel(String label) {
        this.label = label;
    }
}
