package Org.Testing.Testcases;

import Org.Testing.TestSteps.HttpMethods;

import java.io.IOException;
import java.util.Properties;
import Org.Testing.TestResponseValidation.ResponseValidations;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC1 {
    public void testcase1() throws IOException {
        System.out.println("\nExecuting Test Case 1");

        try {
            Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.properties");
            HttpMethods http = new HttpMethods(Pr);

            // Enhanced Logging
            System.out.println("Request URI: " + Pr.getProperty("QA_URI1"));
            System.out.println("Request Method: GET");
            //System.out.println("Request Headers: " + http.getRequestHeaders());

            Response Res = HttpMethods.GetRequest("QA_URI1");

            System.out.println("Response Code: " + Res.getStatusCode());
            System.out.println("Response Body: " + Res.getBody().asString());

            ResponseValidations.ResponseStatusCodeVal(200, Res);

            String parseData = JsonResParsing.JsonResDataParsing(Res, "firstName");
            System.out.println("The value of Json Key fetched is: " + parseData);

            ResponseValidations.ResponseDataValid("Arshbir", parseData);
        } catch (Exception e) {
            // Print the stack trace to diagnose the issue
            e.printStackTrace();
        }
    }
}
