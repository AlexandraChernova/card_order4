package ru.netology.rest;


import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;


class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200);

    }

    @Test
    void shouldTestPostman() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("currency") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("currency"));

    }

}
