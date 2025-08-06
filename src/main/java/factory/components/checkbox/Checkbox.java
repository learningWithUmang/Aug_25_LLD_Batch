package factory.components.checkbox;

public interface Checkbox {
    void render(); // Method to render the checkbox
    void onCheck(); // Method to handle checkbox check events
    void onUncheck(); // Method to handle checkbox uncheck events
    String getLabel(); // Method to get the checkbox label
    void setLabel(String label); // Method to set the checkbox label
}
