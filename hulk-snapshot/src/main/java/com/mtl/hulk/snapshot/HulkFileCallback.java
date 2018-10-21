package com.mtl.hulk.snapshot;

public abstract class HulkFileCallback<T> {

    protected Object obj;

    public HulkFileCallback(Object obj) {
        this.obj = obj;
    }

    protected abstract void process(byte[] data) throws Exception;

}
