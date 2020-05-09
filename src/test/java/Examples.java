import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Examples {
	//@Test
	public void test_get(){
		
		baseURI ="http://localhost:3000/";
		given().
		 param("name", "Automation").
		   get("/subjects").
		then().
		     statusCode(200).
		     log().all();
}
	@Test
	public void test_post(){
		
		JSONObject request = new JSONObject();
		request.put("firstname", "Tom");
		request.put("lastname", "Jerry");
		request.put("subjectId", 1);
		
		baseURI ="http://localhost:3000/";
		
		given().
		contentType(ContentType.JSON).
	    accept(ContentType.JSON).
	    header("Content-Type", "application/json").
	     body(request.toJSONString()).
	     when().post("/users").
	 then().
	    statusCode(201).
	    log().all();
	 
		
		
		
	}

}
