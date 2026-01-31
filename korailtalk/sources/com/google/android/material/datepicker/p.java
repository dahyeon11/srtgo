package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
import k0.AbstractC5837a;

/* loaded from: classes2.dex */
abstract class p extends Fragment {

    /* renamed from: b0, reason: collision with root package name */
    protected final LinkedHashSet f24761b0 = new LinkedHashSet();

    p() {
    }

    boolean addOnSelectionChangedListener(o oVar) {
        return this.f24761b0.add(oVar);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    void o0() {
        this.f24761b0.clear();
    }
}
