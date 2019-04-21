public class Champ<F> {
    Donnee  _donnee;
    String _nom_champ;

    public Champ(int donnee){
        this._donnee = new <Integer> Donnee(donnee);
    }
    public Champ(String donnee){
        this._donnee=new <String> Donnee(donnee);
    }
    public Champ(double donnee){
        this._donnee=new<Double> Donnee(donnee);
    }
    public Champ(boolean donnee ){
        this._donnee = new <Boolean> Donnee(donnee);
    }
    public Champ(char donnee){
        this._donnee = new<Character> Donnee(donnee);
    }
    public Champ(float donnee){
        this._donnee = new<Float> Donnee(donnee);
    }
    public Champ(long donnee){
        this._donnee = new<Long> Donnee(donnee);
    }
    public Champ(byte donnee){
        this._donnee = new<Byte> Donnee(donnee);
    }
    public Champ(short donnee){
        this._donnee = new<Short> Donnee(donnee);
    }

}
