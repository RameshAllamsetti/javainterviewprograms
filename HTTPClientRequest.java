import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class HTTPClientRequest {
	private static final String POST_URL = "http://findthebug.herokuapp.com/primenumbers?number=";

	private static boolean sendPOST(int i) throws IOException {
		URL obj = new URL(POST_URL+i);

		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		//con.setRequestProperty("User-Agent", USER_AGENT);

		// For POST only - START
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		//os.write(POST_PARAMS.getBytes());
		os.flush();
		os.close();
		// For POST only - END

		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);

		if (responseCode == HttpURLConnection.HTTP_OK) 
		{ //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString()+"   "+i);

			if( response.toString().equals("true"))

				return true;

			else
				return false;
		} 

		else
			return false;

	}


	public static void main(String[] args) throws IOException {

		int [] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
		
		ArrayList<Integer> al = new ArrayList<>();

		for(int j=0;j<primes.length;j++)
		{
			al.add(primes[j]);
		}

		System.out.println(al);

		ArrayList<Integer> failed = new ArrayList<>();
		for(int i=2; i<=1000; i++)
		{
			boolean status =sendPOST(i);
			System.out.println(status);
			if(al.contains(i))
			{
				if(status!=true)
				{
					failed.add(i);
				}

			}
			else
			{
				if(status==true)
				{
					failed.add(i);
				}

			}

		}
		 if(failed.size()!=0)
         {
      	   System.out.println("Tests failed for Numbers"+failed);
         }
	    	
         else
         {
      	   System.out.println("Test is successful");
         }
	}

}
