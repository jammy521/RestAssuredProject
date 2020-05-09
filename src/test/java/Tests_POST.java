import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Tests_POST {
	@Test
	public void test_1_post(){
		
	/*	HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Rahul");
		map.put("job", "Engineer");
		
		System.out.println(map);
		*/
		JSONObject request = new JSONObject();
		request.put("name", "Rahul");
		request.put("job", "Engineer");
		System.out.println(request.toJSONString());
		
		given().
		     header("Content-Type","application/json").
		     accept(ContentType.JSON).
		     body(request.toJSONString()).
		 when().
		 	post("https://reqres.in/api/users/2").
		 then().
		    statusCode(201);
		 
		
	}

}
