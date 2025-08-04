package components.checkbox;

public class WindowsCheckbox implements Checkbox{
    private String label;

    public WindowsCheckbox(String label) {
        this.label = label;
    }

    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox with label: " + label);
    }

    @Override
    public void onCheck() {
        System.out.println("Windows checkbox checked: " + label);
    }

    @Override
    public void onUncheck() {
        System.out.println("Windows checkbox unchecked: " + label);
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
