package Org.Testing.TestSteps;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import Org.Testing.Payloads.PojoBodyData;
import java.util.Properties;

	public class HttpMethods {
	   // private static Properties Pr;
	   private Properties Pr;


	    public HttpMethods(Properties properties) {
	        Pr = properties;
	    }
	    public static Response GetRequest(String URI) {
	        try {
	            Response Res = given()
	                    .contentType(ContentType.JSON)
	                    .when()
	                    .get(URI);
	            return Res;
	        } catch (Exception e) {
	            // Handle or log the exception
	            e.printStackTrace();
	            throw new RuntimeException("Error during GET request", e);
	        }
	    }


	    public Response PostRequest(PojoBodyData Body, String URI) {
	        Response Res = given()
	                .contentType(ContentType.JSON)
	                .body(Body)
	                .when()
	                .post(Pr.getProperty(URI));
	        return Res;
	    }

	    public Response PutRequest(PojoBodyData Body, String URI, String id) {
	        String FinalUri = Pr.getProperty(URI) + "/" + id;
	        Response Res = given()
	                .contentType(ContentType.JSON)
	                .body(Body)
	                .when()
	                .put(FinalUri);
	        return Res;
	    }

	    public Response DeleteData(String id, String URI) {
	        String FinalUri = (String)Pr.getProperty(URI) + "/" + id;
	        Response Res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .delete(FinalUri);
	        return Res;
	    }
	}


