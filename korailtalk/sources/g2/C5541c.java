package g2;

import android.text.TextUtils;
import f2.C5392b;
import h2.C5585b;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5541c extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final O.a f31281a;

    public C5541c(O.a aVar) {
        this.f31281a = aVar;
    }

    public C5392b getConnectionResult(AbstractC5543e abstractC5543e) {
        C5585b apiKey = abstractC5543e.getApiKey();
        boolean z8 = this.f31281a.get(apiKey) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        AbstractC5683p.checkArgument(z8, sb.toString());
        return (C5392b) AbstractC5683p.checkNotNull((C5392b) this.f31281a.get(apiKey));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = this.f31281a.keySet().iterator();
        boolean z8 = true;
        while (it.hasNext()) {
            C5585b c5585b = (C5585b) it.next();
            C5392b c5392b = (C5392b) AbstractC5683p.checkNotNull((C5392b) this.f31281a.get(c5585b));
            z8 &= !c5392b.isSuccess();
            String strZab = c5585b.zab();
            String strValueOf = String.valueOf(c5392b);
            StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 2 + strValueOf.length());
            sb.append(strZab);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z8) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public C5392b getConnectionResult(InterfaceC5545g interfaceC5545g) {
        C5585b apiKey = interfaceC5545g.getApiKey();
        boolean z8 = this.f31281a.get(apiKey) != null;
        String strZab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 58);
        sb.append("The given API (");
        sb.append(strZab);
        sb.append(") was not part of the availability request.");
        AbstractC5683p.checkArgument(z8, sb.toString());
        return (C5392b) AbstractC5683p.checkNotNull((C5392b) this.f31281a.get(apiKey));
    }
}
