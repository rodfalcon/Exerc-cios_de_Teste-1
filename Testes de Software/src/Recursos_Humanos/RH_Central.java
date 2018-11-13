
package Recursos_Humanos;

import Pagamento.Calculo_Salario;
import Pagamento.Salario;
import Identificação.Empresa;
import Identificação.Funcionario;

public class RH_Central {
    public static void main(String args[]){
        Salario s = new Salario();
        Calculo_Salario c = new Calculo_Salario();
        Empresa d = new Empresa();
        Funcionario x = new Funcionario();
        
        s = valores(s);
        s.getSalario();
        d.setNome_empresa("FUTANARI CORP");
        d.setSection("Recrutadora");
        x.setNome_funcionario("Mario Karasuma");
        x.setMatricula("MATRÍCULA XXXXXXXXXX");
        Imprime(c, d, x, s);
        
        c.setSalario(2000.00);
        c.setDias_trabalhados(28);
        c.setHoras_trabalhadas(10);
        d.setNome_empresa("KONAMI");
        d.setSection("Games");
        x.setNome_funcionario("Hideo Kojima");
        x.setMatricula("MATRÍCULA ALPHAXYZ");
        Imprime(c, d, x, c);
    }
        public static Salario valores(Salario r){
            r.setSalario(12345.60);
            r.setHoras_trabalhadas(7.8);
            r.setDias_trabalhados(30);
            
            return r;
        }
        public static void Imprime(Calculo_Salario c, Empresa d, Funcionario x, Salario r){
            System.out.println("Empresa: " + d.getNome_empresa());
            System.out.println("Seção: " + d.getSection());
            System.out.println("Funcionário: " + x.getNome_funcionario());
            System.out.println("Matrícula: " + x.getMatricula());
            System.out.println("Salário: " + c.Calculo_Salario(r));
        }
    }   

