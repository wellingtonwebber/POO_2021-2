package Projeto_final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LivrariaGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel labelTitle;
    private JButton btnCadastro;
    private JButton btnPesquisar;
    private JTextField tfTitulo;
    private JTextField tfAutor;
    private JTextField tfGenero;
    private JLabel titulo;
    private JLabel autor;
    private JLabel genero;
    private JButton btnClear;
    private JLabel show;
    private CadastraLivro cl = new CadastraLivro();

    public LivrariaGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setVisible(true);
        this.setSize(500, 500);
        show.setText(" ");

        btnCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Livro livro = new Livro();
                livro.setTitulo(tfTitulo.getText());
                livro.setAutor(tfAutor.getText());
                livro.setGenero(tfGenero.getText());

                if(cl.cadastrar(livro)){
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    tfTitulo.setText("");
                    tfAutor.setText("");
                    tfGenero.setText("");
                    tfTitulo.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro!");
                }
            }
        });

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Livro> l = cl.retornaTodos();
                String pesquisa = tfTitulo.getText();

                for(int i = 0; i < l.size(); i++){
                   if(pesquisa.equals(l.get(i).getTitulo())){
                       String showAux = "Título: " + l.get(i).getTitulo() + "\n - Autor: " + l.get(i).getAutor() + "\n - Genero: " +
                               l.get(i).getGenero();
                       JOptionPane.showMessageDialog(null, "Vizualize o resultado na linha abaixo");
                       show.setText(showAux);
                       break;
                   }else{
                       JOptionPane.showMessageDialog(null, "Pesquisa não encontrou livros");
                       show.setText(" ");
                   }
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfTitulo.setText("");
                tfAutor.setText("");
                tfGenero.setText("");
            }
        });
    }

    public static void main(String[] args) {

        LivrariaGUI livraria = new LivrariaGUI("livraria");

    }

}
