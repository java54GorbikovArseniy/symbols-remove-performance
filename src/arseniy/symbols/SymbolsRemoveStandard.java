package arseniy.symbols;

public class SymbolsRemoveStandard implements SymbolsRemove{

    private final String REGEX = "|<([{\\^-=$!]})?*+.>";
    @Override
    public String removeSymbol(String str, char symbol) {
        String regex = REGEX.indexOf(symbol) == -1 ? Character.toString(symbol) : "\\" + symbol;
        return str.replaceAll(regex, "");
    }
}