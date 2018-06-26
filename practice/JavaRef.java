import java.io.*;

class JavaRef {

   public static void main(String args[])
   {
      String source = "Now is the time for all good men\n"
               + " to come to the aid of their country\n"
               + " and pay their due taxes.";
      byte buf[] = source.getBytes();
      
      try (FileOutputStream f0 = new FileOutputStream("file1.txt");
           FileOutputStream f1 = new FileOutputStream("file2.txt");
           FileOutputStream f2 = new FileOutputStream("file3.txt") )
      {
         for(int i=0; i < buf.length; i+=4) f0.write(buf[i]);
         
         f1.write(buf);
         
         f2.write(buf, buf.length-buf.length/2, buf.length/2);
      }
      catch(IOException e)
      {
         System.out.println("An I/O Error Occurred");
      }
   }
}