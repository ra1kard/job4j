package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC005_GET_ValidationgJsonResponse {

    @Test
    public void GetWeatherDetails(){

        //Endopoint =   http://restapi.demoqa.com/utilities/weather/city/<City>
        //URI =         http://restapi.demoqa.com/utilities/weather/city/Dehli

        //Specify base URI
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"Dehli");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        Assert.assertEquals(responseBody.contains("Delhi"), true);      //contains, т.е. содержит

    }

}
