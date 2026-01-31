package com.google.android.gms.ads.internal.client;

import H1.AbstractBinderC0560o0;
import H1.C0575t1;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC1686Nn;
import com.google.android.gms.internal.ads.InterfaceC1850Rn;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC0560o0 {
    public LiteSdkInfo(Context context) {
    }

    @Override // H1.AbstractBinderC0560o0, H1.InterfaceC0563p0
    public InterfaceC1850Rn getAdapterCreator() {
        return new BinderC1686Nn();
    }

    @Override // H1.AbstractBinderC0560o0, H1.InterfaceC0563p0
    public C0575t1 getLiteSdkVersion() {
        return new C0575t1(ModuleDescriptor.MODULE_VERSION, 241806000, "23.2.0");
    }
}
