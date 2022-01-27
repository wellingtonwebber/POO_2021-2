package Aula14.apresentacao;

import Aula14.negocio.Veiculo;
import Aula14.persistencia.ControlaVeiculo;

import javax.swing.*;

public class Principal extends javax.swing.JFrame {

    private JTextField tfdNome;
    private JTextField tfdMarca;
    private JButton btnVerTodos;
    private JButton btnSalvar;
    private JButton btnSair;

    ControlaVeiculo cv = new ControlaVeiculo();

    public Principal(){
        frameInit();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt){
        System.exit(0);
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt){
        Veiculo veiculo = new Veiculo();

        veiculo.setNome(tfdNome.getText());
        veiculo.setMarca(tfdMarca.getText());

        if (cv.salvar(veiculo)){
            JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso.");
            tfdNome.setText("");
            tfdMarca.setText("");
            tfdNome.requestFocus();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar veiculo");
        }

    }


}

