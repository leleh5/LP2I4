
/**
 * @author Leticia
 */

import java.awt.event.*;
import java.util.*;
import java.awt.Component;

import javax.swing.*;

public class MostrarAlunoEvento implements ActionListener {

    private List<Aluno> alunos;

    public MostrarAlunoEvento(List<Aluno> listAlunos) {
        super();

        alunos = listAlunos;
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";

        for (Aluno aluno : alunos) {
            mensagem += aluno.toString() + "\n";
        }

        if (alunos.size() == 0) {
            mensagem = "Sem registros";
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }

}