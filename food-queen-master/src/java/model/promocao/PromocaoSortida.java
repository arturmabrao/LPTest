package model.promocao;
import java.util.GregorianCalendar;
import static javax.swing.UIManager.get;
import model.Consumidor;


/**
 *
 * @author Artur
 */
public class PromocaoSortida implements Promocao{

    public int id;

    public PromocaoSortida() {
        this.id = 5;
    }

    @Override
    public String getNome() {
        return "Sortida";
    }

    @Override
    public int getId() {
        return 5;
    }

    
    public float getDesconto(Consumidor cons, int dia) {
        int idnt = cons.getId();
        int oper = idnt%dia;
        
        if(dia<32){
        if(idnt < 32){
            if(dia<16){
                return dia*2;
            }else{
                return dia;
            }
        }
        if(oper==0){
            return 23.0f;
        }else if(oper<6){
            return 28.0f;
        }else if(oper<11){
            return 33.0f;
        }else if(oper<16){
            return 38.0f;
        }else if(oper<21){
            return 43.0f;
        }else if(oper<26){
            return 48.0f;
        }else if(oper<31){
            return 51.0f;
        }
        }else{
        
        return 0.0f;
    }
        return 0;
}
 
    @Override
    public float getDesconto() {
        return 5;
    }
}
