
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sully Khalifa
 */

/* Algorithm
==============
Start
display items.
display empty items table
radio button selected
quantity inputted via the spinner component
add button clicked 
if statements used for each item selection  
If pen radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object pen using a method
update the pen quantity label to with the pen object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the pen quantity label to “Sold out”
disable the pen radio button
disable the add button 
display a message "No more pens in stock. Please select a different product!"

If book radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object book using a method
update the book quantity label to with the book object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the book quantity label to “Sold out”
disable the book radio button
disable the add button 
display a message "No more books in stock. Please select a different product!"

If water radio button selected
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object water using a method
update the water quantity label to with the water object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the water quantity label to “Sold out”
disable the water radio button
disable the add button 
display a message "No more water in stock. Please select a different product!"

If drink radio button selected
add the value of property “name” to the table row
add the value of the property “price” to the table row

display message on the message label "Please add up to 5 per selection. "
update the property qty for the object drink using a method
update the drink quantity label to with the drink object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the drink quantity label to “Sold out”
disable the drink radio button
disable the add button 
display a message "No more water in stock. Please select a different product!"

If snack radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object snack using a method
update the snack quantity label to with the snack object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the snack quantity label to “Sold out”
disable the snack radio button
disable the add button 
display a message "No more snacks in stock. Please select a different product!"

If sweet radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object sweet using a method
update the sweet quantity label to with the sweet object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the sweet quantity label to “Sold out”
disable the sweet radio button
disable the add button 
display a message "No more sweets in stock. Please select a different product!"


If chocolate radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object chocolate using a method
update the chocolate quantity label to with the chocolate object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the chocolate quantity label to “Sold out”
disable the chocolate radio button
disable the add button 
display a message "No more chocolate in stock. Please select a different product!"


If biscuits radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object biscuits using a method
update the biscuits quantity label to with the biscuits object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the biscuits quantity label to “Sold out”
disable the biscuits radio button
disable the add button 
display a message "No more biscuits in stock. Please select a different product!"

If cake radio button selected 
add the value of property “name” to the table row
add the value of the property “price” to the table row
display message on the message label "Please add up to 5 per selection. "
update the property qty for the object cake using a method
update the cake quantity label to with the cake object quantity value
a nested if statement to check if the object quantity equals to zero (when condition is met)
set the text on the cake quantity label to “Sold out”
disable the cake radio button
disable the add button 
display a message "No more cakes in stock. Please select a different product!"

added variable qty to take value from the spinner and add to the table
added variable tot equals to the quantity multiplied by price

a model for a table is setup to add the object details as rows of objects.
added variable sum declaration
a for loop to count the rows and add the total of all items added to the total label 

discount button function 
if statements to apply random discounts split over 6 groups 
apply 10% discount if number 1 is selected 
apply 20% discount if number 2 is selected
apply 30% discount if number 3 is selected
apply 40% discount if number 4 is selected
apply 50% discount if number 5 is selected
apply £5 deduction from the total amount if a number between 6 and 10 are selected 

display the applied discount on the discount label 
pay button function
take user input
if user input is more than or equals the total 
display a message "Payment successful. Please take your items."
display the difference between the payment minus the total on the change label 
otherwise display a message "Insufficient amount, please pay the correct amount!"
display no value on the change label

Receipt function
a file writer to print the content of the table rows on the text file
a for loop to loop through the table rows for all values 
a secondary writer to take the values from total label, discount label, discounted total label, payment label and change label then print them on the text file.

reset button to clear all values back to defaults. 
exit button to close the program. 
==============================
Test cases:

Test Case ID	01
Test Scenario	A customer gets products with an amount of money that is greater than or equal to the price of the selected products.
Test Steps	Add products, pay an amount 
Test Data 	Added items from the table rows, Total, discount, payment, change 
Expected results	A customer should complete the transaction successfully.
Actual results	Success
Pass/Fail	Pass



Test Case ID	02
Test Scenario	A customer should not get products with an amount of money that is less than the price of the selected products.
Test Steps	Add products, pay an amount 
Test Data 	Added items from the table rows, Total, discount, payment, change 
Expected results	A customer should not be able to complete the transaction successfully and a message saying insufficient funds.
Actual results	Success
Pass/Fail	Pass

*/


public class selfCheckout extends javax.swing.JFrame {
    
    //defined objects using the Items class
    Items penObj = new Items      ("Pen      ", 1, 1, 20);
    Items bookObj = new Items     ("Book     ", 1, 1, 20);
    Items waterObj = new Items    ("Water    ", 1, 1, 20);
    Items drinkObj = new Items    ("Drink    ", 1, 1, 20);
    Items snackObj = new Items    ("Snack    ", 2, 1, 20);
    Items sweetObj = new Items    ("Sweet    ", 1, 1, 20);
    Items chocolateObj = new Items("Chocolate", 1, 1, 20);
    Items biscuitsObj = new Items ("Biscuits ", 1, 1, 20);
    Items cakeObj = new Items     ("Cake     ", 2, 1, 20);
    
   
    
    //variable declarations
    DefaultTableModel model;
    String item; 
    int price, qty, tot, newQty;
   
     

    /**
     * Creates new form selfCheckout
     */
    public selfCheckout() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblpen = new javax.swing.JRadioButton();
        lblbook = new javax.swing.JRadioButton();
        lblwater = new javax.swing.JRadioButton();
        lbldrink = new javax.swing.JRadioButton();
        lblsnack = new javax.swing.JRadioButton();
        lblsweet = new javax.swing.JRadioButton();
        lblchocolate = new javax.swing.JRadioButton();
        lblbiscuits = new javax.swing.JRadioButton();
        lblcake = new javax.swing.JRadioButton();
        pricelbl1 = new javax.swing.JLabel();
        pricelbl2 = new javax.swing.JLabel();
        pricelbl4 = new javax.swing.JLabel();
        pricelbl7 = new javax.swing.JLabel();
        pricelbl8 = new javax.swing.JLabel();
        pricelbl9 = new javax.swing.JLabel();
        pricelbl10 = new javax.swing.JLabel();
        pricelbl11 = new javax.swing.JLabel();
        pricelbl12 = new javax.swing.JLabel();
        pricelbl13 = new javax.swing.JLabel();
        pricelbl14 = new javax.swing.JLabel();
        penqtylbl = new javax.swing.JLabel();
        bookqtylbl = new javax.swing.JLabel();
        waterqtylbl = new javax.swing.JLabel();
        drinkqtylbl = new javax.swing.JLabel();
        sweetqtylbl = new javax.swing.JLabel();
        chocqtylbl = new javax.swing.JLabel();
        snackqtylbl = new javax.swing.JLabel();
        cakeqtylbl = new javax.swing.JLabel();
        biscuitsqtylbl = new javax.swing.JLabel();
        pricelbl3 = new javax.swing.JLabel();
        pricelbl5 = new javax.swing.JLabel();
        pricelbl6 = new javax.swing.JLabel();
        pricelbl15 = new javax.swing.JLabel();
        pricelbl16 = new javax.swing.JLabel();
        pricelbl17 = new javax.swing.JLabel();
        pricelbl18 = new javax.swing.JLabel();
        pricelbl19 = new javax.swing.JLabel();
        pricelbl20 = new javax.swing.JLabel();
        pricelbl21 = new javax.swing.JLabel();
        pricelbl22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paybtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        discountbtn = new javax.swing.JButton();
        messagelbl = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        txtfile = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        distotallbl = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        changelbl = new javax.swing.JLabel();
        discountlbl = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Self Checkout System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, null, null, java.awt.Color.lightGray));

        buttonGroup1.add(lblpen);
        lblpen.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblpen.setText("Pen");
        lblpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblpenActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblbook);
        lblbook.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblbook.setText("Book");
        lblbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbookActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblwater);
        lblwater.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblwater.setText("Water");
        lblwater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblwaterActionPerformed(evt);
            }
        });

        buttonGroup1.add(lbldrink);
        lbldrink.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lbldrink.setText("Drink");
        lbldrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbldrinkActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblsnack);
        lblsnack.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblsnack.setText("Snack");
        lblsnack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsnackActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblsweet);
        lblsweet.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblsweet.setText("Sweet");
        lblsweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblsweetActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblchocolate);
        lblchocolate.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblchocolate.setText("Chocolate");
        lblchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblchocolateActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblbiscuits);
        lblbiscuits.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblbiscuits.setText("Biscuits");
        lblbiscuits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbiscuitsActionPerformed(evt);
            }
        });

        buttonGroup1.add(lblcake);
        lblcake.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        lblcake.setText("Cake");
        lblcake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblcakeActionPerformed(evt);
            }
        });

        pricelbl1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl1.setText("Stock");

        pricelbl2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl2.setText("Price");

        pricelbl4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl4.setText("£1");

        pricelbl7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl7.setText("£1");

        pricelbl8.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl8.setText("£1");

        pricelbl9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl9.setText("£1");

        pricelbl10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl10.setText("£2");

        pricelbl11.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl11.setText("£1");

        pricelbl12.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl12.setText("£1");

        pricelbl13.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl13.setText("£1");

        pricelbl14.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl14.setText("£2");

        penqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        penqtylbl.setText("20");

        bookqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        bookqtylbl.setText("20");

        waterqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        waterqtylbl.setText("20");

        drinkqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        drinkqtylbl.setText("20");

        sweetqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        sweetqtylbl.setText("20");

        chocqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        chocqtylbl.setText("20");

        snackqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        snackqtylbl.setText("20");

        cakeqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        cakeqtylbl.setText("20");

        biscuitsqtylbl.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        biscuitsqtylbl.setText("20");

        pricelbl3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl3.setText("Code");

        pricelbl5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl5.setText("Item");

        pricelbl6.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl6.setText("01");

        pricelbl15.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl15.setText("02");

        pricelbl16.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl16.setText("03");

        pricelbl17.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl17.setText("05");

        pricelbl18.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl18.setText("04");

        pricelbl19.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl19.setText("06");

        pricelbl20.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl20.setText("08");

        pricelbl21.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl21.setText("07");

        pricelbl22.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        pricelbl22.setText("09");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbiscuits, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblbook, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pricelbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblsnack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pricelbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblpen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pricelbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblsweet, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pricelbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblwater, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbldrink, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pricelbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pricelbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblchocolate)
                                            .addComponent(lblcake, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pricelbl22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pricelbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pricelbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drinkqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(waterqtylbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bookqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(penqtylbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(snackqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sweetqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chocqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(biscuitsqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cakeqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(pricelbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(pricelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pricelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(pricelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pricelbl7)
                                    .addComponent(pricelbl8)
                                    .addComponent(pricelbl4)
                                    .addComponent(pricelbl9)
                                    .addComponent(pricelbl10)
                                    .addComponent(pricelbl11)
                                    .addComponent(pricelbl12)
                                    .addComponent(pricelbl13)
                                    .addComponent(pricelbl14))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpen)
                    .addComponent(pricelbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbook)
                    .addComponent(pricelbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblwater)
                    .addComponent(pricelbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldrink)
                    .addComponent(pricelbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsnack)
                    .addComponent(pricelbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snackqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsweet)
                    .addComponent(pricelbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sweetqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblchocolate)
                    .addComponent(pricelbl12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chocqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbiscuits)
                    .addComponent(pricelbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biscuitsqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcake)
                    .addComponent(pricelbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cakeqtylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricelbl22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qty");

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtqty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payment:");

        txtpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Change:");

        paybtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paybtn.setText("Pay");
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total :");

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        discountbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        discountbtn.setText("Discount");
        discountbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountbtnActionPerformed(evt);
            }
        });

        messagelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        txtfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtfile.setText("Receipt ");
        txtfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfileActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Discounted total: ");

        distotallbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        distotallbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        distotallbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        changelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        discountlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        discountlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discountlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        totallbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totallbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totallbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(262, 262, 262)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(messagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(distotallbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paybtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpay, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(changelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(discountlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discountbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(discountbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(discountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(distotallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(changelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(messagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
      

       // A block of if statements used when the add the button is clicked:
     
     
     
        //if statement used when selecting the pen label 
    
      if (lblpen.isSelected()== true ) {
           
           item = "Pen      ";
           price = 1;
         
         messagelbl.setText("Please add up to 5 per selection. ");
         //updaing the object quantity using the Items class
         penObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
         penqtylbl.setText(String.valueOf(penObj.qty));
         //nested if statement to update the object qantity label with sold when the quantity is zero.
         if(penObj.qty == 0){
             penqtylbl.setText("Sold out.");
             lblpen.setEnabled(false);
             addbtn.setEnabled(false);
            messagelbl.setText("No more pens in stock. Please select a different product!");
        
            } 
      
        
         }
       //if statement used when selecting the book label.
     
       if  (lblbook.isSelected()== true) {
          
           item = "Book     ";
           price = 1;
     
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           bookObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           bookqtylbl.setText(String.valueOf(bookObj.qty));
           
            //nested if statement to update the object qantity label with sold when the quantity is zero.
          if(bookObj.qty == 0){
             bookqtylbl.setText("Sold out.");
             lblbook.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more books in stock. Please select a diffirent product!");
          }
       } 
      
       //if statement used when selectinb the water label.
        if (lblwater.isSelected()== true) {
           item = "Water    ";
           price = 1;
   
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           waterObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           waterqtylbl.setText(String.valueOf(waterObj.qty));
           
            //nested if statement to update the object qantity label with sold when the quantity is zero.
          if(waterObj.qty == 0){
             waterqtylbl.setText("Sold out.");
             lblwater.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more water in stock. Please select a diffirent product!");
          }
       } 
        //if statement used when selecting the drink label
        if (lbldrink.isSelected()== true) {
           item = "Drink    ";
           price = 1;
        
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           drinkObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           drinkqtylbl.setText(String.valueOf(drinkObj.qty));
           
           //nested if statement to update the object qantity label with sold when the quantity is zero.
           if(drinkObj.qty == 0){
             drinkqtylbl.setText("Sold out.");
             lbldrink.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more drinks in stock. Please select a diffirent product!");
           }
           
       }
        //if statement used when selecting the snack label
       if (lblsnack.isSelected()== true) {
           item = "Snack    ";
           price = 2;
        
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           snackObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           snackqtylbl.setText(String.valueOf(snackObj.qty));
           
         //nested if statement to update the object qantity label with sold when the quantity is zero.
           if (snackObj.qty == 0){
              snackqtylbl.setText("Sold out.");
              lblsnack.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more snacks in stock. Please select a diffirent product!");
           }
       
       }
       //if statement used when selecting the sweet label
       if (lblsweet.isSelected()== true) {
           item = "Sweet    ";
           price = 1;
 
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           sweetObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           sweetqtylbl.setText(String.valueOf(sweetObj.qty));
           
          //nested if statement to update the object qantity label with sold when the quantity is zero.
           if(sweetObj.qty == 0){
             sweetqtylbl.setText("Sold out.");
             lblsweet.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more sweets in stock. Please select a diffirent product!");
           }
       }
       //if statement used when selecting the chocolate label
       if (lblchocolate.isSelected()== true) {
           item = "Chocolate";
           price = 1;
   
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           chocolateObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           chocqtylbl.setText(String.valueOf(chocolateObj.qty));
           
          //nested if statement to update the object qantity label with sold when the quantity is zero.
           if(chocolateObj.qty == 0){
             chocqtylbl.setText("Sold out.");
             lblchocolate.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more chocolate in stock. Please select a diffirent product!");
           }
       }
       //if statement used when selecting the biscuits label
       if (lblbiscuits.isSelected()== true) {
           item = "Biscuits ";
           price = 1;
      
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           biscuitsObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           biscuitsqtylbl.setText(String.valueOf(biscuitsObj.qty));
           
          //nested if statement to update the object qantity label with sold when the quantity is zero.
           if(biscuitsObj.qty == 0){
             biscuitsqtylbl.setText("Sold out.");
             lblbiscuits.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more bisuicts in stock. Please select a diffirent product!");
           }
       }
       //if statement used when selecting the cake label
       if (lblcake.isSelected()== true  ) {
           item = "Cake     ";
           price = 2;
           qty  = 20;
           messagelbl.setText("Please add up to 5 per selection. ");
            //updaing the object quantity using the Items class
           cakeObj.updateQty(Integer.parseInt(txtqty.getValue().toString()) );
           cakeqtylbl.setText(String.valueOf(cakeObj.qty));
       
            //nested if statement to update the object qantity label with sold when the quantity is zero.
           if(cakeObj.qty == 0){
             cakeqtylbl.setText("Sold out.");
             lblcake.setEnabled(false);
             addbtn.setEnabled(false);
             messagelbl.setText("No more cakes in stock. Please select a diffirent product!");
           }
       } 
        
       //definition onf qty and tot variables. 
        qty = Integer.parseInt(txtqty.getValue().toString());
        tot = qty * price;
       
       //definition of the model from Jtable1 used to add rows as objects to the table when adding items.
       model = (DefaultTableModel)jTable1.getModel();
       
        model.addRow(new Object []
       {
        item,
        price,
        qty,
        tot
         
       }); 
       
       
        
      // a for loop used to get the total when adding columns to the table. 
       int sum = 0; 
       
       for(int a =0; a< jTable1.getRowCount(); a++) {
           
           sum = sum + Integer.parseInt(jTable1.getValueAt(a, 3).toString());
       }
      
       totallbl.setText(Integer.toString(sum));
       
           
    }//GEN-LAST:event_addbtnActionPerformed
        
       
    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
        // variable declaration within the pay button 
       double tot = Double.parseDouble(distotallbl.getText());
       
       double pay = Double.parseDouble(txtpay.getText());
       
       Double change = pay - tot;
       
       changelbl.setText(String.valueOf(change));
       //if statement used to compare the amount paid against the total
       if ( pay >= tot) {
           messagelbl.setText("Payment successful. Please take your items.");
       }
       
       else { 
           changelbl.setText(null);
           messagelbl.setText("Insufficient amount, please pay the correct amount!");
       }
       
    }//GEN-LAST:event_paybtnActionPerformed

    private void lblpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblpenActionPerformed
        //behaviour of the pen radio button by adding an if statement to enable to button.
         if (lblpen.isSelected()== true && penObj.qty > 0) {
          
           messagelbl.setText(null);   
           addbtn.setEnabled(true);
           lblpen.setEnabled(true);
        } 
         
         
    }//GEN-LAST:event_lblpenActionPerformed

    private void discountbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountbtnActionPerformed
        //variable declaration within the discount button 
        double tenpercent = 10, twentypercent = 20, thirtypercent = 30, fortypercent = 40, fiftypercent = 50;
        double percentage_of =  Double.parseDouble(totallbl.getText() )  ;
         
        messagelbl.setText("Please pay: " + distotallbl.getText());
        Random rand = new Random(); 
        //math random approach used to select a random discount value for numbers between 1 and 10. 
        int myrandom = rand.nextInt(10) + 1;
        //if statement used to generate a 10% discount when number 1 is randomly chosen 
        if (myrandom == 1){
            double calcTen = percentage_of /100* tenpercent;
            double discountedten = percentage_of - calcTen;
            distotallbl.setText( String.valueOf( (discountedten)  ) );
            discountlbl.setText("10% discount.");
        }
        //if statement used to generate a 20% discount when number 2 is randomly chosen 
        else if (myrandom == 2){
            double calc = percentage_of /100* twentypercent;
            double discounted = percentage_of - calc;
            
            distotallbl.setText( String.valueOf( (discounted )  ));
            discountlbl.setText("20% discount.");
        }
        //if statement used to generate a 30% discount when number 3 is randomly chosen
        else if (myrandom == 3){
            double calc = percentage_of /100* thirtypercent;
            double discounted = percentage_of - calc;
            
            distotallbl.setText( String.valueOf( (discounted )  ));
            
            discountlbl.setText("%30 discount.");
        }
        //if statement used to generate a 40& discount when number 4 is randomly chosen 
        else if (myrandom == 4){
           double calc = percentage_of /100* fortypercent;
            double discounted = percentage_of - calc;
            
            distotallbl.setText( String.valueOf( (discounted )  ));
            discountlbl.setText("%40 discount.");
        }
        //if statement used to generate a 40& discount when number 5 is randomly chosen
        else if (myrandom == 5){
            
            double calc = percentage_of /100* fiftypercent;
            double discounted = percentage_of - calc;
            
            distotallbl.setText( String.valueOf( (discounted )  ));
            discountlbl.setText("%50 discount.");
        }
        // if the number are between 6-10, an amount of £5 will be deducted from the total. 
        else { 
            
            distotallbl.setText( String.valueOf( Double.parseDouble(totallbl.getText() ) - 5 ));
            discountlbl.setText("£5 off.");
        }
        
        
        
    }//GEN-LAST:event_discountbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        //exit button used to exit the program.
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void lblbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbookActionPerformed
      //definition of the book button by using an if statement to enable the button when the conditions are met. 
        if (lblbook.isSelected()== true && bookObj.qty > 0) {
             
           messagelbl.setText(null);    
           addbtn.setEnabled(true);
           lblbook.setEnabled(true);
        }
    }//GEN-LAST:event_lblbookActionPerformed

    private void txtfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfileActionPerformed
      //variable declaration to get inputs from various panels so it can be added to the text document.
        String payment = txtpay.getText();
        String change = changelbl.getText();
        String total = totallbl.getText();
        String label = messagelbl.getText();
        String discount = discountlbl.getText();
        String totaldiscount = distotallbl.getText();
        
       //try clause to add the file writer to the program
        try {
            //declaration of the file writer used to collect the item details as well as the file output format.
            FileWriter fw = new FileWriter("Receipt.txt", true);
            
            fw.write("*********** Self Checkout Receipt ***********");
            fw.write(System.getProperty("line.separator"));
            fw.write(System.getProperty("line.separator"));
            fw.write("Item" +"\t"+ "            " + "Price(£)"  + "   " + "Qty  "  +"  "+ "Total(£)");
            fw.write("\n" + "=========================================================");
            fw.write(System.getProperty("line.separator"));
            //buffered writer used to add the rows from the Jtable on the text file.
            BufferedWriter bw = new BufferedWriter(fw);
            //for loop used to get the values from the rows 
            for(int i = 0; i <jTable1.getRowCount(); i++){
                for(int j = 0; j < jTable1.getColumnCount(); j++){
                    bw.write(jTable1.getValueAt(i, j).toString()+ "\t" + "      ");
                    
            }
                
               bw.newLine();
               
        }
            bw.close();
            fw.close();
            //dislog message to show the text file has been produced correctly.
            JOptionPane.showMessageDialog(null, ">>>> Recipt printed successfully <<<<");
            setVisible(true);
            
            
            // a secondary file writer used to collected the payment and discount details 
           FileWriter fw2 = new FileWriter("Receipt.txt",true);
            fw2.write("\n" + "=========================================================");
            fw2.write("\n" + "Total amount: " + "£"+ total + "\n" + "Dicount: " + discount + "\n" + "Discounted amount: " + "£" + totaldiscount +  "\n" +  "Payment: " + "£" + payment + "\n" + "Change: " + "£" + change + " " +  "\n" + label + 
                       "\n" + "=========================================================");
            fw2.write(System.getProperty("line.separator"));
            
            fw2.close();
            
            
            
            
           //catch clause for IO exceptions, and dialog message which will display "Error" in case the text file doesn't generate.  
        } catch (IOException ex) {
            Logger.getLogger(selfCheckout.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_txtfileActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        //a function used to revert all panels back to their  specific default values so it acts as reset 
        //reseting the table to no values
        jTable1.setModel(new DefaultTableModel(null, new String [] {"Item", "Price", "Qty", "Total"}));
        //reseting the stocks for each object back to their default values. 
        penObj.qty = 20;
        bookObj.qty = 20;
        waterObj.qty = 20;
        drinkObj.qty = 20;
        snackObj.qty = 20;
        sweetObj.qty = 20;
        chocolateObj.qty = 20;
        biscuitsObj.qty = 20;
        cakeObj.qty = 20;
        //reset the values for each item stock label to its default values 
        penqtylbl.setText("20");
        bookqtylbl.setText("20");
        waterqtylbl.setText("20");
        drinkqtylbl.setText("20");
        snackqtylbl.setText("20");
        sweetqtylbl.setText("20");
        chocqtylbl.setText("20");
        biscuitsqtylbl.setText("20");
        cakeqtylbl.setText("20");
        //clear any selected button when the clear button is clicked.
        buttonGroup1.clearSelection();
        //enabling the add button
        addbtn.setEnabled(true);
      //reseting labels to empty values.  
        totallbl.setText(null);
        distotallbl.setText(null);
        discountlbl.setText(null);
        txtpay.setText(null);
        changelbl.setText(null);
        messagelbl.setText(null);
        //enabling the item buttons.
        lblpen.setEnabled(true);
        lblbook.setEnabled(true);
        lblwater.setEnabled(true);
        lbldrink.setEnabled(true);
        lblsnack.setEnabled(true);
        lblsweet.setEnabled(true);
        lblchocolate.setEnabled(true);
        lblbiscuits.setEnabled(true);
        lblcake.setEnabled(true);
        txtqty.setValue(0);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void lblwaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblwaterActionPerformed
       //definition of the water button by using an if statement to enable the button when the conditions are met.
        if (lblwater.isSelected()== true && waterObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
           lblwater.setEnabled(true);
        } 
    }//GEN-LAST:event_lblwaterActionPerformed

    private void lbldrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbldrinkActionPerformed
      //definition of the drink button by using an if statement to enable the button when the conditions are met.
        if (lbldrink.isSelected()== true && drinkObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
           lbldrink.setEnabled(true);
        } 
    }//GEN-LAST:event_lbldrinkActionPerformed

    private void lblsnackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsnackActionPerformed
       //definition of the snack button by using an if statement to enable the button when the conditions are met.
        if (lblsnack.isSelected()== true && snackObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
           lblsnack.setEnabled(true);
        } 
    }//GEN-LAST:event_lblsnackActionPerformed

    private void lblsweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblsweetActionPerformed
       //definition of the sweet button by using an if statement to enable the button when the conditions are met.
        if (lblsweet.isSelected()== true && sweetObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
          
           lblsweet.setEnabled(true);
        } 
    }//GEN-LAST:event_lblsweetActionPerformed

    private void lblchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblchocolateActionPerformed
    //definition of the chocolate button by using an if statement to enable the button when the conditions are met.
        if (lblchocolate.isSelected()== true && chocolateObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
          
           lblchocolate.setEnabled(true);
        } 
        
    }//GEN-LAST:event_lblchocolateActionPerformed

    private void lblbiscuitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbiscuitsActionPerformed
       //definition of the biscuits button by using an if statement to enable the button when the conditions are met.
        if (lblbiscuits.isSelected()== true && biscuitsObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
          
           lblbiscuits.setEnabled(true);
        } 
    }//GEN-LAST:event_lblbiscuitsActionPerformed

    private void lblcakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblcakeActionPerformed
   //definition of the cake button by using an if statement to enable the button when the conditions are met.
        
        if (lblcake.isSelected()== true && cakeObj.qty > 0) {
           messagelbl.setText(null);
           addbtn.setEnabled(true);
          
           lblcake.setEnabled(true);
        } 
    }//GEN-LAST:event_lblcakeActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selfCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selfCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selfCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selfCheckout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selfCheckout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel biscuitsqtylbl;
    private javax.swing.JLabel bookqtylbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cakeqtylbl;
    private javax.swing.JLabel changelbl;
    private javax.swing.JLabel chocqtylbl;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton discountbtn;
    private javax.swing.JLabel discountlbl;
    private javax.swing.JLabel distotallbl;
    private javax.swing.JLabel drinkqtylbl;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton lblbiscuits;
    private javax.swing.JRadioButton lblbook;
    private javax.swing.JRadioButton lblcake;
    private javax.swing.JRadioButton lblchocolate;
    private javax.swing.JRadioButton lbldrink;
    private javax.swing.JRadioButton lblpen;
    private javax.swing.JRadioButton lblsnack;
    private javax.swing.JRadioButton lblsweet;
    private javax.swing.JRadioButton lblwater;
    private javax.swing.JLabel messagelbl;
    private javax.swing.JButton paybtn;
    private javax.swing.JLabel penqtylbl;
    private javax.swing.JLabel pricelbl1;
    private javax.swing.JLabel pricelbl10;
    private javax.swing.JLabel pricelbl11;
    private javax.swing.JLabel pricelbl12;
    private javax.swing.JLabel pricelbl13;
    private javax.swing.JLabel pricelbl14;
    private javax.swing.JLabel pricelbl15;
    private javax.swing.JLabel pricelbl16;
    private javax.swing.JLabel pricelbl17;
    private javax.swing.JLabel pricelbl18;
    private javax.swing.JLabel pricelbl19;
    private javax.swing.JLabel pricelbl2;
    private javax.swing.JLabel pricelbl20;
    private javax.swing.JLabel pricelbl21;
    private javax.swing.JLabel pricelbl22;
    private javax.swing.JLabel pricelbl3;
    private javax.swing.JLabel pricelbl4;
    private javax.swing.JLabel pricelbl5;
    private javax.swing.JLabel pricelbl6;
    private javax.swing.JLabel pricelbl7;
    private javax.swing.JLabel pricelbl8;
    private javax.swing.JLabel pricelbl9;
    private javax.swing.JLabel snackqtylbl;
    private javax.swing.JLabel sweetqtylbl;
    private javax.swing.JLabel totallbl;
    private javax.swing.JButton txtfile;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JLabel waterqtylbl;
    // End of variables declaration//GEN-END:variables
}
