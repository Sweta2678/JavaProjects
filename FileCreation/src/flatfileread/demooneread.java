package flatfileread;

public class demooneread {
	private void psvm() {
		try{
		    BufferedReader in = new BufferedReader(new FileReader("people.ser"));
		    String s;

		    while((s = in.readLine()) != null){

		        String[] var = s.split(":");
		             //var[0]=MALE etc etc
		        addGender.add(var[0]);
		    }

		}catch(Exception e){
		    e.printStackTrace();
		}
	}
}
