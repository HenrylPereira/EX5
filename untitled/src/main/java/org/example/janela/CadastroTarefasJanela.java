package org.example.janela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CadastroTarefasJanela extends JFrame {

    private String[] opcoes = {"Fácil","Medil","Difícil"};
    JComboBox opcoesComboBox = new JComboBox<>();
    JTextArea tarefaTextArea = new JTextArea();
    JLabel tarefasLabel = new JLabel();
    JLabel prioridadeLabel = new JLabel();
    JCheckBox finalizadoCheck = new JCheckBox();
    JButton calcularCancelar = new JButton();
    JButton calcularSalvar = new JButton();

    public CadastroTarefasJanela(){
        setTitle("Cadastro de Tarefas");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        tarefasLabel = new JLabel();
        prioridadeLabel = new JLabel();
        tarefaTextArea = new JTextArea();

        tarefasLabel.setText("Tarefa: ");
        prioridadeLabel.setText("Prioridade: ");

        tarefaTextArea = new JTextArea();
        tarefaTextArea.setColumns(25);
        tarefaTextArea.setRows(3);
        tarefaTextArea.setLineWrap(true);
        tarefaTextArea.setBorder(BorderFactory.createLineBorder(Color.black));

        opcoesComboBox = new JComboBox<>(opcoes);
        opcoesComboBox.setPreferredSize( new Dimension(260,30));

        finalizadoCheck = new JCheckBox("Finalizado");
        finalizadoCheck.setPreferredSize( new Dimension(300,30));

        calcularCancelar = new JButton("Cancelar");
        calcularSalvar = new JButton("Salvar");
        calcularSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });



        panel.add(tarefasLabel);
        panel.add(tarefaTextArea);
        panel.add(prioridadeLabel);
        panel.add(opcoesComboBox);
        panel.add(finalizadoCheck);
        panel.add(calcularCancelar);
        panel.add(calcularSalvar);

        add(panel);
    }

    private void calcularResultado() {
        String tarefa = tarefaTextArea.getText();
    }
}