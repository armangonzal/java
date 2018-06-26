import java.io.*;

class JavaRef {

   public static void main(String args[])
   {
      String tmp = "abcdefghijklmnopqrstuvwxyz";
      byte b[] = tmp.getBytes();
      
      ByteArrayInputStream input1 = new ByteArrayInputStream(b);
      ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);
      
      for( int i=0; i<26; i++)
      {
         int c;
         while((c = input1.read()) != -1)
         {
            if (i <= 12)
            {
               System.out.print((char) c);
            }
            else
            {
               System.out.print(Character.toUpperCase((char) c));
            }
         }
         System.out.println();
         input1.reset();
      }
   }
}