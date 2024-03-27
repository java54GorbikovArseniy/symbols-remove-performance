package arseniy.performance.symbols;

import arseniy.symbols.SymbolsRemove;
import arseniy.symbols.SymbolsRemoveCharArray;
import arseniy.symbols.SymbolsRemoveStandard;

import java.util.Random;

public class SymbolsRemovePerformanceAppl {

    private static final int N_STRING_LENGTH = 10000;
    private static final int N_RUNS = 1000;
    private static Random random = new Random();

    public static void main(String[] args) {
        String string = getRandomString(N_STRING_LENGTH);
        char randomCharacter = getRandomASCIICharacter();
        SymbolRemovePerformanceTest symbolRemoveCharArray = getTest("symbolRemoveCharArray", N_RUNS, new SymbolsRemoveCharArray(), string, randomCharacter);
        SymbolRemovePerformanceTest symbolRemoveStandard = getTest("symbolRemoveStandard", N_RUNS, new SymbolsRemoveStandard(), string, randomCharacter);
        symbolRemoveCharArray.run();
        symbolRemoveCharArray.run();
    }

    private static char getRandomASCIICharacter(){
        return (char) (32 + random.nextInt(95));
    }

    private static String getRandomString(int stringLength){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append(getRandomASCIICharacter());
        }
        return stringBuilder.toString();
    }

    private static SymbolRemovePerformanceTest getTest(String displayName, int nRuns, SymbolsRemove symbolsRemove, String str, char symbol){
        return new SymbolRemovePerformanceTest(displayName, nRuns, symbolsRemove, str, symbol);
    }
}
