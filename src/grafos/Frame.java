// Trabalho de Teoria dos Grafos baseado no Algoritmo de Dijkstra para os alunos do curso de Ciência da Computação

package grafos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class NumeroInteiro {
    int numero;

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

public class Frame extends javax.swing.JFrame {

    static int matriz[][];

    public Frame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        tfVertices = new javax.swing.JTextField();
        tfOrigem = new javax.swing.JTextField();
        tfDestino = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo de Dijkstra");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        taResultado.setColumns(20);
        taResultado.setEditable(false);
        taResultado.setRows(5);
        taResultado.setAutoscrolls(false);
        jScrollPane1.setViewportView(taResultado);

        jButton1.setText("Calcular caminho");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVerticesActionPerformed(evt);
            }
        });

        tfOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOrigemActionPerformed(evt);
            }
        });

        tfDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDestinoActionPerformed(evt);
            }
        });

        jButton2.setText(" Gerar matriz ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Origem");

        jLabel3.setText("Destino");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 8));
        jLabel4.setText("Algoritmo de Dijkstra");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 7));
        jButton3.setText("SAIR");
        jButton3.setMaximumSize(new java.awt.Dimension(40, 19));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 19));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Número de vértices");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 773,
                                                                Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(240, 240, 240)
                                                                .addComponent(jButton3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(tfVertices)
                                                                .addComponent(jLabel5)))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(tfDestino)
                                                                        .addComponent(tfOrigem,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(240, 240, 240)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfVertices, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfOrigem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, 0)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton3MouseClicked

    }// GEN-LAST:event_jButton3MouseClicked

    private void tfVerticesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfVerticesActionPerformed

    }// GEN-LAST:event_tfVerticesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        int vertices = Integer.parseInt(tfVertices.getText());

        int origem = Integer.parseInt(tfOrigem.getText()) - 1;
        int destino = Integer.parseInt(tfDestino.getText()) - 1;

        CaminhoMinimo(vertices, origem, destino);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void tfOrigemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfOrigemActionPerformed

    }// GEN-LAST:event_tfOrigemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

        int numeroVertices = Integer.parseInt(tfVertices.getText());
        matriz = new int[numeroVertices][numeroVertices];

        taResultado.append("--- VALORES DA MATRIZ ---\n\n");

        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (i != j) {
                    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "\nDigite um peso para a linha " + (i + 1) + " - coluna " + (j + 1) + "\n\n",
                            "Trabalho de Grafos", JOptionPane.PLAIN_MESSAGE));
                    taResultado.append(matriz[i][j] + "\t"); // Mostra na tela a matriz
                } else {
                    matriz[i][j] = 1000;
                }
            }
            taResultado.append("\n");
        }

        taResultado.append("\n");

        taResultado.append("--- MATRIZ PRONTA ---\n\n"); // Visualiza matriz

        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                taResultado.append(matriz[i][j] + "\t"); // Mostra na tela a matriz
            }
            taResultado.append("\n");
        }

        taResultado.append("\n\n");

    }// GEN-LAST:event_jButton2ActionPerformed

    private void tfDestinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfDestinoActionPerformed

    }// GEN-LAST:event_tfDestinoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });

        JOptionPane.showMessageDialog(null, "Trabalho de Teoria dos Grafos baseado no\n" +
                "Algoritmo de Dijkstra\n" +
                "Curso Ciência da Computação", "Trabalho de Grafos", JOptionPane.PLAIN_MESSAGE);
    }

    public static boolean estaNaLista(ArrayList<NumeroInteiro> n, int z) {
        boolean encontrou = false;

        for (int i = 0; i < n.size(); i++) {
            if (z == n.get(i).getNumero()) {
                encontrou = true;
                break;
            }
        }

        return encontrou;
    }
    // Apresenta a Matriz de Adjacência

    public static void CaminhoMinimo(int numeroVertices, int origem, int destino) {
        boolean sair = false;

        int size = numeroVertices;
        ArrayList<NumeroInteiro> n = new ArrayList<NumeroInteiro>();
        int z, p = 0;
        int[] d = new int[size];
        int[] s = new int[size];
        int distanciaAnterior;

        n.add(new NumeroInteiro(origem)); // Adiciona a origem à "n"
        d[origem] = 0;

        for (z = 0; z < size; z++) {
            if (!estaNaLista(n, z)) {
                d[z] = matriz[origem][z];
                s[z] = origem;
                taResultado.append("Origem: " + (s[z] + 1) + "\t");
                taResultado.append("Destino: " + (z + 1) + "\t\t");
                taResultado.append("Peso: " + d[z] + "\n");
            }
        }

        while (!estaNaLista(n, destino)) // Enquanto o valor(y) não está na lista
        {
            double dCompare = -1.0;

            for (z = 0; z < size; z++) {
                if (!estaNaLista(n, z)) {
                    if (dCompare == -1.0) {
                        dCompare = d[z];
                        p = z;
                    } else {
                        if (d[z] < dCompare) {
                            dCompare = d[z];
                            p = z;
                        }
                    }
                }
            }

            n.add(new NumeroInteiro(p));

            for (z = 0; z < size; z++) {
                if (!estaNaLista(n, z)) {
                    distanciaAnterior = d[z];
                    d[z] = Math.min(d[z], d[p] + matriz[p][z]);
                    if (d[z] != distanciaAnterior) {
                        s[z] = p;
                    }
                    taResultado.append("Origem: " + (s[z] + 1) + "\t");
                    taResultado.append("Destino: " + (z + 1) + "\t\t");
                    taResultado.append("Peso: " + d[z] + "\n");
                }
            }
        }

        ArrayList<NumeroInteiro> caminho = new ArrayList<NumeroInteiro>();

        caminho.add(new NumeroInteiro(destino));

        z = destino;

        do {
            caminho.add(new NumeroInteiro(s[z]));
            z = s[z];
        } while (z != origem);

        taResultado.append("\nOrigem e destino do caminho mínimo: ");

        for (int i = caminho.size() - 1; i >= 0; i--) {
            taResultado.append((caminho.get(i).getNumero() + 1) + " ");
        }

        taResultado.append("\n\nDistância total do caminho mínimo: " + d[destino] + "\n\n"); // Mostra o peso

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea taResultado;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfOrigem;
    private javax.swing.JTextField tfVertices;
    // End of variables declaration//GEN-END:variables
}
