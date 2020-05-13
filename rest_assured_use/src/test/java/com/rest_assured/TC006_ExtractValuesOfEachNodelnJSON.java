package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC006_ExtractValuesOfEachNodelnJSON {

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

        JsonPath jsonpath = response.jsonPath();

        System.out.println((String) jsonpath.get("City"));
        System.out.println((String) jsonpath.get("Temperature"));
        System.out.println((String) jsonpath.get("Humidity"));
        System.out.println((String) jsonpath.get("WeatherDescription"));
        System.out.println((String) jsonpath.get("WindSpeed"));
        System.out.println((String) jsonpath.get("WindDirectionDegree"));

        Assert.assertEquals((String) jsonpath.get("Temperature"),"31 Degree celsius");

    }

}
