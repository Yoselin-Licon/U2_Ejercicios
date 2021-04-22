


//Uso de operadores

/**
 *
 * @author Yoselin
 */
public class Operadores {


    public static void main(String[] args) {
   int a=20, b= 10, c=0,d=20, e=40, f=30;
   boolean condition=true;
   
        //operador pre incremento 

        //a=a+1 entonces c=a

        c=++a;

  System.out.println("Valor de c(++a)= " +c);
        
        //Operador de post incremento (b toma valor de )
        //c=b entonces b=b+1
        
        c=++b;
        
        
        System.err.println("Valor de c(b++)= " +c);
        
        
        //Operdaor de preincremento
        //d=d-1   entonces c=d
        
        c=--d;
        
        System.out.println("Valor de c(-d): "+c);
        
        //Operador de postdecremento
        //c=e entonces e=e-1 (e toma el valor de 39)
        
        c=-e;
        System.out.println("Valor de c(e-)- " +c);
        
        //Operador lógico not
        
        System.out.println("Valor de !condition=" + !condition);
        
    }
    
}
