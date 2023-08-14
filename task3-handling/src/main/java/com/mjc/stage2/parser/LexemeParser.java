package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;

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
            if (lexeme.matches(WORD_REGEX)) {
                WordParser wordParser = new WordParser();
                wordParser.parse(abstractTextComponent, lexeme);
            } else {
                SymbolLeaf symbolLeaf = new SymbolLeaf(lexeme.charAt(0));
                abstractTextComponent.add(symbolLeaf);
            }
        }
    }
}
