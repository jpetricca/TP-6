package negocio;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class DirectorioTelefonico {

    TreeMap <Long,Cliente> directorio = new TreeMap<>();
    
    public boolean agregarCliente(long telefono, Cliente cliente ) {
        if (!directorio.containsKey(telefono)){
            directorio.put(telefono,cliente);
            return true;
        }else {
            return false;
        }   
    }

    public Cliente buscarCliente(long telefono) {
        return directorio.get(telefono);
    }

    Set<Long> buscarTelefono(String apellido){
        //No tiene duplicado de claves     
        HashSet<Long> telefonos = new HashSet<>();
        //Conjunto de claves o telefonos
        Set<Long> claves = directorio.keySet();
        
        Iterator <Long>it=claves.iterator();
        while(it.hasNext()){
            long tel = it.next();
            Cliente client = directorio.get(tel);
            if(client.getApellido().equals(apellido)){
                telefonos.add(tel);
            }
        }   
            System.out.println("Sus telefonos son: ");
        return telefonos;
    }

    public List<Cliente> buscarClientes(String ciudad){
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        Set<Long> tels = directorio.keySet();
        Iterator<Long> it = tels.iterator();
        while(it.hasNext()){
            Long telefono = it.next();
            Cliente c = directorio.get(telefono);
            if(c.getCiudad().equals(ciudad)){
                clientes.add(c);
            }
        }
        return clientes;
    }


    public Cliente borrarCliente(long tel){
        Cliente clienteABorrar = directorio.remove(tel);
        
        if(clienteABorrar!=null){
            JOptionPane.showMessageDialog(null, "Cliente Borrado");         
        }else {
            JOptionPane.showMessageDialog(null, "No existe ese Telefono");
        }   
        return clienteABorrar;
    }

}