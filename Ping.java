import java.net.InetAddress;

public class Ping {

  public static void main(String[] argv) throws Exception {
    InetAddress address = InetAddress.getByName("web.mit.edu");
    System.out.println("Name: " + address.getHostName());
    System.out.println("Addr: " + address.getHostAddress());
    System.out.println("Reach: " + address.isReachable(3000));
  }
}
