/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1;
import java.util.Set;
import javax.swing.JOptionPane;

public class Ipessoas extends javax.swing.JFrame {

    public Ipessoas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Pesquisar = new javax.swing.JButton();
        userName = new javax.swing.JTextField();
        textUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userIdade = new javax.swing.JTextField();
        userSex = new javax.swing.JTextField();
        textUser1 = new javax.swing.JLabel();
        textUser2 = new javax.swing.JLabel();
        textUser3 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        adicionarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        btnAluno = new javax.swing.JRadioButton();
        btnprofessor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo jogo");

        Pesquisar.setText("Pesquisar");
        Pesquisar.setRequestFocusEnabled(false);
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        userName.setEnabled(false);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        textUser.setText("Insira o nome do usuário:");

        jLabel1.setText("Sistema Escolar");

        userIdade.setEnabled(false);

        userSex.setEnabled(false);

        textUser1.setText("Idade do usuário:");

        textUser2.setText("Sexo do usuário:");

        textUser3.setText("Email do usuário:");

        userEmail.setEnabled(false);

        adicionarBtn.setText("Adicionar");
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");

        btnAluno.setText("Aluno");

        btnprofessor.setText("Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUser)
                            .addComponent(textUser1)
                            .addComponent(textUser2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userSex)
                            .addComponent(userIdade)
                            .addComponent(userName))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(adicionarBtn)
                .addGap(29, 29, 29)
                .addComponent(Pesquisar)
                .addGap(29, 29, 29)
                .addComponent(excluirBtn)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textUser3)
                .addGap(51, 51, 51)
                .addComponent(userEmail)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnAluno)
                .addGap(18, 18, 18)
                .addComponent(btnprofessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUser)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUser1)
                    .addComponent(userIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUser2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUser3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAluno)
                    .addComponent(btnprofessor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pesquisar)
                    .addComponent(adicionarBtn)
                    .addComponent(excluirBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed

    }//GEN-LAST:event_userNameActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed

        Pessoa ng = new Pessoa();
        JOptionPane.showMessageDialog(null, "Encontrado: " + userName.getText());
    }//GEN-LAST:event_PesquisarActionPerformed

    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed
        userName.setEnabled(true);
        userSex.setEnabled(true);
        userIdade.setEnabled(true);
        userEmail.setEnabled(true);
        if (btnAluno.isSelected()) {
            if (!"".equals(userName.getText()) && !"".equals(userIdade.getText())) {

                Aluno aluninho = new Aluno();
                aluninho.setNome(userName.getText());
                aluninho.setIdade(Integer.parseInt(userIdade.getText()));
                aluninho.setSexo(userSex.getText());
                aluninho.setEmail(userEmail.getText());
                JOptionPane.showMessageDialog(null, userName.getText()+ "Adicionado");
            }
        } else {
            if (!"".equals(userName.getText()) && !"".equals(userIdade.getText())) {
                Professor prof = new Professor();
                prof.setNome(userName.getText());
                prof.setIdade(Integer.parseInt(userIdade.getText()));
                prof.setSexo(userSex.getText());
                prof.setEmail(userEmail.getText());
                            JOptionPane.showMessageDialog(null, userName.getText()+ "Adicionado");
                
            } else {

                if ("".equals(userName.getText()) && "".equals(userIdade.getText()) && "".equals(userSex.getText()) && "".equals(userEmail.getText())) {
                    JOptionPane.showMessageDialog(null, "Preenha os campos abaixo para adicionar uma nova pessoa");
                }
            }
    }//GEN-LAST:event_adicionarBtnActionPerformed
    }
    private void excluirBtn(java.awt.event.ActionEvent evt) {
        if (!"".equals(userName.getText()) && !"".equals(userIdade.getText())) {

            Aluno aluninho = new Aluno();
            aluninho.setNome("");
            aluninho.setIdade(0);
            aluninho.setSexo("");
            aluninho.setEmail("");
            Professor prof = new Professor();
            prof.setNome("");
            prof.setIdade(0);
            prof.setSexo("");
            prof.setEmail("");
            JOptionPane.showMessageDialog(null, "Exclusão efetuada");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ipessoas().setVisible(true);
                 JOptionPane.showMessageDialog(null,"Clique em adicionar para começar");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JRadioButton btnAluno;
    private javax.swing.JRadioButton btnprofessor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textUser;
    private javax.swing.JLabel textUser1;
    private javax.swing.JLabel textUser2;
    private javax.swing.JLabel textUser3;
    private javax.swing.JTextField userEmail;
    private javax.swing.JTextField userIdade;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userSex;
    // End of variables declaration//GEN-END:variables
}
