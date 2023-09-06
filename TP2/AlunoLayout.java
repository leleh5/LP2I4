
/**
 * @author Leticia
 */

import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class AlunoLayout extends Frame {
    private static List<Aluno> alunos;

    public static void main(String[] args) {
        alunos = new ArrayList<Aluno>();

        Button ok = new Button("Ok");
        Button limpar = new Button("Limpar");
        Button mostrar = new Button("Mostrar");
        Button sair = new Button("Sair");
        TextField text_nome = new TextField(10);
        TextField text_idade = new TextField(10);
        TextField text_endereco = new TextField(10);

        AlunoEventos evento = new AlunoEventos();

        sair.addActionListener(evento);

        List<TextField> campos = new ArrayList<TextField>();
        campos.add(text_nome);
        campos.add(text_idade);
        campos.add(text_endereco);

        limpar.addActionListener(new LimparCamposEvento(campos));
        ok.addActionListener(new AdicionarAlunoEvento(alunos, campos));
        mostrar.addActionListener(new MostrarAlunoEvento(alunos));

        Frame f = new Frame("BoxLayout");
        f.setSize(400, 180);
        f.addWindowListener(new FechaJanela());
        f.setLayout(new BorderLayout());
        Panel painel1 = new Panel();
        painel1.setLayout(new GridLayout(3, 2, 10, 10));
        painel1.add(new Label("Nome:"));
        painel1.add(text_nome);
        painel1.add(new Label("Idade:"));
        painel1.add(text_idade);
        painel1.add(new Label("Endereco:"));
        painel1.add(text_endereco);
        f.add(painel1, BorderLayout.CENTER);
        Panel painel2 = new Panel();
        painel2.setLayout(new GridLayout(1, 4, 10, 10));
        painel2.add(ok);
        painel2.add(limpar);
        painel2.add(mostrar);
        painel2.add(sair);
        f.add(painel2, BorderLayout.SOUTH);
        f.show();
    }
}