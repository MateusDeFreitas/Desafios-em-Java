package KnightTour;

public class DesafioCavalo {
    
    public void desvendarCaminho(String posicao) {
        
        int[][] tabuleiro = new int[8][8];
        
        int posX; // vertical / numero
        int posY; // horizontal / letra       
        boolean continuar = true;
        
        posX = converterPosicao(posicao, 1);
        posY = converterPosicao(posicao, 0);
        
        if (posX < 0 || posX > 7 || posY < 0 || posY > 7) {
            System.out.println("Posição inicial invalida.");
        } else {
            tabuleiro[posX][posY] = 1;
            desconverterPosicao(posX,posY);
        }
        
        while (continuar) {
            if (posX + 2 <= 7 && posY + 1 <= 7 && tabuleiro[posX+2][posY+1] != 1) {
                posX += 2;
                posY += 1;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX + 2 <= 7 && posY - 1 >= 0 && tabuleiro[posX+2][posY-1] != 1) {
                posX += 2;
                posY -= 1;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX + 1 <= 7 && posY + 2 <= 7 && tabuleiro[posX+1][posY+2] != 1) {
                posX += 1;
                posY += 2;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX + 1 <= 7 && posY - 2 >= 0 && tabuleiro[posX+1][posY-2] != 1) {
                posX += 1;
                posY -= 2;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX - 2 >= 0 && posY + 1 <= 7 && tabuleiro[posX-2][posY+1] != 1) {
                posX -= 2;
                posY += 1;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX - 2 >= 0 && posY - 1 >= 0 && tabuleiro[posX-2][posY-1] != 1) {
                posX -= 2;
                posY -= 1;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX - 1 >= 0 && posY + 2 <= 7 && tabuleiro[posX-1][posY+2] != 1) {
                posX -= 1;
                posY += 2;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else if (posX - 1 >= 0 && posY - 2 >= 0 && tabuleiro[posX-1][posY-2] != 1) {
                posX -= 1;
                posY -= 2;
                tabuleiro[posX][posY] = 1;
                desconverterPosicao(posX,posY);
            } else {
                if (!todosUms(tabuleiro)) {
                    System.out.println("O cavaleiro não tem mais para onde ir.");
                    continuar = false;
                } else {
                    System.out.println("O cavaleiro completou o tabuleiro.");
                    continuar = false;
                }
            }
        }
    }
    
    public boolean todosUms(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 1) {
                    return false; // Se encontrar um elemento diferente de 0, retorna false
                }
            }
        }
        return true; // Todos os elementos são 0
    }
    
    public int converterPosicao(String posicao, int x) {
        int valor = -1;
        if( x == 1) {
            valor = posicao.charAt(1) - '1';
        } else if (x == 0) {
            switch(posicao.charAt(0)) {
                case 'a':
                    valor = 0;
                    break;
                case 'b':
                    valor = 1;
                    break;
                case 'c':
                    valor = 2;
                    break;
                case 'd':
                    valor = 3;
                    break;
                case 'e':
                    valor = 4;
                    break;
                case 'f':
                    valor = 5;
                    break;
                case 'g':
                    valor = 6;
                    break;
                case 'h':
                    valor = 7;
                    break;
            }
        }
        return valor;
    }
    
    public void desconverterPosicao(int posicaoVertical, int posicaoHorizaontal) {
        char letra;
        switch (posicaoHorizaontal) {
            case 0:
                letra = 'a';
                break;
            case 1:
                letra = 'b';
                break;
            case 2:
                letra = 'c';
                break;
            case 3:
                letra = 'd';
                break;
            case 4:
                letra = 'e';
                break;
            case 5:
                letra = 'f';
                break;
            case 6:
                letra = 'g';
                break;
            case 7:
                letra = 'h';
                break;
            default:
                letra = ' ';
                break;
        }
        posicaoVertical++;
        System.out.println(letra+""+posicaoVertical);
    }
    
    
    public static void main(String[] args) {
        DesafioCavalo obj = new DesafioCavalo();
        
        obj.desvendarCaminho("a2");
    }
}
