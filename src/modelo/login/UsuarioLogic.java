package modelo.login;

import modelo.beans.Usuario;
import modelo.dao.UsuarioDAO;

/**
 *
 * @author USER
 */
public class UsuarioLogic {
    private static UsuarioDAO usuariodao=new UsuarioDAO();
    
    public static boolean autentificar(String usuario, String contraseña){
        if (obtener(usuario)!=null) {
            Usuario usuarioConsulta=obtener(usuario);
            if (usuarioConsulta.getUsuario().equals(usuario)&&usuarioConsulta.getContraseña().equals(contraseña)) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
    
    public static boolean insertar(Usuario usuario){
        return usuariodao.insertar(usuario);
    }
    public static boolean modificar(Usuario usuario){
        return usuariodao.modificar(usuario);
    }
    public static boolean eliminar(String usuario){
        return usuariodao.eliminar(usuario);
    }
    public static Usuario obtener(String usuario){
        return usuariodao.obtener(usuario);
    }
    
}
