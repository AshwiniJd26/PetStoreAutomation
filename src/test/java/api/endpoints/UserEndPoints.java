package api.endpoints;

import api.payloads.UserPojo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;

//Created for CURD
public class UserEndPoints {
    public static Response createUser(UserPojo payload){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                .post(Routes.postURL);
    return response ;

    }

    public static Response readUser(String username){
        Response response= given()
                .pathParam("username",username)
                .when()
                .get(Routes.getURL);
        return response ;
    }

    public static Response updateUser(UserPojo payload, String username){
        Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username",username)
                .body(payload)
                .when().put(Routes.putURL);
        return response ;
    }

    public static Response deleteUser(String username){
        Response response= given()
                .pathParam("username",username)
                .when()
                .get(Routes.deleteURL);
        return response ;
    }

}
