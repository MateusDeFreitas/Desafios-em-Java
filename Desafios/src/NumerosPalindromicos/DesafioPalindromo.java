package NumerosPalindromicos;

/*
Um palíndromo é uma palavra ou expressão que pode ser lida da esquerda para a direita ou da direita para a esquerda mantendo o mesmo significado. Um exemplo de palíndromo é a palavra “reviver”.

Neste desafio, a idéia é imprimir todos os números palindrômicos entre dois outros números. Tal como as palavras, os números palindrômicos mantém o mesmo valor se lidos de trás para a frente.

Observe que o número inicial e final devem ser incluídos nos resultados, caso também sejam palíndromos.

Exemplo 1: Dado o número inicial 1 e número final 20, o resultado seria: 1, 2, 3, 4, 5, 6, 7, 8, 9, 11.

Exemplo 2: Dado o numero inicial 3000 e número final 3010, o resultado seria: 3003.

Exemplo 3: Dado o número inicial 101 e número final 121, o resultado seria: 101, 111, 121.

Para o desafio, assuma:

Apenas inteiros positivos podem ser usados como limites.
Números de um algarismo são palíndromos por definição.
Máximo número: (1 << 64) - 1 (máximo unsigned int de 64 bits).
*/


public class DesafioPalindromo {
    
    public String inverterStr(String palavra) {
        String invertida = "";
        
        for (int i = palavra.length() - 1 ; i >= 0 ; i--) {
            invertida += palavra.charAt(i);
        }
        
        return invertida;
    }
    
    public void palindromo(int inicio, int fim) {        
        if (inicio < 0 || fim < 0) {
            System.out.println("Os parâmetros de entrada devem ser positivos.");
        } else if (fim < inicio) {
            System.out.println("O segundo parâmetro (FIM) não pode ser menor do que o primeiro (INICIO).");
        } else {
            for (int i = inicio ; i <= fim ; i++) {
            if(String.valueOf(i).equals(inverterStr(String.valueOf(i)))) {
                System.out.println(i);
            }
        }
        }
    }   
    
    public static void main(String[] args) {
        
        DesafioPalindromo obj = new DesafioPalindromo();
        
        obj.palindromo(1,100);
    }
}
