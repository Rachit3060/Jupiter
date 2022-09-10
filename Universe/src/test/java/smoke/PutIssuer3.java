package smoke;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PutIssuer3 extends Utils {
	
	@Test
	public void postIssuer() throws IOException
	{
		RestAssured.baseURI=getGlobalValue("baseURI");
		RestAssured.basePath="SecurityMaster/v1/Issuers/11373";
		String bearerToken=getGlobalValue("bearerToken");
		String res=given().log().all().relaxedHTTPSValidation().headers("Authorization",
	              "Bearer " + bearerToken,
	              "Content-Type",
	              ContentType.JSON,"Accept",
	              ContentType.JSON).when()
				.log().all().relaxedHTTPSValidation().body("{\r\n"
						+ "   \"abbreviation\": \"Issuer_Test_123\",\r\n"
						+ "  \"analyst\": \"sample string 22\",\r\n"
						+ "  \"backupServicerId\": 3,\r\n"
						+ "  \"collateralManagerId\": 4,\r\n"
						+ "  \"countryId\": 1,\r\n"
						+ "  \"hasPublicEquity\": true,\r\n"
						+ "  \"identifier\": \"sample string 6\",\r\n"
						+ "  \"isabsIssuer\": false,\r\n"
						+ "  \"isabsSponsor\": false,\r\n"
						+ "  \"issueDate\": \"2018-03-27T06:18:58.6908642-05:00\",\r\n"
						+ "  \"issuerName\": \"Issuer_Test_824\",\r\n"
						+ "  \"markitEntityId\": \"sample2\",\r\n"
						+ "  \"masterServicerId\": 12,\r\n"
						+ "  \"notes\": \"sample string 13\",\r\n"
						+ "  \"originalIssueSize\": 14.0,\r\n"
						+ "  \"parentAffiliateId\": 1,\r\n"
						+ "  \"state\": \"sample string 15\",\r\n"
						+ "  \"trusteeId\": 16\r\n"
						+ "}").put().then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath postJS=new JsonPath(res);
		String abbreviation=postJS.getString("abbreviation");
		
		Assert.assertEquals(abbreviation, "Issuer_Test_123");
//		Assert.assertEquals(AssetName, "104994_Revolver_01");
	
	}

}
