/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import repository.QuicLibRepository;
import repository.QuicLibRepositoryImpl;
import service.QuicLibService;
import service.QuicLibServiceImpl;
import ui.HalUtam;


/**
 *
 * @author Charlos
 */
public class QuicLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            System.out.println("Gagal mengubah desain tampilan");
        }
        
        
        QuicLibRepository quicLibRepository = new QuicLibRepositoryImpl();
        QuicLibService quicLibService = new QuicLibServiceImpl(quicLibRepository);
        
        
        HalUtam halUtam = new HalUtam();
        halUtam.setQuicLibService(quicLibService);
        halUtam.setVisible(true);

    }

   
}
    
    

