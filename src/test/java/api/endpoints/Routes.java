package api.endpoints;

/*
 * Create user(Post) : https://petstore.swagger.io/v2/user
 * Get user (Get) : https://petstore.swagger.io/v2/user/{username}
 * Update user (Put) : https://petstore.swagger.io/v2/user/{username}
 * Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}
 * */

public class Routes {

    public static String baseURL = "https://petstore.swagger.io/v2";

    public static String postURL = baseURL+"/user";
    public static String getURL = baseURL+"/user/{username}";
    public static String putURL = baseURL+"/user/{username}";
    public static String deleteURL = baseURL+"/user/{username}";




}
