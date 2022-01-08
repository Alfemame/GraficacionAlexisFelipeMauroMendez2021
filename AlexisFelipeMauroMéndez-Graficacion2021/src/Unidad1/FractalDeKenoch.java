package Unidad1;

import javax.swing.JFrame;

public class FractalDeKenoch {
    
    public static void main(String[] args) {
        Koch koch = new Koch(); //MODELO
        PanelKoch panel = new PanelKoch(koch); //VISTA
        OyenteKenoch oyente = new OyenteKenoch(koch, panel); //CONTROLADOR
        panel.addEventos(oyente);
        JFrame f = new JFrame("Fractal de koch");
        f.add(panel);
        f.setBounds(300, 20, 800, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
