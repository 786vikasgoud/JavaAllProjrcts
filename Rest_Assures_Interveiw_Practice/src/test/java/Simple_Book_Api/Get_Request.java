package Simple_Book_Api;
import org.json.JSONArray;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Get_Request {
    @Test
    public void getRequest(ITestContext context){
        Response response=
                given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("content-type","application/json")
                .pathParam("books","books")
                .when()
                .get("https://simple-books-api.glitch.me/{books}");
        System.out.println(response.getBody().asString());
        JSONArray js_data = new JSONArray(response.getBody().asString());
        System.out.println(js_data.length());
        System.out.println(js_data.getJSONObject(0).getInt("id"));
        context.getSuite().setAttribute("id",js_data.getJSONObject(0).getInt("id"));
    }

}
