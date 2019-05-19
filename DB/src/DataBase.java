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

    public void creerTable(){
        Table table = new Table();
        this.tables.add(table);
    }
    public void creerTable(String nom_table){
        Table table = new Table(nom_table);
        this.tables.add(table);
    }
    public void SuppimerTable(String nom_table){
        tables.forEach(table -> {if(table._nom_table==nom_table){
        this.tables.remove(table);}
        });
    }

}
