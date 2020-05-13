package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class TC003_GET_Request_Header {

    @Test
    public void googleMapTest(){
        //Endopoint =   https://maps.googleapis.com
        //URI =         https://maps.googleapis.com/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyCB9c9lr0NPehxFtWbdhgLJbwlujXe95VA

        //Specify base URI
        RestAssured.baseURI="https://maps.googleapis.com";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Response object
        Response response = httpRequest.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyCB9c9lr0NPehxFtWbdhgLJbwlujXe95VA");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        //validating headers
        String contentType = response.header("Content-Type");   //capture details if Content-Type header
        System.out.println("Content-Type is: " + contentType);
        Assert.assertEquals(contentType, "application/xml; charset=UTF-8");

        String contentEncoding = response.header("Content-Encoding");   //capture details if Content-Encoding header
        System.out.println("Content-Encoding is: " + contentEncoding);
        Assert.assertEquals(contentEncoding, "gzip");
    }

}
