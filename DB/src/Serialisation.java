import java.io.*;
import java.util.ArrayList;
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

    public List<T> Deserialises(String nom_fichier) throws ClassNotFoundException{
        List<T> L = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream(nom_fichier);
            ObjectInputStream get = new ObjectInputStream(file);
            L = (ArrayList<T>) get.readObject();
            get.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  L;
    }
    public T Deserialise(String nom_fichier) throws ClassNotFoundException{
        T L ;

        try {
            FileInputStream file = new FileInputStream(nom_fichier);
            ObjectInputStream get = new ObjectInputStream(file);
            L = (T) get.readObject();
            get.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  L;
    }
}