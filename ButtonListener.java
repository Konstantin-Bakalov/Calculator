import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < Frame.numberButtons.length; i++) {
            if(e.getSource() == Frame.numberButtons[i]) {
                Frame.fieldInput.setText(Frame.fieldInput.getText().concat(i + ""));
            }
        }
        for(int i = 0; i < Frame.functionButtons.length; i++) {
            if(e.getSource() == Frame.functionButtons[i]) {
                if(i == 0) {
                    Frame.firstNumber = Integer.parseUnsignedInt(Frame.fieldInput.getText());
                    Frame.fieldInput.setText("");
                    Frame.operation = "Addition";
                }
                else if(i == 1) {
                    Frame.firstNumber = Integer.parseUnsignedInt(Frame.fieldInput.getText());
                    Frame.fieldInput.setText("");
                    Frame.operation = "Subtraction";
                }
                else if(i == 2) {
                    Frame.firstNumber = Integer.parseUnsignedInt(Frame.fieldInput.getText());
                    Frame.fieldInput.setText("");
                    Frame.operation = "Multiplication";
                }
                else if(i == 3) {
                    Frame.firstNumber = Integer.parseUnsignedInt(Frame.fieldInput.getText());
                    Frame.fieldInput.setText("");
                    Frame.operation = "Division";
                }
                else if(i == 4) {
                    Frame.firstNumber = 0;
                    Frame.secondNumber = 0;
                    Frame.fieldInput.setText("");
                    Frame.operation = "";
                }
                else if(i == 5) {
                    Frame.secondNumber = Integer.parseUnsignedInt(Frame.fieldInput.getText());
                    double result = 0;
                    if(Frame.operation.equals("Addition")) {
                        result = Frame.firstNumber + Frame.secondNumber;
                    }
                    else if(Frame.operation.equals("Subtraction")) {
                        result = Frame.firstNumber - Frame.secondNumber;
                    }
                    else if(Frame.operation.equals("Multiplication")) {
                        result = Frame.firstNumber * Frame.secondNumber;
                    }
                    else if(Frame.operation.equals("Division")) {
                        result = Frame.firstNumber / Frame.secondNumber;
                    }
                    Frame.fieldInput.setText(result + "");
                }
            }
        }
    }
}

