import java.io.*;
public class FileDemo
{
    public static void main(String[] args)throws IOException
    {
        int ch;
        BufferedReader fread=new BufferedReader(new FileReader("log.txt"));
        while((ch=fread.read())!=-1){
            System.out.print((char)ch);
        }
        fread.close();
    }
}