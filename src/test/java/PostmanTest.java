import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
public class PostmanTest {

    class PostmanTests {
        @Test
        void shouldReturnSomeData (){
            // Given - When - Then
// Предусловия
            given()
                    .baseUri("https://postman-echo.com")
                    .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                    .when()
                    .post("/post")
// Проверки
                    .then()
                    .statusCode(200)
                    .body("data", equalTo("data"));
            ;
        }
    }
}
