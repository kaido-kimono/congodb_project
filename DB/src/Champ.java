
public class Champ <F> {
    Donnee <F> _donnee;
    String _nom_champ;

    public Champ(String nom_champ, F donnee){

        this._nom_champ = nom_champ;

        if (donnee instanceof Integer){
            this._donnee = new <Integer> Donnee(donnee);
        }
        else if(donnee instanceof Double){
            this._donnee=new<Double> Donnee(donnee);
        }
        else if (donnee instanceof String){
            this._donnee=new <String> Donnee(donnee);
        }
        else if (donnee instanceof Boolean){
            this._donnee = new <Boolean> Donnee(donnee);
        }
        else if (donnee instanceof Character){
            this._donnee = new<Character> Donnee(donnee);
        }
        else if (donnee instanceof Float){
            this._donnee = new<Float> Donnee(donnee);
        }
        else if (donnee instanceof Long){
            this._donnee = new<Long> Donnee(donnee);
        }
        else if (donnee instanceof Byte){
            this._donnee = new<Byte> Donnee(donnee);
        }
        else if (donnee instanceof Short){
            this._donnee = new<Short> Donnee(donnee);
        }
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
