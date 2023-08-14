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

    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] characters = string.split("");
        for (String character : characters) {
            AbstractTextComponent textComponent = new SymbolLeaf(character.charAt(0));
            abstractTextComponent.add(textComponent);
        }
    }
}
