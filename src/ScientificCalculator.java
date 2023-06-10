import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ScientificCalculator extends JFrame implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonSquare, buttonSquareRoot, buttonSin, buttonCos, buttonTan, buttonLog, buttonClear, buttonEqual;
    double num1 = 0, num2 = 0,result = 0;
    String operator=" ",n;

    ScientificCalculator() {

        frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 100,600,700);
        frame.setLayout(null);
        frame.setVisible(true);

        textField = new JTextField();
        textField.setBounds(5,2,580,250);
        textField.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(textField);

        buttonSin = new JButton("sin");
        buttonSin.addActionListener(this);
        buttonSin.setBounds(2,255,98,50);
        buttonSin.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonSin);

        buttonCos = new JButton("cos");
        buttonCos.addActionListener(this);
        buttonCos.setBounds(100,255,98,50);
        buttonCos.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonCos);

        buttonTan = new JButton("tan");
        buttonTan.addActionListener(this);
        buttonTan.setBounds(200,255,98,50);
        buttonTan.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonTan);

        buttonSquare = new JButton("x^2");
        buttonSquare.addActionListener(this);
        buttonSquare.setBounds(300,255,98,50);
        buttonSquare.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonSquare);

        buttonSquareRoot = new JButton("sqrt");
        buttonSquareRoot.addActionListener(this);
        buttonSquareRoot.setBounds(400,255,98,50);
        buttonSquareRoot.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonSquareRoot);

        buttonLog = new JButton("\uF0E7");
        buttonLog.addActionListener(this);
        buttonLog.setBounds(500,255,98,50);
        buttonLog.setFont(new Font("Wingding",Font.PLAIN,20));
        frame.add(buttonLog);

        button7 = new JButton("7");
        button7.setBounds(2,310,150,80);
        button7.setFont(new Font("Arial",Font.PLAIN,20));
        button7.addActionListener(this);
        frame.add(button7);


        button8 = new JButton("8");
        button8.setBounds(154,310,150,80);
        button8.setFont(new Font("Arial",Font.PLAIN,20));
        button8.addActionListener(this);
        frame.add(button8);

        button9 = new JButton("9");
        button9.addActionListener(this);
        button9.setBounds(306,310,150,80);
        button9.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button9);

        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        buttonAdd.setBounds(458,310,127,80);
        buttonAdd.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonAdd);

        button4 = new JButton("4");
        button4.addActionListener(this);
        button4.setBounds(2,395,150,80);
      button4.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button4);

        button5 = new JButton("5");
        button5.addActionListener(this);
        button5.setBounds(154,395,150,80);
        button5.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button5);

        button6 = new JButton("6");
        button6.addActionListener(this);
        button6.setBounds(306,395,150,80);
        button6.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button6);

        buttonSubtract = new JButton("-");
        buttonSubtract.addActionListener(this);
        buttonSubtract.setBounds(458,395,127,80);
        buttonSubtract.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonSubtract);

        button1 = new JButton("1");
        button1.addActionListener(this);
        button1.setBounds(2,480,150,80);
        button1.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        button2.setBounds(154,480,150,80);
        button2.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button2);

        button3 = new JButton("3");
        button3.addActionListener(this);
        button3.setBounds(306,480,150,80);
        button3.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button3);

        buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(this);
        buttonMultiply.setBounds(458,480,127,80);
        buttonMultiply.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonMultiply);

        buttonEqual = new JButton("=");
        buttonEqual.addActionListener(this);
        buttonEqual.setBounds(2,565,150,80);
        buttonEqual.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonEqual);

        buttonClear = new JButton("C");
        buttonClear.addActionListener(this);
        buttonClear.setBounds(154,565,150,80);
        buttonClear.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonClear);

        button0 = new JButton("0");
        button0.addActionListener(this);
        button0.setBounds(306,565,150,80);
        button0.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(button0);

        buttonDivide = new JButton("/");
        buttonDivide.addActionListener(this);
        buttonDivide.setBounds(458,565,127,80);
        buttonDivide.setFont(new Font("Arial",Font.PLAIN,20));
        frame.add(buttonDivide);

        frame.setResizable(false);
    }


    public static void main(String[] args) {
        new ScientificCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button0) {
            textField.setText(textField.getText().concat("0"));
        }
        if(e.getSource()==button1) {
            textField.setText(textField.getText().concat("1"));
        }
        if(e.getSource()==button2) {
            textField.setText(textField.getText().concat("2"));
        }
        if(e.getSource()==button3) {
            textField.setText(textField.getText().concat("3"));
        }
        if(e.getSource()==button4) {
            textField.setText(textField.getText().concat("4"));
        }
        if(e.getSource()==button5) {
            textField.setText(textField.getText().concat("5"));
        }
        if(e.getSource()==button6) {
            textField.setText(textField.getText().concat("6"));
        }
        if(e.getSource()==button7) {
            textField.setText(textField.getText().concat("7"));
        }
        if(e.getSource()==button8) {

            textField.setText(textField.getText().concat("8"));
        }if(e.getSource()==button9) {
            textField.setText(textField.getText().concat("9"));
        }
        else if(e.getSource()==buttonAdd) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }
       else if(e.getSource()==buttonSubtract) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }
        else if(e.getSource()==buttonMultiply) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }
       else if(e.getSource()==buttonDivide) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }
        else if(e.getSource()==buttonEqual) {
            num2 =Double.parseDouble(textField.getText());
            textField.setText(num1+operator+num2);
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            textField.setText(""+result);
            }
        else if(e.getSource()==buttonClear) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = "";
        }
        else if (e.getSource() == buttonSquare) {
            num1 = Double.parseDouble(textField.getText());
            result = num1 * num1;
            textField.setText(Double.toString(result));
        } else if (e.getSource() == buttonSquareRoot) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sqrt(num1);
            textField.setText(Double.toString(result));
        } else if (e.getSource() == buttonSin) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.sin(num1);
            textField.setText(Double.toString(result));
        } else if (e.getSource() == buttonCos) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.cos(num1);
            textField.setText(Double.toString(result));
        } else if (e.getSource() == buttonTan) {
            num1 = Double.parseDouble(textField.getText());
            result = Math.tan(num1);
            textField.setText(Double.toString(result));
        } else if (e.getSource() == buttonLog) {
            String backSpace=null;
            if (textField.getText().length()>0){
                StringBuilder str= new StringBuilder(textField.getText());
                str.deleteCharAt(textField.getText().length()-1);
                backSpace=str.toString();
                textField.setText(backSpace);
            }
        }
    }
}