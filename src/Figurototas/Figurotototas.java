/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figurototas;
import javax.swing.JOptionPane;
/**
 *
 * @author pavilion
 */
public class Figurotototas {
    double area;
    
    public void FigurotaCir (double radio){
        area = Math.PI*Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null,"El area del circulo es: " + area);    
    }
    public void FigurotaCua(double lado){
        area = lado * lado;
       JOptionPane.showMessageDialog(null,"El area del Cuadrado es: " + area);  
    }
    public void FigurotaTri(double base, double altura){
        area = base * altura /2;
        JOptionPane.showMessageDialog(null,"El area del Triangulo es: " + area);  
    }
    public void FigurotaRec(double base1, double altura1){
        area = base1 * altura1;
        JOptionPane.showMessageDialog(null,"El area del Rectangulo es: " + area);  
    }
    public void FigurotaEsf(double radio1){
        area = 4 * (Math.PI)*Math.pow(radio1, 2);
        JOptionPane.showMessageDialog(null,"El area de la Esfera es: " + area);  
    }
    public void FigurotaCub(double arista){
        area = 6 * Math.pow(arista, 2);
        JOptionPane.showMessageDialog(null,"El area del Cubo es: " + area);  
    }
}

