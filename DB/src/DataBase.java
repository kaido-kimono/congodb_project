import java.util.List;

public class DataBase {
    List<Table> tables;
    String _nom_database;
    String _nom_utilisateur;
    String _mot_de_passe;

    public DataBase(String nomDb, String nomUser){
        this._nom_database = nomDb;
        this._nom_utilisateur = nomUser;
    }



}
