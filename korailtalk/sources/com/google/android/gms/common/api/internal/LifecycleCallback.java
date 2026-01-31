package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import h2.C5588e;
import h2.InterfaceC5589f;
import i2.AbstractC5683p;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC5589f f11930a;

    protected LifecycleCallback(InterfaceC5589f interfaceC5589f) {
        this.f11930a = interfaceC5589f;
    }

    protected static InterfaceC5589f a(C5588e c5588e) {
        if (c5588e.zzd()) {
            return h2.a0.zzc(c5588e.zzb());
        }
        if (c5588e.zzc()) {
            return h2.Y.zzc(c5588e.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static InterfaceC5589f getChimeraLifecycleFragmentImpl(C5588e c5588e) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static InterfaceC5589f getFragment(Activity activity) {
        return a(new C5588e(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity lifecycleActivity = this.f11930a.getLifecycleActivity();
        AbstractC5683p.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    public void onActivityResult(int i8, int i9, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static InterfaceC5589f getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
