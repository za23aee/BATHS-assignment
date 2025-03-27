package wars;

import java.io.*;
/**
 * Enumeration class EncounterType - write a description of the enum class here
 * 
 * @author A.Marczyk
 * @version 12/02/2025
 */

public class Encounter {
   private int encounterNo;
   private String type;
   private String location;
   private int requiredSkill;
   private int prizeMoney;
   
   
   public Encounter(int encounterNo, String type, String location, int requiredSkill, int prizeMoney){
   encounterNo = this.encounterNo;
   type = this.type;
   location= this.location;
   requiredSkill = this.requiredSkill;
   prizeMoney = this.prizeMoney;
   
   }
public enum EncounterType implements Serializable
{
    BLOCKADE(" Blockade"), BATTLE(" Battle"), SKIRMISH (" Skirmish"), INVALID (" Invalid");
    private String type;
    
    private EncounterType(String ty)
    {
        type = ty;
    }
    
    public String toString()
    {
        return type;
    }
}
}
