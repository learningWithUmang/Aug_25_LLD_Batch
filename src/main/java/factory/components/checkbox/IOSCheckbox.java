package factory.components.checkbox;

public class IOSCheckbox implements Checkbox{
    private String label;

    public IOSCheckbox(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering iOS checkbox with label: " + label);
    }

    @Override
    public void onCheck() {
        System.out.println("iOS checkbox checked: " + label);
    }

    @Override
    public void onUncheck() {
        System.out.println("iOS checkbox unchecked: " + label);
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
