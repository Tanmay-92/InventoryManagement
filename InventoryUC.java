package com.Bridgelabz;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryUC {
	
	public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader("D:/inventory.json");

       
        Object obj = jsonparser.parse(reader); 
       
        JSONObject inventoryobj = (JSONObject) obj; 
        JSONArray array = (JSONArray) inventoryobj.get("inventoryDetails"); 
        
        for (int i = 0; i < array.size(); i++) {
            JSONObject inventoryDetails = (JSONObject) array.get(i);

            String name = (String) inventoryDetails.get("name");
            double weight = (double) inventoryDetails.get("weight");
            double pricePerKg = (double) inventoryDetails.get("pricePerKg");
            String type = (String) inventoryDetails.get("type");

            System.out.println("inventoryDetail " + i + " is ......");

            System.out.println("Name :: " + name);
            System.out.println("Weight :: " + weight);
            System.out.println("PricePerKg :: " + pricePerKg);
            System.out.println("Type :: " + type);

            double value = weight * pricePerKg;
           
            System.out.println(" Value Of Inventory is : " + value );
          
           
        }

    }

}
