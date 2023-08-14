package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    // Write your code here!

    public SymbolLeaf(char value) {
        super(TextComponentType.SYMBOL);
        this.value = value;
    }

    public String operation() {
        return String.valueOf(value);
    }

    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        return 1;
    }
}
