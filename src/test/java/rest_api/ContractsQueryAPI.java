//package rest_api;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonParser;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.json.JSONObject;
//
//import java.util.HashMap;
//
//import static io.restassured.RestAssured.given;
//
//public class ContractsQueryAPI {
//    public static void main(String[] args) {
//
//        RestAssured.baseURI = "https://clm-test-demographics-api.hcck8s-ctc-np1.optum.com";
//        RestAssured.basePath = "/v1.0/providers";
//
//
//        //Add Query Parameter in rest assured
//        RequestSpecification request = given().relaxedHTTPSValidation();
//        JSONObject requestParams = new JSONObject();
//        String mpin = "8690246";
//        String tin = "566778876";
////        String requestBody = "[\n" +
////                "  {\n" +
////                "    \"mpin\": \"" + mpin + "\",\n" +
////                "    \"tin\": \"" + tin + "\"\n" +
////                "  }\n" +
////                "]";
//        String requestBody = "{\n" +
//                "  \"mpin\": \"" + mpin + "\",\n" +
//                "  \"tin\": \"" + tin + "\"\n" +
//                "  \"firstName\": \"\",\n" +
//                "  \"lastName\": \"\",\n" +
//                "  \"city\": \"\",\n" +
//                "  \"state\": \"\",\n" +
//                "  \"zip\": \"\",\n" +
//                "  \"npi\": \"\",\n" +
//                "  \"attributeSet\": \"\"\n" +
//                "}";
//        requestParams.put("mpin", mpin);
//        requestParams.put("tin", tin);
//        request.body(requestBody);
//        request.header("Content-Type", "application/json");
//        Response response = request.post("/search");
//        System.out.println(response.getBody().asString());
//
//        //parse the response to json object and check the size of locations attribute
//        if(new JsonParser().parse(response.getBody().asString()).getAsJsonArray().get(0).getAsJsonObject().get("locations").getAsJsonArray().size() == 0) {
//            System.out.println("Locations are not present for "+mpin+" and "+tin);
//        }
//
//        //parse the response to json array and check the size of counterParties attribute
////        JsonArray jsonArray = new JsonParser().parse(response.getBody().asString()).getAsJsonArray();
////        if(jsonArray.get(0).getAsJsonObject().get("counterParties").getAsJsonArray().size() == 0) {
////            System.out.println("Counter Parties are present for "+mpin+" and "+tin);
////        }
//    }
//}
