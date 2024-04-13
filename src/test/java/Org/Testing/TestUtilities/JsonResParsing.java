// JsonResParsing.java
package Org.Testing.TestUtilities;

import io.restassured.response.Response;

public class JsonResParsing {
	public static String JsonResDataParsing(Response Res, String JsonPath) {
		
		String JsonParseKeyValue=Res.jsonPath().get(JsonPath).toString();
		
		return JsonParseKeyValue;
		
	}
	

    
}

