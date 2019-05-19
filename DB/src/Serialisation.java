import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialisation <T>{
    public void serialise(List<T> L, String nom_fichier)throws ClassNotFoundException{
        ObjectOutputStream save = null;

        try{
            final FileOutputStream fichier = new FileOutputStream(nom_fichier);
            save = new ObjectOutputStream(fichier);
            save.writeObject(L);
            save.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void serialise(T L, String nom_fichier)throws ClassNotFoundException{
        ObjectOutputStream save = null;

        try{
            final FileOutputStream fichier = new FileOutputStream(nom_fichier);
            save = new ObjectOutputStream(fichier);
            save.writeObject(L);
            save.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
