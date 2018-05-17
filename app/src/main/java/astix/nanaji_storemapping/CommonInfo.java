package astix.nanaji_storemapping;

import android.net.Uri;

import java.io.File;

public class CommonInfo
{




	// Its for Live Path on 194 Server




	public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";
	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidNanajiSFALive/Service.asmx";

	public static int DistanceRange=500;//Defautl Distance Range to show for store list

	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="NanaJISM.apk";

	public static String DATABASE_NAME = "DbMeijiSFAApp";

	public static int AnyVisit = 0;


	public static int DATABASE_VERSIONID = 10;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.5";   // put this field value based on value in table on the server
	public static int Application_TypeID = 1; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct


	public static String OrderSyncPath="http://103.20.212.194/ReadXML_NanajiSFALive/Default.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_NanajiStoreMapImagesLive/Default.aspx";


	public static String OrderXMLFolder="NanajiXml";
	public static String ImagesFolder="NanajiImages";
	public static String AppLatLngJsonFile="NanajiSTLatLngJson";
	public static String FinalLatLngJsonFile="NanajiFinalSTLatLngJson";



























	// Its for Development  Path on 194 server for SFA





	/*public static File imageF_savedInstance=null;
	public static String imageName_savedInstance=null;
	public static String clickedTagPhoto_savedInstance=null;
	public static Uri uriSavedImage_savedInstance=null;

	public static String imei="";

	public static String fileContent="";
	public static final String MejiDairyPreference="MejiDairyPreference";
	public static String WebServicePath="http://103.20.212.194/WebServiceAndroidNanajiSFADevelopment/Service.asmx";

	public static int DistanceRange=500;//Defautl Distance Range to show for store list

	public static String VersionDownloadPath="http://103.20.212.194/downloads/";
	public static String VersionDownloadAPKName="NanaJISMDev.apk";

	public static String DATABASE_NAME = "DbMeijiSFAApp";

	public static int AnyVisit = 0;


	public static int DATABASE_VERSIONID = 7;      // put this field value based on value in table on the server
	public static String AppVersionID = "1.4";   // put this field value based on value in table on the server
	public static int Application_TypeID = 1; //1=Parag Store Mapping,2=Parag SFA Indirect,3=Parag SFA Direct


	public static String OrderSyncPath="http://103.20.212.194/ReadXML_NanajiSFADevelopment/Default.aspx";
	public static String ImageSyncPath="http://103.20.212.194/ReadXML_NanajiStoreMapImagesDevelopment/Default.aspx";


	public static String OrderXMLFolder="NanajiXml";
	public static String ImagesFolder="NanajiImages";
	public static String AppLatLngJsonFile="NanajiSTLatLngJson";
	public static String FinalLatLngJsonFile="NanajiFinalSTLatLngJson";
*/





}
