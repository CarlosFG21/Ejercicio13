
package ejercicio13video18;

import java.util.*;
import javax.swing.JOptionPane;

public class daniel {
    
    public void clase(){
        
        String clave = "Carlos";
        
        String pass = "";
        
        while(clave.equals(pass)==false){
            
        pass = JOptionPane.showInputDialog("INTRODUCE LA CONTRASEÑA, POR FAVOR");
            
        if(clave.equals(pass)==false){
            
           JOptionPane.showMessageDialog(null,"CONTRASEÑA INCORRECTA"); 
            
        }
        
        }
        
       JOptionPane.showMessageDialog(null,"CONTRASEÑA CORRECTA. ACCESO PERMITIDO");
    }
    
    
}
