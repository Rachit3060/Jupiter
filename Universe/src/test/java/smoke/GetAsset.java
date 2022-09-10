package smoke;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class GetAsset extends Utils{
	@Test
	public void GetAsset() throws IOException
	{
		
		String bearerToken=getGlobalValue("bearerToken");
		RestAssured.baseURI="http://ric1dvwsoapp701:49242/wso-api";		
		RestAssured.basePath="SecurityMaster/v1/Assets/15230";
		//Headers
		String res=given().log().all().relaxedHTTPSValidation().headers("Authorization",
	              "Bearer " + bearerToken,
	              "Content-Type",
	              ContentType.JSON,"Accept",
	              ContentType.JSON
	          ).when().log().all().relaxedHTTPSValidation().get().then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath getJS=new JsonPath(res);
		String AssetID=getJS.getString("assetId");
		String AssetName=getJS.getString("assetName");
		Assert.assertEquals(AssetID, "15230");
		Assert.assertEquals(AssetName, "104994_Revolver_01");
	}

}
