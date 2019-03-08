
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.*;
import java.util.*;
import java.util.HashMap;

/**
 * @author Jennifer Sandoval,Andre Toledo
 * @Carne 18962,18439
 * @date 06/03/19
 * @name Worksheet.java
 * <p>Clase principal que muestra diferentes opciones al usuario acerca de las cartas  </p>
 * */
public class worksheet {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        String row_lines = null;
        
        String codi;
        
        String val_terms = "e";
        
        int open;
        
        boolean bro = false;
        //
        Scanner scan = new Scanner(System.in);
        Factory fact = new Factory();
                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
        Map<String, String> map_l;
        Map<String, String> map_user;
        Map<String, Integer> map_count;
                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
        Menu menu = new Menu();
                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
        
        menu.PrintMenu();
        open = scan.nextInt();
        map_l = fact.Crearmap_l(open);
        map_user = fact.Crearmap_l(open);
        map_count = fact.Crearmap_l(open);
                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
        
        try{
                FileReader fileReader = new FileReader("cards_desc.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                        /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                
                while((row_lines = bufferedReader.readLine()) != null) { 
                    codi = row_lines.substring(0, row_lines.indexOf('|'));                   
                    val_terms = row_lines.substring(row_lines.lastIndexOf("|") + 1);
                    map_l.put(codi, val_terms);                  
                } 
                        /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                bufferedReader.close(); 
                while(!bro){
                menu.PrintMenu2();
                try{
                    open = scan.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                        /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                codi = scan.nextLine();
                switch(open){
                    case 1:
                        System.out.println("/INGRESE EL NOMBRE DE LA CARTA A AGREGAR:");                        
                        codi = scan.nextLine();
                        if(map_l.containsKey(codi)){
                            val_terms = map_l.get(codi);
                            map_user.put(codi, val_terms); 
                            if(map_count.containsKey(codi)){
                                int i = map_count.get(codi) + 1;
                                map_count.put(codi, i); 
                            }
                                    /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                            else{
                                map_count.put(codi, 1);
                            }
                                    /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                            System.out.println(map_count.get(codi));
                        }else{
                            System.out.println("DONE.");
                        }
                                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                    break;
                    case 2:
                        System.out.println("/INGRESE EL NOMBRE DE LA CARTA A AGREGAR:");                        
                        codi = scan.nextLine();
                        if(map_l.containsKey(codi)){
                            System.out.println("TIPO DE CARTA: " + map_l.get(codi));
                        }else{
                            System.out.println("DONE.");
                        }
                                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                    break;
                    case 3:
                        for(String e: map_user.keySet()){
                            System.out.println(e + "|||" + map_user.get(e) + "|||" + map_count.get(e));
                        }
                        break;
                    case 4:
                        for(String e: map_user.keySet()){
                            if(map_user.get(e).equals("Monstruo")){
                                System.out.println(e + "|" + map_user.get(e) + "|" + map_count.get(e));
                            }
                        }
                                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                        for(String e: map_user.keySet()){
                            if(map_user.get(e).equals("Hechizo")){
                                System.out.println(e + "|" + map_user.get(e) + "|" + map_count.get(e));
                            }
                        }
                        for(String e: map_user.keySet()){
                            if(map_user.get(e).equals("ENREDO")){
                                System.out.println(e + "|" + map_user.get(e) + "|" + map_count.get(e));
                            }
                        }
                        break;
                    case 5:
                        for(String e: map_l.keySet()){
                            System.out.println(e + "|||" + map_l.get(e));
                        }
                        break;
                    case 6:
                        for(String e: map_l.keySet()){
                            if(map_l.get(e).equals("Monstruo")){
                                System.out.println(e + "|" + map_l.get(e));
                            }
                        }
                        for(String e: map_l.keySet()){
                            if(map_l.get(e).equals("Hechizo")){
                                System.out.println(e + "|" + map_l.get(e));
                            }
                        }
                                /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
                        for(String e: map_l.keySet()){
                            if(map_l.get(e).equals("Trampa")){
                                System.out.println(e + "|" + map_l.get(e));
                            }
                        }
                        break;    
                    case 7:
                        bro = true;
                    break;
                    default:
                        System.out.println("CANT DO IT.");
                }
                }
                scan.close();  
                        /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
            }
            catch(FileNotFoundException ex) {
                System.out.println("No es posible abrir" + "cards_desc.txt" + "'");                
            }
                    /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
            catch(IOException ex) {
                    System.out.println("Error en corrida'" + "cards_desc.txt" + "'");                  
                }
    }
        /*
        *
        *
        TAG_ALTERNATE_IIOP_ADDRESS
        *
        *
        */
    }
    
