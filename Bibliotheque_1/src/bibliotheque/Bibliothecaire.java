
package bibliotheque;

public class Bibliothecaire 

{
 
   static void add(Bibliothecaire b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int idB;
    private String nomB;
    private String prenomB;
    private String adresseB ;
    private String telB;
    private String Mot_de_passe;
    
     public Bibliothecaire (String nomB, String prenomB,String adresseB,String telB,String Mot_de_passe)
    {
        this.nomB = nomB;
        this.prenomB = prenomB;
        this.adresseB = adresseB;
        this.telB=telB;
        this.Mot_de_passe = Mot_de_passe;
        
//        this.adresseE =adresseE;
////      this.volume =volume;
//        this.telE = telE;
    }
  
    public Bibliothecaire( int idB,String nomB, String prenomB,String adresseB,String telB,String Mot_de_passe) 
    {
        this.idB = idB;
        this.nomB = nomB;
        this.prenomB = prenomB;
        this.adresseB = adresseB;
        this.telB=telB;
        this.Mot_de_passe=Mot_de_passe;
        
    } 

//    public Bibliothecaire(String nomB, String prenomB, String adresseB, String telB)
//    {
//        this.nomB = nomB;
//        this.prenomB = prenomB;
//        this.adresseB = adresseB;
//        this.telB = telB;
////        this.Mot_de_passe=Mot_de_passe;
//    }

//    public Bibliothecaire(int idB, String nomB, String prenomB, String adresseB, String telB) {
//        this.idB = idB;
//        this.nomB = nomB;
//        this.prenomB = prenomB;
//        this.adresseB = adresseB;
//        this.telB = telB;
//    }

    public int getIdB() {
        return idB;
    }

    public String getNomB() {
        return nomB;
    }

    public String getPrenomB() {
        return prenomB;
    }

    public String getAdresseB() {
        return adresseB;
    }

    public String getTelB() {
        return telB;
    }

    public String getMot_de_passe() {
        return Mot_de_passe;
    }
     
    
    
     
     
     
    
}
