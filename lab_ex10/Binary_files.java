/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author SONAL L R
 */
public class Binary_files {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here  
        
        //ByteStream
        FileInputStream fis=null;
        FileOutputStream fos=null;
        fis=new FileInputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\input.jpg");
        fos=new FileOutputStream("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\output.jpg");
        int read;
        while((read=fis.read())!=-1) //reads character by character 
            fos.write(read); //writes the characters
        fis.close();
        fos.close();
        
        //CharacterStream
        FileReader fr=null;
        FileWriter fw=null;
        fr=new FileReader("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\inputs.jpg");
        fw=new FileWriter("C:\\Users\\lrsub\\Documents\\NetBeansProjects\\lab_ex10\\src\\lab_ex10\\outputs.jpg");
        int i;
        while((i=fr.read())!=-1) //reads character by character
            fw.write(i); //writes the characaters
        fr.close();
        fw.close();
    }
}