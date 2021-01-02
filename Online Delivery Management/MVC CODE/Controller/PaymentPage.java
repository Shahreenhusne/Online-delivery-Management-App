/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fodder;

import Backend.Customer;
import Backend.FoodItem;



   
    private void homeDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeDeliveryActionPerformed
        
        CardLayout c1 = (CardLayout) jPanel3.getLayout();
        c1.show(jPanel3, "deliveryCard");
    }

    private void ReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationMouseClicked
        
        Random r = new Random( System.currentTimeMillis() );
        int a = 10000 + r.nextInt(20000);
        jTextArea1.setText("Your order has been recieved by us" + "\n" + "Your token number is " + a + "\n\nHappy Dining");
        Reservation.setEnabled(false);
        homeDelivery.setEnabled(false);
    }
    private void BkashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BkashMouseClicked
        
    private void BkashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkashActionPerformed
        Random r = new Random(System.currentTimeMillis());
        int a = r.nextInt(4000);
        
        jTextArea1.setText("Your order is on it's way.\nA message will be sent to your registered \n email address.\nEmail: " + customer.getEmail() 
                + "\n\n after the resturent receive your payment"+ "\n\n\nPlease show it to the delivery boy");
        creditCard.setEnabled(false);
        Bkash.setEnabled(false);
        cod.setEnabled(false);
    }

    private void creditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardActionPerformed
        Random r = new Random(System.currentTimeMillis());
        int a = r.nextInt(4000);
        jTextArea1.setText("Used saved Credit Card : \nCard Number: XXXX XXXX XXXX " + a +"\nAccount Holder's name: " + customer.getName()+"\nYour order is on it's way.\nA message will be sent to your registered \n email address.\nEmail: " + customer.getEmail() 
                + "\n\n after the resturent receive your payment"+ "\n\n\nPlease show it to the delivery boy");
        creditCard.setEnabled(false);
        Bkash.setEnabled(false);
        cod.setEnabled(false);
    }//GEN-LAST:event_creditCardActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        jTextArea1.setText("Your order is on it's way.\nAn invoice has been sent to your registered \n email address.\nEmail: " + customer.getEmail() 
                + "\n\nPlease show it to the delivery boy");
        creditCard.setEnabled(false);
        Bkash.setEnabled(false);
        cod.setEnabled(false);
    }
}

}
