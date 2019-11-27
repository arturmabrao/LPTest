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

    
    public float getDesconto(Consumidor cons) {
        float dia = (float)get(GregorianCalendar.DAY_OF_MONTH);
        float idnt = (float) cons.getId();
        float oper = idnt%dia;
        
        if(idnt > 0 && idnt < 32){
            if(dia<15){
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
        return 10.0f;
    }

    @Override
    public float getDesconto() {
        return 5;
    }
}
