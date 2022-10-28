package org.example.janela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TarefasJanela extends JFrame {

    JLabel label = new JLabel();
    JButton tarefaBtt = new JButton();
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

        tarefaBtt.setText("Nova Tarefa");

        panel.add(label);
        panel.add(tarefaBtt);
        add(panel);
    }
}