package smoke;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.TestDataBuildU;

public class PutIssuer2 extends Utils {
	
	@Test
	public void postIssuer() throws IOException
	{
		RestAssured.baseURI=getGlobalValue("baseURI");
		RestAssured.basePath="SecurityMaster/v1/Issuers/11373";
		String bearerToken=getGlobalValue("bearerToken");
		TestDataBuildU tdb=new TestDataBuildU();
		
		String res=given().log().all().relaxedHTTPSValidation().headers("Authorization",
	              "Bearer " + bearerToken,
	              "Content-Type",
	              ContentType.JSON,"Accept",
	              ContentType.JSON).when()
				.log().all().relaxedHTTPSValidation().body(tdb.addIssuerPayload()).put().then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath postJS=new JsonPath(res);
		String abbreviation=postJS.getString("abbreviation");
		
		Assert.assertEquals(abbreviation, "Issuer_Test_8241");
//		Assert.assertEquals(AssetName, "104994_Revolver_01");
	
	}

}
