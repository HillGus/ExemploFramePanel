package javaapplication1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PainelSecundario extends FramePanel {

    //O mesmo da outra classe
    //Só existe pra mostrar que muda a tela é isso
    public PainelSecundario(JFrame frame) {
        super(frame);
    }

    @Override
    protected void addComponents() {
        
        JLabel lblIdai = new JLabel("Ta mano idai");
        
        addComponent(lblIdai, "lblIdai");
    }

    @Override
    protected void addListeners() {
        
    }

    @Override
    protected void configurar() {
       
        setSize(150, 50);
    }
}