package com.si_autorize;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class RegisterNameParamInMassiveRequest {

    public static final String SI_AUTH_REQUEST = "/oidc/si-authorize?client_id={client_id}" +
            "&response_type={response_type}" +
            "&scope={scope}" +
            "&request={request}";

    @Test
    public void whenUpperСaseRequestNameResponseType(){

        //Specify base URI
        RestAssured.baseURI="https://mc-idgw.beeline.ru";

        //Request object
        RequestSpecification httpRequest=RestAssured.given().log().all();

        String client_id = "TestClientBeeOpSide";
        String response_type = "mc_si_async_code";
        String scope = "openid mc_identity_nationalid";
        String request = "eyJraWQiOiJzaWdLZXkiLCJhbGciOiJSUzI1NiJ9.eyJjbGllbnRfbm90aWZpY2F0aW9uX3Rva2VuIjoic292WTZYRkgwUUJSRmtTRyIsImF1ZCI6IlRlc3RDbGllbnRCZWVPcFNpZGUiLCJsb2dpbl9oaW50IjoiTVNJU0ROJTNBNzk2MzYzMTQ5NDciLCJzY29wZSI6Im9wZW5pZCBtY19pZGVudGl0eV9waG9uZW51bWJlciBtY19pZGVudGl0eV9uYXRpb25hbGlkIiwiYWNyX3ZhbHVlcyI6IjIgMyIsIlJlc3BvbnNlX3R5cGUiOiJtY19zaV9hc3luY19jb2RlIiwiaXNzIjoiaHR0cHM6XC9cL21jLWlkZ3cuYmVlbGluZS5ydVwvb2lkYyIsIm5vdGlmaWNhdGlvbl91cmkiOiJodHRwczpcL1wvbWMtaWRndy5iZWVsaW5lLnJ1XC9vaWRjXC9oZWxwXC9zdWNjZXNzXC9UZXN0Q2xpZW50QmVlT3BTaWRlIiwidmVyc2lvbiI6Im1jX3NpX3IyX3YxLjAiLCJub25jZSI6IjFXQlhNTmx2UE54a05mSkYiLCJjbGllbnRfaWQiOiJUZXN0Q2xpZW50QmVlT3BTaWRlIn0.TvxU--38n5it5vByr5S-0YxF2FbzlPIQmvbf0oq9qQX4ei3GPVfY91Jg2FRBFQsXdzUnd40BU7dzTmkvp94fS-E-vKbUFtP9OzzRYIjJAPCh_CqkOqMlxg92cdHGVCqzvPLYAIp9NzX7npLNF1frIruMxFdOtFGRPLI2taGrWmPQkP-fexNrP-GzI1O4lNVMZD7y3LvP_pGSDBBcMnDviaxy8dpx3yf5SafoeRqUjVB8De0jxPtSrhICuNOjHZ2qqDt7nBzFax261AJbxITHVbh8oBzHBWhDMVZKb0f5R0Ay-1lnY4v142OJ8qbZCpIkSu1aXYIEE0qAazYeKi8IMA";

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
        Assert.assertEquals(errorDescription, "Mandatory parameter request is missing or invalid.");

        String error = response.jsonPath().get("error");
        Assert.assertEquals(error, "invalid_request");
    }

    @Test
    public void whenUpperСaseRequestNameClientId(){

        //Specify base URI
        RestAssured.baseURI="https://mc-idgw.beeline.ru";

        //Request object
        RequestSpecification httpRequest=RestAssured.given().log().all();

        String client_id = "TestClientBeeOpSide";
        String response_type = "mc_si_async_code";
        String scope = "openid mc_identity_nationalid";
        String request = "eyJraWQiOiJzaWdLZXkiLCJhbGciOiJSUzI1NiJ9.eyJjbGllbnRfbm90aWZpY2F0aW9uX3Rva2VuIjoiRTliZmhCd3cxQlhTY0tVNiIsImF1ZCI6IlRlc3RDbGllbnRCZWVPcFNpZGUiLCJsb2dpbl9oaW50IjoiTVNJU0ROJTNBNzk2MzYzMTQ5NDciLCJzY29wZSI6Im9wZW5pZCBtY19pZGVudGl0eV9waG9uZW51bWJlciBtY19pZGVudGl0eV9uYXRpb25hbGlkIiwiYWNyX3ZhbHVlcyI6IjIgMyIsImlzcyI6Imh0dHBzOlwvXC9tYy1pZGd3LmJlZWxpbmUucnVcL29pZGMiLCJyZXNwb25zZV90eXBlIjoibWNfc2lfYXN5bmNfY29kZSIsIkNsaWVudF9pZCI6IlRlc3RDbGllbnRCZWVPcFNpZGUiLCJub3RpZmljYXRpb25fdXJpIjoiaHR0cHM6XC9cL21jLWlkZ3cuYmVlbGluZS5ydVwvb2lkY1wvaGVscFwvc3VjY2Vzc1wvVGVzdENsaWVudEJlZU9wU2lkZSIsInZlcnNpb24iOiJtY19zaV9yMl92MS4wIiwibm9uY2UiOiJBRTlxOVlEeG5JN2tzWW9MIn0.PcBcibaIz8e0p7HckAFi680QiKgTnfMjOBoGQ3v97HM3He2fRO-9rH-wuo5iUfpUB5z484ntKLMZA2Qkinj-nWhDeQq41qoHRtzoyNfwCODcLlW4O7ktys3MzxOdEVTKbbkeJ3y9Azpelh89uvIu2Lf2s9iePmF4A8kSwZ0mXY3TmoR_qTHeXKMdp-Nb7bOp4wL2jX7PQxdRKp0iYtN_XaHRWFuyYdnc929RrfpZSKb6IwKoOhChMekYfADaYI7ANiG7r9EGGKUHqdxxF5y9_d1gptjLDbH3Gf3QABE5n6b5qCN2-sUxfcboOppwIETpWzTLhzx8LMGYETHQ3dxI1Q";

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
        Assert.assertEquals(errorDescription, "Mandatory parameter request is missing or invalid.");

        String error = response.jsonPath().get("error");
        Assert.assertEquals(error, "invalid_request");
    }

    @Test
    public void whenUpperСaseRequestNameScope(){

        //Specify base URI
        RestAssured.baseURI="https://mc-idgw.beeline.ru";

        //Request object
        RequestSpecification httpRequest=RestAssured.given().log().all();

        String client_id = "TestClientBeeOpSide";
        String response_type = "mc_si_async_code";
        String scope = "openid mc_identity_nationalid";
        String request = "eyJraWQiOiJzaWdLZXkiLCJhbGciOiJSUzI1NiJ9.eyJjbGllbnRfbm90aWZpY2F0aW9uX3Rva2VuIjoiMElib0tRSk5tNHQzdWlCbiIsImF1ZCI6IlRlc3RDbGllbnRCZWVPcFNpZGUiLCJsb2dpbl9oaW50IjoiTVNJU0ROJTNBNzk2MzYzMTQ5NDciLCJTY29wZSI6Im9wZW5pZCBtY19pZGVudGl0eV9waG9uZW51bWJlciBtY19pZGVudGl0eV9uYXRpb25hbGlkIiwiYWNyX3ZhbHVlcyI6IjIgMyIsImlzcyI6Imh0dHBzOlwvXC9tYy1pZGd3LmJlZWxpbmUucnVcL29pZGMiLCJyZXNwb25zZV90eXBlIjoibWNfc2lfYXN5bmNfY29kZSIsIm5vdGlmaWNhdGlvbl91cmkiOiJodHRwczpcL1wvbWMtaWRndy5iZWVsaW5lLnJ1XC9vaWRjXC9oZWxwXC9zdWNjZXNzXC9UZXN0Q2xpZW50QmVlT3BTaWRlIiwidmVyc2lvbiI6Im1jX3NpX3IyX3YxLjAiLCJub25jZSI6IlZxUkhseUQ3TXVab1JwaXQiLCJjbGllbnRfaWQiOiJUZXN0Q2xpZW50QmVlT3BTaWRlIn0.GHAPxmwY_utHPkvlOtk8VwlIZNTn5JILfgPvxFVzhFLtkj_6kVeNKZSthVjj_ZpvU1uQslHQMuYfSbLmnZoCnM7j6dgSQAPgJz3gVN_ivJ20x6ziWpGLROytLm_0qKk_XItchSZeYwPBJ61FZvqB_Z3KRjIRT5bUagmR-vdHFRXhdmtcYKhM7SWtoLEqEjGipQUGppeqH0lU9VOeLdSA3AdJnlkLIizFLfT4I1OCNsrmJecpcTCCRJIvXzCq_7Rp23mgRgfBDaMDMI-jQ3tIbp8jN3grCC-p8SmdBzbw0imX2EIwIkSvHj_vCpwzUzeLgi4ZCRF19pOQSH9c2EBaAw";

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
        Assert.assertEquals(errorDescription, "Mandatory parameter request is missing or invalid.");

        String error = response.jsonPath().get("error");
        Assert.assertEquals(error, "invalid_request");
    }

}
