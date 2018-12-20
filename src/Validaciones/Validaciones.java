/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jimmy
 */
public class Validaciones {

    public boolean verificaCedulaRUC(String cedulaRUC) {
        boolean estado = false;
        char[] arregloCedulaRUC = new char[13];
        int provincia;
        for (int i = 0; i < cedulaRUC.length(); i++) {
            arregloCedulaRUC[i] = cedulaRUC.charAt(i);
        }
        if (cedulaRUC.length() >= 10) {
            provincia = Integer.parseInt(String.valueOf(arregloCedulaRUC[0]) + String.valueOf(arregloCedulaRUC[1]));

            if (provincia > 0 && provincia < 25) {
                if (Integer.parseInt(String.valueOf(arregloCedulaRUC[2])) < 6 && cedulaRUC.length() == 10) {
                    estado = verificaCedula(arregloCedulaRUC);
                } else if (Integer.parseInt(String.valueOf(arregloCedulaRUC[2])) < 6) {
                    estado = verificaRUCPersonaNatural(arregloCedulaRUC);
                } else if (Integer.parseInt(String.valueOf(arregloCedulaRUC[2])) == 6) {
                    estado = verificaRUCSectorPublico(arregloCedulaRUC);
                } else if (Integer.parseInt(String.valueOf(arregloCedulaRUC[2])) == 9) {
                    estado = verificaRUCPersonaJuridica(arregloCedulaRUC);
                }
            }
        }
        return estado;
    }

    public boolean verificaCedula(char[] arregloCedula) {
        int aux = 0, par = 0, impar = 0, verificador;
        for (int i = 0; i < 9; i += 2) {
            aux = 2 * Integer.parseInt(String.valueOf(arregloCedula[i]));
            if (aux > 9) {
                aux -= 9;
            }
            par += aux;
        }
        for (int i = 1; i < 9; i += 2) {
            impar += Integer.parseInt(String.valueOf(arregloCedula[i]));
        }

        aux = par + impar;
        if (aux % 10 != 0) {
            verificador = 10 - (aux % 10);
        } else {
            verificador = 0;
        }
        if (verificador == Integer.parseInt(String.valueOf(arregloCedula[9]))) {
            System.out.println("CEDULA VALIDA");
            return true;
        } else {
            System.out.println("CEDULA INVALIDA");
            return false;
        }
    }

    public boolean verificaRUCPersonaNatural(char[] arregloRUC) {

        String ultimosDigitos = arregloRUC[10] + "" + arregloRUC[11] + "" + arregloRUC[12] + "";

        if (verificaCedula(arregloRUC) == true && ultimosDigitos.equals("001")) {
            System.out.println("RUCPersonaNatural VALIDO");
            return true;
        }
        System.out.println("RUCPersonaNatural INVALIDO");
        return false;
    }

    public boolean verificaRUCPersonaJuridica(char[] arregloRUC) {
        int aux = 0, prod, verificador;
        verificador = Integer.parseInt(String.valueOf(arregloRUC[10])) + Integer.parseInt(String.valueOf(arregloRUC[11])) + Integer.parseInt(String.valueOf(arregloRUC[12]));
        if (verificador > 0) {
            int[] coeficiente = {4, 3, 2, 7, 6, 5, 4, 3, 2};
            for (int i = 0; i < 9; i++) {
                prod = Integer.parseInt(String.valueOf(arregloRUC[i])) * coeficiente[i];
                aux += prod;
            }
            if (aux % 11 == 0) {
                verificador = 0;
            } else if (aux % 11 == 1) {
                return false;
            } else {
                aux = aux % 11;
                verificador = 11 - aux;
            }
            if (verificador == Integer.parseInt(String.valueOf(arregloRUC[9]))) {
                System.out.println("RUCPersonaJuridica VALIDO");
                return true;
            } else {
                System.out.println("RUCPersonaJuridica INVALIDO");
                return false;
            }
        } else {
            System.out.println("RUCPersonaJuridica INVALIDO");
            return false;
        }

    }

    public boolean verificaRUCSectorPublico(char[] arregloRUC) {
        int aux = 0, prod, verificador;
        verificador = Integer.parseInt(String.valueOf(arregloRUC[9])) + Integer.parseInt(String.valueOf(arregloRUC[10])) + Integer.parseInt(String.valueOf(arregloRUC[11]) + Integer.parseInt(String.valueOf(arregloRUC[12])));

        if (verificador > 0) {
            int[] coeficiente = {3, 2, 7, 6, 5, 4, 3, 2};

            for (int i = 0; i < 8; i++) {
                prod = Integer.parseInt(String.valueOf(arregloRUC[i])) * coeficiente[i];
                aux += prod;
            }

            if (aux % 11 == 0) {
                verificador = 0;
            } else if (aux % 11 == 1) {
                System.out.println("RUCSectorPublico INVALIDO");
                return false;
            } else {
                aux = aux % 11;
                verificador = 11 - aux;
            }

            if (verificador == Integer.parseInt(String.valueOf(arregloRUC[8]))) {
                System.out.println("RUCSectorPublico VALIDO");
                return true;
            } else {
                System.out.println("RUCSectorPublico INVALIDO");
                return false;
            }
        } else {
            System.out.println("RUCSectorPublico INVALIDO");
            return false;
        }
    }
    
    public boolean validacionCorreoElectronico(String correo){
        
        Pattern pat = null;
        Matcher mat = null;
        
        pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);
        
        if(mat.find()){
            return true;
        } else{
            return false;
        }
        
    } //Fin de la funcion validacionCorreoElectronico
}
