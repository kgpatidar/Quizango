/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizango;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Ram
 */
public class studentquestion extends javax.swing.JFrame {

  

    /**
     * Creates new 
     */
    public void butgrp(){
        ButtonGroup bg1 = new ButtonGroup( );
        bg1.add(r1o1);
        bg1.add(r1o2);
        bg1.add(r1o3);
        bg1.add(r1o4);
        
        ButtonGroup bg2 = new ButtonGroup( );
        bg2.add(r2o1);
        bg2.add(r2o2);
        bg2.add(r2o3);
        bg2.add(r2o4);
        
        ButtonGroup bg3 = new ButtonGroup( );
        bg3.add(r3o1);
        bg3.add(r3o2);
        bg3.add(r3o3);
        bg3.add(r3o4);
        
        ButtonGroup bg4 = new ButtonGroup( );
        bg4.add(r4o1);
        bg4.add(r4o2);
        bg4.add(r4o3);
        bg4.add(r4o4);
        
        ButtonGroup bg5 = new ButtonGroup( );
        bg5.add(r5o1);
        bg5.add(r5o2);
        bg5.add(r5o3);
        bg5.add(r5o4);
        
        ButtonGroup bg6 = new ButtonGroup( );
        bg6.add(r6o1);
        bg6.add(r6o2);
        bg6.add(r6o3);
        bg6.add(r6o4);
        
        ButtonGroup bg7 = new ButtonGroup( );
        bg7.add(r7o1);
        bg7.add(r7o2);
        bg7.add(r7o3);
        bg7.add(r7o4);
        
        ButtonGroup bg8 = new ButtonGroup( );
        bg8.add(r8o1);
        bg8.add(r8o2);
        bg8.add(r8o3);
        bg8.add(r8o4);
        
        ButtonGroup bg9 = new ButtonGroup( );
        bg9.add(r9o1);
        bg9.add(r9o2);
        bg9.add(r9o3);
        bg9.add(r9o4);
        
        ButtonGroup bg10 = new ButtonGroup( );
        bg10.add(r2o1);
        bg10.add(r2o2);
        bg10.add(r2o3);
        bg10.add(r2o4);
    }
    public studentquestion() {
        initComponents();
        butgrp();
    }
    String quizname;
    String seroll;
    public studentquestion(String quname,String r){
        initComponents();
        butgrp();
        quizname = quname;
        seroll = r;
    }
    int userans[] = new int[10];
    int adminans[] = new int[10];
    
    public void calldata1(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=1");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question1.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o1.setText(o1);
                 q1o2.setText(o2);
                 q1o3.setText(o3);
                 q1o4.setText(o4);
                 adminans[0] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        
        
    }
    public void calldata2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=2");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question2.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o5.setText(o1);
                 q1o6.setText(o2);
                 q1o7.setText(o3);
                 q1o8.setText(o4);
                 adminans[1] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        
       
    }
    public void calldata3(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=3");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question3.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o9.setText(o1);
                 q1o10.setText(o2);
                 q1o11.setText(o3);
                 q1o12.setText(o4);
                 adminans[2] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r3o1.isSelected()){
            ans = 1;
        }else if(r3o2.isSelected()){
            ans = 2;
        }else if(r3o3.isSelected()){
            ans = 3;
        }else if(r3o4.isSelected()){
            ans = 4;
        }
        userans[2] = ans;
    }
    public void calldata4(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=4");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question4.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o13.setText(o1);
                 q1o14.setText(o2);
                 q1o15.setText(o3);
                 q1o16.setText(o4);
                 adminans[3] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r4o1.isSelected()){
            ans = 1;
        }else if(r4o2.isSelected()){
            ans = 2;
        }else if(r4o3.isSelected()){
            ans = 3;
        }else if(r4o4.isSelected()){
            ans = 4;
        }
        userans[3] = ans;
    }
    public void calldata5(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=5");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question5.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o17.setText(o1);
                 q1o18.setText(o2);
                 q1o19.setText(o3);
                 q1o20.setText(o4);
                 adminans[4] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r5o1.isSelected()){
            ans = 1;
        }else if(r5o2.isSelected()){
            ans = 2;
        }else if(r5o3.isSelected()){
            ans = 3;
        }else if(r5o4.isSelected()){
            ans = 4;
        }
        userans[4] = ans;
    }
    public void calldata6(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=6");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question6.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o21.setText(o1);
                 q1o22.setText(o2);
                 q1o23.setText(o3);
                 q1o24.setText(o4);
                 adminans[5] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r6o1.isSelected()){
            ans = 1;
        }else if(r6o2.isSelected()){
            ans = 2;
        }else if(r6o3.isSelected()){
            ans = 3;
        }else if(r6o4.isSelected()){
            ans = 4;
        }
        userans[5] = ans;
    }
    public void calldata7(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=7");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question7.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o25.setText(o1);
                 q1o26.setText(o2);
                 q1o27.setText(o3);
                 q1o28.setText(o4);
                 adminans[6] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r7o1.isSelected()){
            ans = 1;
        }else if(r7o2.isSelected()){
            ans = 2;
        }else if(r7o3.isSelected()){
            ans = 3;
        }else if(r7o4.isSelected()){
            ans = 4;
        }
        userans[6] = ans;
    }
    public void calldata8(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=8");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question8.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o29.setText(o1);
                 q1o30.setText(o2);
                 q1o31.setText(o3);
                 q1o32.setText(o4);
                 adminans[7] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r8o1.isSelected()){
            ans = 1;
        }else if(r8o2.isSelected()){
            ans = 2;
        }else if(r8o3.isSelected()){
            ans = 3;
        }else if(r8o4.isSelected()){
            ans = 4;
        }
        userans[7] = ans;
    }
    public void calldata9(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=9");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question9.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o33.setText(o1);
                 q1o34.setText(o2);
                 q1o35.setText(o3);
                 q1o36.setText(o4);
                 adminans[8] = m;
            }
            
        }catch(Exception e){
          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        int ans = 0;
        if(r9o1.isSelected()){
            ans = 1;
        }else if(r9o2.isSelected()){
            ans = 2;
        }else if(r9o3.isSelected()){
            ans = 3;
        }else if(r9o4.isSelected()){
            ans = 4;
        }
        userans[8] = ans;
    }
    public void calldata10(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/admin?zeroDateTimeBehavior=convertToNull","root","1234");  
            java.sql.Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from "+quizname+" where number=10");
            int m = 0;
            while(rs.next()){
                 String q = rs.getString("question");
                 question10.setText(q);
                 String o1 = rs.getString("option1");
                 String o2 = rs.getString("option2");
                 String o3 = rs.getString("option3");
                 String o4 = rs.getString("option4");
                 m = rs.getInt("answer");
                 q1o37.setText(o1);
                 q1o38.setText(o2);
                 q1o39.setText(o3);
                 q1o40.setText(o4);
                 adminans[9] = m;
            }
            
        }catch(Exception e){
//          System.out.print(e);
          JOptionPane.showMessageDialog(null,"Something Went Wrong!" + e);
        }
        
    }
    
   public void calculate1(){
       int ans = 0;
        if(r1o1.isSelected()){
            ans = 1;
            
        }else if(r1o2.isSelected()){
            ans = 2;
        }else if(r1o3.isSelected()){
            ans = 3;
        }else if(r1o4.isSelected()){
            ans = 4;
        }
        userans[0] = ans;
   }
   public void calculate2(){
       int ans = 0;
        if(r2o1.isSelected()){
            ans = 1;
        }else if(r2o2.isSelected()){
            ans = 2;
        }else if(r2o3.isSelected()){
            ans = 3;
        }else if(r2o4.isSelected()){
            ans = 4;
        }
        userans[1] = ans;
   }
   public void calculate3(){
       int ans = 0;
        if(r3o1.isSelected()){
            ans = 1;
        }else if(r3o2.isSelected()){
            ans = 2;
        }else if(r3o3.isSelected()){
            ans = 3;
        }else if(r3o4.isSelected()){
            ans = 4;
        }
        userans[2] = ans;
   }
   public void calculate4(){
       int ans = 0;
        if(r4o1.isSelected()){
            ans = 1;
        }else if(r4o2.isSelected()){
            ans = 2;
        }else if(r4o3.isSelected()){
            ans = 3;
        }else if(r4o4.isSelected()){
            ans = 4;
        }
        userans[3] = ans;
   }
   public void calculate5(){
       int ans = 0;
        if(r5o1.isSelected()){
            ans = 1;
        }else if(r5o2.isSelected()){
            ans = 2;
        }else if(r5o3.isSelected()){
            ans = 3;
        }else if(r5o4.isSelected()){
            ans = 4;
        }
        userans[4] = ans;
   }
   public void calculate6(){
       int ans = 0;
        if(r6o1.isSelected()){
            ans = 1;
        }else if(r6o2.isSelected()){
            ans = 2;
        }else if(r6o3.isSelected()){
            ans = 3;
        }else if(r6o4.isSelected()){
            ans = 4;
        }
        userans[5] = ans;
   }
   public void calculate7(){
       int ans = 0;
        if(r7o1.isSelected()){
            ans = 1;
        }else if(r7o2.isSelected()){
            ans = 2;
        }else if(r7o3.isSelected()){
            ans = 3;
        }else if(r7o4.isSelected()){
            ans = 4;
        }
        userans[6] = ans;
   }
   public void calculate8(){
       int ans = 0;
        if(r8o1.isSelected()){
            ans = 1;
        }else if(r8o2.isSelected()){
            ans = 2;
        }else if(r8o3.isSelected()){
            ans = 3;
        }else if(r8o4.isSelected()){
            ans = 4;
        }
        userans[7] = ans;
   }
   public void calculate9(){
       int ans = 0;
        if(r9o1.isSelected()){
            ans = 1;
        }else if(r9o2.isSelected()){
            ans = 2;
        }else if(r9o3.isSelected()){
            ans = 3;
        }else if(r9o4.isSelected()){
            ans = 4;
        }
        userans[8] = ans;
   }
   public void calculate10(){
       int ans = 0;
        if(r10o1.isSelected()){
            ans = 1;
        }else if(r10o2.isSelected()){
            ans = 2;
        }else if(r10o3.isSelected()){
            ans = 3;
        }else if(r10o4.isSelected()){
            ans = 4;
        }
        userans[9] = ans;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        qunumpane = new javax.swing.JPanel();
        qut1 = new javax.swing.JPanel();
        q1 = new javax.swing.JButton();
        qut2 = new javax.swing.JPanel();
        q2 = new javax.swing.JButton();
        qut3 = new javax.swing.JPanel();
        q3 = new javax.swing.JButton();
        qut4 = new javax.swing.JPanel();
        q4 = new javax.swing.JButton();
        qut5 = new javax.swing.JPanel();
        q5 = new javax.swing.JButton();
        qut6 = new javax.swing.JPanel();
        q6 = new javax.swing.JButton();
        qut7 = new javax.swing.JPanel();
        q7 = new javax.swing.JButton();
        qut8 = new javax.swing.JPanel();
        q8 = new javax.swing.JButton();
        qut9 = new javax.swing.JPanel();
        q9 = new javax.swing.JButton();
        qut10 = new javax.swing.JPanel();
        q10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stu1 = new javax.swing.JPanel();
        qnum1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        previous = new javax.swing.JButton();
        r1o1 = new javax.swing.JRadioButton();
        q1o1 = new javax.swing.JLabel();
        q1o2 = new javax.swing.JLabel();
        r1o2 = new javax.swing.JRadioButton();
        r1o3 = new javax.swing.JRadioButton();
        q1o3 = new javax.swing.JLabel();
        r1o4 = new javax.swing.JRadioButton();
        q1o4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        next1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        question1 = new javax.swing.JTextArea();
        stu2 = new javax.swing.JPanel();
        qnum2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        previous1 = new javax.swing.JButton();
        r2o1 = new javax.swing.JRadioButton();
        q1o5 = new javax.swing.JLabel();
        q1o6 = new javax.swing.JLabel();
        r2o2 = new javax.swing.JRadioButton();
        r2o3 = new javax.swing.JRadioButton();
        q1o7 = new javax.swing.JLabel();
        r2o4 = new javax.swing.JRadioButton();
        q1o8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        next2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        question2 = new javax.swing.JTextArea();
        stu3 = new javax.swing.JPanel();
        qnum3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        previous2 = new javax.swing.JButton();
        r3o1 = new javax.swing.JRadioButton();
        q1o9 = new javax.swing.JLabel();
        q1o10 = new javax.swing.JLabel();
        r3o2 = new javax.swing.JRadioButton();
        r3o3 = new javax.swing.JRadioButton();
        q1o11 = new javax.swing.JLabel();
        r3o4 = new javax.swing.JRadioButton();
        q1o12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        next3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        question3 = new javax.swing.JTextArea();
        stu4 = new javax.swing.JPanel();
        qnum4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        previous3 = new javax.swing.JButton();
        r4o1 = new javax.swing.JRadioButton();
        q1o13 = new javax.swing.JLabel();
        q1o14 = new javax.swing.JLabel();
        r4o2 = new javax.swing.JRadioButton();
        r4o3 = new javax.swing.JRadioButton();
        q1o15 = new javax.swing.JLabel();
        r4o4 = new javax.swing.JRadioButton();
        q1o16 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        next4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        question4 = new javax.swing.JTextArea();
        stu5 = new javax.swing.JPanel();
        qnum5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        previous4 = new javax.swing.JButton();
        r5o1 = new javax.swing.JRadioButton();
        q1o17 = new javax.swing.JLabel();
        q1o18 = new javax.swing.JLabel();
        r5o2 = new javax.swing.JRadioButton();
        r5o3 = new javax.swing.JRadioButton();
        q1o19 = new javax.swing.JLabel();
        r5o4 = new javax.swing.JRadioButton();
        q1o20 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        next5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        question5 = new javax.swing.JTextArea();
        stu6 = new javax.swing.JPanel();
        qnum6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        previous5 = new javax.swing.JButton();
        r6o1 = new javax.swing.JRadioButton();
        q1o21 = new javax.swing.JLabel();
        q1o22 = new javax.swing.JLabel();
        r6o2 = new javax.swing.JRadioButton();
        r6o3 = new javax.swing.JRadioButton();
        q1o23 = new javax.swing.JLabel();
        r6o4 = new javax.swing.JRadioButton();
        q1o24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        next6 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        question6 = new javax.swing.JTextArea();
        stu7 = new javax.swing.JPanel();
        qnum7 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        previous6 = new javax.swing.JButton();
        r7o1 = new javax.swing.JRadioButton();
        q1o25 = new javax.swing.JLabel();
        q1o26 = new javax.swing.JLabel();
        r7o2 = new javax.swing.JRadioButton();
        r7o3 = new javax.swing.JRadioButton();
        q1o27 = new javax.swing.JLabel();
        r7o4 = new javax.swing.JRadioButton();
        q1o28 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        next7 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        question7 = new javax.swing.JTextArea();
        stu8 = new javax.swing.JPanel();
        qnum8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        previous7 = new javax.swing.JButton();
        r8o1 = new javax.swing.JRadioButton();
        q1o29 = new javax.swing.JLabel();
        q1o30 = new javax.swing.JLabel();
        r8o2 = new javax.swing.JRadioButton();
        r8o3 = new javax.swing.JRadioButton();
        q1o31 = new javax.swing.JLabel();
        r8o4 = new javax.swing.JRadioButton();
        q1o32 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        next8 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        question8 = new javax.swing.JTextArea();
        stu9 = new javax.swing.JPanel();
        qnum9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        previous8 = new javax.swing.JButton();
        r9o1 = new javax.swing.JRadioButton();
        q1o33 = new javax.swing.JLabel();
        q1o34 = new javax.swing.JLabel();
        r9o2 = new javax.swing.JRadioButton();
        r9o3 = new javax.swing.JRadioButton();
        q1o35 = new javax.swing.JLabel();
        r9o4 = new javax.swing.JRadioButton();
        q1o36 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        next9 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        question9 = new javax.swing.JTextArea();
        stu10 = new javax.swing.JPanel();
        qnum10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        previous9 = new javax.swing.JButton();
        r10o1 = new javax.swing.JRadioButton();
        q1o37 = new javax.swing.JLabel();
        q1o38 = new javax.swing.JLabel();
        r10o2 = new javax.swing.JRadioButton();
        r10o3 = new javax.swing.JRadioButton();
        q1o39 = new javax.swing.JLabel();
        r10o4 = new javax.swing.JRadioButton();
        q1o40 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        next10 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        question10 = new javax.swing.JTextArea();
        submit = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        publishing = new javax.swing.JButton();
        startpane = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        publishing1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(96, 223, 170));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Gisha", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LetsQUIZ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 50, 40));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1100, 40);

        qunumpane.setBackground(new java.awt.Color(0, 204, 153));
        qunumpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qut1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1.setForeground(new java.awt.Color(0, 153, 255));
        q1.setText("1");
        q1.setBorderPainted(false);
        q1.setContentAreaFilled(false);
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        qut1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 50, 50));

        qut2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q2.setForeground(new java.awt.Color(0, 153, 255));
        q2.setText("2");
        q2.setBorderPainted(false);
        q2.setContentAreaFilled(false);
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        qut2.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        qut3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q3.setForeground(new java.awt.Color(0, 153, 255));
        q3.setText("3");
        q3.setBorderPainted(false);
        q3.setContentAreaFilled(false);
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        qut3.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 50, 50));

        qut4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q4.setForeground(new java.awt.Color(0, 153, 255));
        q4.setText("4");
        q4.setBorderPainted(false);
        q4.setContentAreaFilled(false);
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });
        qut4.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, 50));

        qut5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q5.setForeground(new java.awt.Color(0, 153, 255));
        q5.setText("5");
        q5.setBorderPainted(false);
        q5.setContentAreaFilled(false);
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });
        qut5.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 50));

        qut6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q6.setForeground(new java.awt.Color(0, 153, 255));
        q6.setText("6");
        q6.setBorderPainted(false);
        q6.setContentAreaFilled(false);
        q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q6ActionPerformed(evt);
            }
        });
        qut6.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 50));

        qut7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q7.setForeground(new java.awt.Color(0, 153, 255));
        q7.setText("7");
        q7.setBorderPainted(false);
        q7.setContentAreaFilled(false);
        q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q7ActionPerformed(evt);
            }
        });
        qut7.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 50));

        qut8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q8.setForeground(new java.awt.Color(0, 153, 255));
        q8.setText("8");
        q8.setBorderPainted(false);
        q8.setContentAreaFilled(false);
        q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q8ActionPerformed(evt);
            }
        });
        qut8.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 50));

        qut9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q9.setForeground(new java.awt.Color(0, 153, 255));
        q9.setText("9");
        q9.setBorderPainted(false);
        q9.setContentAreaFilled(false);
        q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q9ActionPerformed(evt);
            }
        });
        qut9.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 50, 50));

        qut10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        q10.setForeground(new java.awt.Color(0, 153, 255));
        q10.setText("10");
        q10.setBorderPainted(false);
        q10.setContentAreaFilled(false);
        q10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q10ActionPerformed(evt);
            }
        });
        qut10.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        qunumpane.add(qut10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 50));

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SUBMIT");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        qunumpane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 140, 50));

        min.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        min.setForeground(new java.awt.Color(255, 0, 51));
        min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qunumpane.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 40, 50));

        sec.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        sec.setForeground(new java.awt.Color(255, 0, 51));
        sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qunumpane.add(sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 40, 50));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");
        qunumpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 20, 50));

        jPanel1.add(qunumpane);
        qunumpane.setBounds(0, 70, 1100, 50);

        stu1.setBackground(new java.awt.Color(0, 204, 153));

        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum1.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum1.setForeground(new java.awt.Color(255, 255, 255));
        qnum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum1.setText("1");
        stu1.add(qnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, -1));

        jLabel20.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Question :");
        stu1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, -1));

        jPanel9.setBackground(new java.awt.Color(204, 0, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous.setBackground(new java.awt.Color(255, 255, 255));
        previous.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setText("Previous");
        previous.setBorderPainted(false);
        previous.setContentAreaFilled(false);
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous.setEnabled(false);
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        jPanel9.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r1o1.setBackground(new java.awt.Color(0, 204, 153));
        r1o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r1o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1o1ActionPerformed(evt);
            }
        });
        stu1.add(r1o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o1.setForeground(new java.awt.Color(255, 255, 255));
        q1o1.setText("jLabel1");
        stu1.add(q1o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o2.setForeground(new java.awt.Color(255, 255, 255));
        q1o2.setText("jLabel1");
        stu1.add(q1o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r1o2.setBackground(new java.awt.Color(0, 204, 153));
        r1o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r1o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1o2ActionPerformed(evt);
            }
        });
        stu1.add(r1o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r1o3.setBackground(new java.awt.Color(0, 204, 153));
        r1o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r1o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1o3ActionPerformed(evt);
            }
        });
        stu1.add(r1o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o3.setForeground(new java.awt.Color(255, 255, 255));
        q1o3.setText("jLabel1");
        stu1.add(q1o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r1o4.setBackground(new java.awt.Color(0, 204, 153));
        r1o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r1o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1o4ActionPerformed(evt);
            }
        });
        stu1.add(r1o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o4.setForeground(new java.awt.Color(255, 255, 255));
        q1o4.setText("jLabel1");
        stu1.add(q1o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next1.setBackground(new java.awt.Color(255, 255, 255));
        next1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next1.setForeground(new java.awt.Color(255, 255, 255));
        next1.setText("Next");
        next1.setBorderPainted(false);
        next1.setContentAreaFilled(false);
        next1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });
        jPanel11.add(next1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question1.setBackground(new java.awt.Color(0, 204, 153));
        question1.setColumns(20);
        question1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question1.setForeground(new java.awt.Color(255, 255, 255));
        question1.setLineWrap(true);
        question1.setRows(5);
        jScrollPane1.setViewportView(question1);

        stu1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 750, 110));

        jPanel1.add(stu1);
        stu1.setBounds(30, 150, 1040, 400);

        stu2.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        //       stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum2.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum2.setForeground(new java.awt.Color(255, 255, 255));
        qnum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum2.setText("2");
        stu2.add(qnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 50, -1));

        jLabel21.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Question :");
        stu2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, -1));

        jPanel12.setBackground(new java.awt.Color(255, 102, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous1.setBackground(new java.awt.Color(255, 255, 255));
        previous1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous1.setForeground(new java.awt.Color(255, 255, 255));
        previous1.setText("Previous");
        previous1.setBorderPainted(false);
        previous1.setContentAreaFilled(false);
        previous1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous1ActionPerformed(evt);
            }
        });
        jPanel12.add(previous1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r2o1.setBackground(new java.awt.Color(0, 204, 153));
        r2o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r2o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2o1ActionPerformed(evt);
            }
        });
        stu2.add(r2o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o5.setForeground(new java.awt.Color(255, 255, 255));
        q1o5.setText("jLabel1");
        stu2.add(q1o5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o6.setForeground(new java.awt.Color(255, 255, 255));
        q1o6.setText("jLabel1");
        stu2.add(q1o6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r2o2.setBackground(new java.awt.Color(0, 204, 153));
        r2o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r2o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2o2ActionPerformed(evt);
            }
        });
        stu2.add(r2o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r2o3.setBackground(new java.awt.Color(0, 204, 153));
        r2o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r2o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2o3ActionPerformed(evt);
            }
        });
        stu2.add(r2o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o7.setForeground(new java.awt.Color(255, 255, 255));
        q1o7.setText("jLabel1");
        stu2.add(q1o7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r2o4.setBackground(new java.awt.Color(0, 204, 153));
        r2o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r2o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2o4ActionPerformed(evt);
            }
        });
        stu2.add(r2o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o8.setForeground(new java.awt.Color(255, 255, 255));
        q1o8.setText("jLabel1");
        stu2.add(q1o8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel13.setBackground(new java.awt.Color(255, 102, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next2.setBackground(new java.awt.Color(255, 255, 255));
        next2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next2.setForeground(new java.awt.Color(255, 255, 255));
        next2.setText("Next");
        next2.setBorderPainted(false);
        next2.setContentAreaFilled(false);
        next2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });
        jPanel13.add(next2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question2.setBackground(new java.awt.Color(0, 204, 153));
        question2.setColumns(20);
        question2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question2.setForeground(new java.awt.Color(255, 255, 255));
        question2.setLineWrap(true);
        question2.setRows(5);
        question2.setText("\n");
        jScrollPane2.setViewportView(question2);

        stu2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 750, 110));

        jPanel1.add(stu2);
        stu2.setBounds(30, 150, 1040, 400);

        stu3.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        //       stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum3.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum3.setForeground(new java.awt.Color(255, 255, 255));
        qnum3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum3.setText("3");
        stu3.add(qnum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Question :");
        stu3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel14.setBackground(new java.awt.Color(255, 102, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous2.setBackground(new java.awt.Color(255, 255, 255));
        previous2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous2.setForeground(new java.awt.Color(255, 255, 255));
        previous2.setText("Previous");
        previous2.setBorderPainted(false);
        previous2.setContentAreaFilled(false);
        previous2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous2ActionPerformed(evt);
            }
        });
        jPanel14.add(previous2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r3o1.setBackground(new java.awt.Color(0, 204, 153));
        r3o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r3o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3o1ActionPerformed(evt);
            }
        });
        stu3.add(r3o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o9.setForeground(new java.awt.Color(255, 255, 255));
        q1o9.setText("jLabel1");
        stu3.add(q1o9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o10.setForeground(new java.awt.Color(255, 255, 255));
        q1o10.setText("jLabel1");
        stu3.add(q1o10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r3o2.setBackground(new java.awt.Color(0, 204, 153));
        r3o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r3o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3o2ActionPerformed(evt);
            }
        });
        stu3.add(r3o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r3o3.setBackground(new java.awt.Color(0, 204, 153));
        r3o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r3o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3o3ActionPerformed(evt);
            }
        });
        stu3.add(r3o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o11.setForeground(new java.awt.Color(255, 255, 255));
        q1o11.setText("jLabel1");
        stu3.add(q1o11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r3o4.setBackground(new java.awt.Color(0, 204, 153));
        r3o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r3o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3o4ActionPerformed(evt);
            }
        });
        stu3.add(r3o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o12.setForeground(new java.awt.Color(255, 255, 255));
        q1o12.setText("jLabel1");
        stu3.add(q1o12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel15.setBackground(new java.awt.Color(255, 102, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next3.setBackground(new java.awt.Color(255, 255, 255));
        next3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next3.setForeground(new java.awt.Color(255, 255, 255));
        next3.setText("Next");
        next3.setBorderPainted(false);
        next3.setContentAreaFilled(false);
        next3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next3ActionPerformed(evt);
            }
        });
        jPanel15.add(next3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question3.setBackground(new java.awt.Color(0, 204, 153));
        question3.setColumns(20);
        question3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question3.setForeground(new java.awt.Color(255, 255, 255));
        question3.setLineWrap(true);
        question3.setRows(5);
        jScrollPane3.setViewportView(question3);

        stu3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu3);
        stu3.setBounds(30, 150, 1040, 400);

        stu4.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        //       stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum4.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum4.setForeground(new java.awt.Color(255, 255, 255));
        qnum4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum4.setText("4");
        stu4.add(qnum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Question :");
        stu4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel16.setBackground(new java.awt.Color(255, 102, 102));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous3.setBackground(new java.awt.Color(255, 255, 255));
        previous3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous3.setForeground(new java.awt.Color(255, 255, 255));
        previous3.setText("Previous");
        previous3.setBorderPainted(false);
        previous3.setContentAreaFilled(false);
        previous3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous3ActionPerformed(evt);
            }
        });
        jPanel16.add(previous3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r4o1.setBackground(new java.awt.Color(0, 204, 153));
        r4o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r4o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4o1ActionPerformed(evt);
            }
        });
        stu4.add(r4o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o13.setForeground(new java.awt.Color(255, 255, 255));
        q1o13.setText("jLabel1");
        stu4.add(q1o13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o14.setForeground(new java.awt.Color(255, 255, 255));
        q1o14.setText("jLabel1");
        stu4.add(q1o14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r4o2.setBackground(new java.awt.Color(0, 204, 153));
        r4o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r4o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4o2ActionPerformed(evt);
            }
        });
        stu4.add(r4o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r4o3.setBackground(new java.awt.Color(0, 204, 153));
        r4o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r4o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4o3ActionPerformed(evt);
            }
        });
        stu4.add(r4o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o15.setForeground(new java.awt.Color(255, 255, 255));
        q1o15.setText("jLabel1");
        stu4.add(q1o15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r4o4.setBackground(new java.awt.Color(0, 204, 153));
        r4o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r4o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4o4ActionPerformed(evt);
            }
        });
        stu4.add(r4o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o16.setForeground(new java.awt.Color(255, 255, 255));
        q1o16.setText("jLabel1");
        stu4.add(q1o16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel17.setBackground(new java.awt.Color(255, 102, 102));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next4.setBackground(new java.awt.Color(255, 255, 255));
        next4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next4.setForeground(new java.awt.Color(255, 255, 255));
        next4.setText("Next");
        next4.setBorderPainted(false);
        next4.setContentAreaFilled(false);
        next4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next4ActionPerformed(evt);
            }
        });
        jPanel17.add(next4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu4.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question4.setBackground(new java.awt.Color(0, 204, 153));
        question4.setColumns(20);
        question4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question4.setForeground(new java.awt.Color(255, 255, 255));
        question4.setLineWrap(true);
        question4.setRows(5);
        jScrollPane4.setViewportView(question4);

        stu4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu4);
        stu4.setBounds(30, 150, 1040, 400);

        stu5.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        //       stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum5.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum5.setForeground(new java.awt.Color(255, 255, 255));
        qnum5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum5.setText("5");
        stu5.add(qnum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel24.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Question :");
        stu5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel18.setBackground(new java.awt.Color(255, 102, 102));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous4.setBackground(new java.awt.Color(255, 255, 255));
        previous4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous4.setForeground(new java.awt.Color(255, 255, 255));
        previous4.setText("Previous");
        previous4.setBorderPainted(false);
        previous4.setContentAreaFilled(false);
        previous4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous4ActionPerformed(evt);
            }
        });
        jPanel18.add(previous4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r5o1.setBackground(new java.awt.Color(0, 204, 153));
        r5o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r5o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5o1ActionPerformed(evt);
            }
        });
        stu5.add(r5o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o17.setForeground(new java.awt.Color(255, 255, 255));
        q1o17.setText("jLabel1");
        stu5.add(q1o17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o18.setForeground(new java.awt.Color(255, 255, 255));
        q1o18.setText("jLabel1");
        stu5.add(q1o18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r5o2.setBackground(new java.awt.Color(0, 204, 153));
        r5o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r5o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5o2ActionPerformed(evt);
            }
        });
        stu5.add(r5o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r5o3.setBackground(new java.awt.Color(0, 204, 153));
        r5o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r5o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5o3ActionPerformed(evt);
            }
        });
        stu5.add(r5o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o19.setForeground(new java.awt.Color(255, 255, 255));
        q1o19.setText("jLabel1");
        stu5.add(q1o19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r5o4.setBackground(new java.awt.Color(0, 204, 153));
        r5o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r5o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5o4ActionPerformed(evt);
            }
        });
        stu5.add(r5o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o20.setForeground(new java.awt.Color(255, 255, 255));
        q1o20.setText("jLabel1");
        stu5.add(q1o20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel19.setBackground(new java.awt.Color(255, 102, 102));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next5.setBackground(new java.awt.Color(255, 255, 255));
        next5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next5.setForeground(new java.awt.Color(255, 255, 255));
        next5.setText("Next");
        next5.setBorderPainted(false);
        next5.setContentAreaFilled(false);
        next5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next5ActionPerformed(evt);
            }
        });
        jPanel19.add(next5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu5.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question5.setBackground(new java.awt.Color(0, 204, 153));
        question5.setColumns(20);
        question5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question5.setForeground(new java.awt.Color(255, 255, 255));
        question5.setLineWrap(true);
        question5.setRows(5);
        jScrollPane5.setViewportView(question5);

        stu5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu5);
        stu5.setBounds(30, 150, 1040, 400);

        stu6.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        //       stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum6.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum6.setForeground(new java.awt.Color(255, 255, 255));
        qnum6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum6.setText("6");
        stu6.add(qnum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Question :");
        stu6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel20.setBackground(new java.awt.Color(255, 102, 102));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous5.setBackground(new java.awt.Color(255, 255, 255));
        previous5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous5.setForeground(new java.awt.Color(255, 255, 255));
        previous5.setText("Previous");
        previous5.setBorderPainted(false);
        previous5.setContentAreaFilled(false);
        previous5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous5ActionPerformed(evt);
            }
        });
        jPanel20.add(previous5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu6.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r6o1.setBackground(new java.awt.Color(0, 204, 153));
        r6o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r6o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6o1ActionPerformed(evt);
            }
        });
        stu6.add(r6o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o21.setForeground(new java.awt.Color(255, 255, 255));
        q1o21.setText("jLabel1");
        stu6.add(q1o21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o22.setForeground(new java.awt.Color(255, 255, 255));
        q1o22.setText("jLabel1");
        stu6.add(q1o22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r6o2.setBackground(new java.awt.Color(0, 204, 153));
        r6o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r6o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6o2ActionPerformed(evt);
            }
        });
        stu6.add(r6o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r6o3.setBackground(new java.awt.Color(0, 204, 153));
        r6o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r6o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6o3ActionPerformed(evt);
            }
        });
        stu6.add(r6o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o23.setForeground(new java.awt.Color(255, 255, 255));
        q1o23.setText("jLabel1");
        stu6.add(q1o23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r6o4.setBackground(new java.awt.Color(0, 204, 153));
        r6o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r6o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6o4ActionPerformed(evt);
            }
        });
        stu6.add(r6o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o24.setForeground(new java.awt.Color(255, 255, 255));
        q1o24.setText("jLabel1");
        stu6.add(q1o24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel21.setBackground(new java.awt.Color(255, 102, 102));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next6.setBackground(new java.awt.Color(255, 255, 255));
        next6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next6.setForeground(new java.awt.Color(255, 255, 255));
        next6.setText("Next");
        next6.setBorderPainted(false);
        next6.setContentAreaFilled(false);
        next6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next6ActionPerformed(evt);
            }
        });
        jPanel21.add(next6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu6.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question6.setBackground(new java.awt.Color(0, 204, 153));
        question6.setColumns(20);
        question6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question6.setForeground(new java.awt.Color(255, 255, 255));
        question6.setLineWrap(true);
        question6.setRows(5);
        jScrollPane6.setViewportView(question6);

        stu6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu6);
        stu6.setBounds(30, 150, 1040, 400);

        stu7.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        //       stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum7.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum7.setForeground(new java.awt.Color(255, 255, 255));
        qnum7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum7.setText("7");
        stu7.add(qnum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel26.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Question :");
        stu7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel22.setBackground(new java.awt.Color(255, 102, 102));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous6.setBackground(new java.awt.Color(255, 255, 255));
        previous6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous6.setForeground(new java.awt.Color(255, 255, 255));
        previous6.setText("Previous");
        previous6.setBorderPainted(false);
        previous6.setContentAreaFilled(false);
        previous6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous6ActionPerformed(evt);
            }
        });
        jPanel22.add(previous6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu7.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r7o1.setBackground(new java.awt.Color(0, 204, 153));
        r7o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r7o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7o1ActionPerformed(evt);
            }
        });
        stu7.add(r7o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o25.setForeground(new java.awt.Color(255, 255, 255));
        q1o25.setText("jLabel1");
        stu7.add(q1o25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o26.setForeground(new java.awt.Color(255, 255, 255));
        q1o26.setText("jLabel1");
        stu7.add(q1o26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r7o2.setBackground(new java.awt.Color(0, 204, 153));
        r7o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r7o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7o2ActionPerformed(evt);
            }
        });
        stu7.add(r7o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r7o3.setBackground(new java.awt.Color(0, 204, 153));
        r7o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r7o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7o3ActionPerformed(evt);
            }
        });
        stu7.add(r7o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o27.setForeground(new java.awt.Color(255, 255, 255));
        q1o27.setText("jLabel1");
        stu7.add(q1o27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r7o4.setBackground(new java.awt.Color(0, 204, 153));
        r7o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r7o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7o4ActionPerformed(evt);
            }
        });
        stu7.add(r7o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o28.setForeground(new java.awt.Color(255, 255, 255));
        q1o28.setText("jLabel1");
        stu7.add(q1o28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel23.setBackground(new java.awt.Color(255, 102, 102));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next7.setBackground(new java.awt.Color(255, 255, 255));
        next7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next7.setForeground(new java.awt.Color(255, 255, 255));
        next7.setText("Next");
        next7.setBorderPainted(false);
        next7.setContentAreaFilled(false);
        next7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next7ActionPerformed(evt);
            }
        });
        jPanel23.add(next7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu7.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question7.setBackground(new java.awt.Color(0, 204, 153));
        question7.setColumns(20);
        question7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question7.setForeground(new java.awt.Color(255, 255, 255));
        question7.setLineWrap(true);
        question7.setRows(5);
        jScrollPane7.setViewportView(question7);

        stu7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu7);
        stu7.setBounds(30, 150, 1040, 400);

        stu8.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        //       stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum8.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum8.setForeground(new java.awt.Color(255, 255, 255));
        qnum8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum8.setText("8");
        stu8.add(qnum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel27.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Question :");
        stu8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel24.setBackground(new java.awt.Color(255, 102, 102));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous7.setBackground(new java.awt.Color(255, 255, 255));
        previous7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous7.setForeground(new java.awt.Color(255, 255, 255));
        previous7.setText("Previous");
        previous7.setBorderPainted(false);
        previous7.setContentAreaFilled(false);
        previous7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous7ActionPerformed(evt);
            }
        });
        jPanel24.add(previous7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu8.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r8o1.setBackground(new java.awt.Color(0, 204, 153));
        r8o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r8o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8o1ActionPerformed(evt);
            }
        });
        stu8.add(r8o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o29.setForeground(new java.awt.Color(255, 255, 255));
        q1o29.setText("jLabel1");
        stu8.add(q1o29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o30.setForeground(new java.awt.Color(255, 255, 255));
        q1o30.setText("jLabel1");
        stu8.add(q1o30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r8o2.setBackground(new java.awt.Color(0, 204, 153));
        r8o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r8o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8o2ActionPerformed(evt);
            }
        });
        stu8.add(r8o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r8o3.setBackground(new java.awt.Color(0, 204, 153));
        r8o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r8o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8o3ActionPerformed(evt);
            }
        });
        stu8.add(r8o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o31.setForeground(new java.awt.Color(255, 255, 255));
        q1o31.setText("jLabel1");
        stu8.add(q1o31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r8o4.setBackground(new java.awt.Color(0, 204, 153));
        r8o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r8o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8o4ActionPerformed(evt);
            }
        });
        stu8.add(r8o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o32.setForeground(new java.awt.Color(255, 255, 255));
        q1o32.setText("jLabel1");
        stu8.add(q1o32, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel25.setBackground(new java.awt.Color(255, 102, 102));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next8.setBackground(new java.awt.Color(255, 255, 255));
        next8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next8.setForeground(new java.awt.Color(255, 255, 255));
        next8.setText("Next");
        next8.setBorderPainted(false);
        next8.setContentAreaFilled(false);
        next8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next8ActionPerformed(evt);
            }
        });
        jPanel25.add(next8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu8.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question8.setBackground(new java.awt.Color(0, 204, 153));
        question8.setColumns(20);
        question8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question8.setForeground(new java.awt.Color(255, 255, 255));
        question8.setLineWrap(true);
        question8.setRows(5);
        jScrollPane8.setViewportView(question8);

        stu8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu8);
        stu8.setBounds(30, 150, 1040, 400);

        stu9.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        //       stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum9.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum9.setForeground(new java.awt.Color(255, 255, 255));
        qnum9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum9.setText("9");
        stu9.add(qnum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel28.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Question :");
        stu9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel26.setBackground(new java.awt.Color(255, 102, 102));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous8.setBackground(new java.awt.Color(255, 255, 255));
        previous8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous8.setForeground(new java.awt.Color(255, 255, 255));
        previous8.setText("Previous");
        previous8.setBorderPainted(false);
        previous8.setContentAreaFilled(false);
        previous8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous8ActionPerformed(evt);
            }
        });
        jPanel26.add(previous8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu9.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r9o1.setBackground(new java.awt.Color(0, 204, 153));
        r9o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r9o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9o1ActionPerformed(evt);
            }
        });
        stu9.add(r9o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o33.setForeground(new java.awt.Color(255, 255, 255));
        q1o33.setText("jLabel1");
        stu9.add(q1o33, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o34.setForeground(new java.awt.Color(255, 255, 255));
        q1o34.setText("jLabel1");
        stu9.add(q1o34, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r9o2.setBackground(new java.awt.Color(0, 204, 153));
        r9o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r9o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9o2ActionPerformed(evt);
            }
        });
        stu9.add(r9o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r9o3.setBackground(new java.awt.Color(0, 204, 153));
        r9o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r9o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9o3ActionPerformed(evt);
            }
        });
        stu9.add(r9o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o35.setForeground(new java.awt.Color(255, 255, 255));
        q1o35.setText("jLabel1");
        stu9.add(q1o35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r9o4.setBackground(new java.awt.Color(0, 204, 153));
        r9o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r9o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9o4ActionPerformed(evt);
            }
        });
        stu9.add(r9o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o36.setForeground(new java.awt.Color(255, 255, 255));
        q1o36.setText("jLabel1");
        stu9.add(q1o36, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel27.setBackground(new java.awt.Color(255, 102, 102));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next9.setBackground(new java.awt.Color(255, 255, 255));
        next9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next9.setForeground(new java.awt.Color(255, 255, 255));
        next9.setText("Next");
        next9.setBorderPainted(false);
        next9.setContentAreaFilled(false);
        next9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next9ActionPerformed(evt);
            }
        });
        jPanel27.add(next9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu9.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question9.setBackground(new java.awt.Color(0, 204, 153));
        question9.setColumns(20);
        question9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question9.setForeground(new java.awt.Color(255, 255, 255));
        question9.setLineWrap(true);
        question9.setRows(5);
        jScrollPane9.setViewportView(question9);

        stu9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 760, 110));

        jPanel1.add(stu9);
        stu9.setBounds(30, 150, 1040, 400);

        stu10.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        //       stu10.setVisible(false);
        submit.setVisible(false);
        startpane.setVisible(false);
        stu10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        qnum10.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        qnum10.setForeground(new java.awt.Color(255, 255, 255));
        qnum10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qnum10.setText("10");
        stu10.add(qnum10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 50, -1));

        jLabel29.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Question :");
        stu10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        jPanel28.setBackground(new java.awt.Color(255, 102, 102));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous9.setBackground(new java.awt.Color(255, 255, 255));
        previous9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        previous9.setForeground(new java.awt.Color(255, 255, 255));
        previous9.setText("Previous");
        previous9.setBorderPainted(false);
        previous9.setContentAreaFilled(false);
        previous9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous9ActionPerformed(evt);
            }
        });
        jPanel28.add(previous9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu10.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 190, 40));

        r10o1.setBackground(new java.awt.Color(0, 204, 153));
        r10o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r10o1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10o1ActionPerformed(evt);
            }
        });
        stu10.add(r10o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 60, 40));

        q1o37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o37.setForeground(new java.awt.Color(255, 255, 255));
        q1o37.setText("jLabel1");
        stu10.add(q1o37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 290, 30));

        q1o38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o38.setForeground(new java.awt.Color(255, 255, 255));
        q1o38.setText("jLabel1");
        stu10.add(q1o38, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 30));

        r10o2.setBackground(new java.awt.Color(0, 204, 153));
        r10o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r10o2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10o2ActionPerformed(evt);
            }
        });
        stu10.add(r10o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 60, 40));

        r10o3.setBackground(new java.awt.Color(0, 204, 153));
        r10o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r10o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10o3ActionPerformed(evt);
            }
        });
        stu10.add(r10o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        q1o39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o39.setForeground(new java.awt.Color(255, 255, 255));
        q1o39.setText("jLabel1");
        stu10.add(q1o39, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, 30));

        r10o4.setBackground(new java.awt.Color(0, 204, 153));
        r10o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        r10o4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10o4ActionPerformed(evt);
            }
        });
        stu10.add(r10o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, 40));

        q1o40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        q1o40.setForeground(new java.awt.Color(255, 255, 255));
        q1o40.setText("jLabel1");
        stu10.add(q1o40, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 310, 30));

        jPanel29.setBackground(new java.awt.Color(153, 0, 51));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next10.setBackground(new java.awt.Color(255, 255, 255));
        next10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        next10.setForeground(new java.awt.Color(255, 255, 255));
        next10.setText("Next");
        next10.setBorderPainted(false);
        next10.setContentAreaFilled(false);
        next10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next10.setEnabled(false);
        next10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next10ActionPerformed(evt);
            }
        });
        jPanel29.add(next10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        stu10.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 190, 40));

        question10.setBackground(new java.awt.Color(0, 204, 153));
        question10.setColumns(20);
        question10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        question10.setForeground(new java.awt.Color(255, 255, 255));
        question10.setLineWrap(true);
        question10.setRows(5);
        question10.setTabSize(5);
        jScrollPane10.setViewportView(question10);

        stu10.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 750, 110));

        jPanel1.add(stu10);
        stu10.setBounds(30, 150, 1040, 400);

        submit.setBackground(new java.awt.Color(0, 204, 153));
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        //       submit.setVisible(false);
        startpane.setVisible(false);
        submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 102, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishing.setBackground(new java.awt.Color(255, 255, 255));
        publishing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        publishing.setForeground(new java.awt.Color(255, 255, 255));
        publishing.setText("Publish Quiz");
        publishing.setBorderPainted(false);
        publishing.setContentAreaFilled(false);
        publishing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        publishing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishingActionPerformed(evt);
            }
        });
        jPanel10.add(publishing, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        submit.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 320, 40));

        jPanel1.add(submit);
        submit.setBounds(30, 150, 1040, 400);

        startpane.setBackground(new java.awt.Color(0, 204, 153));
        startpane.setVisible(true);
        stu1.setVisible(false);
        stu2.setVisible(false);
        stu3.setVisible(false);
        stu4.setVisible(false);
        stu5.setVisible(false);
        stu6.setVisible(false);
        stu7.setVisible(false);
        stu8.setVisible(false);
        stu9.setVisible(false);
        stu10.setVisible(false);
        submit.setVisible(false);
        qunumpane.setVisible(false);
        startpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(255, 102, 102));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        publishing1.setBackground(new java.awt.Color(255, 255, 255));
        publishing1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        publishing1.setForeground(new java.awt.Color(255, 255, 255));
        publishing1.setText("Start QUIZ");
        publishing1.setBorderPainted(false);
        publishing1.setContentAreaFilled(false);
        publishing1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        publishing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishing1ActionPerformed(evt);
            }
        });
        jPanel30.add(publishing1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 70));

        startpane.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 370, 70));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All The Best!");
        startpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1040, 70));

        jPanel1.add(startpane);
        startpane.setBounds(30, 150, 1040, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1100, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
       

    }//GEN-LAST:event_previousActionPerformed
    
    
    
    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        stu1.setVisible(true);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       submit.setVisible(false);
       startpane.setVisible(false);
       calldata1();
    }//GEN-LAST:event_q1ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
calldata2();        stu1.setVisible(false);
       stu2.setVisible(true);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       startpane.setVisible(false);
       submit.setVisible(false);
    }//GEN-LAST:event_q2ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
stu1.setVisible(false);
calldata3();
       stu2.setVisible(false);
       stu3.setVisible(true);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       startpane.setVisible(false);stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       submit.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
calldata4();        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(true);
       startpane.setVisible(false);stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       submit.setVisible(false);
    }//GEN-LAST:event_q4ActionPerformed

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(true);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       startpane.setVisible(false);stu9.setVisible(false);
       stu10.setVisible(false);
       submit.setVisible(false);
       calldata5();
    }//GEN-LAST:event_q5ActionPerformed

    private void q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q6ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(true);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       startpane.setVisible(false);submit.setVisible(false);
       calldata6();
    }//GEN-LAST:event_q6ActionPerformed

    private void q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q7ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(true);
       stu8.setVisible(false);
       stu9.setVisible(false);
       startpane.setVisible(false);stu10.setVisible(false);
       submit.setVisible(false);
       calldata7();
    }//GEN-LAST:event_q7ActionPerformed

    private void q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q8ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(true);
       stu9.setVisible(false);
       stu10.setVisible(false);
       startpane.setVisible(false);submit.setVisible(false);
       calldata8();
    }//GEN-LAST:event_q8ActionPerformed

    private void q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q9ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(true);
       stu10.setVisible(false);
       startpane.setVisible(false);submit.setVisible(false);
       calldata9();
    }//GEN-LAST:event_q9ActionPerformed

    private void q10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q10ActionPerformed
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       startpane.setVisible(false);stu10.setVisible(true);
       submit.setVisible(false);
       calldata10();
    }//GEN-LAST:event_q10ActionPerformed

    private void r1o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1o1ActionPerformed

    private void r1o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1o2ActionPerformed

    private void r1o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1o3ActionPerformed

    private void r1o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1o4ActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
       stu1.setVisible(false);
       stu2.setVisible(true);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       startpane.setVisible(false);stu10.setVisible(false);
       qut1.setBackground(Color.red);
       calldata2();
       calculate1();
    }//GEN-LAST:event_next1ActionPerformed

    private void previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous1ActionPerformed
        stu1.setVisible(true);
        stu2.setVisible(false);
        calldata1();
        calculate2();
    }//GEN-LAST:event_previous1ActionPerformed

    private void r2o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2o1ActionPerformed

    private void r2o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2o2ActionPerformed

    private void r2o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2o3ActionPerformed

    private void r2o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2o4ActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        qut2.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       startpane.setVisible(false);stu3.setVisible(true);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       calldata3();
       calculate2();
    }//GEN-LAST:event_next2ActionPerformed

    private void previous2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous2ActionPerformed
        stu2.setVisible(true);
        stu3.setVisible(false);
        calldata2();
        calculate3();
    }//GEN-LAST:event_previous2ActionPerformed

    private void r3o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3o1ActionPerformed

    private void r3o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3o2ActionPerformed

    private void r3o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3o3ActionPerformed

    private void r3o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3o4ActionPerformed

    private void next3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next3ActionPerformed
qut3.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(true);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       startpane.setVisible(false);stu9.setVisible(false);
       stu10.setVisible(false);
       calldata4();
       calculate3();
    }//GEN-LAST:event_next3ActionPerformed

    private void previous3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous3ActionPerformed
        stu3.setVisible(true);
        stu4.setVisible(false);
        calldata3();
        calculate4();
    }//GEN-LAST:event_previous3ActionPerformed

    private void r4o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4o1ActionPerformed

    private void r4o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4o2ActionPerformed

    private void r4o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4o3ActionPerformed

    private void r4o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4o4ActionPerformed

    private void next4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next4ActionPerformed
qut4.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(true);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       startpane.setVisible(false);stu10.setVisible(false);
       calldata5();
       calculate4();
    }//GEN-LAST:event_next4ActionPerformed

    private void previous4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous4ActionPerformed
        stu4.setVisible(true);
        stu5.setVisible(false);
        calldata4();
        calculate5();
    }//GEN-LAST:event_previous4ActionPerformed

    private void r5o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5o1ActionPerformed

    private void r5o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5o2ActionPerformed

    private void r5o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5o3ActionPerformed

    private void r5o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5o4ActionPerformed

    private void next5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next5ActionPerformed
qut5.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       startpane.setVisible(false);stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(true);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       calldata6();
       calculate5();
    }//GEN-LAST:event_next5ActionPerformed

    private void previous5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous5ActionPerformed
        // TODO add your handling code here:
        stu5.setVisible(true);
        stu6.setVisible(false);
        calldata5();
        calculate6();
    }//GEN-LAST:event_previous5ActionPerformed

    private void r6o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6o1ActionPerformed

    private void r6o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6o2ActionPerformed

    private void r6o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6o3ActionPerformed

    private void r6o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6o4ActionPerformed

    private void next6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next6ActionPerformed
       qut6.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(true);
       startpane.setVisible(false);stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       calldata7();
       calculate6();
       
    }//GEN-LAST:event_next6ActionPerformed

    private void previous6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous6ActionPerformed
        stu6.setVisible(true);
        stu7.setVisible(false);
        calldata6();
        calculate7();
    }//GEN-LAST:event_previous6ActionPerformed

    private void r7o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7o1ActionPerformed

    private void r7o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7o2ActionPerformed

    private void r7o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7o3ActionPerformed

    private void r7o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7o4ActionPerformed

    private void next7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next7ActionPerformed
        qut7.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(true);
       stu9.setVisible(false);
       startpane.setVisible(false);stu10.setVisible(false);
       calldata8();
       calculate7();
    }//GEN-LAST:event_next7ActionPerformed

    private void previous7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous7ActionPerformed
        stu7.setVisible(true);
        stu8.setVisible(false);
        calldata7();
        calculate8();
    }//GEN-LAST:event_previous7ActionPerformed

    private void r8o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r8o1ActionPerformed

    private void r8o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r8o2ActionPerformed

    private void r8o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r8o3ActionPerformed

    private void r8o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r8o4ActionPerformed

    private void next8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next8ActionPerformed
qut8.setBackground(Color.red);
       stu1.setVisible(false);
       stu2.setVisible(false);
       startpane.setVisible(false);stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(true);
       stu10.setVisible(false);
       calldata9();
       calculate8();
    }//GEN-LAST:event_next8ActionPerformed

    private void previous8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous8ActionPerformed
        stu8.setVisible(true);
        stu9.setVisible(false);
        calldata8();
        calculate9();
    }//GEN-LAST:event_previous8ActionPerformed

    private void r9o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9o1ActionPerformed

    private void r9o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9o2ActionPerformed

    private void r9o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9o3ActionPerformed

    private void r9o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r9o4ActionPerformed

    private void next9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next9ActionPerformed
qut9.setBackground(Color.red);
        stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       startpane.setVisible(false);stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(true);
       calldata10();
       calculate9();
    }//GEN-LAST:event_next9ActionPerformed

    private void previous9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous9ActionPerformed
        stu9.setVisible(true);
        stu10.setVisible(false);
        calldata9();
        calculate10();
    }//GEN-LAST:event_previous9ActionPerformed

    private void r10o1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10o1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r10o1ActionPerformed

    private void r10o2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10o2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r10o2ActionPerformed

    private void r10o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r10o3ActionPerformed

    private void r10o4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10o4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r10o4ActionPerformed

    private void next10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next10ActionPerformed
       stu1.setVisible(false);
       stu2.setVisible(false);
       stu3.setVisible(false);
       startpane.setVisible(false);stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       submit.setVisible(true);
       qut10.setBackground(Color.red);
    }//GEN-LAST:event_next10ActionPerformed
    
    private void publishingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishingActionPerformed
        
        new submit(mark).setVisible(true);
        dispose();
    }//GEN-LAST:event_publishingActionPerformed
    int second=300;
    Timer timer = new Timer(1000, new ActionListener() {
       int m=4;
       int secon=59;
           @Override
 
           public void actionPerformed(ActionEvent ae) {
               second--;
               secon--;
               if(second==0){
                   //Submit button property
                   new submit().setVisible(true);
               }
               if(secon<1){
                   m--;
                   secon=59;
               }
               min.setText(""+m);
               sec.setText(""+secon);
           }
       });
    private void publishing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishing1ActionPerformed
       qunumpane.setVisible(true);
        stu1.setVisible(true);
       stu2.setVisible(false);
       stu3.setVisible(false);
       stu4.setVisible(false);
       stu5.setVisible(false);
       stu6.setVisible(false);
       stu7.setVisible(false);
       stu8.setVisible(false);
       stu9.setVisible(false);
       stu10.setVisible(false);
       startpane.setVisible(false);submit.setVisible(false);
       calldata1();
       
       
//       System.out.print(quizname);
       timer.start();
    }//GEN-LAST:event_publishing1ActionPerformed
    int mark;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        calculate10();
        for(int i=0;i<10;i++){
            if(userans[i]==adminans[i]){
                mark++;
            }
        }
        quizname = quizname + "result";
        try{  
                Class.forName("com.mysql.jdbc.Driver");  
                java.sql.Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/resultquiz?zeroDateTimeBehavior=convertToNull","root","1234");  
                //here sonoo is database name, root is username and password  
                java.sql.Statement stmt=con.createStatement();
                int rs=stmt.executeUpdate("update "+quizname+" set marks="+mark+" where enroll='"+seroll+"';");  
            }catch(Exception e){ 
//                System.out.print(e);
                JOptionPane.showMessageDialog(null, "Something Wrong!");
                
            } 
        
        
        
        new submit(mark).setVisible(true);
        
        dispose();
//        qunumpane.setVisible(false);3
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentquestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel min;
    private javax.swing.JButton next1;
    private javax.swing.JButton next10;
    private javax.swing.JButton next2;
    private javax.swing.JButton next3;
    private javax.swing.JButton next4;
    private javax.swing.JButton next5;
    private javax.swing.JButton next6;
    private javax.swing.JButton next7;
    private javax.swing.JButton next8;
    private javax.swing.JButton next9;
    private javax.swing.JButton previous;
    private javax.swing.JButton previous1;
    private javax.swing.JButton previous2;
    private javax.swing.JButton previous3;
    private javax.swing.JButton previous4;
    private javax.swing.JButton previous5;
    private javax.swing.JButton previous6;
    private javax.swing.JButton previous7;
    private javax.swing.JButton previous8;
    private javax.swing.JButton previous9;
    private javax.swing.JButton publishing;
    private javax.swing.JButton publishing1;
    private javax.swing.JButton q1;
    private javax.swing.JButton q10;
    private javax.swing.JLabel q1o1;
    private javax.swing.JLabel q1o10;
    private javax.swing.JLabel q1o11;
    private javax.swing.JLabel q1o12;
    private javax.swing.JLabel q1o13;
    private javax.swing.JLabel q1o14;
    private javax.swing.JLabel q1o15;
    private javax.swing.JLabel q1o16;
    private javax.swing.JLabel q1o17;
    private javax.swing.JLabel q1o18;
    private javax.swing.JLabel q1o19;
    private javax.swing.JLabel q1o2;
    private javax.swing.JLabel q1o20;
    private javax.swing.JLabel q1o21;
    private javax.swing.JLabel q1o22;
    private javax.swing.JLabel q1o23;
    private javax.swing.JLabel q1o24;
    private javax.swing.JLabel q1o25;
    private javax.swing.JLabel q1o26;
    private javax.swing.JLabel q1o27;
    private javax.swing.JLabel q1o28;
    private javax.swing.JLabel q1o29;
    private javax.swing.JLabel q1o3;
    private javax.swing.JLabel q1o30;
    private javax.swing.JLabel q1o31;
    private javax.swing.JLabel q1o32;
    private javax.swing.JLabel q1o33;
    private javax.swing.JLabel q1o34;
    private javax.swing.JLabel q1o35;
    private javax.swing.JLabel q1o36;
    private javax.swing.JLabel q1o37;
    private javax.swing.JLabel q1o38;
    private javax.swing.JLabel q1o39;
    private javax.swing.JLabel q1o4;
    private javax.swing.JLabel q1o40;
    private javax.swing.JLabel q1o5;
    private javax.swing.JLabel q1o6;
    private javax.swing.JLabel q1o7;
    private javax.swing.JLabel q1o8;
    private javax.swing.JLabel q1o9;
    private javax.swing.JButton q2;
    private javax.swing.JButton q3;
    private javax.swing.JButton q4;
    private javax.swing.JButton q5;
    private javax.swing.JButton q6;
    private javax.swing.JButton q7;
    private javax.swing.JButton q8;
    private javax.swing.JButton q9;
    private javax.swing.JLabel qnum1;
    private javax.swing.JLabel qnum10;
    private javax.swing.JLabel qnum2;
    private javax.swing.JLabel qnum3;
    private javax.swing.JLabel qnum4;
    private javax.swing.JLabel qnum5;
    private javax.swing.JLabel qnum6;
    private javax.swing.JLabel qnum7;
    private javax.swing.JLabel qnum8;
    private javax.swing.JLabel qnum9;
    private javax.swing.JTextArea question1;
    private javax.swing.JTextArea question10;
    private javax.swing.JTextArea question2;
    private javax.swing.JTextArea question3;
    private javax.swing.JTextArea question4;
    private javax.swing.JTextArea question5;
    private javax.swing.JTextArea question6;
    private javax.swing.JTextArea question7;
    private javax.swing.JTextArea question8;
    private javax.swing.JTextArea question9;
    private javax.swing.JPanel qunumpane;
    private javax.swing.JPanel qut1;
    private javax.swing.JPanel qut10;
    private javax.swing.JPanel qut2;
    private javax.swing.JPanel qut3;
    private javax.swing.JPanel qut4;
    private javax.swing.JPanel qut5;
    private javax.swing.JPanel qut6;
    private javax.swing.JPanel qut7;
    private javax.swing.JPanel qut8;
    private javax.swing.JPanel qut9;
    private javax.swing.JRadioButton r10o1;
    private javax.swing.JRadioButton r10o2;
    private javax.swing.JRadioButton r10o3;
    private javax.swing.JRadioButton r10o4;
    private javax.swing.JRadioButton r1o1;
    private javax.swing.JRadioButton r1o2;
    private javax.swing.JRadioButton r1o3;
    private javax.swing.JRadioButton r1o4;
    private javax.swing.JRadioButton r2o1;
    private javax.swing.JRadioButton r2o2;
    private javax.swing.JRadioButton r2o3;
    private javax.swing.JRadioButton r2o4;
    private javax.swing.JRadioButton r3o1;
    private javax.swing.JRadioButton r3o2;
    private javax.swing.JRadioButton r3o3;
    private javax.swing.JRadioButton r3o4;
    private javax.swing.JRadioButton r4o1;
    private javax.swing.JRadioButton r4o2;
    private javax.swing.JRadioButton r4o3;
    private javax.swing.JRadioButton r4o4;
    private javax.swing.JRadioButton r5o1;
    private javax.swing.JRadioButton r5o2;
    private javax.swing.JRadioButton r5o3;
    private javax.swing.JRadioButton r5o4;
    private javax.swing.JRadioButton r6o1;
    private javax.swing.JRadioButton r6o2;
    private javax.swing.JRadioButton r6o3;
    private javax.swing.JRadioButton r6o4;
    private javax.swing.JRadioButton r7o1;
    private javax.swing.JRadioButton r7o2;
    private javax.swing.JRadioButton r7o3;
    private javax.swing.JRadioButton r7o4;
    private javax.swing.JRadioButton r8o1;
    private javax.swing.JRadioButton r8o2;
    private javax.swing.JRadioButton r8o3;
    private javax.swing.JRadioButton r8o4;
    private javax.swing.JRadioButton r9o1;
    private javax.swing.JRadioButton r9o2;
    private javax.swing.JRadioButton r9o3;
    private javax.swing.JRadioButton r9o4;
    private javax.swing.JLabel sec;
    private javax.swing.JPanel startpane;
    private javax.swing.JPanel stu1;
    private javax.swing.JPanel stu10;
    private javax.swing.JPanel stu2;
    private javax.swing.JPanel stu3;
    private javax.swing.JPanel stu4;
    private javax.swing.JPanel stu5;
    private javax.swing.JPanel stu6;
    private javax.swing.JPanel stu7;
    private javax.swing.JPanel stu8;
    private javax.swing.JPanel stu9;
    private javax.swing.JPanel submit;
    // End of variables declaration//GEN-END:variables

    private static class timer {

        public timer() {
        }
    }
}
