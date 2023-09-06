
/**
 * @author Leticia
 */

import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.*;

public class AdicionarAlunoEvento implements ActionListener {

    private List<Aluno> alunos;
    private List<TextField> campos;

    private final int INDEX_NOME = 0;
    private final int INDEX_IDADE = 1;
    private final int INDEX_ENDERECO = 2;

    public AdicionarAlunoEvento(List<Aluno> listAlunos, List<TextField> listCampos) {
        super();

        alunos = listAlunos;
        campos = listCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = campos.get(INDEX_NOME).getText();
        String endereco = campos.get(INDEX_ENDERECO).getText();
        int idade = Integer.parseInt(campos.get(INDEX_IDADE).getText());

        Aluno aluno = new Aluno(endereco, idade, nome);
        alunos.add(aluno);

        new LimparCamposEvento(campos).actionPerformed(e);
    }
}