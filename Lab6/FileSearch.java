/**
 * Created by Jibran on 5/14/19.
 */
import java.io.*;
public class FileSearch {
    /*
        7.1 - Goal is to determine if the target exists and find where it exists given a file/directory

        Step 2: - Setup is private instance variables, input: file input stream, processing by finding the file,
                    and output: file in directory

        Step 3: while(more files to view) {
                    look at one file and return it if found, if the file is in directory, repeat steps for another dir }

        Step N: while(more dirs to examine) {
                    get a directory
                    if (file found) {
                        check for a match
                    }
                    if (directory exists) {
                        for (each file and directory) {
                            if(file found) {
                                check for match
                                return it
                            }
                            if(dir found) {
                                save in a structure
                            }
                        }
                    return not found
                }

     */

    public static void main(String[] args) {
        System.out.println(searchFiles(new File("/Users/Jibran/Documents/CSS143"), "FractionsV2.zip"));
    }

    public static String searchFiles(File path, String target) {
        if(path.equals(target)) {
            return "";
        }
        else {
            return "Exiting";
        }
    }

    public static String recursiveSearch(File path, String target) {
        if(path.equals(target)) {
            return "";
        }
        else {
            return recursiveSearch(path, target);
        }
    }
}
