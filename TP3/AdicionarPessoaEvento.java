/*
 * @author Leticia e Caroline
 */

import java.awt.event.*;
import java.awt.*;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.*;

public class AdicionarPessoaEvento implements ActionListener {

    private Pessoa UmaPessoa;
    private List<TextField> campos;

    private final int INDEX_NUMERO = 0;
    private final int INDEX_NOME = 1;
    private final int INDEX_SEXO = 2;
    private final int INDEX_IDADE = 3;

    public AdicionarPessoaEvento(Pessoa _UmaPessoa, List<TextField> listCampos) {
        super();

        UmaPessoa = _UmaPessoa;
        campos = listCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String _nome = campos.get(INDEX_NOME).getText();
            String _sexo = campos.get(INDEX_SEXO).getText();
            String _idade = campos.get(INDEX_IDADE).getText();

            if (_nome.trim().equals("") || _sexo.trim().equals("") || _idade.trim().equals("")) {
                throw new Mensagem_Erro("Algum campo nao digitado, favor rever o preenchimento dos mesmos.");
            }

            String nome = _nome;
            char sexo = _sexo.charAt(0);
            int idade = Integer.parseInt(_idade);

            if (sexo != 'F' && sexo != 'M') {
                throw new Mensagem_Erro("O campo sexo deve ser preenchido somente com o valor 'F' ou 'M'.");
            }

            UmaPessoa.setIdade(idade);
            UmaPessoa.setNome(nome);
            UmaPessoa.setSexo(sexo);
            UmaPessoa.setKp();

            new LimparCamposEvento(campos).actionPerformed(e);
        } catch (Mensagem_Erro excecao) {
            JOptionPane.showMessageDialog(null, excecao.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }
}