
package Unidad1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelAlfombraSierpinski extends JPanel{
    private AlfombraSierpinski alfombra;

    public PanelAlfombraSierpinski(
            AlfombraSierpinski alfombra) {
        this.alfombra = alfombra;
        setBackground(Color.CYAN);
    }

    public void addEventos(OyenteAlfombraSierpinski oyente) {
        addMouseListener(oyente);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Nivel:" + alfombra.getNivel(), 710, 50);
        alfombra.dibujar(g, 650, alfombra.getNivel(), 50, 680);
    }
}
