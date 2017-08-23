
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



public class Equacao extends JFrame {
    private final JButton calculate = new JButton("Calcular");
    private final JTextField inputa2 = new JTextField("", 10);
    private final JLabel a2 = new JLabel("a²");
    private final JTextField inputb = new JTextField("", 10);
    private final JLabel b = new JLabel("b");
    private final JTextField inputc = new JTextField("", 10);
    private final JLabel c = new JLabel("c");
    private final JTextField inputResultado = new JTextField("", 10);
    private final JLabel Resultado = new JLabel("Resultado:");
    private final int simples = 0;
    
    public Equacao() throws HeadlessException {
        super("Botoes");
        setLayout(new FlowLayout());
        add(inputa2);
        add(a2);
        add(inputb);
        add(b);
        add(inputc);
        add(c);
        add(calculate);
        add(Resultado);
        add(inputResultado);
        
        
        BotaoClicado bc = new BotaoClicado();
        calculate.addActionListener(bc);
    }
    
    public class BotaoClicado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Integer.parseInt(inputa2.getText());
            double b = Integer.parseInt(inputb.getText());
            double c = Integer.parseInt(inputc.getText());
            double delta = b*b-4*a*c;
            double result1 = (-b+Math.sqrt(delta))/2*a;
            double result2 = (-b-Math.sqrt(delta))/2*a;
            if(delta < 0)
                JOptionPane.showMessageDialog(null, "A equação nao possui raizes reais", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            else if(delta ==0)
                 JOptionPane.showMessageDialog(null, "A equação  possui uma raiz real: ", "Resultado"+result1 , JOptionPane.INFORMATION_MESSAGE);
            else if(delta>0) 
            JOptionPane.showMessageDialog(null, "A equação possui duas raizes reais: "+result1+" e "+result2, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
