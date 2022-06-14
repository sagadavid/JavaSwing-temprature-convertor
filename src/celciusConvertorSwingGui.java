import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class celciusConvertorSwingGui extends JFrame {
    private JPanel mainJPanel;
    private JButton fahrenheitButton;
    private JLabel outputLabel;
    private JButton celciusButton;
    private JTextField inputField;

    public celciusConvertorSwingGui() {
//        super(titleJFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainJPanel);
        this.pack();
        celciusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab text
                //convert double
                //convert to celcius
                try {
                    int tempCelcius = (int) ((Double.parseDouble(inputField.getText())-32)/1.8);
                    outputLabel.setText("Celcius: "+tempCelcius);
                }
                catch (NumberFormatException ex) {
                    outputLabel.setText(ex.getMessage());
                }
            }
        });
        fahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tempFahrenheit = (int) ((Double.parseDouble(inputField.getText()) * 1.8) + 32);
                    outputLabel.setText("Fahrenheit: "+tempFahrenheit);

                }
                catch (NumberFormatException ex) {
                    outputLabel.setText(ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new celciusConvertorSwingGui();
        jFrame.setVisible(true);


    }
}
