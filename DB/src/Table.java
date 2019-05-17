import java.util.List;

public class Table<T> {
    List<Champ> champs;
    String _nom_table;
    Champ _cleprimaire = null;
    Champ _clesecondaire = null;

    public Table(){this._nom_table="Table";}

    public  Table(String nom){
        this._nom_table=nom;
    }

    public void AjoutChamp(String nom,T donne){
        Champ champ = new Champ(nom,donne);
        this.champs.add(champ);
    }



}
