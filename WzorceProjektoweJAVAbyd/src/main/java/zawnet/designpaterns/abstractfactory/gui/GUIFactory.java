package zawnet.designpaterns.abstractfactory.gui;

/**
 * Fabryka abstrakcyjna
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
