import java.net.URLEncoder;
public class EncodeSpecialChar{
public static void main(String[] args) throws Exception {
System.out.println(URLEncoder.encode(&quot;A.B-C*E_F&quot;, &quot;UTF-8&quot;));
}
}