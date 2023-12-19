package org.example;

import org.example.model.Block;
import org.example.model.SampleBlock;
import org.example.model.SampleCompositeBlock;
import org.example.model.Wall;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Block firstBlock = new SampleBlock("gray", "stone");
        Block secondBlock = new SampleBlock("brown", "wood");

        SampleCompositeBlock compositeBlock = new SampleCompositeBlock();
        compositeBlock.addBlock(firstBlock);
        compositeBlock.addBlock(secondBlock);

        List<Block> blocks = new ArrayList<>();
        blocks.add(compositeBlock);

        Block thirdBlock = new SampleBlock("black", "wood");
        blocks.add(thirdBlock);

        Wall wall = new Wall(blocks);

        List<Block> woodenBlocks = wall.findBlocksByMaterial("wood");
        Optional<Block> redBlock = wall.findBlockByColor("red");
        int allBlocks = wall.count();

        System.out.println("Number of wooden blocks: " + woodenBlocks.size());
        System.out.println("There is a red block: " + redBlock.isPresent());
        System.out.println("Number of blocks in the wall: " + allBlocks);
    }
}