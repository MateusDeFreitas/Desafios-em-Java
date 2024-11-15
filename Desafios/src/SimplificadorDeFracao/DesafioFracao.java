package SimplificadorDeFracao;

/*
Escreva um programa que leia um arquivo texto contendo uma lista de frações em ASCII (uma por linha)

e produza na saída a versão simplificada de cada fração. Números simples assumem denominador 1 (apenas imprima o número).

Divisões inteiras como 81/9 devem imprimir o número inteiro 9. Em caso de erros na entrada (como divisão por zero), 

imprima “ERR” em maíusculas.
 */
public class DesafioFracao {
    
    public void simplificarFracao(String[] array) {
        
        int resultado;
        int numerador;
        int divisor;
        int resto;
        int denominador;
        int multiplo;
        String numeradorStr;
        String denominadorStr;
        boolean verificador;
                
        for (int i = 0 ; i < array.length ; i++) {
            
            divisor = 0;
            numeradorStr = "";
            denominadorStr = "";
            multiplo = 2;
            verificador = true;
            
            for (int j = 0 ; j < array[i].length() ; j++) {
                
                if(array[i].charAt(j) != '/' && divisor == 0) {
                    numeradorStr += array[i].charAt(j);
                } else if (array[i].charAt(j) == '/') {
                    divisor++;
                } else if(array[i].charAt(j) != '/' && divisor == 1) {
                    denominadorStr += array[i].charAt(j);
                }
            }
            
            if (numeradorStr != "") {
                numerador = Integer.parseInt(numeradorStr);
            } else {
                numerador = 0;
            }
            if (denominadorStr != "") {
                denominador = Integer.parseInt(denominadorStr);
            } else {
                denominador = 1;
            }
            
            if (denominador == 0) {
                System.out.println("ERRO - Divisão por zero" + ".\n");
            } else {
                if (numerador % denominador == 0) {
                    resultado = numerador / denominador;

                    System.out.println("A equação " + numerador + "/" + denominador + " é inteira e tem como resultado: " + resultado + ".\n");
                } else {
                    resultado = numerador / denominador;
                    resto = numerador % denominador;
                    
                    while (verificador) {
                        if (multiplo > numerador || multiplo > denominador) {
                            verificador = false;
                        }
                        if (resto % multiplo == 0 && denominador % multiplo == 0) {
                            resto /= multiplo;
                            denominador /= multiplo;
                        } else {
                            multiplo++;
                        }
                    }

                    if (resultado == 0) {
                        System.out.println("A equação " + array[i] + " não é inteira, sua forma simplificada é " + resto + "/" + denominador + ".\n");
                    } else {
                        System.out.println("A equação " + array[i] + " não é inteira, sua forma simplificada é " + resultado + " inteiros + " + resto + "/" + denominador + ".\n");
                    }
                }
            }
        }
    }
    
    
       
    public static void main(String[] args) {
        
        DesafioFracao obj = new DesafioFracao();
        
        String[] numeros = {"14/3","3/8","4/8","4/3","5","10/0","48/12"};
        
        obj.simplificarFracao(numeros);
    }
    
}
