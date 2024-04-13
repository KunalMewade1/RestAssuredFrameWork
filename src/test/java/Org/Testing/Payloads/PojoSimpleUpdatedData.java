package Org.Testing.Payloads;

public class PojoSimpleUpdatedData {
  
	public static PojoBodyData GetUpdatedBodyData() {
		
		PojoBodyData data= new PojoBodyData();
		data.setFirstName("Raghubir");
		 data.setLastName("Singh");
		 data.setAge(9);
		 data.setProfession("Student");
		 data.setId("999");
		 return data;
		
		
		
		
	}
	
}
