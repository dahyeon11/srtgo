package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
class m extends BaseAdapter {

    /* renamed from: e */
    static final int f24748e = s.i().getMaximum(4);

    /* renamed from: a */
    final l f24749a;

    /* renamed from: b */
    private Collection f24750b;

    /* renamed from: c */
    c f24751c;

    /* renamed from: d */
    final a f24752d;

    m(l lVar, d dVar, a aVar) {
        this.f24749a = lVar;
        this.f24752d = aVar;
        this.f24750b = dVar.a();
    }

    private void c(Context context) {
        if (this.f24751c == null) {
            this.f24751c = new c(context);
        }
    }

    private boolean d(long j8) {
        throw null;
    }

    private void g(TextView textView, long j8) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f24752d.getDateValidator().isValid(j8)) {
            textView.setEnabled(true);
            bVar = d(j8) ? this.f24751c.f24673b : s.g().getTimeInMillis() == j8 ? this.f24751c.f24674c : this.f24751c.f24672a;
        } else {
            textView.setEnabled(false);
            bVar = this.f24751c.f24678g;
        }
        bVar.b(textView);
    }

    private void h(MaterialCalendarGridView materialCalendarGridView, long j8) {
        if (l.c(j8).equals(this.f24749a)) {
            g((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f24749a.g(j8)) - materialCalendarGridView.getFirstVisiblePosition()), j8);
        }
    }

    int a(int i8) {
        return b() + (i8 - 1);
    }

    int b() {
        return this.f24749a.e();
    }

    int e() {
        return (this.f24749a.e() + this.f24749a.f24745e) - 1;
    }

    int f(int i8) {
        return (i8 - this.f24749a.e()) + 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24749a.f24745e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8 / this.f24749a.f24744d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i8) {
        return i8 >= b() && i8 <= e();
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f24750b.iterator();
        while (it.hasNext()) {
            h(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    @Override // android.widget.Adapter
    public Long getItem(int i8) {
        if (i8 < this.f24749a.e() || i8 > e()) {
            return null;
        }
        return Long.valueOf(this.f24749a.f(f(i8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.c(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = J2.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f24749a
            int r2 = r8.f24745e
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f24749a
            long r7 = r8.f(r7)
            com.google.android.material.datepicker.l r3 = r5.f24749a
            int r3 = r3.f24743c
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.d()
            int r4 = r4.f24743c
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.g(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }
}
