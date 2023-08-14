package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {

    public WordParser() {
    }
    // Write your code here!
    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        TextComponent wordComponent = new TextComponent(TextComponentType.WORD);
        char[] symbols = string.toCharArray();
        for (char symbol : symbols) {
            SymbolLeaf symbolLeaf = new SymbolLeaf(symbol);
            wordComponent.add(symbolLeaf);
        }
        abstractTextComponent.add(wordComponent);
    }
}
