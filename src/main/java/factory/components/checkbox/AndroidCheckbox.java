package factory.components.checkbox;

public class AndroidCheckbox implements Checkbox {
    private String label;

    public AndroidCheckbox(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering Android checkbox with label: " + label);
    }

    @Override
    public void onCheck() {
        System.out.println("Android checkbox checked: " + label);
    }

    @Override
    public void onUncheck() {
        System.out.println("Android checkbox unchecked: " + label);
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