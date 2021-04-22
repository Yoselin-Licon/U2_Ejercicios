/*
      
*/

package poo_ejerc_u2;

/**
 *
 * @author Yoselin
 */
public class POO_ejerc_U2 {

    public static void main(String[] args) {
                int resultado = sumar (5,10);
                
                System.out.println(resultado);
       }
    
    public static int sumar (int inicio, int fin){
        if(fin>inicio){
            return fin + sumar(inicio, fin=1);

        }else{
            return fin;
        }
    }
    
}
