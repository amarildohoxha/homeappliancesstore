
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class homeappliancesstore{






    public static void main(String[] args){

        JFrame frame = new JFrame("Devices");

        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 15));


        JLabel fridge = new JLabel("Fridge :");
        JTextField field1 = new JTextField(20);
        JLabel oven = new JLabel("Oven :");
        JTextField field2 = new JTextField(20);
        JLabel washing = new JLabel("Washingmachine :");
        JTextField field3 = new JTextField(15);
        JLabel air = new JLabel("Aircondition :");
        JTextField field4 = new JTextField(20);
        frame.add(fridge);
        frame.add(field1);
        frame.add(oven);
        frame.add(field2);
        frame.add(washing);
        frame.add(field3);
        frame.add(air);
        frame.add(field4);

        JButton but = new JButton("Submit");
        but.setBounds(200, 375, 50, 50);
        frame.add(but);

        but.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String string;
                String ek;
                int oven = 0;
                int fridge = 0;
                int wash = 0;
                int air = 0;
                fridge = Integer.parseInt(field1.getText());
                oven = Integer.parseInt(field2.getText());
                wash = Integer.parseInt(field3.getText());
                air = Integer.parseInt(field4.getText());


                Fridge fridgearray[] = new Fridge[fridge];

                AirCondition airconditionarray[] = new AirCondition[air];

                Oven ovenarray[] = new Oven[oven];
                WashineMachine washinemachinearray[] = new WashineMachine[wash];

//dhmhiorgia antikimenon  basi ton dedomenon//
                for (int i = 0; i < fridgearray.length; i++) {
                    fridgearray[i] = new Fridge(50 + i, 160 + i, 40 + i, 40 + i, "Bosch", "Coolx3", "Psygeio", true, true, false, false, true);
                }
                for (int i = 0; i < ovenarray.length; i++) {
                    ovenarray[i] = new Oven(45 + i, 65 + i, 50 + i, 80 + i, "Pitsos", "mly800", "Hl.Kouzhna", "Keramhkes", true, 7, 66, false);
                }

                for (int i = 0; i < airconditionarray.length; i++) {
                    airconditionarray[i] = new AirCondition(20 + i, 25 + i, 15 + i, 60 + i, "Samsung", "maxair", "Air condition", true, true, true, true, 60);
                }

                for (int i = 0; i < washinemachinearray.length; i++) {
                    washinemachinearray[i] = new WashineMachine(40, 60, 35, 45, "Bloomberg", "Tr330", "Plynthrio", true, true, true, true, 55);
                }

                //kathe event exei thn methodo getSource() h opoia bohthai na kseroume poio koumpi exei patithi
                // eno edo to xrisimopoio gia na ksero pote patithike to koumpi kai na emfanizh to mhnhm//
                if (e.getSource() == but) {
                    //klino to frame dhl. to proto grafiko me tous eisagoghs//
                    frame.dispose();
                    ek = String.format("EPITIXIS EGRAFIS\n\nFridges: %d\nWashingMachines: %d\nOvens: %d\nAirCondition: %d",fridge,wash,oven,air );
                    JOptionPane.showMessageDialog(null, ek);

                }
                System.out.println("EPITIXIS EGRAFI SYSKEBON");



                JFrame f = new JFrame("DEVICES CREATED");
                JTextArea area=new JTextArea("Fridges: " +Fridge.getMetrisi() +"\n" +"Ovens: "+Oven.metrisi +"\n" +"Washingmachines: " + WashineMachine.metrisi + "\n" +"AirConditio: " + AirCondition.getMetrisi() );
                area.setBounds(10,30, 200,200);
                f.add(area);
                f.setSize(300,300);
                f.setLocationRelativeTo(null);
                f.setLayout(null);
                f.setVisible(true);



            }

        });


        frame.setSize(350, 300); // Set the frame size
        frame.setLocationRelativeTo(null);// Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


}}



