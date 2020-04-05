package level.two.array;

/**
 * Os testes para estes metodos estao em:
 * src.test.java.level.two.array
 * MODIFIQUE OS RETURNS
 */
public class SearchAndCalculate {

    /**
     * @return a soma do maior e o menor elemento
     * Exemplo: [1, 0, 7, 9] retorna 9 + 0
     * Exemplo: [1, 0, 7, 9, 9] retorna 9 + 0
     * Exemplo: [9] retorna 9 + 9
     */
    public int sumBiggestAndSmallestElement(int[] array) {
        // implemente a função aqui.
        return -1;
    }

    /**
     * @return a soma de todos os elementos com excecao do maior e o menor
     * Exemplo: [1, 0, 7, 9] retorna 1 + 7
     * Exemplo: [0, 0, 7, 9] retorna 7
     * Exemplo: [9] retorna 0
     */
    public int sumAllElementsExceptBiggestAndSmallest(int[] array) {
        // implemente a função aqui.
        return -1;
    }

    /**
     * @return a soma de todos os numeros pares
     * Exemplo: [1, 0, 7, 9] retorna 0
     * Exemplo: [1, 0, 7, 8] retorna 0 + 8
     * Exemplo: [1, 2, 2, 8] retorna 2 + 2 + 8
     * Exemplo: [1, 3, 3, 9] retorna 0
     */
    public int sumEvenElement(int[] array) {
        // implemente a função aqui.
        return -1;
    }

    /**
     * @return se o menor elemento se repetir, deve retornar a soma entre eles
     * caso contrario, retornar apenas ele.
     * Exemplo: [1, 1, 1, 9, 2, 10] retorna 1 + 1 + 1
     * Exemplo: [1, 1, 0, 0, 2, 10] retorna 0 + 0
     * Exemplo: [0, 1, 1, 9, 2, 10] retorna 0
     */
    public int sumSmallerElementRepeated(int[] array) {
        // implemente a função aqui.
        return -1;
    }

    /**
     * Chefao 1 ### Yellow Devil ####
     * @return A soma de todos os elementos pares que se repetem sequencialmente no primeiro array
     * Com a soma de todos os elementos nao sequenciais do segundo array
     * Exemplo array 1 [1, 2, 2, 4] -> soma dos elementos pares sequenciais 2 + 2 = 4
     * array 2 [1, 2, 2, 3, 4] -> soma dos elementos nao sequenciais 1 + 3 + 4 = 8
     * No final retorna 4 + 8 = 12
     * Segue mais exemplos de cada array:
     * Array 1 [1, 2, 2, 4, 5, 6, 6]  -> 2 + 2 + 6 + 6
     * Array 1 [1, 2, 2, 4, 5, 6, 6, 2]  -> 2 + 2 + 6 + 6
     * Array 1 [1, 2, 3, 3, 3, 0, 6]  -> 0 - Retorna zero caso nao tenha repeticao sequencial de pares
     * Array 1 [2, 2, 3, 2, 2, 2]  -> 2 + 2 + 2 - neste caso, considerar a maior sequencia
     *
     * Array 2 [1, 2, 2, 4, 5, 6, 6]  -> 1 + 4 + 5
     * Array 2 [1, 2, 2, 4, 5, 6, 6, 2] -> 1 + 4 + 5 - nqo considerar o 2 solto, se ele ja tiver sequencia antes
     * Array 2 [1, 2, 1, 4, 1, 0, 1]  -> 1 + 2 + 4 + 0 - nao considerar numeros soltos repetidos nao sequenciais
     */
    public int bigBossMethod(int[] array1, int[] array2) {
        // implemente a função aqui.
        return -1;
    }
}
