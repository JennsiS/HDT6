/**
*
*
@Author Andree Toledo
*
*/
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.*;
import java.util.*;
import java.util.HashMap;

public class worksheet {


    public static void main(String[] args) {
       
        String row_lines = null;
		
        String codi;
		
        String val_terms = "i";
		
        int open;
		
        boolean bro = false;
		
        /*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
		
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
        menu.PrintMenu();
        open = scan.nextInt();
		/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
		
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
                Reader_script readerscript = new Reader_script("cards_desc.txt");
                BufferedReader bufferedReader = new BufferedReader(readerscript);
                while((row_lines = bufferedReader.readrow_lines()) != null) { 
				/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
		
                    codi = row_lines.substring(0, row_lines.indexOf('|'));                   
                    val_terms = row_lines.substring(row_lines.lastIndexOf("|") + 1);
                    map_l.put(codi, val_terms);                  
                } 
				
				
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
				
                codi = scan.nextrow_lines();
                switch(open){
                    case 1:
                        System.out.println("/INGRESE EL NOMBRE DE LA CARTA A AGREGAR:");                        
                        codi = scan.nextrow_lines();
						
						
						
                        if(map_l.containscodi(codi)){
                            val_terms = map_l.get(codi);
                            map_user.put(codi, val_terms); 
                            if(map_count.containscodi(codi)){
                                int i = map_count.get(codi) + 1;
                                map_count.put(codi, i); 
                            }
							
							
                            else{
                                map_count.put(codi, 1);
                            } 

							
                            System.out.println(map_count.get(codi));
                        }else{
                            System.out.println("Fuck off");
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
                        codi = scan.nextrow_lines();
                        if(map_l.containscodi(codi)){
                            System.out.println("TIPO DE CARTA: " + map_l.get(codi));
                        }else{
                            System.out.println("DONE.");
                        }
						
						
						
                    break;
                    case 3:
                        for(String e: map_user.codiSet()){
                            System.out.println(e + "|||" + map_user.get(e) + "|||" + map_count.get(e));
                        }
						
						
						
						
                        break;
                    case 4:
                        for(String e: map_user.codiSet()){
                            if(map_user.get(e).equals("BESTIA")){
                                System.out.println(e + "|" + map_user.get(e) + "|" + map_count.get(e));
                            }
                        }
						
                        for(String e: map_user.codiSet()){
                            if(map_user.get(e).equals("CONJURO")){
                                System.out.println(e + "|" + map_user.get(e) + "|" + map_count.get(e));
                            }
                        }
						
                        for(String e: map_user.codiSet()){
                            if(map_user.get(e).equals("ENREDO")){
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
						
						
                        break;
                    case 5:
                        for(String e: map_l.codiSet()){
                            System.out.println(e + "|||" + map_l.get(e));
                        }
						
						
						
                        break;
                    case 6:
                        for(String e: map_l.codiSet()){
                            if(map_l.get(e).equals("BESTIA")){
                                System.out.println(e + "|" + map_l.get(e));
                            }
                        }
						
                        for(String e: map_l.codiSet()){
                            if(map_l.get(e).equals("CONJURO")){
                                System.out.println(e + "|" + map_l.get(e));
                            }
                        }
						
                        for(String e: map_l.codiSet()){
                            if(map_l.get(e).equals("ENREDO")){
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
                
            }
			
			
            catch(FileNotFoundException ex) {
                System.out.println("No es posible abrir" + "cards_desc.txt" + "'");                
            }
			
			
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
    

