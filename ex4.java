import java.net.*;
import java.io.*;
import java.util.*;

public class ex4 extends Thread {
    
   URL url ;
 StringBuffer sb;
public ex4(String url) throws Exception{
   this.url = new URL(url) ;
   this.sb = new StringBuffer ();
}
   
   public void run() {
     
      try {
         
         BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));  
         sb.append("begin downloading\n \n"+url+"\n"); 
         String inputLine;
            while ((inputLine = br.readLine()) != null){
               sb.append(inputLine);
               
              // System.out.println
              //yeild(); //pauses the currently executing thread temporarily for giving a chance to the remaining waiting threads of the same priority to execute
            }
            	sb.append("\n\nend downloading"+url+"\n");
         br.close(); 
        
         
      }catch (Exception e) {
         
      }
      
      System.out.println(sb);
   }




   public static void main(String args[]) throws Exception {

		ArrayList<Thread> threads= new ArrayList<Thread>();
		 
      
      for(String url: args){
         Thread t = new ex4(url);
         t.start();
         threads.add(t);
         
      }
      
		for (Thread t: threads) {
			t.join(); //If any executing thread t1 calls join() on t2 i.e; t2.join() immediately t1 will enter into waiting state until t2 completes its execution.
			//System.out.println(sb);
		}
      
	
   }   
}
