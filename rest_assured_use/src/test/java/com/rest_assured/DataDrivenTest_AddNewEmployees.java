package com.rest_assured;

import com.tngtech.java.junit.dataprovider.DataProvider;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class DataDrivenTest_AddNewEmployees {

    //@Test("empdataprovider")
    public void postNewEmployees(String ename, String eage, String esal){

        //Endopoint =   http://dummy.restapiexample.com/api/v1
        //URI =         http://dummy.restapiexample.com/api/v1/create

        //Specify base URI
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";

        //Request object
        RequestSpecification httpRequest=RestAssured.given();

        //Here we created data which we can send along with the post request
        JSONObject requestParams = new JSONObject();

        requestParams.put("name","Johnxyz123");
        requestParams.put("salary","599999");
        requestParams.put("age","29");

        //Add a header stating the Request body is a JSON
        httpRequest.header("Content-Type","application/json");

        //Add the Json to the body of the request
        httpRequest.body(requestParams.toJSONString());

        //Post request
        Response response = httpRequest.request(Method.POST,"/create");

        //capture response body to perform validation
        String responseBody = response.getBody().asString();

        System.out.println("Response body is: "+responseBody);

        Assert.assertEquals(responseBody.contains(ename),true);
        Assert.assertEquals(responseBody.contains(eage),true);
        Assert.assertEquals(responseBody.contains(esal),true);

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }

    @DataProvider()
    public static String[][] getEmpData() {
        String empdata[][] = {{"abc123","30000","40"},{"xyz","40000","30"},{"pqr123","80000","50"}};
        return(empdata);
    }

}
