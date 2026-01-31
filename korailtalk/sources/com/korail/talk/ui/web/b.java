package com.korail.talk.ui.web;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.List;

/* loaded from: classes.dex */
public class b extends BaseAdapter {
    public static final String KEY_ARRIVAL_TIME = "arrival_time";
    public static final String KEY_DELAY_ARRIVAL_TIME = "arrival_delay_time";
    public static final String KEY_DELAY_DEPARTURE_TIME = "departure_delay_time";
    public static final String KEY_DEPARTURE_TIME = "departure_time";
    public static final String KEY_DETOUR_STATION = "detour_station";
    public static final String KEY_DETOUR_STATION_INFO = "detour_station_info";
    public static final String KEY_EXPECT_DELAY_ARRIVAL_TIME = "expect_arrival_delay_time";
    public static final String KEY_EXPECT_DELAY_DEPARTURE_TIME = "expect_departure_delay_time";
    public static final String KEY_LAST_STATION = "last_station";
    public static final String KEY_NO_STOP_STATION = "no_stop_station";
    public static final String KEY_STATION_NAME = "station_name";

    /* renamed from: a, reason: collision with root package name */
    private final List f29324a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29325b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29326c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29327d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29328e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29329f;

    /* renamed from: g, reason: collision with root package name */
    private final String f29330g;

    b(Context context, List list, int i8, int i9, int i10, boolean z8, String str) {
        this.f29325b = context;
        this.f29324a = list;
        this.f29326c = i8;
        this.f29327d = i9;
        this.f29328e = i10;
        this.f29329f = z8;
        this.f29330g = str;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f29324a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i8) {
        return this.f29324a.get(i8);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030b  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.web.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
