
/*
 * @author Leticia e Caroline
 */

import java.awt.event.*;
import java.util.*;
import java.awt.Component;

import javax.swing.*;

public class MostrarPessoaEvento implements ActionListener {

    private Pessoa UmaPessoa;

    public MostrarPessoaEvento(Pessoa _pessoa) {
        super();

        UmaPessoa = _pessoa;
    }

    // @Override
    public void actionPerformed(ActionEvent e) {
        String mensagem = "";

        mensagem += UmaPessoa.toString() + "\n";

        UmaPessoa = new Pessoa();

        JOptionPane.showMessageDialog(null, mensagem);

    }

}