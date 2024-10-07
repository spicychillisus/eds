/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eds;

/**
 *
 * @author asher
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
import operators.*;

public class EDSData {
    
    private SMRT smrt = new SMRT();
    
    // find the eds code in the arraylist
    // datatype can be flexible
    public ArrayList SMRTData(int edsCode) {
        
        ArrayList data = new ArrayList<>();
        data.add(smrt);
        return data;
    }
}
