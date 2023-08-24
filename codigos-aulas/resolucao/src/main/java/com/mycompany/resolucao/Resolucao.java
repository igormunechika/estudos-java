/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucao;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Igorm
 */
public class Resolucao {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolução do Sitemas: "+d.width+"x"+d.height);
    }
}
