import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.internal.Exceptions4;
import com.db4o.query.Query;

import java.io.File;
import java.util.List;
//import com.sun.org.apache.xml.internal.security.signature.ObjectContainer;

public class AccesDB {

    final static String DB_FOLDER = "C:\\Users\\PORTATIL\\Documents\\A-Universidad\\Tercero";
    //final static String DB_FOLDER = System.getProperty("user.home");

    final static String DB_FILE = "bd-bancaria.db4o";

    final static String DB4OFILENAME = DB_FOLDER + "\\" + DB_FILE;

    public static void main(String[]args) {
        new File(DB4OFILENAME).delete();
        ObjectContainer db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);

        Usuario u = new Usuario("31168350Y","Naida","Ayala",81,"2817 Dictum. C.","et.netus@dolorDonecfringilla.edu",23980911,null);
        almacenarUsuario(db,u);

        ObjectSet result2 = db.queryByExample(Usuario.class);
        listResult(result2);

        cerrarConexion(db);
    }

    public static void cerrarConexion(ObjectContainer obj) {
        try {
            obj.close();
        }
        catch(Exception e) {
            System.out.print("Error al cerrar conexion");
        }
    }
    public static void almacenarUsuario(ObjectContainer obj, Usuario u) {
        try {
            obj.store(u);
            System.out.print("Se ha almacenado correctamente el usuario");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar usuario");
        }
    }

    public static void listResult(List<?> result){
        System.out.println(result.size());
        for (Object o : result) {
            System.out.println(o);
        }
    }

}
