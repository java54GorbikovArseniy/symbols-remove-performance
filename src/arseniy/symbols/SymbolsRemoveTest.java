package arseniy.symbols;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SymbolsRemoveTest {

    @Test
    void symbolsRemoveStandardAndCharArray(){
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab|AB", '|'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab+AB", '+'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab>AB", '>'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab.AB", '.'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab*AB", '*'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab?AB", '?'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab)AB", ')'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab}AB", '}'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab]AB", ']'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab!AB", '!'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab$AB", '$'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab=AB", '='));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab-AB", '-'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab^AB", '^'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab\\AB", '\\'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab{AB", '{'));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab[AB", '['));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab(AB", '('));
        assertEquals("abAB", new SymbolsRemoveStandard().removeSymbol("ab<AB", '<'));


        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab|AB", '|'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab+AB", '+'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab>AB", '>'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab.AB", '.'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab*AB", '*'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab?AB", '?'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab)AB", ')'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab}AB", '}'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab]AB", ']'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab!AB", '!'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab$AB", '$'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab=AB", '='));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab-AB", '-'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab^AB", '^'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab\\AB", '\\'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab{AB", '{'));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab[AB", '['));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab(AB", '('));
        assertEquals("abAB", new SymbolsRemoveCharArray().removeSymbol("ab<AB", '<'));

    }
}
