import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;



public class Millon {
    
    public static void muestraContenido() {
        
   try{

      File archivo = new File("out.txt");
      boolean bool = false;
      FileWriter fw = new FileWriter(archivo);
      BufferedWriter bw = new BufferedWriter(fw);

      FileInputStream inputStream = null;
      Scanner b = null;


    inputStream = new FileInputStream(archivo);
    b = new Scanner(inputStream, "UTF-8");


      String cadena;
      int cont=1;
      boolean flag =false;
      int cont2=0;
      
      
      
     
            int num =(int)(Math.random()*10000000 + 1);
            bw.write(num+"\n");
            bw.flush();
 
    
   


while( cont<10000000){
flag=false;
cont2++;

num =(int)(Math.random()*10000000 + 1);
    

 inputStream = new FileInputStream(archivo);
b = new Scanner(inputStream, "UTF-8");

   while((b.hasNextLine()) && cont!=10000000) {
    cadena = b.nextLine();;

         int numero = Integer.parseInt(cadena);
    if(numero!=num){
    }
    else{

        flag=true;

  
    }    
 
   
         }

     if(!flag){
            cont++;    
            bw.write(num+"\n");
            bw.flush();
     }

     }

            bw.close();
            fw.close();
            b.close();
     }catch(Exception e){
         e.printStackTrace();
         }
    }

    public static void main(String[] args) {

       

        muestraContenido();
    }
   
}