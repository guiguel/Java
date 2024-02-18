package application;

import com.sun.source.tree.TryTree;

import java.beans.DefaultPersistenceDelegate;
import java.math.BigDecimal;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("produto1", Double.valueOf(10));
        map.put("produto2", 50.5);
        map.put("produto3", Double.valueOf(2));
        map.put("produto4", 10.5);

        boolean comissao = true;
        Double comissaoValor = 0.0;

        double total = processCalculodeProdutos(map, comissao);

        if (comissao) {
            System.out.println("inicio_total="+total);
            double comissaoVenda = (total * 20) / 100;
            comissaoValor = comissaoVenda;
        } else {
            System.out.println("entrei nesse");
            total = processCalculodeProdutos(map, comissao);
        }

        System.out.println("Total = " + total);
        if (comissaoValor >= 0) {
            System.out.println("Comissao = " + comissaoValor);
        }
    }

    private static double processCalculodeProdutos(HashMap map, boolean comissao){

        Float total = 0.0F;

        try{
            if(comissao){
                total = somarTotal(map);
            } else {
                double totalProcessado = processCalculodeProdutos(map, false);
                return totalProcessado;
            }
        } catch (Exception e){
            return 0;
        }

        return Double.valueOf(total);
    }

    private static Float somarTotal(HashMap map){
        Float f = 0.0F;
        for(Object m : map.values()){

            BigDecimal value = BigDecimal.valueOf((Double) m);
            System.out.println("valorMAP=" + value);
            f += value.floatValue();
        }
        return f;
    }
}