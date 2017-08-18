/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
public class Janela extends JFrame{
        private int n1;
        private int n2;
        private int n3;
       private final JLabel A;
       private final JTextField txtA;
       private final JLabel B;
       private final JTextField txtB;
       private final JLabel C;
       private final JTextField txtC;
    public Janela() throws HeadlessException {
        super("EQUAÇÕES");
        A = new JLabel("A");
        txtA = new JTextField(20);
        B = new JLabel("B");
        txtB = new JTextField(20);
        C = new JLabel("C");
        txtC = new JTextField(20);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(A);
        add(txtA);
        add(B);
        add(txtB);
        add(C);
        add(txtC);
        txtA.addActionListener(new Numero1Enter());
        txtB.addActionListener(new Numero2Enter());
        txtC.addActionListener(new Numero3Enter());
        
    }

    private class Numero2Enter implements ActionListener {

        public Numero2Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    private class Numero3Enter implements ActionListener {

        public Numero3Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    private class Numero1Enter implements ActionListener {

        public Numero1Enter() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    
}
