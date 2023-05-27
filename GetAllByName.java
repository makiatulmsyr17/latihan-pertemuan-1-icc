import java.net.InetAddress;

public class GetAllByName {

  public static void main(String[] args) throws Exception {
    InetAddress[] addresses = InetAddress.getAllByName("www.goole.com");
    for (int i = 0; i < addresses.length; i++) {
      System.out.println(addresses[i]);
    }
  }
}
