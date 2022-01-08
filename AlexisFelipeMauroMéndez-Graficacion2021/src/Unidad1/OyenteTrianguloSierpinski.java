
package Unidad1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OyenteTrianguloSierpinski extends MouseAdapter{
    private final TrianguloSierpinski triangulo;
    private final PanelTrianguloSierpinski panel;
    
    public OyenteTrianguloSierpinski(
            TrianguloSierpinski triangulo,
            PanelTrianguloSierpinski panel){
        this.triangulo = triangulo;
        this.panel = panel;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
       triangulo.setNivel(triangulo.getNivel()+1);
       panel.repaint();
    }
}
