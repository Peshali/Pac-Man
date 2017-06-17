// answer for exersice 2

import java.net.*;
import java.io.*;

public class TestThread extends Thread {
   
   URL url ;
  static StringBuffer sb=new StringBuffer("");

public TestThread(String url) throws Exception{
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

      for(String url: args){
         Thread t = new TestThread(url);
         t.start();
      }

   }   
}



