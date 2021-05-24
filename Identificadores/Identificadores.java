public class Identificadores{
    public static void main(String [] args){
        //Permitidos
        double sueldo = 100000.45;
        double _sueldo = 100000.45;
        double $sueldo = 100000.45;
        double _ = 100000.45;
        double $ = 100000.45;
        double _1 = 100000.45;
        double $sueldo1 = 100000.45;
        //No permitidos
        // Numeros al inicio
        double 1sueldo = 100000.45;
        double 1_sueldo = 100000.45;
        double 1$sueldo = 100000.45;
        double final = 100000.45; // palabras reservadas de JAVA
    }
}