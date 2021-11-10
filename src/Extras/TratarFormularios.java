/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author Thiago
 */
public class TratarFormularios {
    public static void limparCampos(JFrame form) throws Exception{
        limparCampos(form.getComponents());
    }
    public static void limparCampos(JInternalFrame form) throws Exception{
        limparCampos(form.getContentPane().getComponents());
    }
    private static void limparCampos(Component[] form) throws Exception{
        for(Component c: form){
            if(c instanceof JTextField){
                JTextField t =  (JTextField) c;
                t.setText("");
            }
            if(c instanceof JComboBox){
                JComboBox t =  (JComboBox) c;
                t.setSelectedIndex(0);
            }
        }
    }
    public static void habilitarCampos(JInternalFrame form)throws Exception{
        habilitarCampos(form.getContentPane().getComponents());
    }
    private static void habilitarCampos(Component[] form) throws Exception{
        for(Component c: form){
            c.setEnabled(true); 
        }
    }
}
