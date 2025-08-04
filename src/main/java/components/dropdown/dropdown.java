package components.dropdown;

public interface dropdown {
    void render(); // Method to render the dropdown
    void onSelect(String option); // Method to handle selection of an option
    String[] getOptions(); // Method to get the list of options in the dropdown
    void setOptions(String[] options); // Method to set the options in the dropdown
}
