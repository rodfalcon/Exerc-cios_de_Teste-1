
package Pagamento;


public class Calculo_Salario extends Salario {
    private double fator_dias;
    private double fator_horas;
    
    Salario s = new Salario();
    
     public double Calculo_Salario(Salario r){
         fator_dias = r.getDias_trabalhados()/30;
         fator_horas = r.getHoras_trabalhadas()/8;
         return r.getSalario()* fator_horas * fator_dias;
     }
}
