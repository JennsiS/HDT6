import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

/**
 * @author Jennifer Sandoval,Andre Toledo
 * @Carne 18962,18439
 * @date 06/03/19
 * @name Factory.java
 * <p>Clase encargada de implementar el diseño factory  </p>
 * */
 
 
public class Factory {
    		/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/

    /**
     *
     * @param inicialized
     * @return Map, retorna un mapa
     */

		
    public Map Crearmap_l(int inicialized){
        if(inicialized==1){
            Map<String, String> map_l = new HashMap<String, String>();
                return map_l;
				/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
		
        }else if(inicialized==2){
            Map<String, String> map_l = new TreeMap<String, String>();
                return map_l; 
	/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
						
        }else if(inicialized==3){
            Map<String, String> map_l = new LinkedHashMap<String, String>();
            return map_l;
				/*
		*
		*
		TAG_ALTERNATE_IIOP_ADDRESS
		*
		*
		*/
		
        }
        else{
            return (null);
        }
    }
}