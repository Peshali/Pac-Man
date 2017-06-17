import java.util.*;
import java.io.*;  
import java.net.*;
// answer for exercise 1
public class GetURL_v1{

	public static void main(String[] args) throws Exception {
	
		try{
			int len = args.length ;
			StringBuffer sb=new StringBuffer("");
    
    		for(int j = 0; j<args.length ; j++){
		    	URL obj = new URL(args[j]);
		        
		        BufferedReader br = new BufferedReader(new InputStreamReader(obj.openStream()));
		        
		        String inputLine;
		        while ((inputLine = br.readLine()) != null){
		            
		             sb.append(inputLine);
		           }	

				br.close();	
			}
		
		}catch(Exception e){

		}

	}
}	