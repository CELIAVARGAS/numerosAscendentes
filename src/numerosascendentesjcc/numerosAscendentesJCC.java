/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosascendentesjcc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esmeralda
 */
public class numerosAscendentesJCC {
   
        public static void main(String[] args) {
            try {
                gramatica parser = new gramatica(new BufferedReader(new FileReader("prueba.txt")));
                System.out.println("INICIA ANALISIS");
                parser.S();
                System.out.println("FINALIZA ANALISIS");
            } catch (ParseException e) {
                System.err.println(e.getMessage());
            } catch(TokenMgrError e){
                System.err.println(e.getMessage());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(gramatica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
