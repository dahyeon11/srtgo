package io.grpc.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;

/* renamed from: io.grpc.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5737a0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f32623a = new ArrayList();

    public C5737a0 append(Object obj) {
        this.f32623a.add(String.valueOf(obj));
        return this;
    }

    public C5737a0 appendKeyValue(String str, Object obj) {
        this.f32623a.add(str + SimpleComparison.EQUAL_TO_OPERATION + obj);
        return this;
    }

    public String toString() {
        return this.f32623a.toString();
    }
}
