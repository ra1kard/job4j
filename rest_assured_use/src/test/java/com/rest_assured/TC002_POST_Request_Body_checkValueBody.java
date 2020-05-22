package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

//Register Customer API
public class TC002_POST_Request_Body_checkValueBody {

    @Test
    public void RegistrationSuccessful(){
        //Endopoint =   http://restapi.demoqa.com/customer
        //URI =         http://restapi.demoqa.com/customer/register
        /*      Body
        {
            "FirstName":"value",
            "LastName":"value",
            "UserName":"value",
            "Password":"value",
            "Email":"value"
        }*/
        /*      Success Response
        {
            "SuccessCode":"OPERATION_SUCCESS",
            "Message":"Operation completed successfully"
        }*/

        //Specify base URI
        RestAssured.baseURI="http://restapi.demoqa.com/customer";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Request payload sending along with post request
        JSONObject requestParams = new JSONObject();

        requestParams.put("FirstName","Johnrara");
        requestParams.put("LastName","XYZ");
        requestParams.put("UserName","JohnraraXYZ");
        requestParams.put("Password","JohnraraXYZxyx");
        requestParams.put("Email","JohnraraXYZ@gmail.com");


        httpRequest.header("Content-Type","application/json");

        httpRequest.body(requestParams.toJSONString());         //attach above date to the request  прикрепить вышеуказанную дату к запросу

        //Response object
        Response response = httpRequest.request(Method.POST,"/register");


        //print response in console window

        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 201);

        //success code validation
        String successCode = response.jsonPath().get("SuccessCode");
        Assert.assertEquals(successCode, "OPERATION_SUCCESS");

    }

}
