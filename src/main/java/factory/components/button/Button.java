package factory.components.button;

public interface Button {
    void render(); // Method to render the button
    void onClick(); // Method to handle button click events
    String getLabel(); // Method to get the button label
    void setLabel(String label); // Method to set the button label
}
