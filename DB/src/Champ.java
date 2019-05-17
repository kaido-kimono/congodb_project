
public class Champ <F> {
    Donnee <F> _donnee;
    String _nom_champ;

    public Champ(String nom_champ, int donnee){
        this._donnee = new <Integer> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,String donnee){
        this._donnee=new <String> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,double donnee){
        this._donnee=new<Double> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,boolean donnee ){
        this._donnee = new <Boolean> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,char donnee){
        this._donnee = new<Character> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,float donnee){
        this._donnee = new<Float> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,long donnee){
        this._donnee = new<Long> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,byte donnee){
        this._donnee = new<Byte> Donnee(donnee);
        this._nom_champ = nom_champ;
    }
    public Champ(String nom_champ,short donnee){
        this._donnee = new<Short> Donnee(donnee);
        this._nom_champ = nom_champ;
    }

    public Donnee get_donnee() {
        return _donnee;
    }

    public String get_nom_Champ() {
        return _nom_champ;
    }

    public void set_nom_Champ(String _nom_Champ) {
        this._nom_champ = _nom_Champ;
    }



}
