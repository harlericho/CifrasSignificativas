/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula;

/**
 *
 * @author Charlie
 */
public class Sentecias {

    //metodo para resolver de forma logica el
    //problema de las cifras significativas
    public int formula(String numero) {
        char[] vector = new char[numero.length()];
        int c = 0;
        int v = 0;
        int g = 0;
        int b = 0;
        for (int i = 0; i < numero.length(); i++) {
            vector[i] = numero.charAt(i);
        }

        for (int i = 0; i < vector.length; i++) {

            if ((vector[i] == '.')) {
                if (g == 0) {
                    v++;
                    c = 0;
                }
            } else if (vector[i] == '0') {
                if (v > 0) {
                    c = 0;
                } else {
                    c++;
                }
            } else if (vector[i] != '0') {
                c++;
                v = 0;
                g = 1;
            }

        }
        //validar cifras enteras
        for (int i = 0; i < numero.length(); i++) {
            if (vector[i] == '.') {
                b++;
            }
        }
        if (b == 0) {
            for (int i = numero.length() - 1; i > 0; i--) {
                if (vector[i] == '0') {
                    c--;
                } else if (vector[i] != '0') {
                    break;
                }
            }
        }
        System.out.println("" + c);
        return c;
    }

    public static void main(String[] args) {
        Sentecias s = new Sentecias();
        s.formula("2.360");
//        if (s.formula("0") == 3) {
//            System.out.println("correcto");
//        } else {
//            System.out.println("incorrecto");
//        }

    }
}
