import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @org.junit.jupiter.api.Test
    void convertStringToMorseSymbols() {
        Utils u = new Utils();
        String example = ".-.";
        Assert.assertArrayEquals(new MorseSymbol[]{MorseSymbol.DOT, MorseSymbol.HYPHEN, MorseSymbol.DOT}, u.convertStringToMorseSymbols(example));
    }
}