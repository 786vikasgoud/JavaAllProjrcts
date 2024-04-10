import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.internal.ResponseSpecificationImpl;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

public class Test_get {
    //@Test
    public void get_data(){
        Response response= get("https://reqres.in/api/users?page=2");
        System.out.println(response.asString());
    }
    //@Test
    public void get_data_static(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .body("data.id[0]",equalTo(7))
                .log().all();

    }
    @Test
    public void Test_post(){
        HashMap <String ,Object> map = new HashMap<String , Object>();
        map.put("Name","vikas");
        map.put("job","rampart");
        JSONObject req=new JSONObject();
        req.put("Name","vikas");
        req.put("job","leader");
        System.out.println(req.toJSONString());
        given()
                .body(req.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201)
                .log().all();

    }

}
