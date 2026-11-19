import java.io.*;
// import java.io.FileOutputStream;
// import java.io.IOException;

public class IPOPStreamwrite {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fout = new FileOutputStream("abc.txt");
        String z = "This is First File";
        byte[] b = z.getBytes();
        fout.write(b);
        fout.close();

        System.out.println("Write operation Successfully");
    }
}