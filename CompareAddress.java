import java.net.InetAddress;

public class CompareAddress {

  public static void main(String args[]) throws Exception {
    String a1 = "www.google.co.id";
    String a2 = "www.google.com";
    InetAddress ca = InetAddress.getByName(a1);
    InetAddress com = InetAddress.getByName(a2);
    if (ca.equals(com)) {
      System.out.println(a1 + " is the same as " + a2);
    } else {
      System.out.println(a1 + " and " + a2 + " are not the same");
    }
  }
}
