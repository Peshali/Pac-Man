// answer for exersice 2

import java.net.*;
import java.io.*;
import java.util.*;

public class TestThread1 extends Thread {
    
   URL url ;
  static StringBuffer sb=new StringBuffer("");

public TestThread1(String url) throws Exception{
   this.url = new URL(url) ;
}
   
   public void run() {
     
      try {
         
         BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));   
         String inputLine;
            while ((inputLine = br.readLine()) != null){
               sb.append(inputLine);
               System.out.println(inputLine);
            }
         br.close(); 
        
         
      }catch (Exception e) {
         
      }
   }




   public static void main(String args[]) throws Exception {

		ArrayList<Thread> threads= new ArrayList<Thread>();
		 
      
      for(String url: args){
         Thread t = new TestThread1(url);
         t.start();
         threads.add(t);
         
      }
      
		for (Thread t: threads) {
			t.join();
			
		}
      
	System.out.println(sb.toString());
   }   
}



