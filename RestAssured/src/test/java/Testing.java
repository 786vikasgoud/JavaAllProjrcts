import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher.*;

public class Testing {
  //  @Test
//    public void Test_01(){
//        given().
//                get("https://jsonplaceholder.typicode.com/todos/1")
//                .then()
//                .statusCode(200)
//                .body("userId",equalTo(1))
//                .log().all();
//
//
//    }
//    @Test
//    public void test_2(){
//        HashMap <String, Object> map=new HashMap<String,Object>();
//        map.put("name","Vikas");
//        map.put("age",22);
//        JSONObject js=new JSONObject(map);
//        System.out.println(js);
//        System.out.println(js.toJSONString());
//    }

    @Test
    public void test_2(){

        JSONObject js=new JSONObject();
        js.put("name","vikas");
        js.put("age",22);
        System.out.println(js.toJSONString());
        given()
                .header("content-type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(js.toJSONString())
                .when()
//                .post("https://reqres.in/api/users")
//                .put("https://reqres.in/api/users/2")
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(200);
    }
}
