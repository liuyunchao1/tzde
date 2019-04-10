package com.wonders.tzjkbase.tool;

public class Test {
	public static void main(String[] args){
		SoapWebServiceClient client=new SoapWebServiceClient();
		try {
			client.callWebService("http://localhost:8080/cfxWSServer/webservice/Greeting?wsdl", "greeting", "suyongji");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
