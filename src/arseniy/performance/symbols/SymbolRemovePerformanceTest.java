package arseniy.performance.symbols;

import arseniy.performance.PerformanceTest;
import arseniy.symbols.SymbolsRemove;

public class SymbolRemovePerformanceTest extends PerformanceTest {
    private char symbol;
    private String str;
    private SymbolsRemove symbolsRemove;

    protected SymbolRemovePerformanceTest(String displayName, int nRuns, SymbolsRemove symbolsRemove, String str, char symbol) {
        super(displayName, nRuns);
        this.symbol = symbol;
        this.str = str;
        this.symbolsRemove = symbolsRemove;
    }

    @Override
    protected void runTest() {
        symbolsRemove.removeSymbol(str, symbol);
    }
}
