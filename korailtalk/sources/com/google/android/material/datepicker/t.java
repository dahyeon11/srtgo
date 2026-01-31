package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes2.dex */
class t extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final h f24767d;

    public static class a extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        final TextView f24768t;

        a(TextView textView) {
            super(textView);
            this.f24768t = textView;
        }
    }

    t(h hVar) {
        this.f24767d = hVar;
    }

    int b(int i8) {
        return i8 - this.f24767d.w0().i().f24743c;
    }

    int c(int i8) {
        return this.f24767d.w0().i().f24743c + i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f24767d.w0().j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(a aVar, int i8) {
        int iC = c(i8);
        String string = aVar.f24768t.getContext().getString(J2.j.mtrl_picker_navigate_to_year_description);
        aVar.f24768t.setText(String.format(Locale.getDefault(), com.google.android.material.timepicker.c.NUMBER_FORMAT, Integer.valueOf(iC)));
        aVar.f24768t.setContentDescription(String.format(string, Integer.valueOf(iC)));
        c cVarX0 = this.f24767d.x0();
        if (s.g().get(1) == iC) {
            b bVar = cVarX0.f24677f;
        } else {
            b bVar2 = cVarX0.f24675d;
        }
        this.f24767d.getDateSelector();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(J2.h.mtrl_calendar_year, viewGroup, false));
    }
}
