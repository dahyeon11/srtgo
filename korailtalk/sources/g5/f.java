package g5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.view.base.BaseActivity;
import g5.e;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class f extends e {

    private class b extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        private final ViewGroup[] f31373t;

        /* renamed from: u, reason: collision with root package name */
        private final View f31374u;

        private b(View view) {
            super(view);
            this.f31373t = new ViewGroup[]{(ViewGroup) view.findViewById(AbstractC5955f.ic_b_train), (ViewGroup) view.findViewById(AbstractC5955f.ic_a_train)};
            this.f31374u = view.findViewById(AbstractC5955f.selectBg);
        }
    }

    public f(BaseActivity baseActivity, ArrayList<Bundle> arrayList, c cVar) {
        super(baseActivity, arrayList, cVar);
    }

    private void p(b bVar, int i8) {
        Bundle bundle = (Bundle) this.f31369h.get(i8);
        Bundle[] bundleArr = (Bundle[]) bundle.getParcelableArray("TRAIN_DATA");
        for (int i9 = 0; i9 < bundleArr.length; i9++) {
            n(bVar.f31373t[i9], bundleArr[i9], i8, i9);
        }
        bVar.f31374u.setVisibility(bundle.getBoolean(e.KEY_SELECTED_LINE) ? 0 : 8);
    }

    @Override // g5.e
    protected void m(int i8, int i9, int i10) {
        Bundle bundleD = d(i8);
        bundleD.putBoolean(e.KEY_SELECTED_LINE, true);
        ((Bundle[]) bundleD.getParcelableArray("TRAIN_DATA"))[i9].putInt(e.KEY_SELECTED_SEAT_TYPE, i10);
    }

    @Override // g5.e
    protected void o(int i8) {
        Bundle bundleD = d(i8);
        bundleD.putBoolean(e.KEY_SELECTED_LINE, false);
        for (Bundle bundle : (Bundle[]) bundleD.getParcelableArray("TRAIN_DATA")) {
            bundle.putInt(e.KEY_SELECTED_SEAT_TYPE, -1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.E e8, int i8) {
        if (e8 instanceof b) {
            p((b) e8, i8);
        } else if (e8 instanceof e.a) {
            h((e.a) e8, i8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return i8 != 1 ? new b(View.inflate(c(), AbstractC5957h.transfer_train_inquiry_list_item, null)) : new e.a(View.inflate(c(), AbstractC5957h.next_day_query_button_item, null));
    }

    @Override // g5.e
    public void setUnSelectView(int i8, int i9, int i10) {
        int i11;
        Bundle bundleD = d(i8);
        Bundle[] bundleArr = (Bundle[]) bundleD.getParcelableArray("TRAIN_DATA");
        bundleArr[i9].putInt(e.KEY_SELECTED_SEAT_TYPE, i10);
        int length = bundleArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i11 = -1;
                break;
            }
            Bundle bundle = bundleArr[i12];
            if (bundle.getInt(e.KEY_SELECTED_SEAT_TYPE, -1) > -1) {
                i11 = bundle.getInt(e.KEY_SELECTED_SEAT_TYPE, -1);
                break;
            }
            i12++;
        }
        if (i11 == -1) {
            bundleD.putBoolean(e.KEY_SELECTED_LINE, false);
            this.f31366e = -1;
        }
    }
}
