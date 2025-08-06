package factory.components.button;

public class WindowsButton implements Button{
    private String label;

    public WindowsButton(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows button with label: " + label);
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked: " + label);
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
