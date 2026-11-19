import java.io.*;

public class IPOPread {
    public static void main(String[] args) throws IOException {
        int z;
        FileInputStream fin = new FileInputStream("abc.txt");
        while((z=fin.read())!=-1){
        System.out.print((char)z);
        }
        fin.close();
    }
}