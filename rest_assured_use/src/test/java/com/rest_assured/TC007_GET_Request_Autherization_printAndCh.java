package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC007_GET_Request_Autherization_printAndCh {

    @Test
    public void AutherizationTest() {

        //Endopoint =   http://restapi.demoqa.com/authentication/CheckForAuthentication/
        //URI =         http://restapi.demoqa.com/authentication/CheckForAuthentication/

        //Basic authentication
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("ToolsQA");
        authScheme.setPassword("TestPassword");


        RestAssured.authentication = authScheme;

        //Specify base URI
        RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);


    }

}
