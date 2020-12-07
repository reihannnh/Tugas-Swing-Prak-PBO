package tugas3;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        GUI g  = new GUI();
    }
}

class GUI extends JFrame implements ActionListener{      
      double panjang;
      double lebar;
      double tinggi;
    
    
    
    JLabel lpanjang = new JLabel("Panjang");
    JTextField fpanjang = new JTextField(10);
      
    JLabel llebar = new JLabel("Lebar");
    JTextField flebar = new JTextField(10);
   
    JLabel ltinggi = new JLabel("Tinggi");
    JTextField ftinggi = new JTextField(10);
    
    JLabel lHasil = new JLabel("Hasil: ");
    JLabel lLuasPersegi = new JLabel("Luas Persegi: ");
    JLabel lKelilingPersegi = new JLabel("Keliling Persegi: ");
    JLabel lVolumeBalok = new JLabel("Volume Balok: ");
    JLabel lLuasPermukaanBalok = new JLabel("Luas Permukaan Balok: ");
            
    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");
    
    Balok balok;
    PersegiPanjang persegipanjang;
    
    
    public GUI(){
        setTitle("KALKULATOR BALOK");
        setDefaultCloseOperation(3);
        setSize(350,300);
        
        setLayout(null);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(lHasil);
        add(lLuasPersegi);
        add(lKelilingPersegi);
        add(lVolumeBalok);
        add(lLuasPermukaanBalok);
        add(btnHitung);
        add(btnReset);
        
        // setBounds(m,n,o,p)
	// m = posisi x; n = posisi n
	// o = panjang komponen; p = tinggi komponen
        lpanjang.setBounds(10, 10, 120, 20);
        fpanjang.setBounds(130, 10, 150, 20);
        llebar.setBounds(10, 35, 120, 20);
        flebar.setBounds(130, 35, 150, 20);
        ltinggi.setBounds(10, 60, 120, 20);
        ftinggi.setBounds(130, 60, 150, 20);
        
        lHasil.setBounds(155, 85, 120, 20);
        lLuasPersegi.setBounds(10, 110, 180, 20);
        lKelilingPersegi.setBounds(10, 135, 180, 20);
        lVolumeBalok.setBounds(10, 160, 180, 20);
        lLuasPermukaanBalok.setBounds(10, 185, 180, 20);
        btnHitung.setBounds(50, 210, 120, 20);
        btnReset.setBounds(180, 210, 120, 20);
        
        setVisible(true);
        
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnHitung){
            if(("".equals(fpanjang.getText())) || ("".equals(flebar.getText())) || ("".equals(ftinggi.getText()))){
                JOptionPane.showMessageDialog(this, "Loh kok kosong!");
                return;
                
            }
            try{
                panjang = Double.parseDouble(fpanjang.getText());
                lebar = Double.parseDouble(flebar.getText());
                tinggi = Double.parseDouble(flebar.getText());
                
                balok = new Balok(panjang, lebar, tinggi);
                persegipanjang = new PersegiPanjang(panjang, lebar);
                
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(this,"Loh kok huruf!");
                return;
                
            }finally{
                lLuasPersegi.setText("Luas Persegi: " + persegipanjang.luas());
                lKelilingPersegi.setText("Keliling Persegi: " + persegipanjang.keliling());
                lVolumeBalok.setText("Volume Balok: " + balok.volume());
                lLuasPermukaanBalok.setText("Luas Permukaan Balok: " + balok.luasPermukaan());
                
            }
        }
        if(e.getSource() == btnReset){
            fpanjang.setText("");
            ftinggi.setText("");
            flebar.setText("");
            lLuasPersegi.setText("Luas Persegi: ");
            lKelilingPersegi.setText("Keliling Persegi: ");
            lVolumeBalok.setText("Volume Balok: ");
            lLuasPermukaanBalok.setText("Luas Permukaan Balok: ");
        }  
    }
}
