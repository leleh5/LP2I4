/*
 * @author Leticia e Caroline
 */

import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.*;

public class AdicionarPessoaEvento implements ActionListener {

    private List<Pessoa> pessoas;
    private List<TextField> campos;

    private final int INDEX_NUMERO = 0;
    private final int INDEX_NOME = 1;
    private final int INDEX_SEXO = 2;
    private final int INDEX_IDADE = 3;

    public AdicionarPessoaEvento(List<Pessoa> listPessoas, List<TextField> listCampos) {
        super();

        pessoas = listPessoas;
        campos = listCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numero = Integer.parseInt(campos.get(INDEX_NUMERO).getText());
        String nome = campos.get(INDEX_NOME).getText();
        String sexo = campos.get(INDEX_SEXO).getText();
        int idade = Integer.parseInt(campos.get(INDEX_IDADE).getText());

        Pessoa pessoa = new Pessoa(numero, nome, sexo, idade);
        pessoas.add(pessoa);

        new LimparCamposEvento(campos).actionPerformed(e);
    }
}