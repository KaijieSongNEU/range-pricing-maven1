/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5001.model.Personnel;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {



    public EmployeeProfile(Person p) {

        super(p); 

    }
    @Override
    public String getRole(){
        return  "Admin";
    }

}