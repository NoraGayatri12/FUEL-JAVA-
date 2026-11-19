
//wITHOUT using transferTo method
// import java.io.*;
// public class transfer {
//     public static void main(String[] args) throws IOException {
    
        
//         FileInputStream fin=new FileInputStream("abc.txt");
//         FileOutputStream fout = new FileOutputStream("xyz.txt");//abc.txt data transfer in xyz.txt
//         byte[] b =fin.readAllBytes();
//         fout.write(b);
//         fout.close();
//         fin.close();
        

//         System.out.println("\nFile Transfer Done");
//     }
// }


// using transferTo
import java.io.*;
public class transfer{
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("abc.txt");
        FileOutputStream fout = new FileOutputStream("pqr.txt");//abc.txt data transfer in pqr.txt
        fin.transferTo(fout);
        fout.close();
        fin.close();
        

        System.out.println("\nFile Transfer Done using transferTo method");
    }
}

