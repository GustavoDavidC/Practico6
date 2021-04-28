package entidades;

import java.util.*;

public class Directorio {
    
    private TreeMap<Long, Cliente> lista = new TreeMap <> ();
    
    public Cliente agregarCliente(long Tel, Cliente cliente){
        return(lista.put(Tel, cliente)); 
    }
    
    public Cliente buscarCliente(long Tel){
        return(lista.get(Tel));
    }
    
    public Set buscarTelefono(String apellido){
        Set <Long> nros = new HashSet <> ();
        Set <Long> claves = lista.keySet();
        for(Long iter:claves){
            if(lista.get(iter).getApellido().equals(apellido)){
               nros.add(iter);
            }
        }
        return(nros);
    }
    
    public List buscarClientes (String ciudad){
        List <Cliente> listaClientes = new ArrayList<>();
        Collection <Cliente> coleCliente = lista.values();
        for(Cliente iter:coleCliente){
            if(iter.getCiudad().equals(ciudad)){
                listaClientes.add(iter);
            }
        }
        
        return(listaClientes);
    }
    
       public TreeMap <Long, Cliente> borrarCliente(Long dni){
        
        TreeMap <Long,Cliente> cli = new TreeMap<>();
        
        Set <Long> claves = lista.keySet();
        
        for(Long tel:claves){
            if(lista.get(tel).getDni().equals(dni)){
            
            cli.put(tel, lista.get(tel));
            lista.remove(tel);
            return(cli);
            }
        }
        return(null);
       }
       
}
