package t6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.korail.talk.network.dao.cust.MchdDcntTgtDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.c;
import y6.C6542b;
import z4.C6630d;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6367b extends C6542b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private a f36948a;

    /* renamed from: b, reason: collision with root package name */
    private List f36949b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f36950c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f36951d;

    /* renamed from: t6.b$a */
    public interface a {
        void onClick(ArrayList<MchdDcntTgtDao.Fmly> arrayList);
    }

    public C6367b(Context context) {
        super(context);
        g();
    }

    private void g() {
        View.inflate(getContext(), AbstractC5957h.view_payment_certication, this);
        h();
        i();
    }

    private void h() {
        this.f36950c = new ArrayList();
    }

    private void i() {
        this.f36951d = (ViewGroup) findViewById(AbstractC5955f.v_payment_certification);
    }

    @Override // v4.c.a
    public void onCustomClick(View view, int i8) {
        boolean zContains = this.f36950c.contains(Integer.valueOf(i8));
        if (zContains) {
            this.f36950c.remove(Integer.valueOf(i8));
        } else {
            this.f36950c.add(Integer.valueOf(i8));
        }
        ((CheckBox) view.findViewById(AbstractC5955f.cb_item_view_payment_certification)).setChecked(!zContains);
        if (C6630d.isNotNull(this.f36948a)) {
            ArrayList<MchdDcntTgtDao.Fmly> arrayList = new ArrayList<>();
            Collections.sort(this.f36950c);
            Iterator it = this.f36950c.iterator();
            while (it.hasNext()) {
                arrayList.add((MchdDcntTgtDao.Fmly) this.f36949b.get(((Integer) it.next()).intValue()));
            }
            this.f36948a.onClick(arrayList);
        }
    }

    public void setCertificationData(a aVar, List<MchdDcntTgtDao.Fmly> list) {
        this.f36948a = aVar;
        this.f36949b = list;
        for (int i8 = 0; i8 < list.size(); i8++) {
            MchdDcntTgtDao.Fmly fmly = list.get(i8);
            C6366a c6366a = new C6366a(getContext());
            c6366a.setCertificationData(fmly);
            c6366a.setOnClickListener(new c(this, i8));
            this.f36951d.addView(c6366a);
        }
    }

    public C6367b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
