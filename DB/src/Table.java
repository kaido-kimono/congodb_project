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

    public List<Champ> getChamps() {
        return champs;
    }

    public String get_nom_table() {
        return _nom_table;
    }

    public void set_nom_table(String _nom_table) {
        this._nom_table = _nom_table;
    }

    public Champ get_cleprimaire() {
        return _cleprimaire;
    }

    public void set_cleprimaire(Champ _cleprimaire) {
        this._cleprimaire = _cleprimaire;
    }

    public Champ get_clesecondaire() {
        return _clesecondaire;
    }

    public void set_clesecondaire(Champ _clesecondaire) {
        this._clesecondaire = _clesecondaire;
    }

    public void AjoutChamp(String nom, T donne){
        Champ champ = new Champ(nom,donne);
        this.champs.add(champ);
    }

}
