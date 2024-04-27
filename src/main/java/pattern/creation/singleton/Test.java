package pattern.creation.singleton;



import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
