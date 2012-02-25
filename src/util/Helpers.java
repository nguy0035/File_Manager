/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author tatthang
 */
import java.io.File;
public class Helpers {

    public static boolean saveFileContent(File file,String content){
        
        file.canWrite();
        
        return true;
    }
}
