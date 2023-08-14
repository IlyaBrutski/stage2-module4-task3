package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    // Write your code here!
    public LexemeParser() {
    }

    public LexemeParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split(LEXEME_REGEX);
        for (String lexeme : lexemes) {
            AbstractTextComponent textComponent = new TextComponent(TextComponentType.WORD);
            nextParser.parse(textComponent, lexeme);
            abstractTextComponent.add(textComponent);
        }
    }
}
