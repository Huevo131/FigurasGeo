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
public class Datotes {
    double radio;
    double lado;
    double base;
    double altura;
    double base1;
    double altura1;
    double radio1;
    double arista;
    
public void Valores(){
    JOptionPane.showMessageDialog(null, "\t\s //Area del Circulo//");
       radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
    JOptionPane.showMessageDialog(null, "\t\s //Area del Cuadrado//");
       lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del lado"));
    JOptionPane.showMessageDialog(null, "\t\s //Area del Triangulo//");
       base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
    JOptionPane.showMessageDialog(null, "\t\s //Area del Rectangulo//");
       base1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la base"));
       altura1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
    JOptionPane.showMessageDialog(null, "\t\s //Area de la Esfera//");
       radio1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del radio"));
    JOptionPane.showMessageDialog(null, "\t\s //Area del Cubo//");
       arista = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la arista"));
   
   Figurotototas dorilocos = new Figurotototas();
   dorilocos.FigurotaCir(radio);
   dorilocos.FigurotaCua(lado);
   dorilocos.FigurotaCub(arista);
   dorilocos.FigurotaEsf(radio1);
   dorilocos.FigurotaRec(base1, altura1);
   dorilocos.FigurotaTri(base, altura);
}
}
