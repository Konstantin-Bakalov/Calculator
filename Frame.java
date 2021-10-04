import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public static JPanel panel;
    public static JTextField fieldInput;
    public static JButton[] numberButtons;
    public static JButton[] functionButtons;
    public static double firstNumber = 0;
    public static double secondNumber = 0;
    public static String operation = "";

    Frame() {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(101, 100, 100));

        numberButtons = new JButton[10];
        functionButtons = new JButton[6];
        setFunctionButtons();

        panel = new JPanel();
        panel.setBounds(50, 130, 300, 400);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(101, 100, 100));

        for(int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(i + "");
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(new Font("Helvetica", Font.BOLD, 25));
            numberButtons[i].setOpaque(true);
            numberButtons[i].setBackground(new Color(18, 146, 201));
            numberButtons[i].addActionListener(new ButtonListener());
            numberButtons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            panel.add(numberButtons[i]);
        }

        for(int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].setFocusable(false);
            functionButtons[i].setFont(new Font("Helvetica", Font.BOLD, 25));
            functionButtons[i].setOpaque(true);
            functionButtons[i].setBackground(new Color(18, 146, 201));
            functionButtons[i].addActionListener(new ButtonListener());
            functionButtons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            functionButtons[i].setBackground(new Color(227, 128, 7, 169));
            panel.add(functionButtons[i]);
        }

        fieldInput = new JTextField();
        fieldInput.setBounds(50, 50, 300, 50);
        fieldInput.setFont(new Font("Apple LiGothic", Font.BOLD, 35));
        fieldInput.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        fieldInput.setBackground(new Color(79, 79, 86));

        this.add(panel);
        this.add(fieldInput);
        this.setVisible(true);
    }

    private void setFunctionButtons() {
        functionButtons[0] = new JButton("+");
        functionButtons[1] = new JButton("-");
        functionButtons[2] = new JButton("*");
        functionButtons[3] = new JButton("/");
        functionButtons[4] = new JButton("C");
        functionButtons[5] = new JButton("=");
    }

}