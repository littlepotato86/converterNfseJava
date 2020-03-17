package com.aldeiaconsultoriajr.conversor;

import com.constanzooficial.integracao.util.UtilZip;
import com.constanzooficial.integracao.view.ViewNotaMunicipal;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Yuri Fernandes de Oliveira
 */
public class telaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewDemo
     */
    public telaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            Image iconePrograma = ImageIO.read(getClass().getResourceAsStream("/res/iconeNFSe.png"));
            this.setIconImage(iconePrograma);

            BufferedImage iconeAbrirArquivo = ImageIO.read(getClass().getResourceAsStream("/res/iconeAbrirArquivo.png"));
            Image dimg = iconeAbrirArquivo.getScaledInstance(btnSelecaoArquivo.getWidth() - 15, btnSelecaoArquivo.getHeight() - 10, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            btnSelecaoArquivo.setIcon(imageIcon);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnConverterArquivo = new javax.swing.JButton();
        comboMunicipio = new javax.swing.JComboBox<>();
        campoCaminhoArquivo = new javax.swing.JTextField();
        btnSelecaoArquivo = new javax.swing.JButton();
        radioEmitidas = new javax.swing.JRadioButton();
        radioRecebidas = new javax.swing.JRadioButton();
        btnConsiderarISS = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConversor = new javax.swing.JMenu();
        menuNfseMunicipais = new javax.swing.JMenuItem();
        menuEmpresasEspecificas = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de NFSe Municipal");
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        btnConverterArquivo.setText("Converter Arquivo");
        btnConverterArquivo.setEnabled(false);
        btnConverterArquivo.setMargin(new java.awt.Insets(50, 50, 50, 50));
        btnConverterArquivo.setMaximumSize(new java.awt.Dimension(120, 40));
        btnConverterArquivo.setMinimumSize(new java.awt.Dimension(120, 40));
        btnConverterArquivo.setPreferredSize(new java.awt.Dimension(120, 40));
        btnConverterArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterArquivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConverterArquivo);
        btnConverterArquivo.setBounds(170, 70, 230, 30);

        comboMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Município", "Agrolândia - SC", "Canoas - RS", "Ibaiti - PR", "Rio Verde - GO", "Salvador - BA", "Vila Velha - ES" }));
        comboMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMunicipioActionPerformed(evt);
            }
        });
        jPanel1.add(comboMunicipio);
        comboMunicipio.setBounds(10, 10, 140, 30);

        campoCaminhoArquivo.setEditable(false);
        campoCaminhoArquivo.setText("Selecione um município");
        campoCaminhoArquivo.setFocusable(false);
        jPanel1.add(campoCaminhoArquivo);
        campoCaminhoArquivo.setBounds(160, 10, 270, 30);

        btnSelecaoArquivo.setToolTipText("");
        btnSelecaoArquivo.setBorderPainted(false);
        btnSelecaoArquivo.setEnabled(false);
        btnSelecaoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecaoArquivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelecaoArquivo);
        btnSelecaoArquivo.setBounds(420, 10, 40, 30);

        btnGroupTipo.add(radioEmitidas);
        radioEmitidas.setText("NFSe Emitidas");
        radioEmitidas.setEnabled(false);
        radioEmitidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmitidasActionPerformed(evt);
            }
        });
        jPanel1.add(radioEmitidas);
        radioEmitidas.setBounds(10, 60, 120, 25);

        btnGroupTipo.add(radioRecebidas);
        radioRecebidas.setText("NFSe Recebidas");
        radioRecebidas.setEnabled(false);
        radioRecebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRecebidasActionPerformed(evt);
            }
        });
        jPanel1.add(radioRecebidas);
        radioRecebidas.setBounds(10, 80, 120, 25);

        btnConsiderarISS.setText("Considerar ISS");
        btnConsiderarISS.setEnabled(false);
        btnConsiderarISS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsiderarISSActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsiderarISS);
        btnConsiderarISS.setBounds(10, 100, 130, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 470, 130);

        menuConversor.setText("Conversor");

        menuNfseMunicipais.setText("NFSe Municipais");
        menuNfseMunicipais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNfseMunicipaisActionPerformed(evt);
            }
        });
        menuConversor.add(menuNfseMunicipais);

        menuEmpresasEspecificas.setText("Empresas Específicas");
        menuEmpresasEspecificas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpresasEspecificasActionPerformed(evt);
            }
        });
        menuConversor.add(menuEmpresasEspecificas);

        jMenuBar1.add(menuConversor);

        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSobre);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterArquivoActionPerformed

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String path = campoCaminhoArquivo.getText();
        File f = new File(path);
        String destino = f.getAbsolutePath().replaceAll(f.getName(), "");
        System.out.println(destino);

        switch (comboMunicipio.getSelectedItem().toString()) {

            case "Agrolândia - SC":

                try {
                    File destFolder = new File("tmp");
                    UtilZip.unzipArchive(new File(path), destFolder);
                    com.aldeiaconsultoriajr.nfe.sc.agrolandia.LeitorXML leitorXML = new com.aldeiaconsultoriajr.nfe.sc.agrolandia.LeitorXML();
                    ArrayList<com.aldeiaconsultoriajr.nfe.sc.agrolandia.Nfse> listaNfse = leitorXML.lerXMLs(destFolder);
                    com.aldeiaconsultoriajr.nfe.sc.agrolandia.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.sc.agrolandia.GeradorTXT(listaNfse);
                    geradorTXT.gerarTXT(destino, btnConsiderarISS.isSelected());
                    FileUtils.deleteDirectory(destFolder);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

            case "Canoas - RS": {
                File destFolder = new File("tmp");
                
                try {
                    UtilZip.unzipArchive(new File(path), destFolder);
                    
                    com.aldeiaconsultoriajr.nfe.rs.canoas.LeitorXML leitorXML = new com.aldeiaconsultoriajr.nfe.rs.canoas.LeitorXML();
                    com.aldeiaconsultoriajr.nfe.rs.canoas.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.rs.canoas.GeradorTXT(leitorXML.lerXML(destFolder));
                    geradorTXT.gerarTXT(destino, btnConsiderarISS.isSelected());
                } catch (IOException ex) {
                    Logger.getLogger(ViewNotaMunicipal.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
            }

            case "Ibaiti - PR":
                com.aldeiaconsultoriajr.nfe.pr.ibaiti.LeitorXML leitorXMLIbaiti = new com.aldeiaconsultoriajr.nfe.pr.ibaiti.LeitorXML();
                try {
                    com.aldeiaconsultoriajr.nfe.pr.ibaiti.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.pr.ibaiti.GeradorTXT(leitorXMLIbaiti.lerXML(path));
                    geradorTXT.gerarTXT(destino, btnConsiderarISS.isSelected());
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

            case "Rio Verde - GO":
                com.aldeiaconsultoriajr.nfe.go.rioVerde.LeitorXML leitorXMLRioVerde = new com.aldeiaconsultoriajr.nfe.go.rioVerde.LeitorXML();
                try {
                    com.aldeiaconsultoriajr.nfe.go.rioVerde.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.go.rioVerde.GeradorTXT(leitorXMLRioVerde.lerXML(path));
                    geradorTXT.gerarTXT(destino, btnConsiderarISS.isSelected());
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

            case "Salvador - BA":
                com.aldeiaconsultoriajr.nfe.ba.salvador.LeitorXML leitorXMLSalvador = new com.aldeiaconsultoriajr.nfe.ba.salvador.LeitorXML();
                try {
                    com.aldeiaconsultoriajr.nfe.ba.salvador.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.ba.salvador.GeradorTXT(leitorXMLSalvador.lerXML(path));
                    geradorTXT.gerarTXT(destino, (radioEmitidas.isSelected()) ? 1 : 2, btnConsiderarISS.isSelected());
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;

            case "Vila Velha - ES":
                com.aldeiaconsultoriajr.nfe.es.vilaVelha.LeitorXML leitorXMLVilaVelha = new com.aldeiaconsultoriajr.nfe.es.vilaVelha.LeitorXML();

                try {
                    com.aldeiaconsultoriajr.nfe.es.vilaVelha.GeradorTXT geradorTXT = new com.aldeiaconsultoriajr.nfe.es.vilaVelha.GeradorTXT(leitorXMLVilaVelha.lerXML(path));
                    geradorTXT.gerarTXT(destino, btnConsiderarISS.isSelected());
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                break;
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        JOptionPane.showMessageDialog(null, "Conversão concluída com sucesso!");
    }//GEN-LAST:event_btnConverterArquivoActionPerformed

    private void comboMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMunicipioActionPerformed
        switch (comboMunicipio.getSelectedItem().toString()) {
            case "Município":
                campoCaminhoArquivo.setText("Selecione um município");
                btnSelecaoArquivo.setEnabled(false);
                break;
            case "Agrolândia - SC":
                campoCaminhoArquivo.setText("Selecione o arquivo ZIP das notas");
                btnSelecaoArquivo.setEnabled(true);
                break;
            case "Brasília - DF":
                campoCaminhoArquivo.setText("Selecione a pasta das notas");
                btnSelecaoArquivo.setEnabled(true);
                break;
            default:
                campoCaminhoArquivo.setText("Selecione o arquivo XML das notas");
                btnSelecaoArquivo.setEnabled(true);
                break;
        }
        btnGroupTipo.clearSelection();
        radioEmitidas.setEnabled(false);
        radioRecebidas.setEnabled(false);
        btnConsiderarISS.setEnabled(false);
        btnConverterArquivo.setEnabled(false);
    }//GEN-LAST:event_comboMunicipioActionPerformed

    private void btnSelecaoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecaoArquivoActionPerformed

        JFileChooser fc = new JFileChooser(".");
        switch (comboMunicipio.getSelectedItem().toString()) {
            case "Agrolândia - SC":
                fc.setFileFilter(new FileNameExtensionFilter("ZIP", "zip"));
                break;
            default:
                fc.setFileFilter(new FileNameExtensionFilter("XML", "xml"));
                break;
        }
        fc.setAcceptAllFileFilterUsed(false);
        int opcao = fc.showOpenDialog(null);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            campoCaminhoArquivo.setText(fc.getSelectedFile().getPath());

            switch (comboMunicipio.getSelectedItem().toString()) {
                case "Agrolândia - SC":
                case "Canoas - RS":
                case "Ibaiti - PR":
                case "Rio Verde - GO":
                case "Vila Velha - ES":
                    radioEmitidas.setEnabled(true);
                    radioRecebidas.setEnabled(false);
                    break;
                case "Salvador - BA":
                    radioEmitidas.setEnabled(true);
                    radioRecebidas.setEnabled(true);
                    break;
                default:
                    radioEmitidas.setEnabled(false);
                    radioRecebidas.setEnabled(false);
                    break;
            }
            btnGroupTipo.clearSelection();
            btnConsiderarISS.setEnabled(true);
            btnConsiderarISS.setSelected(true);
        }
    }//GEN-LAST:event_btnSelecaoArquivoActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void radioEmitidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmitidasActionPerformed
        btnConverterArquivo.setEnabled(true);
    }//GEN-LAST:event_radioEmitidasActionPerformed

    private void radioRecebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRecebidasActionPerformed
        btnConverterArquivo.setEnabled(true);
    }//GEN-LAST:event_radioRecebidasActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        JOptionPane.showMessageDialog(null, "Conversor de NFSe de diversos municípios para o padrão aceito pelo Contmatic G5 Phoenix.\nDesenvolvido por Yuri Fernandes de Oliveira");
    }//GEN-LAST:event_menuSobreMouseClicked

    private void btnConsiderarISSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsiderarISSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsiderarISSActionPerformed

    private void menuNfseMunicipaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNfseMunicipaisActionPerformed
        new telaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuNfseMunicipaisActionPerformed

    private void menuEmpresasEspecificasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpresasEspecificasActionPerformed
        new telaEmpresaEspecifica().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuEmpresasEspecificasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            javax.swing.UIManager.setLookAndFeel(new com.jgoodies.looks.plastic.Plastic3DLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnConsiderarISS;
    private javax.swing.JButton btnConverterArquivo;
    private javax.swing.ButtonGroup btnGroupTipo;
    private javax.swing.JButton btnSelecaoArquivo;
    private javax.swing.JTextField campoCaminhoArquivo;
    private javax.swing.JComboBox<String> comboMunicipio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuConversor;
    private javax.swing.JMenuItem menuEmpresasEspecificas;
    private javax.swing.JMenuItem menuNfseMunicipais;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JRadioButton radioEmitidas;
    private javax.swing.JRadioButton radioRecebidas;
    // End of variables declaration//GEN-END:variables
}