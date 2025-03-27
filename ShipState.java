package wars;

import java.io.*;
/**
 * Enumeration class UnitState - write a description of the enum class here
 * 
 * @author A.Marczyk
 * @version 12/02/2025
 */

     
 private String name;
 private String captain;
 private int battleskill;
 private int commissionFee;
 private String status;
 
 public Ship (String name, String captain, int battleskill, int commissionFee, String status){
     name = this.name;
     captain = this.captain;
     battleskill = this.battleskill;
     commissionFee = this.commissionFee;
     status = this.status;  
 }
 
 
 //Acessors here 
 
 public String getShipName()
  {
      return name;
  }
 
 //mutators here
 


public enum ShipState implements Serializable
{
    RESERVE(" In reserve fleet"), ACTIVE(" Active in squadron"), RESTING(" Resting"), SUNK (" Sunk");
    private String state;
    
    private ShipState(String st)
    {
        state = st;
    }
    
    public String toString()
    {
        return state;
    }
}
