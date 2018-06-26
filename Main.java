package javaapplication1;

import javax.swing.JFrame;

public class Main {

    public static void main(String args[]) {
        
        //Cria e configura a tela
        JFrame frm = new JFrame();
        frm.setSize(166, 89);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null);
        frm.setLocationRelativeTo(null);
        
        //Seta o painel principal do JFrame como um PainelPrincipal
        frm.setContentPane(new PainelPrincipal(frm));
        
        frm.setVisible(true);
    }
}
