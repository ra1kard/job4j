package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

//Weather API Validate status code & statis line
public class TC001_GET_Request_checkCodeLines {

    @Test
    public void getweatherDetails(){
        //Endopoint =   http://restapi.demoqa.com/utilities/weather/city/<City>
        //URI =         http://restapi.demoqa.com/utilities/weather/city/Hyderabad
        /*  вывод:
        Response Body is: {
        "City": "Hyderabad",
        "Temperature": "38.15 Degree celsius",
        "Humidity": "17 Percent",
        "WeatherDescription": "overcast clouds",
        "WindSpeed": "2.75 Km per hour",
        "WindDirectionDegree": "116 Degree"
        }
        Status code is: 200
        Status line is: HTTP/1.1 200 OK*/

        //Specify base URI
        RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/Hyderabad");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 200);

        //status line verification
        String statusLine = response.getStatusLine();
        System.out.println("Status line is: " + statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
    }

}
