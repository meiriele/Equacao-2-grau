/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.br.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class CalcEq extends JFrame {
    private final JButton calculate = new JButton("Calcular");
    private final JTextField inputx2 = new JTextField("", 8);
    private final JLabel x2 = new JLabel("x²");
    private final JTextField inputx = new JTextField("", 8);
    private final JLabel x = new JLabel("x");
    private final JTextField inputc = new JTextField("", 8);
    private final JLabel c = new JLabel("c");
    private int simples = 0;
    
    public CalcEq() throws HeadlessException {
        super("Botoes");
        setLayout(new FlowLayout());
        add(inputx2);
        add(x2);
        add(inputx);
        add(x);
        add(inputc);
        add(c);
        add(calculate);
        
        BotaoClicado bc = new BotaoClicado();
        calculate.addActionListener(bc);
    }
    
    public class BotaoClicado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double x2 = Integer.parseInt(inputx2.getText());
            double x = Integer.parseInt(inputx.getText());
            double c = Integer.parseInt(inputc.getText());
            double delta = x*x-4*x2*c;
            double result1 = (-x+Math.sqrt(delta))/2*x2;
            double result2 = (-x-Math.sqrt(delta))/2*x2;
            if(delta < 0)
                JOptionPane.showMessageDialog(null, "A equacao nao possui raizes reais", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "O resultado da equacao é: "+result1+" ou "+result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
