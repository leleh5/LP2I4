
/* @author Leticia e Caroline
 */

import java.awt.*;
import java.util.*;
import java.util.List;
import java.awt.event.*;

import javax.swing.*;

public class LimparCamposEvento implements ActionListener {

    private List<TextField> campos;

    public LimparCamposEvento(List<TextField> arrayCampos) {
        super();

        campos = arrayCampos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (TextField jTextField : campos) {
            jTextField.setText("");
        }
    }

}
