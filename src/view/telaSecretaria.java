/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AdministradorDAO;
import controller.ConsultaDAO;
import controller.ConvenioDAO;
import controller.MedicoDAO;
import controller.PacienteDAO;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConsultaModel;
import model.ConvenioModel;
import model.MedicoModel;
import model.PacienteModel;

/**
 *
 * @author Neto
 */
public class telaSecretaria extends javax.swing.JFrame {

    /**
     * Creates new form telaSecretaria
     */
    public telaSecretaria() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void cadastraMedicoTabela() throws SQLException{
        MedicoDAO mdao = null;
        DefaultTableModel tblMed = (DefaultTableModel) tblMedico.getModel();
        
        try {
            mdao = new MedicoDAO();
            for(MedicoModel m : mdao.listarUltimoMedico()){
                Object [] dados = {m.getCod(), m.getCrm(),m.getNome(),m.getTelefone(),m.getCpf(),m.getRg(),m.getEndereco(),m.getSexo()};
                tblMed.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void preencheTabelaPaciente() throws SQLException{
        PacienteDAO pdao = null;
        DefaultTableModel tblPac = (DefaultTableModel) tblPacientes.getModel();
        
        try {
            pdao = new PacienteDAO();
            for(PacienteModel p : pdao.listarPacientes()){
                Object [] dados = {p.getCod(),p.getNome(), p.getTelefone(), p.getCpf(), p.getRg(),p.getEndereco(),p.getSexo()};
                tblPac.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void cadastraPacienteTabela() throws SQLException{
        PacienteDAO pdao = null;
        DefaultTableModel tblPac = (DefaultTableModel) tblPacientes.getModel();
        
        try {
            pdao = new PacienteDAO();
            for(PacienteModel p : pdao.listarUltimoPaciente()){
                Object [] dados = {p.getCod(), p.getNome(),p.getTelefone(),p.getCpf(),p.getRg(),p.getEndereco(),p.getSexo()};
                tblPac.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void preencheTabelaMedico() throws SQLException{
        MedicoDAO mdao = null;
        DefaultTableModel tblMed = (DefaultTableModel) tblMedico.getModel();
        
        try {
            mdao = new MedicoDAO();
            for(MedicoModel m : mdao.listarMedicos()){
                Object [] dados = {m.getCod(),m.getCrm(), m.getNome(), m.getTelefone(), m.getCpf(),m.getRg(),m.getEndereco(), m.getSexo()};
                tblMed.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void preencheTabelaConsulta() throws SQLException{
        ConsultaDAO cdao = null;
        DefaultTableModel tblCon = (DefaultTableModel) tblCons.getModel();
        
        try {
            cdao = new ConsultaDAO();
            for(ConsultaModel c : cdao.listarConsultas()){
                Object [] dados = {c.getCod(),c.getMedico(),c.getData(),c.getHora(),c.getPaciente()};
                tblCon.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void cadastraConsultaTabela() throws SQLException{
        ConsultaDAO cdao = null;
        DefaultTableModel tblConsulta = (DefaultTableModel) tblCons.getModel();
        
        try {
            cdao = new ConsultaDAO();
            for(ConsultaModel c : cdao.listarUltimaConsulta()){
                Object [] dados = {c.getCod(), c.getMedico(),c.getData(),c.getHora(),c.getPaciente()};
                tblConsulta.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void preencheTabelaConvenio() throws SQLException{
        ConvenioDAO cdao = null;
        DefaultTableModel tblCon = (DefaultTableModel) tblConvenio.getModel();
        
        try {
            cdao = new ConvenioDAO();
            for(ConvenioModel c : cdao.listarConvenios()){
                Object [] dados = {c.getCod(),c.getTipo_plano(),c.getTipo_servico(),c.getCliente(),c.getCpf(),c.getRg(),c.getEndereco(),c.getTelefone(),c.getSexo()};
                tblCon.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void cadastraConvenioTabela() throws SQLException{
        ConvenioDAO cdao = null;
        DefaultTableModel tblConsulta = (DefaultTableModel) tblConvenio.getModel();
        
        try {
            cdao = new ConvenioDAO();
            for(ConvenioModel c : cdao.listarUltimoConvenio()){
                Object [] dados = {c.getCod(),c.getTipo_plano(),c.getTipo_servico(),c.getCliente(),c.getCpf(),c.getRg(),c.getEndereco(),c.getTelefone(),c.getSexo()};
                tblConsulta.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        calendario = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMedico = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        crm = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox();
        telefone = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JFormattedTextField();
        btnCadastro = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnApaga = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        confirmSenha = new javax.swing.JPasswordField();
        consultas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCons = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        codCons = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        medico = new javax.swing.JTextField();
        paciente = new javax.swing.JTextField();
        data = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JFormattedTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        pacientes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConvenio = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        tipo_plano = new javax.swing.JTextField();
        tipo_servico = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        rgConv = new javax.swing.JTextField();
        enderecoConv = new javax.swing.JTextField();
        cpfConv = new javax.swing.JFormattedTextField();
        telefoneConv = new javax.swing.JFormattedTextField();
        sexoConv = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        codConv = new javax.swing.JTextField();
        pacient = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        cod1 = new javax.swing.JTextField();
        nome1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        telefone1 = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        cpf1 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        rg1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        endereco1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        sexo1 = new javax.swing.JComboBox();
        btnCadastro1 = new javax.swing.JButton();
        btnEdita1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        logout.setBackground(new java.awt.Color(255, 51, 51));
        logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Sair");
        logout.setFocusable(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/secretaria2.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Consultas");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Médicos");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Convênio");
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Pacientes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        inicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bemvindo.png"))); // NOI18N
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(inicio, "card4");

        tblMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CRM", "Nome", "Telefone", "CPF", "RG", "Endereço", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {
            preencheTabelaMedico();
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblMedico);
        if (tblMedico.getColumnModel().getColumnCount() > 0) {
            tblMedico.getColumnModel().getColumn(0).setResizable(false);
            tblMedico.getColumnModel().getColumn(1).setResizable(false);
            tblMedico.getColumnModel().getColumn(2).setResizable(false);
            tblMedico.getColumnModel().getColumn(3).setResizable(false);
            tblMedico.getColumnModel().getColumn(4).setResizable(false);
            tblMedico.getColumnModel().getColumn(5).setResizable(false);
            tblMedico.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Manipulação de dados dos médicos");

        cod.setText("COD");
        cod.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CRM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("RG");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Endereço");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("CPF");

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastro.setBackground(new java.awt.Color(0, 204, 51));
        btnCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("CADASTRAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnEdita.setBackground(new java.awt.Color(51, 153, 255));
        btnEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdita.setForeground(new java.awt.Color(255, 255, 255));
        btnEdita.setText("EDITAR");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });

        btnApaga.setBackground(new java.awt.Color(255, 51, 51));
        btnApaga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApaga.setForeground(new java.awt.Color(255, 255, 255));
        btnApaga.setText("APAGAR");
        btnApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Login");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Confirmação de senha");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Senha");

        javax.swing.GroupLayout calendarioLayout = new javax.swing.GroupLayout(calendario);
        calendario.setLayout(calendarioLayout);
        calendarioLayout.setHorizontalGroup(
            calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(calendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calendarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(calendarioLayout.createSequentialGroup()
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(calendarioLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(calendarioLayout.createSequentialGroup()
                                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(crm, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        calendarioLayout.setVerticalGroup(
            calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarioLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calendarioLayout.createSequentialGroup()
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(crm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(confirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(calendarioLayout.createSequentialGroup()
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnApaga, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(calendario, "telaDefault");

        tblCons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Médico", "Data", "Hora", "Paciente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {
            preencheTabelaConsulta();
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsMouseClicked(evt);
            }
        });
        tblCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblConsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCons);
        if (tblCons.getColumnModel().getColumnCount() > 0) {
            tblCons.getColumnModel().getColumn(0).setResizable(false);
            tblCons.getColumnModel().getColumn(1).setResizable(false);
            tblCons.getColumnModel().getColumn(2).setResizable(false);
            tblCons.getColumnModel().getColumn(3).setResizable(false);
            tblCons.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Manipulação de dados das consultas");

        codCons.setText("COD");
        codCons.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Médico");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Data");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Hora");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Paciente");

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Apagar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 153, 0));
        jButton7.setText("Marcar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout consultasLayout = new javax.swing.GroupLayout(consultas);
        consultas.setLayout(consultasLayout);
        consultasLayout.setHorizontalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
            .addGroup(consultasLayout.createSequentialGroup()
                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultasLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, consultasLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(consultasLayout.createSequentialGroup()
                                .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(consultasLayout.createSequentialGroup()
                                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        consultasLayout.setVerticalGroup(
            consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultasLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(codCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(medico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(consultasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel2.add(consultas, "telaConsulta");

        tblConvenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Tipo de plano", "Tipo de serviço", "Cliente", "CPF", "RG", "Endereço", "Telefone", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {
            preencheTabelaConvenio();
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConvenioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblConvenio);
        if (tblConvenio.getColumnModel().getColumnCount() > 0) {
            tblConvenio.getColumnModel().getColumn(0).setResizable(false);
            tblConvenio.getColumnModel().getColumn(1).setResizable(false);
            tblConvenio.getColumnModel().getColumn(2).setResizable(false);
            tblConvenio.getColumnModel().getColumn(3).setResizable(false);
            tblConvenio.getColumnModel().getColumn(4).setResizable(false);
            tblConvenio.getColumnModel().getColumn(5).setResizable(false);
            tblConvenio.getColumnModel().getColumn(6).setResizable(false);
            tblConvenio.getColumnModel().getColumn(7).setResizable(false);
            tblConvenio.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Manipulação de dados dos convênios");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Tipo de plano");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Tipo de serviço");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Cliente");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("CPF");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("RG");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Telefone");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Endereço");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Sexo");

        try {
            cpfConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefoneConv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        sexoConv.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));

        jButton8.setBackground(new java.awt.Color(51, 153, 0));
        jButton8.setText("Cadastrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setText("Editar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 0, 0));
        jButton10.setText("Apagar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        codConv.setText("COD");
        codConv.setEditable(false);

        javax.swing.GroupLayout pacientesLayout = new javax.swing.GroupLayout(pacientes);
        pacientes.setLayout(pacientesLayout);
        pacientesLayout.setHorizontalGroup(
            pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
            .addGroup(pacientesLayout.createSequentialGroup()
                .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacientesLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codConv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pacientesLayout.createSequentialGroup()
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pacientesLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pacientesLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfConv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pacientesLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_plano, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pacientesLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rgConv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoConv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneConv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexoConv, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pacientesLayout.setVerticalGroup(
            pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientesLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(codConv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31)
                    .addComponent(tipo_plano, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgConv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel33)
                            .addComponent(tipo_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoConv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel32)
                            .addComponent(cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneConv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pacientesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34)
                    .addComponent(cpfConv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoConv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel2.add(pacientes, "telaPacientes");

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "CPF", "RG", "Endereço", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        try {
            preencheTabelaPaciente();
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacientesMouseClicked(evt);
            }
        });
        tblPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPacientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPacientes);
        if (tblPacientes.getColumnModel().getColumnCount() > 0) {
            tblPacientes.getColumnModel().getColumn(0).setResizable(false);
            tblPacientes.getColumnModel().getColumn(1).setResizable(false);
            tblPacientes.getColumnModel().getColumn(2).setResizable(false);
            tblPacientes.getColumnModel().getColumn(3).setResizable(false);
            tblPacientes.getColumnModel().getColumn(4).setResizable(false);
            tblPacientes.getColumnModel().getColumn(5).setResizable(false);
            tblPacientes.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Manipulação de dados dos pacientes");

        cod1.setText("COD");
        cod1.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nome");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Telefone");

        try {
            telefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("CPF");

        try {
            cpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("RG");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Endereço");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Sexo");

        sexo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outro" }));

        btnCadastro1.setBackground(new java.awt.Color(0, 204, 0));
        btnCadastro1.setText("CADASTRAR");
        btnCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastro1ActionPerformed(evt);
            }
        });

        btnEdita1.setBackground(new java.awt.Color(0, 102, 255));
        btnEdita1.setText("EDITAR");
        btnEdita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdita1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pacientLayout = new javax.swing.GroupLayout(pacient);
        pacient.setLayout(pacientLayout);
        pacientLayout.setHorizontalGroup(
            pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(pacientLayout.createSequentialGroup()
                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pacientLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pacientLayout.createSequentialGroup()
                        .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pacientLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rg1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pacientLayout.createSequentialGroup()
                                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pacientLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pacientLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pacientLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(endereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pacientLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(33, 33, 33)
                        .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdita1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 191, Short.MAX_VALUE))
        );
        pacientLayout.setVerticalGroup(
            pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(rg1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(endereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pacientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdita1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 78, Short.MAX_VALUE))
        );

        jPanel2.add(pacient, "telaPacient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        login telaP = new login();
        telaP.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout c2 = (CardLayout) jPanel2.getLayout();
        c2.show(jPanel2, "telaConsulta");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout) jPanel2.getLayout();
        c1.show(jPanel2, "telaDefault");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout c3 = (CardLayout) jPanel2.getLayout();
        c3.show(jPanel2, "telaPacientes");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
        MedicoModel medModel = new MedicoModel();
        MedicoDAO medDAO = null;
        
        List<MedicoModel> meds = new ArrayList<>();

        AdministradorDAO adminDAO = null;
        try {
            adminDAO = new AdministradorDAO();
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String senha = new String(this.senha.getPassword()).trim();
        String confirmSenha = new String(this.confirmSenha.getPassword()).trim();
        
        medModel.setNome(nome.getText());
        medModel.setCpf(cpf.getText());
        medModel.setCrm(crm.getText());
        medModel.setRg(rg.getText());
        medModel.setEndereco(endereco.getText());
        medModel.setTelefone(telefone.getText());
        medModel.setSexo((String) sexo.getSelectedItem());
        medModel.setLogin(login.getText());
        medModel.setSenha(senha);

        try {
            medDAO = new MedicoDAO();
            if(senha.equals(confirmSenha)){
                medDAO.cadastrarMedicos(medModel);
                JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso!");
                cadastraMedicoTabela();
            }else{
                JOptionPane.showMessageDialog(null, "Senha e confirmação de senha devem ser iguais!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        // TODO add your handling code here:
        MedicoModel medModel = new MedicoModel();

        medModel.setCod(cod.getText());
        medModel.setRg(rg.getText());
        medModel.setCrm(crm.getText());
        medModel.setTelefone(telefone.getText());
        medModel.setCpf(cpf.getText());
        medModel.setEndereco(endereco.getText());
        medModel.setNome(nome.getText());
        medModel.setSexo((String) sexo.getSelectedItem());

        DefaultTableModel tblMed = (DefaultTableModel) tblMedico.getModel();
        try {
            // TODO add your handling code here:
            MedicoDAO medDAO = new MedicoDAO();
            if(tblMedico.getSelectedRow() != -1){
                tblMedico.setValueAt(cod.getText(), tblMedico.getSelectedRow(), 0);
                tblMedico.setValueAt(crm.getText(), tblMedico.getSelectedRow(), 1);
                tblMedico.setValueAt(nome.getText(), tblMedico.getSelectedRow(), 2);
                tblMedico.setValueAt(telefone.getText(), tblMedico.getSelectedRow(), 3);
                tblMedico.setValueAt(cpf.getText(), tblMedico.getSelectedRow(), 4);
                tblMedico.setValueAt(rg.getText(), tblMedico.getSelectedRow(), 5);
                tblMedico.setValueAt(endereco.getText(), tblMedico.getSelectedRow(), 6);
                tblMedico.setValueAt(sexo.getSelectedItem(), tblMedico.getSelectedRow(), 7);
                medDAO.editarMedico(medModel);
                JOptionPane.showMessageDialog(null, "Secretária editada com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Selecione a secretária antes de editar!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagaActionPerformed
        MedicoModel medModel = new MedicoModel();
        medModel.setCod(cod.getText());
        DefaultTableModel tblMed = (DefaultTableModel) tblMedico.getModel();
        try {
            // TODO add your handling code here:
            MedicoDAO medDAO = new MedicoDAO();
            if(tblMedico.getSelectedRow() != -1){
                medDAO.apagarMedico(medModel);
                tblMed.removeRow(tblMedico.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Secretária deletada com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Selecione a secretária antes de apagar!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(telaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnApagaActionPerformed

    private void tblMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicoMouseClicked
        // TODO add your handling code here:
        cod.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 0).toString());
        crm.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 1).toString());
        nome.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 2).toString());
        telefone.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 3).toString());
        cpf.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 4).toString());
        rg.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 5).toString());
        endereco.setText(tblMedico.getValueAt(tblMedico.getSelectedRow(), 6).toString());
        sexo.setSelectedItem(tblMedico.getValueAt(tblMedico.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tblMedicoMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout c4 = (CardLayout) jPanel2.getLayout();
        c4.show(jPanel2, "telaPacient");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastro1ActionPerformed
        // TODO add your handling code here:
        PacienteModel pacModel = new PacienteModel();

        pacModel.setNome(nome1.getText());
        pacModel.setTelefone(telefone1.getText());
        pacModel.setCpf(cpf1.getText());
        pacModel.setRg(rg1.getText());
        pacModel.setEndereco(endereco1.getText());
        pacModel.setSexo((String) sexo1.getSelectedItem());

        try {
            PacienteDAO pacDAO = new PacienteDAO();
            pacDAO.cadastrarPacientes(pacModel);
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
            cadastraPacienteTabela();
        } catch (SQLException ex) {
            Logger.getLogger(telaMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCadastro1ActionPerformed

    private void btnEdita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdita1ActionPerformed
        // TODO add your handling code here:
        if(tblPacientes.getSelectedRow() != -1){
            DefaultTableModel tblPac = (DefaultTableModel) tblPacientes.getModel();
            PacienteModel pacModel = new PacienteModel();

            pacModel.setCod(cod1.getText());
            pacModel.setNome(nome1.getText());
            pacModel.setCpf(cpf1.getText());
            pacModel.setEndereco(endereco1.getText());
            pacModel.setRg(rg1.getText());
            pacModel.setTelefone(telefone1.getText());
            pacModel.setSexo((String) sexo1.getSelectedItem());

            try {
                PacienteDAO pacDAO = new PacienteDAO();
                pacDAO.editarPaciente(pacModel);
                JOptionPane.showMessageDialog(null, "Paciente editado com sucesso!");
                tblPacientes.setValueAt(cod1.getText(), tblPacientes.getSelectedRow(), 0);
                tblPacientes.setValueAt(nome1.getText(), tblPacientes.getSelectedRow(), 1);
                tblPacientes.setValueAt(telefone1.getText(), tblPacientes.getSelectedRow(), 2);
                tblPacientes.setValueAt(cpf1.getText(), tblPacientes.getSelectedRow(), 3);
                tblPacientes.setValueAt(rg1.getText(), tblPacientes.getSelectedRow(), 4);
                tblPacientes.setValueAt(endereco1.getText(), tblPacientes.getSelectedRow(), 5);
                tblPacientes.setValueAt(sexo1.getSelectedItem(), tblPacientes.getSelectedRow(), 6);
            } catch (SQLException ex) {
                Logger.getLogger(telaMedico.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Selecione o paciente antes de editar!");
        }
    }//GEN-LAST:event_btnEdita1ActionPerformed

    private void tblPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacientesMouseClicked
        // TODO add your handling code here:
        cod1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 0).toString());
        nome1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 1).toString());
        telefone1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 2).toString());
        cpf1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 3).toString());
        rg1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 4).toString());
        endereco1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 5).toString());
        sexo1.setSelectedItem(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tblPacientesMouseClicked

    private void tblPacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPacientesKeyReleased
        // TODO add your handling code here:
        cod1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 0).toString());
        nome1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 1).toString());
        telefone1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 2).toString());
        cpf1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 3).toString());
        rg1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 4).toString());
        endereco1.setText(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 5).toString());
        sexo1.setSelectedItem(tblPacientes.getValueAt(tblPacientes.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_tblPacientesKeyReleased

    private void tblConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsMouseClicked
        // TODO add your handling code here:
        codCons.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 0));
        medico.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 1));
        data.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 2));
        hora.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 3));
        paciente.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 4));
    }//GEN-LAST:event_tblConsMouseClicked

    private void tblConsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblConsKeyReleased
        // TODO add your handling code here:
        codCons.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 0));
        medico.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 1));
        data.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 2));
        hora.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 3));
        paciente.setText((String) tblCons.getValueAt(tblCons.getSelectedRow(), 4));
    }//GEN-LAST:event_tblConsKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ConsultaModel consModel = new ConsultaModel();
        
        consModel.setCod(codCons.getText());
        consModel.setData(data.getText());
        consModel.setHora(hora.getText());
        consModel.setMedico(medico.getText());
        consModel.setPaciente(paciente.getText());
        
        try {
            ConsultaDAO consDAO = new ConsultaDAO();
            consDAO.cadastrarConsulta(consModel);
            JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso!");
            cadastraConsultaTabela();
        } catch (SQLException ex) {
            Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblConsulta = (DefaultTableModel) tblCons.getModel();
        if(tblCons.getSelectedRow() != -1){
            ConsultaModel consModel = new ConsultaModel();
            
            consModel.setCod(codCons.getText());
            consModel.setData(data.getText());
            consModel.setHora(hora.getText());
            consModel.setMedico(medico.getText());
            consModel.setPaciente(paciente.getText());
            
            try {
                ConsultaDAO consDAO = new ConsultaDAO();
                consDAO.editarConsulta(consModel);
                JOptionPane.showMessageDialog(null, "Consulta editada com sucesso!");
                tblConsulta.setValueAt(codCons.getText(), tblCons.getSelectedRow(), 0);
                tblConsulta.setValueAt(medico.getText(), tblCons.getSelectedRow(), 1);
                tblConsulta.setValueAt(data.getText(), tblCons.getSelectedRow(), 2);
                tblConsulta.setValueAt(hora.getText(), tblCons.getSelectedRow(), 3);
                tblConsulta.setValueAt(paciente.getText(), tblCons.getSelectedRow(), 4);
            } catch (SQLException ex) {
                Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro deve selecionar a consulta antes de editá-la!");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblConsulta = (DefaultTableModel) tblCons.getModel();
        if(tblCons.getSelectedRow() != -1){
            ConsultaModel consModel = new ConsultaModel();
            
            consModel.setCod(codCons.getText());
            
            try {
                ConsultaDAO consDAO = new ConsultaDAO();
                consDAO.apagarConsulta(consModel);
                JOptionPane.showMessageDialog(null, "Consulta apagada com sucesso!");
                tblConsulta.removeRow(tblCons.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro deve selecionar a consulta antes de apagá-la!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ConvenioModel convModel = new ConvenioModel();
        
        convModel.setCod(codConv.getText());
        convModel.setTipo_servico(tipo_servico.getText());
        convModel.setTipo_plano(tipo_plano.getText());
        convModel.setCliente(cliente.getText());
        convModel.setCpf(cpfConv.getText());
        convModel.setRg(rgConv.getText());
        convModel.setEndereco(enderecoConv.getText());
        convModel.setTelefone(telefoneConv.getText());
        convModel.setSexo((String) sexoConv.getSelectedItem());
        
        try {
            ConvenioDAO convDAO = new ConvenioDAO();
            convDAO.cadastrarConvenio(convModel);
            JOptionPane.showMessageDialog(null, "Convênio cadastrado com sucesso!");
            cadastraConvenioTabela();
        } catch (SQLException ex) {
            Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tblConvenioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConvenioMouseClicked
        // TODO add your handling code here:
        codConv.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 0).toString());
        tipo_plano.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 1).toString());
        tipo_servico.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 2).toString());
        cliente.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 3).toString());
        cpfConv.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 4).toString());
        rgConv.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 5).toString());
        enderecoConv.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 6).toString());
        telefoneConv.setText(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 7).toString());
        sexoConv.setSelectedItem(tblConvenio.getValueAt(tblConvenio.getSelectedRow(), 8).toString());
    }//GEN-LAST:event_tblConvenioMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblConv = (DefaultTableModel) tblConvenio.getModel();
        if(tblConvenio.getSelectedRow() != -1){
            ConvenioModel convModel = new ConvenioModel();
            
            convModel.setCod(codConv.getText());
            convModel.setTipo_servico(tipo_servico.getText());
            convModel.setTipo_plano(tipo_plano.getText());
            convModel.setCliente(cliente.getText());
            convModel.setCpf(cpfConv.getText());
            convModel.setRg(rgConv.getText());
            convModel.setEndereco(enderecoConv.getText());
            convModel.setTelefone(telefoneConv.getText());
            convModel.setSexo((String) sexoConv.getSelectedItem());
            
            try {
                ConvenioDAO convDAO = new ConvenioDAO();
                convDAO.editarConvenio(convModel);
                JOptionPane.showMessageDialog(null, "Convênio editado com sucesso!");
                tblConv.setValueAt(codConv.getText(), tblConvenio.getSelectedRow(), 0);
                tblConv.setValueAt(tipo_plano.getText(), tblConvenio.getSelectedRow(), 1);
                tblConv.setValueAt(tipo_servico.getText(), tblConvenio.getSelectedRow(), 2);
                tblConv.setValueAt(cliente.getText(), tblConvenio.getSelectedRow(), 3);
                tblConv.setValueAt(cpfConv.getText(), tblConvenio.getSelectedRow(), 4);
                tblConv.setValueAt(rgConv.getText(), tblConvenio.getSelectedRow(), 5);
                tblConv.setValueAt(enderecoConv.getText(), tblConvenio.getSelectedRow(), 6);
                tblConv.setValueAt(telefoneConv.getText(), tblConvenio.getSelectedRow(), 7);
                tblConv.setValueAt(sexoConv.getSelectedItem(), tblConvenio.getSelectedRow(), 8);
            } catch (SQLException ex) {
                Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro deve selecionar o convênio antes de editá-lo!");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblConv = (DefaultTableModel) tblConvenio.getModel();
        if(tblConvenio.getSelectedRow() != -1){
            ConvenioModel convModel = new ConvenioModel();
            
            convModel.setCod(codConv.getText());
            
            try {
                ConvenioDAO convDAO = new ConvenioDAO();
                convDAO.apagarConvenio(convModel);
                JOptionPane.showMessageDialog(null, "Convênio apagado com sucesso!");
                tblConv.removeRow(tblConvenio.getSelectedRow());
            } catch (SQLException ex) {
                Logger.getLogger(telaSecretaria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro deve selecionar o convênio antes de apagá-lo!");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApaga;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCadastro1;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnEdita1;
    private javax.swing.JPanel calendario;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField cod1;
    private javax.swing.JTextField codCons;
    private javax.swing.JTextField codConv;
    private javax.swing.JPasswordField confirmSenha;
    private javax.swing.JPanel consultas;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JFormattedTextField cpf1;
    private javax.swing.JFormattedTextField cpfConv;
    private javax.swing.JTextField crm;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField endereco1;
    private javax.swing.JTextField enderecoConv;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField login;
    private javax.swing.JButton logout;
    private javax.swing.JTextField medico;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome1;
    private javax.swing.JPanel pacient;
    private javax.swing.JTextField paciente;
    private javax.swing.JPanel pacientes;
    private javax.swing.JTextField rg;
    private javax.swing.JTextField rg1;
    private javax.swing.JTextField rgConv;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox sexo;
    private javax.swing.JComboBox sexo1;
    private javax.swing.JComboBox sexoConv;
    private javax.swing.JTable tblCons;
    private javax.swing.JTable tblConvenio;
    private javax.swing.JTable tblMedico;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JFormattedTextField telefone;
    private javax.swing.JFormattedTextField telefone1;
    private javax.swing.JFormattedTextField telefoneConv;
    private javax.swing.JTextField tipo_plano;
    private javax.swing.JTextField tipo_servico;
    // End of variables declaration//GEN-END:variables
}
