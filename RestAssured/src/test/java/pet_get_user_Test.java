import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class pet_get_user_Test {
    @Test
    public void get_user(ITestContext context){
        context.setAttribute("username","Vikas");
        String user = (String) context.getAttribute("username");
        Response res=
        given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .pathParam("name",user)
        .when()
                .get("https://petstore.swagger.io/v2/user/{name}");

//        .then()
//                .log().all();
//        Assert.assertEquals(res.getStatusCode(),200);

        String responseBody = res.getBody().asString();
        System.out.println("Response Body: " + res.getBody().asString());
        org.json.JSONObject jsonObject = new org.json.JSONObject(responseBody);
        System.out.println(jsonObject);
        for(String i:jsonObject.keySet()){
            System.out.println(jsonObject.get(i));
        }
//        for(int i=0;jsonObject.get().length();i++){
//
//        }
//        Map<String, ?> resultMap = res.jsonPath().getMap("$");
//        String username = (String) resultMap.get("username");
//
//        System.out.println("Username: " + username);
//        Object id = resultMap.get("id");
//        System.out.println("ID: " + id);
        System.out.println(user);

    }
}
