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
public abstract class Doctors extends Person{
protected int experience;

abstract public void prescribeMedicine();
abstract public void suggestXray();
abstract public void suggestBloodTest();
} 
