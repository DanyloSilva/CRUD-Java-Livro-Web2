/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;
import java.util.ArrayList;
import java.util.List;
import negocios.Livro;

/**
 *
 * @author danylosilva
 */
public class RepositorioLivro {
    
     private static int cont = 1;
    
    private static List<Livro> livro = new ArrayList<>();
    
    public static void inserir(Livro l){
        l.setId(cont++);
        livro.add(l);
    }
    
    public static void alterar(Livro l){
        
        for(Livro cont: livro){
            if(cont.getId() == l.getId()){
                
                cont.setNome(l.getNome());
                cont.setAutor(l.getAutor());
                cont.setAno(l.getAno());
                cont.setGen(l.getGen());
                cont.setSes(l.getSes());
                cont.setPra(l.getPra());
            
            }
            return;
        }
    }
    
    public static Livro ler(int id){
        for(Livro l: livro){
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }
    
    public static void delete(Livro l){
        
        Livro cAux = null;
        
        for(Livro cont: livro){
            if(cont.getId() == l.getId()){
                cAux = cont;
                break;
            }
        }
        
        livro.remove(cAux);
        
        
    }
    
    public static List<Livro> lerTudo(){
        return livro;
    }
    
    
    
    
}
