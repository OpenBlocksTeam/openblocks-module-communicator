package com.openblocks.moduleinterface.models.code;

import java.util.ArrayList;

/**
 * BlockCodeNest is a nest of {@link BlockCode}, which can be an: If statement, While loop, For loop, function, class, etc
 */
public class BlockCodeNest extends BlockCode {
    public ArrayList<BlockCode> blocks;

    public BlockCodeNest(String opcode, String format, int color, ParseBlockTask parseBlockTask, ArrayList<String> parameters, ArrayList<BlockCode> blocks) {
        super(opcode, format, color, parseBlockTask, parameters);
        this.blocks = blocks;
    }
}
