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
import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class JanelaBotoes extends JFrame {
    private final JButton btnEnfeitado = new JButton("Clique-me");
    private final JButton btnSimples = new JButton("Clique-me (2)");
    private int simples = 0;
    private int enfeitado = 0;
    
    public JanelaBotoes() throws HeadlessException {
        super("Botoes");
        setLayout(new FlowLayout());
        add(btnEnfeitado);
        btnEnfeitado.setIcon(new ImageIcon("resources/livros.jpg"));
        btnEnfeitado.setRolloverIcon(new ImageIcon("resources/cellphone.jpg"));
        add(btnSimples);
        
        BotaoClicado bc = new BotaoClicado();
        btnEnfeitado.addActionListener(bc);
        btnSimples.addActionListener(bc);
    }
    
    public class BotaoClicado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnSimples) {
                simples++;
                JOptionPane.showMessageDialog(null, "Botao simples clicado!\nSimples:"+ simples +" Enfeitado:"+ enfeitado, "Click!", JOptionPane.INFORMATION_MESSAGE);
            } else if(e.getSource() == btnEnfeitado) {
                enfeitado++;
                JOptionPane.showMessageDialog(null, "Botao enfeitado clicado!\nSimples:"+ simples +" Enfeitado:"+ enfeitado, "Click!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
