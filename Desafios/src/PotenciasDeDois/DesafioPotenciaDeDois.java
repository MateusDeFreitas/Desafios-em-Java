package PotenciasDeDois;

/**
Potências de 2
Introdução 
A base 2 é uma das bases mais usadas em computação. Números nessa base são representados pela equação 2^n. Exemplo:

2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
E assim por diante.

Instruções 
Este desafio consiste em:

Ler um arquivo de números (abaixo), contendo um número por linha.
Se o número for uma potência de 2, imprimir o número seguido de true e o expoente ao qual se deve elevar 2 para obter o número.
Se o número não for uma potência de 2, imprimir o número seguido de false.
 */
public class DesafioPotenciaDeDois {
    
    
    public void exibirPotencia(int[] array) {
        
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] % 2 != 0 && array[i] != 1) {
                System.out.println(array[i] + " não é uma potência de 2.");
            } else {
                int contador = 0;
                int numero = 1;
                boolean verificador = true;
                
                while (verificador) {
                    if (numero == array[i]) {
                        System.out.println(array[i] + " é uma potência de 2 (2^" + contador + ").");
                        verificador = false;
                    } else if (numero > array[i]) {
                        System.out.println(array[i] + " não é uma potência de 2.");
                        verificador = false;
                    }
                    numero *= 2;
                    contador++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        DesafioPotenciaDeDois obj = new DesafioPotenciaDeDois();
        int[] numeros = {1,140,128,137,65535,65536,171798694};
        obj.exibirPotencia(numeros);
    }
}
