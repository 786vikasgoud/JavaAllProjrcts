package Api_Endpoints;

import Payloads.pet_data.Pet_Post_Request_Data;
import Routers.Pet_URL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequest {

    public static Response post_request(Pet_Post_Request_Data data){
        Response response=
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .header("content-type","application/json")
                        .body(data)
                .when()
                .post(Pet_URL.Post_URI);
        return response;
    }
}
