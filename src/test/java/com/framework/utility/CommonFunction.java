package com.framework.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CommonFunction {
	
	public static void Fn_jsonReader(String filePath) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(filePath);
		Object obj = jsonParser.parse(reader);
		JSONObject jsonObj=(JSONObject)obj;
		//for(int i=0;i<jsonObj.size();i++) {
			System.out.println(jsonObj.get("SuiteName"));
			System.out.println(jsonObj.get("ModuleName"));
			
		//}
	}
	

}
