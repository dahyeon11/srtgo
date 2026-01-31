package u5;

import q4.C6111b;
import z4.N;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6419a {

    /* renamed from: a, reason: collision with root package name */
    private final String f37138a;

    /* renamed from: b, reason: collision with root package name */
    private final String f37139b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37140c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37141d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37142e;

    public C6419a(String str, String str2, boolean z8, int i8, int i9) {
        this.f37139b = str;
        this.f37138a = C6111b.getInstance().getStationNameByCode(str, str2);
        this.f37140c = z8;
        this.f37141d = i8;
        this.f37142e = i9;
    }

    public int getLeftMargin() {
        return this.f37141d;
    }

    public int getMarkerLeftMargin() {
        return Math.min(getLeftMargin() + N.dpToPx(30.0f), N.dpToPx(314.0f));
    }

    public int getMarkerTopMargin() {
        return getTopMargin() - N.dpToPx(30.0f);
    }

    public int getSelectLeftMargin() {
        int leftMargin = getLeftMargin() - N.dpToPx(15.0f);
        if (leftMargin >= 0) {
            return leftMargin > N.dpToPx(260.0f) ? N.dpToPx(260.0f) : leftMargin;
        }
        return 0;
    }

    public int getSelectTopMargin() {
        return Math.max(getTopMargin() - N.dpToPx(45.0f), 0);
    }

    public String getStationCode() {
        return this.f37139b;
    }

    public String getStationName() {
        return this.f37138a;
    }

    public int getTopMargin() {
        return this.f37142e;
    }

    public boolean isMainStation() {
        return this.f37140c;
    }
}
