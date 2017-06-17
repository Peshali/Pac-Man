import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class GetURL_v2 {

  public static void main(String[] args) {

    try {

    int len = args.length ;

    for(int j = 0; j<args.length ; j++){
    	URL obj = new URL(args[j]);
    

	
	URLConnection connection = obj.openConnection();
	Map<String, List<String>> map = connection.getHeaderFields();

	System.out.println("Printing Response Header...\n");

	for (Map.Entry<String, List<String>> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey()
                           + " ,Value : " + entry.getValue());
	}
}
	

    } catch (Exception e) {
	
    }

  }
}