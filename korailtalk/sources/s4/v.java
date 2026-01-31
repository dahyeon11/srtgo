package s4;

import android.content.Context;
import android.widget.TextView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class v extends C6219c {

    /* renamed from: q, reason: collision with root package name */
    private TextView f36277q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f36278r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f36279s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f36280t;

    public v(Context context) {
        super(context);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_private_collection);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36277q = (TextView) a(AbstractC5955f.dialog_private_collection_purpose);
        this.f36278r = (TextView) a(AbstractC5955f.dialog_private_collection_item);
        this.f36279s = (TextView) a(AbstractC5955f.dialog_private_collection_retention_period);
        this.f36280t = (TextView) a(AbstractC5955f.dialog_private_collection_addtional_info);
    }

    public v setStringArray(String[] strArr) {
        this.f36277q.setText(strArr[0]);
        this.f36278r.setText(strArr[1]);
        this.f36279s.setText(strArr[2]);
        if (strArr.length > 3) {
            this.f36280t.setVisibility(0);
            this.f36280t.setText(strArr[3]);
        }
        return this;
    }

    public v setStringBold(int i8) {
        if (i8 == 0) {
            this.f36277q.setPaintFlags(32);
        } else if (i8 == 1) {
            this.f36278r.setPaintFlags(32);
        } else if (i8 == 2) {
            this.f36279s.setPaintFlags(32);
        }
        return this;
    }
}
