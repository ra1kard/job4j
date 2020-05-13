//package com.rest_assured;
package com.rest_assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;



public class TestPet {

    @Test
    public void petTest(){
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")     //домен, на который будет отправлить запросы, метод = .baseUri
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "i72517i72517")
                .body("{\n" +
                        " \"id\": " + 545454 + ",\n" +
                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then().extract().response()
                .prettyPrint();     //что вывести после when - или проверки или какую-нибудь информацию
    }

    @Test
    public void petTest2(){
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")     //домен, на который будет отправлить запросы, метод = .baseUri
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "i72517i72517")
                .body("{\n" +
                        " \"id\": " + 545454 + ",\n" +
                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
                .statusCode(200);       //проверим statusCode 200?
    }

    @Test
    public void petTest3(){
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")     //домен, на который будет отправлить запросы, метод = .baseUri
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "i72517i72517")
                .body("{\n" +
                        " \"id\": " + 545454 + ",\n" +
                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
                .body("id", Matchers.equalTo(545454));      //проверяем результат, что id такой-то
    }

    @Test
    public void petTest4(){
        String idTestValue = RandomStringUtils.randomNumeric(5);        //т.к. используем переменную больше 1 раза, вынесем её тут отдельно
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")     //домен, на который будет отправлить запросы, метод = .baseUri
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "i72517i72517")
                .body("{\n" +
                        " \"id\": " + idTestValue + ",\n" +
                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
                .body("id", Matchers.equalTo(Integer.valueOf(idTestValue)));      //проверяем результат, что id такой-то
    }

/*    @Test
    public void petTest5(){
        String idTestValue = RandomStringUtils.randomNumeric(5);        //т.к. используем переменную больше 1 раза, вынесем её тут отдельно
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")     //домен, на который будет отправлить запросы, метод = .baseUri
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "i72517i72517")
                .body("{\n" +
                        " \"id\": \"0\",\n" +
                        " \"category\": {\n" +
                            " \"id\": \"0\",\n" +
                            " \"name\": \"string\"\n" +
                        "\"}" +
                        " \"name\": \"doggie\",\n" +
                        " \"photoUrls\": [\n" +
                            " \"string\" "]" +


                        " \"name\": \"dfdfdfdfdf\",\n" +
                        " \"photoUrls\": [],\n" +
                        " \"tags\": [],\n" +
                        " \"status\": \"pending\"\n" +
                        "}")
                .when().post()
                .then()
                .body("id", Matchers.equalTo(Integer.valueOf(idTestValue)));      //проверяем результат, что id такой-то
    }*/






    //domain.com/path/resr?name=value&name2=value2
    //domain.com/asdfokasdf
    //"adfkj":"df"
    //"ad":"sddf"

    //ctrL+q документация (нажав на метод)      .formParam("")      в документации описано для чего его можно применять (только для POST и тп)

}
