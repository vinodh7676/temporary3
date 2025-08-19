import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Sample {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created and updated: " + myObj.getName());
      } else {
        System.out.println("Navyavinodh File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
