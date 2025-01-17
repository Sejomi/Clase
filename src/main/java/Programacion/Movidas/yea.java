package Programacion.Movidas;

import javax.swing.*;

public class yea {
    public static void main(String[] args) {
        String hola = "";
        int hola2 = 0;
        int hola3 = 0;

        hola = JOptionPane.showInputDialog("pollita?");

        JOptionPane.showMessageDialog(null, hola);
        if ((JOptionPane.showOptionDialog(null,"¿Eres gay?", "Pregunta",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null,null) == 0)){
            JOptionPane.showMessageDialog(null, "ja que tonto");
        }else{
            JOptionPane.showMessageDialog(null, "marica");
        }
    }
}
