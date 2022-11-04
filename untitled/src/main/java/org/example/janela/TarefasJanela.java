package org.example.janela;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarefasJanela extends JFrame {

    JLabel label = new JLabel();
    JButton tarefaBtt = new JButton();

    JPanel panel2 = new JPanel();

    JRadioButton radioButton = new JRadioButton("comprar leite");

    public TarefasJanela(){
        setTitle("Tarefas");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        label.setText("Caixa de entrada");
        label.setPreferredSize( new Dimension(270, 80));

        tarefaBtt.setText("Nova Tarefa");



        Border blackline;
        blackline = BorderFactory.createLineBorder(Color.black);
        panel2.setBorder(blackline);
        panel2.setPreferredSize( new Dimension(300, 40));
        radioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel2.add(radioButton);


        panel.add(label);
        panel.add(tarefaBtt);
        panel.add(panel2);
        add(panel);
    }
}