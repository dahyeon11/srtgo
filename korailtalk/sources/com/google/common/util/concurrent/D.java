package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public interface D extends ScheduledFuture, C {
    @Override // com.google.common.util.concurrent.C
    /* synthetic */ void addListener(Runnable runnable, Executor executor);
}
