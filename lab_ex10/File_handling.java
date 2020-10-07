/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex10;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author SONAL L R
 */
public class File_handling {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file name:"); //file name:file.txt
        String filename=obj.next(); //getting filename as input from the user
        File f=new File(filename);
        if(f.exists()) //if file exists
            System.out.println("File exists");
        else //if file does not exist
        {
            System.out.println("File doesn't exist");
            return;
        }
        System.out.println("Name of the file is:"+f.getName()); //prints the name of file
        System.out.println("Length of the file is:"+f.length()+" bytes"); //prints the length of the file in byte form
        System.out.println("Readable:"+f.canRead()); //checks if the file is readable and retuns true if the file is readable
        System.out.println("Writable:"+f.canWrite()); //checks if the file is writable and retuns true if the file is writable
    }
}