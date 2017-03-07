package com.hb;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.sql.*;
import java.util.Scanner;

public class Main extends Frame{
    Scanner sc;
    Panel p1;
    TextField[] textf;


    public Main(){
        p1 = new Panel();
        Panel p2 = new Panel(new GridLayout(5,1));

        Button[] bttns = new Button[5];
        String[] menus = {"List","add","Edit","Delete","EXIT"};
        for(int i=0; i<bttns.length; i++){
            bttns[i]=new Button(menus[i]);
            bttns[i].setFont(new Font("Consolas",Font.BOLD,22));
            p2.add(bttns[i]);
            bttns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.getActionCommand()+":버튼눌림");
                    if(e.getActionCommand().equals("EXIT")){
                        System.exit(0);
                    }else if(e.getActionCommand().equals("List")){
                        list();
                    }else if(e.getActionCommand().equals("add")){
                        insert();
                    }else if(e.getActionCommand().equals("Edit")){

                    }else if(e.getActionCommand().equals("Delete")){

                    }
                }
            });
        }


//        add(BorderLayout.CENTER,p1);
        add(BorderLayout.EAST,p2);
        this.setBounds(1600+200, 200, 500,400);
        this.setVisible(true);
    }
    public void insert(){
//        p1.setVisible(false);
        System.out.println("입력폼 띄우기");
        Panel p2= new Panel(new GridLayout(6,2));
        String[] la = {"num:","name:","kor:","eng","math"};
        Label[] label = new Label[la.length];
        textf =new TextField[la.length];
        for(int i=0; i<la.length ; i++) {
            label[i] = new Label(la[i]);
            textf[i] = new TextField(15);
            p2.add(label[i]);
            p2.add(textf[i]);
        }
        Button send= new Button("insert");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertDB();
            }
        });
        p2.add(send);

        add(BorderLayout.CENTER,p2);
        p2.setVisible(true);
        this.revalidate();
    }
    public void insertDB(){
        String sql = "insert into stu02 values (";
        sql+=textf[0].getText()+",'"+textf[1].getText()+"',";
        sql+=textf[2].getText()+","+textf[3].getText()+","+textf[4].getText()+")";
        System.out.println(sql);
    }
    public void list(){
        String sql = "select * from stu02";
        String url ="jdbc:oracle:thin:@localhost:1521:xe";
        String id= "scott";
        String pw="tiger";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conn = DriverManager.getConnection(url, id, pw);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("---------------------------------------------------");
            System.out.println("학번\t이름\t국어\t영어\t수학");
            System.out.println("---------------------------------------------------");
            while(rs.next()){
                System.out.print(rs.getInt("num"));
                System.out.print('\t');
                System.out.print(rs.getString("name"));
                System.out.print('\t');
                System.out.print(rs.getInt("kor"));
                System.out.print('\t');
                System.out.print(rs.getInt("eng"));
                System.out.print('\t');
                System.out.println(rs.getInt("math"));
            }
            System.out.println("---------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public int menu(){
        System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료");
        return sc.nextInt();
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("학생 성적 관리 프로그램 v7.0.1");
        new Main();
    }
}
