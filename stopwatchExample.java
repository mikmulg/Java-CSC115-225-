// include required packges

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

//GUI interface for StopWatch

class GUIstopwwatch extends JPanel{

     // Declare the required GUI components

    private JLabel swtime = new JLabel("0:0:0", JLabel.CENTER);

     private Stopwatch swtimer;

     private JButton swstart;

     private JButton swstop;

     private JButton swclear;

     // declare variables

     private int swcount = 0;

     JPanel swpan, swpan1, swpan2;

     // constructor

     public GUIstopwwatch()

     {

          // intialize the GUI components

swtime.setFont(new Font("Courier New", Font.BOLD, 60));

          swpan = new JPanel(new BorderLayout());

          swpan1 = new JPanel(new GridLayout(1, 1, 20, 30));

          swpan2 = new JPanel(new GridLayout(1, 2, 30, 30));

          swtimer = new Stopwatch(this);

          swstart = new JButton("Start");

          swstop = new JButton("Stop");

          swclear = new JButton("Reset");

          swstart.addActionListener(new tmrStarts());

          swstop.addActionListener(new tmrStarts());

          swclear.addActionListener(new tmrStarts());

          swpan1.add(swtime);

          swpan2.add(swstart);

          swpan2.add(swstop);

          swpan2.add(swclear);

          swpan.add(swpan1, BorderLayout.CENTER);

          swpan.add(swpan2, BorderLayout.SOUTH);

          add(swpan);

     }

     // method to compute the time

     public void update(long swdT)

     {

          // Code to display normal timer

//swtime.setText(String.valueOf((swdT / 600000) % 60) + ":" + String.valueOf((swdT / 60000) % 60) + ":" + String.valueOf((swdT / 1000) % 60));

        

          // Each tenth second will increase the tier value

swtime.setText(String.valueOf((swdT / 100000) % 10) + ":" + String.valueOf((swdT / 10000) % 10)

                   + ":" + String.valueOf((swdT / 1000) % 10));

     }

     // ActionListener interface Implementation

     public class tmrStarts implements ActionListener

     {

          public void actionPerformed(ActionEvent event)

          {

              // Check the click event source is swstart

              if (event.getSource() == swstart)

              {

                   if (swcount == 0)

                   {

                        swtimer.startTimer();

                        swstart.setText("Pause");

                        swcount++;

                   }

                   else if (swcount == 1)

                   {

                        swtimer.pauseTimer();

                        swstart.setText("Resume");

                        swcount++;

                   }

                   else if (swcount == 2)

                   {

                        swtimer.startTimer();

                        swstart.setText("Start");

                        swcount = 0;

                   }

              }

             

              // Check the click event source is swstop

              if (event.getSource() == swstop)

              {

                   swtimer.stopTimer();

                   swstart.setText("Start");

              }

             

              // Check the click event source is clear

              if (event.getSource() == swclear)

              {

                   swtimer.stopTimer();

                   swstart.setText("Start");

                   swcount = 0;

                   swtime.setText("0:0:0");

              }

          }

     }

}

//StopWatch Implementation class extending from thread class

public class Stopwatch extends Thread

{

     // Declare the required variables

     private Thread swrunThread;

     private boolean swrunning = false;

     private boolean swpaused = false;

     private GUIstopwwatch swtimeFrame;

     private long swsmdTime = 0;

     // Constructor

     public Stopwatch(GUIstopwwatch swtimeFrame)

     {

          this.swtimeFrame = swtimeFrame;

     }

     // main method to perform the stop watch operation

     public static void main(String[] args)

     {

          GUIstopwwatch swtobj = new GUIstopwwatch();

          JFrame swf = new JFrame("Count-Up Stop Watch");

          swf.setSize(300, 200);

          swf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          swf.setLocationRelativeTo(null);

          swf.getContentPane().add(swtobj);

          swf.setVisible(true);

     }

     // methof to start the timer

     public void startTimer()

     {

          swrunning = true;

          swpaused = false;

          // start thread

          swrunThread = new Thread(this);

          swrunThread.start();

     }

     // method to pause timer

     public void pauseTimer()

     {

          // pause timer

          swpaused = true;

     }

     //method to stop timer

     public void stopTimer()

     {

          // stop the timer

          swrunning = false;

          swpaused = false;

     }

     @Override

     public void run()

     {

          long startTime = System.currentTimeMillis();

// Method to show the time difference until press pause or stop

          while (swrunning && !swpaused)

          {

swtimeFrame.update(swsmdTime + (System.currentTimeMillis() - startTime));

          }

          // pause timer and store the change

          if (swpaused)

swsmdTime += System.currentTimeMillis() - startTime;

          else

              swsmdTime = 0;

     }

}