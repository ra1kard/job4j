package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC004_GET_PrintAllHeaders {

    @Test
    public void GetWeatherDetails(){

        //Endopoint =   https://maps.googleapis.com
        //URI =         https://maps.googleapis.com/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyCB9c9lr0NPehxFtWbdhgLJbwlujXe95VA

        //Specify base URI
        RestAssured.baseURI="https://maps.googleapis.com";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyCcssYbQb1EcciyAqR-rs6xFjpDIz5K1GU");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        Headers allheaders = response.headers();        //capture all the headers from response

        for(Header header:allheaders){
            System.out.println(header.getName() + ": " + header.getValue());
        }
    }

}

