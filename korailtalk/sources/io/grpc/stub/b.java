package io.grpc.stub;

import io.grpc.AbstractC5723f;
import io.grpc.C5721e;
import io.grpc.stub.d;
import io.grpc.stub.g;

/* loaded from: classes.dex */
public abstract class b extends d {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    protected b(AbstractC5723f abstractC5723f, C5721e c5721e) {
        super(abstractC5723f, c5721e);
    }

    public static <T extends d> T newStub(d.a aVar, AbstractC5723f abstractC5723f) {
        return (T) newStub(aVar, abstractC5723f, C5721e.DEFAULT);
    }

    public static <T extends d> T newStub(d.a aVar, AbstractC5723f abstractC5723f, C5721e c5721e) {
        return (T) aVar.newStub(abstractC5723f, c5721e.withOption(g.f33291c, g.EnumC0326g.BLOCKING));
    }
}
