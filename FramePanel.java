package javaapplication1;

import java.util.HashMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class FramePanel extends JPanel {

    //JFrame onde o painel está
    JFrame frame;
    
    //Dicionário onde os componentes serão guardados
    HashMap<String, JComponent> componentes = new HashMap<>();
    
    public FramePanel(JFrame frame) {
        
        this.frame = frame;
        construir();
    }
    
    //Método que todo a classe que estender FramePanel deve ter
    //Usado para configurar a tela, adicionar componentes, etc
    private void construir() {
    
        configurar();
        addComponents();
        addListeners();
    };
    
    //Talvez seja interessante fazer assim não sei, parece organizado
    protected abstract void configurar();
    protected abstract void addComponents();
    protected abstract void addListeners();
    
    //Método usado para adicionar componentes ao panel e ao dicionário
    public FramePanel addComponent(JComponent comp, String index) {
        
        add(comp);
        
        //Adiciona o componente ao dicionário no devido index
        componentes.put(index, comp);
        
        return this;
    }
    
    //Método usado para obter um componente de acordo com o index no dicionário
    public JComponent getComponent(String index) {
        
        return componentes.get(index);
    }
}