import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Tests_PUT  {
	@Test
	public void test_1_PUT(){

		JSONObject request = new JSONObject();
		request.put("name", "Rahul");
		request.put("job", "Engineer");
		System.out.println(request.toJSONString());
		
		given().
		     header("Content-Type","application/json").
		     accept(ContentType.JSON).
		     body(request.toJSONString()).
		 when().
		 	put("https://reqres.in/api/users/2").
		 then().
		    statusCode(200).
		    log().all();
		 
		
	}

}
