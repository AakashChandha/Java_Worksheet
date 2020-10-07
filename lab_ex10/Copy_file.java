/*
 */
package lab_ex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author SONAL L R
 */
public class Copy_file {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\copy.txt");
            FileOutputStream fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\copy1.txt");  
            int read;
            while((read=fis.read())!=-1)
            {
                if(read==' ') //if space is encountered, skip the loop by use of "continue" statement
                continue;
                fos.write(read); //writing each character to "two.txt" file
            }
            fis.close();
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}