package Hashmap_apiBody;

import java.util.HashMap;

public class createuser {

	public HashMap<String ,Object>  mapcreateuser(String name, String email, String gender, String status)
	{
		
		HashMap<String ,Object> mapp =new  HashMap<String, Object>();
		
		mapp.put("name", name);
		mapp.put("email",email);
		mapp.put("gender", gender);
		mapp.put("status",status);
		
		return mapp;
		
	}
	
	
	

	

	
}
