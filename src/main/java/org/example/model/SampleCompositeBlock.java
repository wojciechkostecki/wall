package org.example.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleCompositeBlock implements CompositeBlock {

    private List<Block> blocks = new ArrayList<>();

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    }

    public void removeBlock(Block block) {
        blocks.remove(block);
    }

    @Override
    public String getColor() {

        Set<String> uniqueColors = new HashSet<>();

        for (Block block : blocks) {
            uniqueColors.add(block.getColor());
        }

        return String.join(", ", uniqueColors);
    }

    @Override
    public String getMaterial() {
        Set<String> uniqueMaterials = new HashSet<>();

        for (Block block : blocks) {
            uniqueMaterials.add(block.getMaterial());
        }

        return String.join(", ", uniqueMaterials);
    }
}
