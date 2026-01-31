package io.grpc;

/* renamed from: io.grpc.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5727h {

    /* renamed from: io.grpc.h$a */
    public enum a {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    public abstract void log(a aVar, String str);

    public abstract void log(a aVar, String str, Object... objArr);
}
