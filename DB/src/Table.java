import java.util.List;

public class Table {
    List<Champ> champs;
    String _nom_table;
    Champ _cleprimaire = null;
    Champ _clesecondaire = null;

    public Table(){this._nom_table="Table";}

    public  Table(String nom){
        this._nom_table=nom;
    }
}
