package Unidad1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OyenteAlfombraSierpinski extends MouseAdapter{
    private final AlfombraSierpinski alfombra;
    private final PanelAlfombraSierpinski panel;

    public OyenteAlfombraSierpinski(
            AlfombraSierpinski alfombra,
            PanelAlfombraSierpinski panel) {
        this.alfombra = alfombra;
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch (e.getButton()) {
            case 1://BOTON IZQUIERDO
                alfombra.setNivel(alfombra.getNivel() + 1);
                break;
            case 3://BOTON DERECHO
                alfombra.setNivel(alfombra.getNivel() - 1);
        }
        panel.repaint();
    }
}
