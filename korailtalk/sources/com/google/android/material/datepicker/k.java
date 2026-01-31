package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k0.AbstractC5837a;

/* loaded from: classes2.dex */
public final class k<S> extends p {

    /* renamed from: c0, reason: collision with root package name */
    private int f24738c0;

    /* renamed from: d0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f24739d0;

    class a extends o {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void onIncompleteSelectionChanged() {
            Iterator it = k.this.f24761b0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).onIncompleteSelectionChanged();
            }
        }

        @Override // com.google.android.material.datepicker.o
        public void onSelectionChanged(S s8) {
            Iterator it = k.this.f24761b0.iterator();
            while (it.hasNext()) {
                ((o) it.next()).onSelectionChanged(s8);
            }
        }
    }

    static k p0(d dVar, int i8, com.google.android.material.datepicker.a aVar) {
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.setArguments(bundle);
        return kVar;
    }

    public d getDateSelector() {
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }

    @Override // com.google.android.material.datepicker.p, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24738c0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.f.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f24739d0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f24738c0));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f24738c0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f24739d0);
    }
}
