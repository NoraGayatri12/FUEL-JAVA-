import java.io.*;
public class filewriterReader{
    public static void main(String[] args) throws IOException {
        FileWriter fout=new FileWriter("abc.txt");//write abc file
        FileReader fin = new FileReader("xyz.txt");//read xyz file
        fout.write("This is my new file");
        int z;
        while((z=fin.read())!=-1){
            System.out.print((char)z);
        }
        fout.close();
        fin.close();
        System.out.println("\nFile Writer and Reader operation done");
    }
}

