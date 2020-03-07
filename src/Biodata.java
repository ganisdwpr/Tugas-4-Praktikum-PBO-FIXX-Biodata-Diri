/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

//Ganis Dwiarum Prabandari (123180106)

import javax.swing.*;

public class Biodata {
public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    //frame
    final JTextField alamat = new JTextField(10);

        JLabel judul = new JLabel ("BIODATA DIRI");
        JLabel gambar;
        JLabel nama = new JLabel ("Ganis Dwiarum P");
        JLabel ttl = new JLabel ("Bantul, 24 Februari 2000");
        JLabel agama = new JLabel(" Agama ");
            String[] namaagama = {"Islam","Katolik","Kristen","Budha","Hindu"};
        JComboBox boxagama = new JComboBox(namaagama);
        JRadioButton laki = new JRadioButton(" Laki-laki ");
        JRadioButton perempuan = new JRadioButton("Perempuan ");
        JLabel lalamat = new JLabel ("Alamat");
        JButton tombolEdit = new JButton("Edit");
        JButton tombolSave = new JButton("Save");

public GUI(){
    
    setTitle ("Biodata Diri");
    setDefaultCloseOperation(3);
    setSize(340,560);
    setLocation(750,250);
        
    ButtonGroup group = new ButtonGroup();
        group.add(laki);
        group.add(perempuan);
    
    gambar = new JLabel (new ImageIcon (getClass().getResource(("ganis.jpg"))));
    
    //set layout
        setLayout (null);
        add(judul);
        add(gambar);
        add(nama);
        add(ttl);
        add(boxagama);
        add(laki);
        add(perempuan);
        add(lalamat);
        add(alamat);
        add(tombolEdit);
        add(tombolSave);
    
    //set bounds    
    judul.setBounds(125,20,120,20);
    gambar.setBounds(100,55,120,120);
    nama.setBounds(110,190,120,20);
    ttl.setBounds(90,210,200,20);
    agama.setBounds(100,230,90,20);
    boxagama.setBounds(45,250,230,20);
    laki.setBounds(45,280,120,20);
    perempuan.setBounds(185,280,120,20);
    lalamat.setBounds(130,310,120,20);
    alamat.setBounds(45,330,230,100);
    tombolEdit.setBounds(45,450,90,30);
    tombolSave.setBounds(185,450,90,30);
    setVisible(true);
}
}

