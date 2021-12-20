/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.Java.B.Activity.Java.B;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import serviceData.service;



/**
 *
 * @author ASUS
 */
@Controller
public class fileController {
    service sc = new service();
     
    @RequestMapping("/dataktp")
    public String tampil(Model data){
        
        ArrayList<String> kirim = new ArrayList<>();
        
        kirim = sc.getdataktp(); //untuk mengisi ArrayList lokal 
        
        data.addAttribute("dataktp", kirim);//proses mengirim data yang ada di ArrayList
        
        return "view"; //Didalam tanda petik adalah nama file html
    }
    
}
