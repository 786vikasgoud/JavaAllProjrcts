package Api_Endpoints;

import Routers.Pet_URL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get_Request {
    public static Response get_request(int id){
        Response response=
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .header("content-type","application/json")
                        .pathParams("petId",id)
                .when()
                        .get(Pet_URL.Post_URI+"/{petId}");
        return response;
    }
}
