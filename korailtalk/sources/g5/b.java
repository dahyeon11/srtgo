package g5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.view.base.BaseActivity;
import com.korail.talk.viewGroup.ReserveButton;
import g5.e;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.c;
import z4.N;

/* loaded from: classes.dex */
public class b extends e {

    /* renamed from: g5.b$b, reason: collision with other inner class name */
    private class C0307b extends e.b {

        /* renamed from: u, reason: collision with root package name */
        private final ViewGroup f31361u;

        /* renamed from: v, reason: collision with root package name */
        private final View f31362v;

        private C0307b(View view) {
            super(view);
            this.f31361u = (ViewGroup) view.findViewById(AbstractC5955f.ic_train);
            this.f31362v = view.findViewById(AbstractC5955f.selectBg);
        }
    }

    public b(BaseActivity baseActivity, ArrayList<Bundle> arrayList, c cVar) {
        super(baseActivity, arrayList, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(View view, int i8) {
        Bundle bundle = (Bundle) this.f31369h.get(i8);
        this.f31367f.setSelectedIndex(i8);
        this.f31367f.moveToSRT(bundle);
    }

    private void r(C0307b c0307b, int i8) {
        Bundle bundle = (Bundle) this.f31369h.get(i8);
        Bundle bundle2 = bundle.getBundle(e.KEY_SEAT_STANDARD);
        Bundle bundle3 = bundle.getBundle(e.KEY_SEAT_SUITE);
        ViewGroup viewGroup = c0307b.f31361u;
        n(viewGroup, bundle, i8, -1);
        s((ReserveButton) viewGroup.findViewById(AbstractC5955f.standardReserveButton), bundle2, i8);
        s((ReserveButton) viewGroup.findViewById(AbstractC5955f.suiteReserveButton), bundle3, i8);
        c0307b.f31362v.setVisibility(bundle.getBoolean(e.KEY_SELECTED_LINE) ? 0 : 8);
    }

    private void s(ReserveButton reserveButton, Bundle bundle, int i8) {
        String string = bundle.getString("state");
        if (N.isNotNull(string) && e.STATE_NAME_LINK.equals(string)) {
            reserveButton.setOnClickListener(new v4.c(new c.a() { // from class: g5.a
                @Override // v4.c.a
                public final void onCustomClick(View view, int i9) {
                    this.f31360a.q(view, i9);
                }
            }, i8));
        }
    }

    @Override // g5.e
    protected void m(int i8, int i9, int i10) {
        Bundle bundleD = d(i8);
        bundleD.putBoolean(e.KEY_SELECTED_LINE, true);
        bundleD.putInt(e.KEY_SELECTED_SEAT_TYPE, i10);
    }

    @Override // g5.e
    protected void o(int i8) {
        Bundle bundleD = d(i8);
        bundleD.putBoolean(e.KEY_SELECTED_LINE, false);
        bundleD.putInt(e.KEY_SELECTED_SEAT_TYPE, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.E e8, int i8) {
        if (e8 instanceof C0307b) {
            r((C0307b) e8, i8);
        } else if (e8 instanceof e.a) {
            h((e.a) e8, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return i8 != 1 ? new C0307b(View.inflate(c(), AbstractC5957h.direct_train_inquiry_list_item, null)) : new e.a(View.inflate(c(), AbstractC5957h.next_day_query_button_item, null));
    }

    @Override // g5.e
    public void setUnSelectView(int i8, int i9, int i10) {
        Bundle bundleD = d(i8);
        bundleD.putBoolean(e.KEY_SELECTED_LINE, false);
        bundleD.putInt(e.KEY_SELECTED_SEAT_TYPE, -1);
    }
}
