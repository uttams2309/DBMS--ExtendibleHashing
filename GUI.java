/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dbms;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piyush
 */
public class GUI extends javax.swing.JFrame{

    /**
     * Creates new form GUI
     */
        int global_depth;
        int bfr;
        int local_depth;
        
        List<SinglyLinkedList> Directory = new ArrayList<>();
        List<SinglyLinkedList> ll = new ArrayList<>();
        HashMap<SinglyLinkedList,Integer> index_track = new HashMap<>();
        HashMap<SinglyLinkedList,Integer> LocalDepth_track = new HashMap<>();
        void construct(){
            try{
            int gd = Integer.parseInt(jTextField4.getText());
            global_depth = gd;
            int b = Integer.parseInt(jTextField5.getText());
            bfr = b;
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Enter a valid Integers","Alert",JOptionPane.ERROR_MESSAGE);
            }
            int Directory_Size=(int)(Math.pow(2,global_depth));
            Directory.clear();
            ll.clear();
            SinglyLinkedList Sll0 = new SinglyLinkedList();
            SinglyLinkedList Sll1 = new SinglyLinkedList();
            ll.add(Sll0);
            ll.add(Sll1); 
            index_track.put(Sll0,0);
            index_track.put(Sll1,1);
            LocalDepth_track.put(Sll0, 1);
            LocalDepth_track.put(Sll1, 1);
//            local_depth = 1;
//            int bucket_size = (int)(Math.pow(2,local_depth));
//            for(int i = 0;i < bucket_size; i++){
//                SinglyLinkedList sll = new SinglyLinkedList();
//                ll.add(sll);
//            }
            for (int i = 0; i < Directory_Size; i += 1)
            {
            //    SinglyLinkedList Sll = new SinglyLinkedList();
            if(i%2==0)
                Directory.add(Sll0);
            else
                Directory.add(Sll1);
            //    Directory.add(ll.get(getLastBits(i,local_depth)));
            }
            JOptionPane.showMessageDialog(this,"Directory is initialized");
            
            
        }
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Initialize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Global Depth");

        jLabel2.setText("ENTER GLOBAL DEPTH");

        jLabel3.setText("ENTER BFR");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jTextField4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        int val = Integer.parseInt(jTextField1.getText());
        try{
    //    val = val%10;
        insert(val);
        display_table();

    //    D.display();
    //    D.insert(val);
    //    JOptionPane.showMessageDialog(this, val+"  is inserted");
        jTextField3.setText(Integer.toString(global_depth));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Enter a valid Integers","Alert",JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Invalid INPUTS BUCKET OVERFLOWED","Alert",JOptionPane.ERROR_MESSAGE);
    //        e.printStackTrace(); 
        //    construct();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        construct();
        jTextField3.setText(Integer.toString(global_depth));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                try{
        int val = Integer.parseInt(jTextField2.getText());
        int last_bits = getLastBits(hashfunction(val), global_depth);
        String result = (Directory.get(last_bits).search(val));
    //    D.display();
    //    D.insert(val);
        JOptionPane.showMessageDialog(this, result);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Enter valid integer","Alert",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"Error","Alert",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed
 void insert(int val) throws Exception{
     //       try{
            int flag = 0;
            int hashvalue = hashfunction(val);
            int last_bits = getLastBits(hashvalue,global_depth);  
            if(Directory.get(last_bits).isEmpty())
                flag = 1;
            Directory.get(last_bits).insertLast(val);
            if(flag==1){
                Directory.get(last_bits).setIndex(getLastBits(hashvalue,1));
                index_track.put(Directory.get(last_bits),getLastBits(hashvalue,1));
            }
            else{
                Directory.get(last_bits).setIndex(getLastBits(hashvalue, Directory.get(last_bits).getlocaldepth()));
            //    index_track.put(Directory.get(last_bits),(getLastBits(hashvalue, Directory.get(last_bits).getlocaldepth())));
                index_track.put(Directory.get(last_bits),(getLastBits(hashvalue, LocalDepth_track.get(Directory.get(last_bits)))));
            }
        //   Directory.get(last_bits).setIndex(last_bits);
        int last_bits_check = last_bits;
           while(Directory.get(last_bits_check).size()>bfr){
            //   System.out.println("size---"+Directory.get(last_bits).size()+"   last_bits---"+last_bits);
               if(global_depth==Directory.get(last_bits).getlocaldepth()){
//                   this.global_depth = this.global_depth+1;
                   global_depth = global_depth+1;
                   ll = change_ll(ll,Directory.get(last_bits),last_bits,global_depth);
                   Directory = restructure(Directory, ll, global_depth, last_bits);
               }
               else{
                //    int local_depth1 = Directory.get(last_bits).getlocaldepth();
                //    System.out.println("akjndkjas");
                    int local_depth1 = LocalDepth_track.get(Directory.get(last_bits));
                //    System.out.println(local_depth1+"++++");
                    last_bits = getLastBits(hashvalue, local_depth1);
                    int global_depth1 = local_depth1+1;
                //    System.out.println(local_depth1+"*****");
                   ll = change_ll(ll,Directory.get(last_bits),last_bits,global_depth1);
                   
                   Directory = restructure(Directory, ll, global_depth, last_bits);
                //   System.out.println(local_depth1+"-----");
                   display();
                
//                   System.out.println("size---"+Directory.get(last_bits).size()+"   last_bits---"+last_bits);
//                      System.out.println("|||||");
//                   System.out.println("|||||");
               }
               System.out.println(Directory.size());
               if(Directory.size()>32){
                 //  break;
                   throw new Exception("OVERFLOW"); 
                   
               }
           }
//           }catch(Exception e){
//               
//               Directory.get(getLastBits(val,global_depth)).deleteLast();
//               JOptionPane.showMessageDialog(this,"Invalid INPUTS: OVERFLOWED","Alert",JOptionPane.ERROR_MESSAGE);
//           }
          // display();
                               for(int k = 0;k < ll.size(); k++){
             //    System.out.println(ll.get(k).getIndex());
                 System.out.println("LD->"+LocalDepth_track.get(ll.get(k))+"Index->"+index_track.get(ll.get(k)));
                 System.out.println("------------");
                 ll.get(k).printLinkedList();
             }
         System.out.println("XXXXX");
        }
        List<SinglyLinkedList> restructure(List<SinglyLinkedList> Directory,List<SinglyLinkedList> ll, int gd, int ld){
        List<SinglyLinkedList> D = new ArrayList<>();
       // System.out.println("HELOO");
        int Directory_Size=(int)(Math.pow(2,gd));
        int empty_index = -1;
        for (int i = 0; i < Directory_Size; i += 1)
        {
            int flag = 0;
            for( int j = 0; j < ll.size(); j += 1){
            //    if(getLastBits(i,ll.get(j).getlocaldepth())==getLastBits(hashfunction(ll.get(j).getHead()),ll.get(j).getlocaldepth())){
            if(getLastBits(i,LocalDepth_track.get(ll.get(j)))==index_track.get(ll.get(j))){
               // System.out.println(getLastBits(i,LocalDepth_track.get(ll.get(j)))+"......"+index_track.get(ll.get(j)));
                    D.add(ll.get(j));
                    flag = 1;
                    break;
                }
//                if(ll.get(j).getHead()==-1)
//                    empty_index = j;
            }
            if(flag==0){
                System.out.println("AAAA");
                D.add(ll.get(empty_index));
                System.out.println("BBBB");
            }
            
        }
        
        return D;
    }
        List<SinglyLinkedList> change_ll(List<SinglyLinkedList> ll,SinglyLinkedList sll, int lb, int global_depth) throws Exception{
        SinglyLinkedList new_sll1 = new SinglyLinkedList();
        SinglyLinkedList new_sll2 = new SinglyLinkedList();
    //    SinglyLinkedLis
        for(int i = 0;i < ll.size(); i++){
        //   if(i==lb){
        //  System.out.println("i:"+i+"index:"+index_track.get(ll.get(i))+"lb"+lb);
            //    if(ll.get(i).getIndex()==lb){
               if(index_track.get(ll.get(i))==lb){
            //    sll.printLinkedList();
                int first_index = lb;
                int second_index = (int)Math.pow(2,(global_depth-1))+lb;
                sll.split(new_sll1,new_sll2, first_index, second_index, global_depth,index_track,LocalDepth_track);
            }
            //   System.out.println("vvvv");
        }
        //new_sll2.printLinkedList();
     //    System.out.println("kkkkk");
        LocalDepth_track.put(new_sll1, LocalDepth_track.get(sll)+1);
        LocalDepth_track.put(new_sll2, LocalDepth_track.get(sll)+1);
        ll.remove(sll);
        ll.add(new_sll1);
        ll.add(new_sll2);
//                     for(int k = 0;k < ll.size(); k++){
//             //    System.out.println(ll.get(k).getIndex());
//                 System.out.println("LD->"+LocalDepth_track.get(ll.get(k))+"Index->"+index_track.get(ll.get(k)));
//                 System.out.println("------------");
//                 ll.get(k).printLinkedList();
//             }
//         System.out.println("XXXXX");
        
        return ll;
    }
    static int getLastBits(int num,int d){        
        int number=(int)(Math.pow(2.00000,d)); 
        number--;
        return num&number;     // bitwise and 
    }
    static int find_second(int num){
        int i = 1;
        while(i<=num){
            i = i*2;
        }
        return i;
    }
        public void display(){
        for(int k = 0;k < Directory.size(); k++){
        //    System.out.println(Directory.get(k).getlocaldepth());
         //   System.out.println(index_track.get(Directory.get(k)));
            System.out.println(getLocalDepthBF(Directory.get(k)));
            System.out.println("------------"+k);
            Directory.get(k).printLinkedList();
        }
            // for(int k = 0;k < ll.size(); k++){
            // //    System.out.println(ll.get(k).getIndex());
            //     System.out.println("LD->"+ll.get(k).getlocaldepth()+"Index->"+ll.get(k).getIndex());
            //     System.out.println("------------");
            //     ll.get(k).printLinkedList();
            // }

        System.out.println("*************");
        System.out.println(Directory.get(1).getIndex());
    }
    public void display_table(){
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            String[] col = new String[bfr+2];
            int i;
            col[0] = "Directory_Index";
            for(i = 1;i <= bfr; i++){
                col[i] = "Val"+Integer.toString(i);
            }
            col[i] = "Local_depth";
            String[][] data = new String[Directory.size()][bfr+2];
            for(int k = 0;k < Directory.size(); k++){
                data[k][0] = toBinary(k,global_depth);
            //    String.
                
                String[] val = new String[bfr];
                int bucket_size = Directory.get(k).size();
                int j;
                for(j = 0;j < bucket_size; j++){
                //    System.out.println(Directory.get(k).at(j));      
                val[j] = Integer.toString(Directory.get(k).at(j));
                }
                for(j = 0;j < bfr;j++)
                    data[k][j+1]=val[j];
            //    int ld = Directory.get(k).getlocaldepth();
                int ld = LocalDepth_track.get(Directory.get(k));
                String bucket_ld = Integer.toString(ld);
            //    String[] data = {directory_index,val[0],val[1],val[2],bucket_ld};
                data[k][j+1]=bucket_ld;
            //    model.addRow(data);
                
            }
            model.setDataVector(data, col);
    }
    	
    public static String toBinary(int x, int len) {
		StringBuilder result = new StringBuilder();

		for (int i = len - 1; i >= 0 ; i--) {
			int mask = 1 << i;
			result.append((x & mask) != 0 ? 1 : 0);
		}

		return result.toString();
	}
        int getLocalDepthBF(SinglyLinkedList sll){
        int pointer = 0;
        for(int i = 0; i < Directory.size(); i++){
            if(Directory.get(i)==sll)
                pointer++;
        }
        int ans = (int)(Math.log(Directory.size()/pointer) / Math.log(2));
        System.out.println(ans);
        return ans;
    }

    static int hashfunction(int val){
        return val%10;
      //  return val;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
