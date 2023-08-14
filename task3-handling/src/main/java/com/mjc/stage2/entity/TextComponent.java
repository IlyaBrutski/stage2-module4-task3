package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;
// Write your code here!
public TextComponent(TextComponentType componentType) {
    super(componentType);
}

    public String operation() {
        StringBuilder result = new StringBuilder();
        for (AbstractTextComponent textComponent : componentList) {
            result.append(textComponent.operation());
        }
        return result.toString();
    }

    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    public int getSize() {
        int size = 0;
        for (AbstractTextComponent textComponent : componentList) {
            size += textComponent.getSize();
        }
        return size;
    }
}
