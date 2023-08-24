/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author Igorm
 */
public class IdiomaSistema {

    public static void main(String[] args) {  
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma: "+idioma);
        System.out.println("Idioma: "+idioma.getDisplayLanguage());
    }
}