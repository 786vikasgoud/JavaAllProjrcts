import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class pet_create_user_Test {
    @Test
    public void create_user(ITestContext context){
        String st =(String) context.getAttribute("username");
        HashMap<String,Object> data = new HashMap<>();
        data.put("id",0);
        data.put("username","Vikas");
        data.put("firstName","shivaiahgari");
        data.put("lastName","goud");
        data.put("email","Vikas@gmail.com");
        data.put("password","Vikas@");
        data.put("phone","samsung");
        data.put("userStatus",0);

        given()
                .contentType("application/json")
                .header("Content-Type", "application/json")
                .pathParam("user","user")
                .body(data)
        .when()
                .post("https://petstore.swagger.io/v2/{user}")
                .then()
                .log().all();
        System.out.println(st);
    }
}
