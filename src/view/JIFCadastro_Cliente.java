/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Extras.TratarFormularios;
import data.ClienteData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thiago
 */
public class JIFCadastro_Cliente extends javax.swing.JInternalFrame {
    private Cliente  obj;
    private ClienteData  DAO;
    private int acao;
    private ArrayList<Cliente> listaDeUsuarios;
    /**
     * Creates new form JIFCadastro_Cliente
     */
    public JIFCadastro_Cliente() {
        try {
             initComponents();
             obj = new Cliente();
             DAO = new ClienteData();
             acao=0;
             listaDeUsuarios = new ArrayList<>();
        } catch (Exception erro) {
          JOptionPane.showMessageDialog(null, erro.getMessage());
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

        jlCadastro = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlPesquisar = new javax.swing.JLabel();
        jlIconPesquisa = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfPesquisar = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlCadastro.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jlCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/feedback-do-cliente.png"))); // NOI18N
        jlCadastro.setText("CADASTRO DE CLIENTE");
        jlCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlCadastro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jlCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, -1, 103));

        jlCodigo.setFont(new java.awt.Font("SimSun", 1, 22)); // NOI18N
        jlCodigo.setText("Código");
        getContentPane().add(jlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jlNome.setFont(new java.awt.Font("SimSun", 1, 22)); // NOI18N
        jlNome.setText("Nome");
        getContentPane().add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jlEmail.setFont(new java.awt.Font("SimSun", 1, 22)); // NOI18N
        jlEmail.setText("Email");
        getContentPane().add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jlPesquisar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jlPesquisar.setText("PESQUISAR");
        getContentPane().add(jlPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, 30));

        jlIconPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lupas .png"))); // NOI18N
        getContentPane().add(jlIconPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, -1, 37));

        jtfCodigo.setToolTipText("Digite aqui o código do cliente");
        jtfCodigo.setEnabled(false);
        getContentPane().add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 170, -1));

        jtfNome.setToolTipText("Digite aqui o nome do cliente");
        jtfNome.setEnabled(false);
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, -1));

        jtfEmail.setToolTipText("Digite aqui o email do cliente");
        jtfEmail.setEnabled(false);
        getContentPane().add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 170, -1));

        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(jtfPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 210, 30));

        jbSalvar.setFont(new java.awt.Font("SimSun", 1, 22)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salve-.png"))); // NOI18N
        jbSalvar.setText("SALVAR");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 190, -1));

        jbSair.setFont(new java.awt.Font("SimSun", 1, 22)); // NOI18N
        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair (1).png"))); // NOI18N
        jbSair.setText("SAIR");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        getContentPane().add(jbSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 591, 162, -1));

        jbNovo.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/novo-arquivo.png"))); // NOI18N
        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, -1));

        jbExcluir.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jbExcluir.setText("EXCLUIR");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 190, -1));

        jbCancelar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbCancelar.setText("CANCECLAR");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 200, -1));

        jbLimpar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/apagador.png"))); // NOI18N
        jbLimpar.setText("LIMPAR");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 190, -1));

        jbEditar.setFont(new java.awt.Font("SimSun", 1, 20)); // NOI18N
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 300, 190, -1));

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if(validarCampos()){
            try {
                if(preencherObjeto()){
                    
                    if(acao==1){
                        if(DAO.incluir(obj)){
                            JOptionPane.showMessageDialog(this,"Salvo com sucesso", "Acesso ao sistema!", JOptionPane.INFORMATION_MESSAGE);
                            jbCancelarActionPerformed(evt);
                        }else{
                            JOptionPane.showMessageDialog(this, "Não Salvou");
                        }
                    }
                    if(acao==2){
                        if(DAO.editar(obj)){
                            JOptionPane.showMessageDialog(this,"Atualizado com sucesso com sucesso", "Acesso ao sistema!", JOptionPane.INFORMATION_MESSAGE);
                            jbCancelarActionPerformed(evt);
                        }else{
                            JOptionPane.showMessageDialog(this, "Não Atualizou");
                        }
                    }                            
                }
            } catch (Exception ex) {
                Logger.getLogger(JIFCadastro_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        try {
            Extras.TratarFormularios.limparCampos(this);
        } catch (Exception ex) {
            Logger.getLogger(JIFCadastro_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbNovo.setEnabled(false);
        jbLimpar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfCodigo.setEnabled(true);
        jtfNome.setEnabled(true);
        jtfEmail.setEnabled(true);
        jtfPesquisar.setEnabled(true);
        jtbDados.setEnabled(false);
        acao=1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            TratarFormularios.habilitarCampos(this);
        } catch (Exception ex) {
            Logger.getLogger(JIFCadastro_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
       acao = 2;
       jtfCodigo.setEnabled(false);
       jbNovo.setEnabled(false);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
       jbSalvar.setEnabled(true);
       jbCancelar.setEnabled(true);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfCodigo.setEnabled(false);
        jtfEmail.setEnabled(false);
        jtfNome.setEnabled(false);
        jtfPesquisar.setEnabled(true);
        jtbDados.setEnabled(true);
        jtfCodigo.setText("");
        jtfEmail.setText("");
        jtfNome.setText("");
        jtfPesquisar.setText("");
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if(DAO.excluir(Integer.parseInt(jtfCodigo.getText())));
            JOptionPane.showMessageDialog(this, "EXCLUIDO COM SUCESSO");
            TratarFormularios.limparCampos(this);
            jbExcluir.setEnabled(false);
            jbEditar.setEnabled(false);
        } catch (Exception e) {
        }        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
                 try {
    DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
    mp.setNumRows(0);
    if(jtfPesquisar.getText().length()>1){
    listaDeUsuarios=DAO.pesquisar(jtfPesquisar.getText());
    for(Cliente u : listaDeUsuarios){
    mp.addRow(new String[]{""+u.getCodigo(),""+u.getNome(),""+u.getEmail()});
    }
    }
    } catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Erro:"+e.getMessage(),"Erro ao pesquisar",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jtfPesquisarKeyReleased

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try{
           int linhaSelecionada = jtbDados.getSelectedRow();
           if(linhaSelecionada>-1){
               jtfCodigo.setText(""+listaDeUsuarios.get(linhaSelecionada).getCodigo());
               jtfNome.setText(listaDeUsuarios.get(linhaSelecionada).getNome());
               jtfEmail.setText(listaDeUsuarios.get(linhaSelecionada).getEmail());
               jbEditar.setEnabled(true);
               jbExcluir.setEnabled(true);
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"Erro" + e.getMessage(),"Erro ao pesquisar" , JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private boolean validarCampos(){
        String msg="";
        if(jtfCodigo.getText().length()<3)
        msg+="\nO código deve ter pelo menos 3 números";
        if(jtfCodigo.getText().length()>10)
        msg+="\nO código deve ter menos de 10 números";
        
        if(jtfNome.getText().length()<3)
        msg+="\nO nome deve ter pelo menos 3 caracteres";
        if(jtfNome.getText().length()>25)
        msg+="\nO nome deve ter menos de 25 caracteres";
       
        if(jtfEmail.getText().length()<5)
        msg+="\nO email deve ter pelo menos 5 caracteres";
        if(jtfEmail.getText().length()>30)
        msg+="\nO email deve ter menos de 30 caracteres";
        
        if(msg.length()==0)
            return true; 
        else{
            JOptionPane.showMessageDialog(this,"Corrija os seguintes campos" + msg, "Acesso Negado", JOptionPane.ERROR_MESSAGE);

            return false;
        }
    }
    
     private boolean preencherObjeto()throws Exception{
        obj.setCodigo(Integer.parseInt(jtfCodigo.getText()));
        obj.setNome(jtfNome.getText());
        obj.setEmail(jtfEmail.getText());
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCadastro;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlIconPesquisa;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JTable jtbDados;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisar;
    // End of variables declaration//GEN-END:variables
}
