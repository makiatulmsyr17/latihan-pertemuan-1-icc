import java.io.*;
import java.util.*;

class CheckInternetConnectivity1 {

  public static void main(String args[]) throws Exception {
    Process process = java.lang.Runtime
      .getRuntime()
      .exec("ping www.google.co.id");
    int x = process.waitFor();
    if (x == 0) {
      System.out.println("Connection Successful, " + "Output was " + x);
    } else {
      System.out.println("Internet Not Connected, " + "Output was " + x);
    }
  }
}
