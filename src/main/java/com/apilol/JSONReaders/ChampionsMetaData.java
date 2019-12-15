package com.apilol.JSONReaders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.apilol.exception.InitializeSingletonException;
/*Contenedor de la informacion sobre el paso id-nombre de campeon
 * Se hace singleton para evitar la continua creacion y lectura del json
 * */
public class ChampionsMetaData {
	
	private Map<Integer,String> championData;
	private static ChampionsMetaData selfReference;
	
	private ChampionsMetaData() {
		readJSON();
	}
	
	public static ChampionsMetaData getInstance() throws InitializeSingletonException {
		if(selfReference!=null) {
			return selfReference;
		}
		throw  new InitializeSingletonException();
	}
	
	public static void initializeInstance() throws InitializeSingletonException {
		System.out.println(selfReference);
		if(selfReference==null) {
			selfReference =  new ChampionsMetaData();
			return;
		}
		throw  new InitializeSingletonException();
	}
	
	
	public String getChampionDataById(int code) {
		return championData.get(code);
	}

	private void readJSON() {
		championData= new HashMap<>();
		JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("src\\main\\java\\com\\apilol\\files\\champion.json"))
        {
            Object obj = jsonParser.parse(reader);
            JSONObject championsList = (JSONObject) ((JSONObject) obj).get("data");
            championsList.keySet().forEach(data->parseChampions(championsList,(String)data));
           
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    private void parseChampions(JSONObject employee,String key) 
    {
        //Get employee object within list
    	
    	Integer championId = Integer.parseInt((String)((JSONObject) employee.get(key)).get("key"));
    	
    	championData.put(championId, key) ;
    }	
	
}
