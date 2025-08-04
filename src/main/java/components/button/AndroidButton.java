package components.button;

public class AndroidButton implements Button{
    private String label;

    public AndroidButton(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering Android button with label: " + label);
    }

    @Override
    public void onClick() {
        System.out.println("Android button clicked: " + label);
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
