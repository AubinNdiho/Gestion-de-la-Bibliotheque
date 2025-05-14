 
package bibliotheque;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
//import java.sql.Enregistrepersonne;
public class DatabaseMapper
{
    private DatabaseConfig dbc = null;
    private Connection con = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;


 public DatabaseMapper() 
    
    {
        dbc = new DatabaseConfig();
        con = dbc.getCon();
    }
 
 public int conteretudiant()
 {
 String sql ="select count(*) as conteretudiant from Etudiant";
 int cont =0;
 try
 {
 stmt = con.createStatement();
       rs = stmt.executeQuery(sql);
       
       while(rs.next())
       {
       cont = rs.getInt(1);
       }
 }
       catch(SQLException e)
               {
               System.err.println(e.getMessage());
               }return cont;
         
         }
    
 public int conterlivre()
 {
 String sql ="select count(*) as conterlivre from livre";
 int cont =0;
 try
 {
 stmt = con.createStatement();
       rs = stmt.executeQuery(sql);
       
       while(rs.next())
       {
       cont = rs.getInt(1);
       }
 }
       catch(SQLException e)
               {
               System.err.println(e.getMessage());
               }return cont;
         
         }
         
  public int conterbibliothecaire()
 {
 String sql ="select count(*) as conterbibliothecaire from Bibliothecaire";
 int cont =0;
 try
 {
 stmt = con.createStatement();
       rs = stmt.executeQuery(sql);
       
       while(rs.next())
       {
       cont = rs.getInt(1);
       }
 }
       catch(SQLException e)
               {
               System.err.println(e.getMessage());
               }return cont;
         
         }
 
 
   public int addLivre(Livre l) 
   {
        String req = "insert into Livre (noml,auteur,volume,maison,Isbn) value (?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, l.getNoml());
            pstmt.setString(2, l.getAuteur());
            pstmt.setInt(3, l.getVolume());
            pstmt.setString(4, l.getMaison());
            pstmt.setString(5,l.getIsbn());
            int nlm = pstmt.executeUpdate();
            return nlm;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }
   
   
   
    public int addEtudiant(Etudiant e) 
   {
        String req = "insert into Etudiant (nomE,prenomE,adresseE,telE) value (?,?,?,?)";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, e.getNomE());
            pstmt.setString(2, e.getPrenomE());
//            pstmt.setInt(3, e.getAdresseE());
            pstmt.setString(3, e.getAdresseE());
            pstmt.setString(4,e.getTelE());
            int nlm = pstmt.executeUpdate();
            return nlm;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }
 
    public int addReservation(Reservation r) 
   {
        String req = "insert into Reservation (idl,idE) value (?,?)";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setInt(1, r.getIdl());
            pstmt.setInt(2, r.getIdE());
//            pstmt.setInt(3, e.getAdresseE());
//            pstmt.setString(3, e.getAdresseE());
//            pstmt.setString(4,e.getTelE());
            int nlm = pstmt.executeUpdate();
            return nlm;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }
  
     public int addEmprunt(Emprunt em) 
   {
        String req = "insert into Emprunt(dateRem,idl,idE) value (?,?,?)";
        try {
            pstmt = con.prepareStatement(req);
//            pstmt.setString(1, em.getDateEmp());
            pstmt.setString(1, em.getDateRem());
            pstmt.setInt(2, em.getIdl());
            pstmt.setInt(3, em.getIdE());
//            pstmt.setString(4,e.getTelE());
            int nlm = pstmt.executeUpdate();
            return nlm;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }
     
       public int addBibliothecaire(Bibliothecaire b) 
   {
        String req = "insert into Bibliothecaire(nomB,prenomB,adresseB,telB,Mot_de_passe) value (?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(req);
            pstmt.setString(1, b.getNomB());
            pstmt.setString(2, b.getPrenomB());
            pstmt.setString(3, b.getAdresseB());
            pstmt.setString(4, b.getTelB());
            pstmt.setString(5, b.getMot_de_passe());
//            pstmt.setString(4,e.getTelE());
            int nlm = pstmt.executeUpdate();
            return nlm;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return 0;
    }
    
    
 public int Modifier(Livre l)
   {
   String req= "UPDATE Livre SET noml = ?,auteur = ? ,volume= ?,maison= ?,Isbn = ? WHERE idl = ?";
   try{
   pstmt=con.prepareStatement(req);
   pstmt.setInt(6,l.getIdl());
   pstmt.setString(1, l.getNoml());
   pstmt.setString(2, l.getAuteur());
   pstmt.setInt(3, l.getVolume());
   pstmt.setString(4, l.getMaison());
   pstmt.setString(5, l.getIsbn());
   return pstmt.executeUpdate();
  }
    catch(SQLException ex)
   {System.err.println(ex.getMessage());
   }
   return 0;
   }
 
 
  public int Modifier(Etudiant e)
   {
   String req= "UPDATE Etudiant SET nomE = ?,prenomE = ? ,adresseE = ?,telE = ? WHERE idE = ?";
   try{
   pstmt=con.prepareStatement(req);
   pstmt.setInt(5,e.getIdE());
   pstmt.setString(1, e.getNomE());
   pstmt.setString(2, e.getPrenomE());
//   pstmt.setInt(5, e.getIdE());
   pstmt.setString(3, e.getAdresseE());
   pstmt.setString(4, e.getTelE());
   return pstmt.executeUpdate();
  }
    catch(SQLException ex)
   {System.err.println(ex.getMessage());
   }
   return 0;
   }
 
  public int Modifier(Reservation r)
   {
   String req= "UPDATE Reservation SET idl = ?,dateRes = ?, idE= ? WHERE idRes = ?";
   try{
   pstmt=con.prepareStatement(req);
   pstmt.setInt(4,r.getIdRes());
   pstmt.setInt(1, r.getIdl());
   pstmt.setString(2, r.getDateRes());
   pstmt.setInt(3, r.getIdE());
//   pstmt.setInt(3, r.getIdE());
//   pstmt.setInt(5, e.getIdE());
//   pstmt.setString(3, e.getAdresseE());
//   pstmt.setString(4, e.getTelE());
   return pstmt.executeUpdate();
  }
    catch(SQLException ex)
   {System.err.println(ex.getMessage());
   }
   return 0;
   }
  
  public int Modifier(Emprunt em)
   {
   String req= "UPDATE Emprunt SET dateEmp =?,dateRem = ?,idl = ?,idE =? WHERE idEmp = ?";
   try{
   pstmt=con.prepareStatement(req);
   pstmt.setInt(5,em.getIdEmp());
   pstmt.setString(1, em.getDateEmp());
   pstmt.setString(2, em.getDateRem());
   pstmt.setInt(3, em.getIdl());
   pstmt.setInt(4, em.getIdE()); 
//   pstmt.setString(4, e.getTelE());
   return pstmt.executeUpdate();
  }
    catch(SQLException ex)
   {System.err.println(ex.getMessage());
   }
   return 0;
   }
  
  
   public int Modifier(Bibliothecaire b)
   {
   String req= "UPDATE Bibliothecaire SET nomB =?,prenomB = ?,adresseB = ?,telB =?,Mot_de_passe =? WHERE idB = ?";
   try{
   pstmt=con.prepareStatement(req);
   pstmt.setInt(6,b.getIdB());
   pstmt.setString(1, b.getNomB());
   pstmt.setString(2, b.getPrenomB());
//   pstmt.setInt(5, e.getIdE());
   pstmt.setString(3, b.getAdresseB());
   pstmt.setString(4,b.getTelB());
   pstmt.setString(5,b.getMot_de_passe());
//   pstmt.setString(4, e.getTelE());
   return pstmt.executeUpdate();
  }
    catch(SQLException ex)
   {System.err.println(ex.getMessage());
   }
   return 0;
   }

  public int Supprimer(int idl)
   {
   String sql="Delete from Livre  where idl=?";
   try{
   pstmt=con.prepareStatement(sql);
   pstmt.setInt(1, idl);
           int nlm=pstmt.executeUpdate();
           return nlm;
   }
   catch(SQLException ex)
   {
   System.err.println(ex.getMessage());
   }
   return 0;
   }
 
  
  
   public int supprimer(int idE)
   {
   String sql="Delete from Etudiant  where idE=?";
   try{
   pstmt=con.prepareStatement(sql);
//       int e = 0;
   pstmt.setInt(1, idE);
           int nlm=pstmt.executeUpdate();
           return nlm;
   }
   catch(SQLException ex)
   {
   System.err.println(ex.getMessage());
   }
   return 0;
   }

   public int SSupprimer(int idRes)
   {
   String sql="Delete from Reservation  where idRes = ?";
   try{
   pstmt=con.prepareStatement(sql);
   pstmt.setInt(1,idRes);
           int nlm=pstmt.executeUpdate();
           return nlm;
   }
   catch(SQLException ex)
   {
   System.err.println(ex.getMessage());
   }
   return 0;
   }

   
    public int SSSupprimer(int idEmp)
   {
   String sql="Delete from Emprunt  where idEmp = ?";
   try{
   pstmt=con.prepareStatement(sql);
   pstmt.setInt(1, idEmp);
           int nlm=pstmt.executeUpdate();
           return nlm;
   }
   catch(SQLException ex)
   {
   System.err.println(ex.getMessage());
   }
   return 0;
   }
    
     public int SSSSupprimer(int idB)
   {
   String sql="Delete from Bibliothecaire  where idB = ?";
   try{
   pstmt=con.prepareStatement(sql);
   pstmt.setInt(1, idB);
           int nlm=pstmt.executeUpdate();
           return nlm;
   }
   catch(SQLException ex)
   {
   System.err.println(ex.getMessage());
   }
   return 0;
   }
   
public List<Livre> getLivres() {
        List<Livre> Livres = new ArrayList<>();
        String req = "SELECT *  from Livre ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(req);
            while (rs.next()) {
                int idl = rs.getInt("idl");
                String noml = rs.getString("noml");
                String auteur = rs.getString("auteur");
                int volume =rs.getInt("volume");
                String maison =rs.getString("maison");
                String Isbn =rs.getString("Isbn");
                Livre l = new Livre(idl,noml,auteur,volume,maison,Isbn);
                Livres.add(l);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Livres;
    }


      public List<Etudiant> getEtudiants() {
        List<Etudiant> Etudiants = new ArrayList<>();
        String req = "SELECT *  from Etudiant ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(req);
            while (rs.next()) {
                int idE = rs.getInt("idE");
                String nomE = rs.getString("nomE");
                String prenomE = rs.getString("prenomE");
//                int volume =rs.getInt("volume");
                String adresseE =rs.getString("adresseE");
                String telE =rs.getString("telE");
                Etudiant e  = new Etudiant(idE,nomE,prenomE,adresseE,telE);
                Etudiants.add(e);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return Etudiants;
    }

     
      public List<Reservation> getReservations() {
        List<Reservation> Reservations = new ArrayList<>();
        String req = "select * from Reservation r inner join Etudiant e on e.idE = r.idE inner join livre l on l.idl=r.idl ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(req);
            while (rs.next()) {
                int idRes = rs.getInt("idRes");
                int  idl = rs.getInt("idl");
                String noml =rs.getString("noml");
                String dateRes = rs.getString("dateRes");
                String nomE =rs.getString("nomE");
                String PrenomE = rs.getString("prenomE");
                int idE = rs.getInt("idE");
//                int volume =rs.getInt("volume");
//                String adresseE =rs.getString("adresseE");
//                String telE =rs.getString("telE");
                Reservation r  = new Reservation(idRes,idl,noml,dateRes, idE,nomE,PrenomE);
                Reservations.add(r);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
//      List<Reservation> Reservations = null;
        return Reservations;
    }

     
       public List<Emprunt> getEmprunts() {
        List<Emprunt> Emprunts = new ArrayList<>();
        String req = " select * from Emprunt em inner join Etudiant e on e.idE = em.idE inner join livre l on l.idl=em.idl; ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(req);
            while (rs.next()) 
            {
                int idEmp = rs.getInt("idEmp");
                String dateEmp = rs.getString("dateEmp");
                String dateRem = rs.getString("dateRem");
//                String livre = rs.getString("livre");                
                String noml =rs.getString("noml");
                int idl =rs.getInt("idl");
                int idE =rs.getInt("idE");
                String nomE = rs.getString("nomE");
                String prenomE = rs.getString("prenomE");
                Emprunt em  = new Emprunt(idEmp,dateEmp,dateRem,noml,idl,nomE,prenomE,idE);
                Emprunts.add(em);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
//      List<Reservation> R = null;
//      List<Emprunt> Emprunts = null;
        return Emprunts;
    }


         public List<Bibliothecaire> getBibliothecaires() {
        List<Bibliothecaire> Bibliothecaires = new ArrayList<>();
        String req = "SELECT *  from Bibliothecaire ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(req);
            while (rs.next()) 
            {
                int idB = rs.getInt("idB");
                String nomB = rs.getString("nomB");
                String prenomB = rs.getString("prenomB");
                 String adresseB = rs.getString("adresseB");
//                int volume =rs.getInt("volume");
//                String adresseE =rs.getString("adresseE");
                String telB =rs.getString("telB");
                String Mot_de_passe =rs.getString("Mot_de_passe");
                Bibliothecaire b  = new Bibliothecaire(idB,nomB,prenomB,adresseB,telB,Mot_de_passe);
                Bibliothecaires.add(b);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
//      List<Reservation> R = null;
//      List<Emprunt> Emprunts = null;
        return Bibliothecaires;
    }
         public boolean seconnecter(String nomB,String prenomB,String Mot_de_passe){
         String sql = "select * from Bibliothecaire where nomB ='"+nomB+""+"'and prenomB= '"+prenomB+"' and Mot_de_passe='"+Mot_de_passe+"'";
         boolean s = false;
         
         try {
             stmt = con.createStatement ();
             rs = stmt.executeQuery(sql);
             while(rs.next())
         {
         s = true;
         }
         
         }
         
          catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return s;
    }
//     public List<Etudiant> chargerPersonne(){
//         List<Etudiant> nom_prenom = new ArrayList<>();
//         String req = "Select * from Etudiant";
//         try {
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(req);
//            while (rs.next()) 
//            {
//                int idE = rs.getInt("idB");
//                String nomE = rs.getString("nomB");
//                String prenomE = rs.getString("prenomB");
//                nom_prenom.add(new Etudiant(idE, nomE, prenomE));
//            }
//        } catch (SQLException ex) {
//            System.err.println(ex.getMessage());
//        }
//         return nom_prenom;
//     }    
         
         
         
}
