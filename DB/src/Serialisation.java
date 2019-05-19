import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialisation <T>{
    public void serialise(List<T> L, String nom_fichier)throws ClassNotFoundException{
        ObjectOutputStream save = null;

        try{
            final FileOutputStream fichier = new FileOutputStream(nom_fichier);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
