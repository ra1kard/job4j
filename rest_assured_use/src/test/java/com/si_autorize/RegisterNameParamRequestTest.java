package com.si_autorize;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class RegisterNameParamRequestTest {

    public static final String SI_AUTH_REQUEST = "/oidc/si-authorize?client_id={client_id}" +
            "&response_type={response_type}" +
            "&scope={scope}" +
            "&Request={request}";

    @Test
    public void whenUpperСaseRequestNameRequest(){

        //Specify base URI
        RestAssured.baseURI="https://mc-idgw.beeline.ru";

        //Request object
        RequestSpecification httpRequest=RestAssured.given().log().all();

        String client_id = "TestClientBeeOpSide";
        String response_type = "mc_si_async_code";
        String scope = "openid mc_identity_nationalid";
        String request = "eyJraWQiOiJzaWdLZXkiLCJhbGciOiJSUzI1NiJ9.eyJjbGllbnRfbm90aWZpY2F0aW9uX3Rva2VuIjoiQ3Q4cGlMQ2hYMWs4VE1aWiIsImF1ZCI6IlRlc3RDbGllbnRCZWVPcFNpZGUiLCJsb2dpbl9oaW50IjoiTVNJU0ROJTNBNzkwNTc3OTIwMTUiLCJzY29wZSI6Im9wZW5pZCBtY19pZGVudGl0eV9uYXRpb25hbGlkIiwiYWNyX3ZhbHVlcyI6IjIgMyIsImlzcyI6Imh0dHBzOlwvXC9tYy1pZGd3LmJlZWxpbmUucnVcL29pZGMiLCJyZXNwb25zZV90eXBlIjoibWNfc2lfYXN5bmNfY29kZSIsIm5vdGlmaWNhdGlvbl91cmkiOiJodHRwczpcL1wvbWMtaWRndy5iZWVsaW5lLnJ1XC9vaWRjXC9oZWxwXC9zdWNjZXNzXC9UZXN0Q2xpZW50QmVlT3BTaWRlIiwidmVyc2lvbiI6Im1jX3NpX3IyX3YxLjAiLCJub25jZSI6ImhwRHQyRUptMkFFRlVNRmIiLCJjbGllbnRfaWQiOiJUZXN0Q2xpZW50QmVlT3BTaWRlIn0.b1eS2h4f_ErdO8WstSjlqJ1pc8aeRdqaqFRaqMoGcBSN2Q_PJCzebUj5t7c9OVl_kIoD6MJOKDYyETlGGK1J2c7L4W5L-SALaRQQcbXO-Sd2qnHqzvmhbCDuTm_LiTFY75WSUwO3QnW2FczGgxHzUcdsckDeJBMc1q9pIwfTEuVgXsIbU26CufSlOw6i2yfXyXGWvwU0_SefJI12IIH3vPcm_uaii4tVKDH6_DMv4m12qx796kWiyOSdV_T-Czwy31p8BiOb9GhlnyS0CSdk-KCVaUVoHGwAXR0RHGrG3w7NUVfvQia3snNy-o-fpEulsJveKHgv06gtG7FyQfqEew";

        //Response object
        Response response = httpRequest.get(SI_AUTH_REQUEST,client_id,response_type,scope,request);

        //status code validation
        int statusCode = response.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        Assert.assertEquals(statusCode, 400);

        //status line verification
        String statusLine = response.getStatusLine();
        System.out.println("Status line is: " + statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 400 Bad Request");

        //print response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);

        String errorDescription = response.jsonPath().get("error_description");
        Assert.assertEquals(errorDescription, "Allowed params are: client_id, response_type, scope, request");

        String error = response.jsonPath().get("error");
        Assert.assertEquals(error, "invalid_request");
    }

}
