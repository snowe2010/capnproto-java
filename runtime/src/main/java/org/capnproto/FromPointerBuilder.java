package org.capnproto;

public interface FromPointerBuilder<T> {
    T fromPointerBuilder(PointerBuilder builder, SegmentReader defaultSegment, int defaultOffset);
}
