/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcenter;

/**
 *
 * @author Moiz Ahmad
 */
public class PrivatePatient extends Patient{

public void calculateBill(){
System.out.println("Your Total Bill is::"+this.DoctorFee
                  +this.MedicineFee+this.RegistrationFee);
}

}
