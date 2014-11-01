/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica34 {
    public static void main(String[] args) {
        int cont=1;
        long fat;
        
        while((fat=fatorial(cont-1))>0){
            System.out.println(fat);
            cont++;
        }
        System.out.println(mdc(12,24));
        System.out.println(mdc(7,5));
    }
    
    public static long fatorial(int m){
        if(m<0)
            return 0L;
        if(m==1 || m==0)
            return 1L;
        else
            return ((long)m*fatorial(m-1));
    }
    
    public static int mdc(int m, int n){
        if(n>m)
            return mdc(n,m);
        else{
            if(n==0)
                return m;
            else
                return mdc(n, m%n);
        }
    }
}
