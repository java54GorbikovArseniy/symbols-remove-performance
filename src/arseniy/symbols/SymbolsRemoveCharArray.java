package arseniy.symbols;

public class SymbolsRemoveCharArray implements SymbolsRemove{
    @Override
    public String removeSymbol(String str, char symbol) {
        char[] chars = new char[str.length()];
        int lengthNewArray = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != symbol){
                chars[lengthNewArray++] = str.charAt(i);
            }
        }
        char[] res = new char[lengthNewArray];
        System.arraycopy(chars, 0, res, 0, res.length);
        return new String(res);
    }


//    @Override
//    public String removeSymbol(String str, char symbol) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)!= symbol){
//                stringBuilder.append(str.charAt(i));
//            }
//        }
//        return stringBuilder.toString();
//    }
}