import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GetURLnew {

  public static void main(String[] args) {

    try {

    

    
    URL obj0 = new URL(args[0]);
   // URLConnection connection = obj0.openConnection();
	//Map<String, List<String>> map = connection.getHeaderFields();

    StringBuffer sb = new StringBuffer();

    URL obj1 = new URL(args[0]);

    sb.append(obj1);

	//System.out.println("Printing Response Header...\n");

	// for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	// 	System.out.println("Key : " + entry.getKey()
 //                           + " ,Value : " + entry.getValue());
	// }

	

    } catch (Exception e) {
	
    }

  }
}