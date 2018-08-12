import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	  serializationExample();
	  deserializationExample();
  }
  
  public static void serializationExample() throws IOException {
	  //create object 
	  Emp emp = new Emp("make", 1001);
	  
	  File f = new File(System.getProperty("user.dir") + "/objectStateSerial.txt");
	  
	  FileOutputStream fos = new FileOutputStream(f);
	  ObjectOutputStream oos = new ObjectOutputStream(fos);
	  
	  // write object emp as byte stream data
	 oos.writeObject(emp);
	 
	 oos.close();
	 fos.close();
  }
  
  public static void deserializationExample() throws IOException, ClassNotFoundException {
	  //create object 
	  Emp emp ;
	  
	  File f = new File(System.getProperty("user.dir") + "/objectStateSerial.txt");
	  
	  FileInputStream fis = new FileInputStream(f);
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  
	  // write object emp as byte stream data
	 Emp emp1 = (Emp) ois.readObject();
	 
	 ois.close();
	 fis.close();
	 
	System.out.println(emp1);
  }
}