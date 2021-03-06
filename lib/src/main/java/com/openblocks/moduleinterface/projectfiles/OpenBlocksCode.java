package com.openblocks.moduleinterface.projectfiles;

import com.openblocks.moduleinterface.models.code.BlockCode;
import com.openblocks.moduleinterface.models.code.ParseBlockTask;

import java.util.ArrayList;
import java.util.HashMap;

// TODO: 3/18/21 Should be possible to make multiple collection of blocks / activity
public class OpenBlocksCode {
    public String block_collection_name;
    // This HashMap is used by the code editor to display the blocks
    /** HashMap of opcode, format */
    public HashMap<String, String> blocks_formats;
    public ArrayList<BlockCode> blocks = new ArrayList<>();

    public OpenBlocksCode(String block_collection_name) {
        this.block_collection_name = block_collection_name;
    }

    public OpenBlocksCode(String block_collection_name, ArrayList<BlockCode> blocks) {
        this.block_collection_name = block_collection_name;
        this.blocks = blocks;
    }

    public void setBlocksFormats(HashMap<String, String> blocks_formats) {
        this.blocks_formats = blocks_formats;
    }
}
