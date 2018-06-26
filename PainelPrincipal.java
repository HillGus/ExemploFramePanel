package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PainelPrincipal extends FramePanel {

    
    public PainelPrincipal(JFrame frame) {
        super(frame);
    }
    
    //Adiciona os componentes
    @Override
    protected void addComponents() {
        
        JLabel lblOi = new JLabel("oi");
        
        addComponent(lblOi, "lblOi");
        
        JButton btnOutraTela = new JButton("Vai pra outra tela");
        
        addComponent(btnOutraTela, "btnOutraTela");
    }
    
    //Adiciona os listeners
    @Override
    protected void addListeners() {
        
        ((JButton) getComponent("btnOutraTela")).addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                frame.setContentPane(new PainelSecundario(frame));
            }
        });
    }

    @Override
    protected void configurar() {
        
        setSize(150, 50);
    }
}