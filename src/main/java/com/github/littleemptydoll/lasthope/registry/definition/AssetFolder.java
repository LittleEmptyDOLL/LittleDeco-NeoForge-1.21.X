package com.github.littleemptydoll.lasthope.registry.definition;

public enum AssetFolder {
    DECORATION("decoration"),
    CONTAINER("container");

    private final String folder;

    AssetFolder(String folder) {
        this.folder = folder;
    }

    public String folder() {
        return folder;
    }
}
