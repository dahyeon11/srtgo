package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: com.google.android.gms.internal.ads.eE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2681eE0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
