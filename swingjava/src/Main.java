import javax.swing.*;

public class Main
{
    public static void main(String[] args) {


        //        make a object of JFRAME
        JFrame fram=new JFrame();




//        if you want to see the frame the set the visible value True

        fram.setVisible(true);//but if you want to close then it not terminate the program

        fram.setBounds(100,100,1000,500);// setbound provide the height and width or position in the screen


//        close or program termination when click on close
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("hello java");
    }
}