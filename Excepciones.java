package excepciones;



public class Excepciones {

        public static void main(String[] args) {

       
        Arit();
        arreglos();
        clasex();
	nullex();
        stackovf();
       
    }

    public static void Arit() {
       try{
          int i=10/0;
       }catch(ArithmeticException ex){
 ex.printStackTrace(System.err);       
       }
           
    }
    public static void arreglos(){
        try{
               int [] array = new int[20];
		         array[-3] = 24;
        }catch(ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace(System.err); 
        }
    }
    public static void clasex(){
        
        try{
          Object x = new Integer(0);
     System.out.println((String)x);
        }catch(ClassCastException ex){
     ex.printStackTrace(System.err);
        }
    }
  public static void nullex(){
        String cadena=null;
	
        try{
             cadena.charAt(4);
        }catch(NullPointerException ex){
           ex.printStackTrace(System.err);  
        }
    }
    public static void stackovf(){
	
        try{
              
               stackovf();
 
        }catch(ExceptionInInitializerError ex){
           ex.printStackTrace(System.err);  
        }
    }

}