import com.db4o.Db4oEmbedded;
import com.db4o.EmbeddedObjectContainer;
import com.db4o.ObjectContainer;
import com.db4o.internal.Exceptions4;
//import com.sun.org.apache.xml.internal.security.signature.ObjectContainer;


/**
 * Created by anicacortes on 01/04/2016.
 */
public class AccesDB {

    public static void main(String[]args) {
        EmbeddedObjectContainer bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"C:\\dbObject.yap");
    }

    public static void cerrarConexion(ObjectContainer obj) {
        try {
            obj.close();
        }
        catch(Exception e) {
            System.out.print("Error al cerrar conexion");
        }
    }
    public static void almacenarUsuario(ObjectContainer obj, Usuario usu) {
        try {
            obj.store(usu);
            System.out.print("Se ha almacenado correctamente el usuario");
        }
        catch(Exception e) {
            System.out.print("Error al almacenar usuario");
        }
    }
    //Mas metodos de almacenamiento en BD
}
