
/*
 * @author Leticia e Caroline
 */

import java.awt.event.*;
import java.util.*;
import java.awt.Component;

import javax.swing.*;

public class MostrarPessoaEvento implements ActionListener {

    private List<Pessoa> pessoas;

    public MostrarPessoaEvento(List<Pessoa> listPessoas) {
        super();

        pessoas = listPessoa;
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";

        for (Pessoas pessoa : pessoas) {
            mensagem += pessoa.toString() + "\n";
        }

        if (pessoas.size() == 0) {
            mensagem = "Sem registros";
        }

        JOptionPane.showMessageDialog(null, mensagem);

    }

}