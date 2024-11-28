import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main
{
    public static void main(String[] args) {

        //        make a object of JFRAME
        JFrame fram=new JFrame();




//        if you want to see the frame the set the visible value True

        fram.setVisible(true);//but if you want to close then it not terminate the program

        fram.setBounds(0,0,1080,1080);// setbound provide the height and width or position in the screen


//        close or program termination when click on close
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//   set title in frame
        fram.setTitle("My new project");


        System.out.println("first");
//     set icon in frame and mostly provide absolute path of image
        ImageIcon im=new ImageIcon("p.png");
        fram.setIconImage(im.getImage());

        System.out.println("hello");

//        background color and conatiner is in java.awt.*
        Container c=fram.getContentPane();
//        c.setBackground(Color.red);

//        resizable window

        fram.setResizable(true);  //default

        System.out.println("hgvgsha");

//        set text
        c.setLayout(null);
        JLabel jl=new JLabel();
        jl.setBounds(100,50,100,30);
        jl.setText("hello");
        c.add(jl);
        ImageIcon icon=new ImageIcon("p.png");
        JLabel label=new JLabel(icon);
        label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        System.out.println("end");

    }
}