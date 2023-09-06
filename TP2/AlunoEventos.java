
/**
 * @author Leticia
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class AlunoEventos implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().toString().contains("Sair")) {
            System.exit(0);
        }
    }
}