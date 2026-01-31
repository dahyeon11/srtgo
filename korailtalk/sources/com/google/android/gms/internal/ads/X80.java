package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class X80 {
    public static void zza(AtomicReference atomicReference, W80 w80) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            w80.zza(obj);
        } catch (RemoteException e8) {
            L1.n.zzl("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            L1.n.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }
}
