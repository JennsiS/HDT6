
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws FileNotFoundException {
     Scanner scan = new Scanner(System.in);
     FileReader fr = new FileReader("C:\\Users\\bff_n_000\\Desktop\\datos.txt"); //aqui debes de poner tu ruta
     BufferedReader br = new BufferedReader (fr);
     System.out.print("Ingrese que tipo de implementacion desea utilizar");
     System.out.print("1.Hash Map");
     System.out.print("1.Tree Map");   
     System.out.print("1.Linked hash map");
     String opcion = scan.nextLine();
     
    }
    
}
