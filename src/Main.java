import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //layout Manager = defines the natural layout for components within a container

        // 3 common managers

        // BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, EAST, CENTER
        //                All extra space is places in the center area


        //1. Create JFrame 1. a)
        //JFrame is used to host simple elements, think of it as a book
        //Instantiating means to = > call the constructor of a class that creates an instance or object of the type of that class
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what will happen on default when user initiates a CLOSE on this frame
        frame.setSize(500,500); // Resizes this component
        frame.setVisible(true); // Method makes frame appear on screen
        // 1. b) Set up the frame with the border layout
        frame.setLayout(new BorderLayout(10,10));

        //2. Instantiating a Class , creating an object 2. a)
        //JPanel is a type of a conteiner designed to hold a group of components so they can be displayed in a frame.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //2. b) Set Color for panel
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.RED);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.YELLOW);

        //2.c) Add panel size
        panel1.setPreferredSize(new Dimension(100,100) );
        panel2.setPreferredSize(new Dimension(100,100) );
        panel3.setPreferredSize(new Dimension(100,100) );
        panel4.setPreferredSize(new Dimension(100,100) );
        panel5.setPreferredSize(new Dimension(100,100) );

        //3. After adding the size and color of the panel add the panel to our frame
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
        // =============================================================================================================================
        //JPanel inside a JPanel / sub panels
        //Conteiner inside a conteiner, they use the flow manager

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        //2. b) Set Color for panel
        panel6.setBackground(Color.WHITE);
        panel7.setBackground(Color.LIGHT_GRAY);
        panel8.setBackground(Color.PINK);
        panel9.setBackground(Color.GRAY);
        panel10.setBackground(Color.ORANGE);

        panel5.setLayout(new BorderLayout());// IMPORTANT

        //2.c) Add panel size
        panel6.setPreferredSize(new Dimension(50,50) );
        panel7.setPreferredSize(new Dimension(50,50) );
        panel8.setPreferredSize(new Dimension(50,50) );
        panel9.setPreferredSize(new Dimension(50,50) );
        panel10.setPreferredSize(new Dimension(50,50) );


        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.WEST);
        panel5.add(panel10,BorderLayout.CENTER);


    }
}