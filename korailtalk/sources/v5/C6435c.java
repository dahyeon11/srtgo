package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6435c extends m {
    public static final String TAG = "GyeongjeonLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new C6435c();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_03;
    }

    @Override // v5.m
    protected String F0() {
        return "map_03.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_03;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0921", "인천공항T1", false, N.dpToPx(18.0f), N.dpToPx(16.0f)));
        arrayList.add(new C6419a("0390", "행신", false, N.dpToPx(156.0f), N.dpToPx(43.0f)));
        arrayList.add(new C6419a("0923", "인천공항T2", false, N.dpToPx(5.0f), N.dpToPx(57.0f)));
        arrayList.add(new C6419a("0001", "서울", true, N.dpToPx(155.0f), N.dpToPx(81.0f)));
        arrayList.add(new C6419a("0501", "광명", true, N.dpToPx(18.0f), N.dpToPx(115.0f)));
        arrayList.add(new C6419a("0502", "천안아산", false, N.dpToPx(31.0f), N.dpToPx(157.0f)));
        arrayList.add(new C6419a("0297", "오송", false, N.dpToPx(39.0f), N.dpToPx(200.0f)));
        arrayList.add(new C6419a("0507", "김천구미", false, N.dpToPx(174.0f), N.dpToPx(186.0f)));
        arrayList.add(new C6419a("0015", "동대구", true, N.dpToPx(250.0f), N.dpToPx(200.0f)));
        arrayList.add(new C6419a("0010", "대전", true, N.dpToPx(135.0f), N.dpToPx(140.0f)));
        arrayList.add(new C6419a("0024", "경산", false, N.dpToPx(284.0f), N.dpToPx(239.0f)));
        arrayList.add(new C6419a("0057", "창원", false, N.dpToPx(167.0f), N.dpToPx(280.0f)));
        arrayList.add(new C6419a("0017", "밀양", false, N.dpToPx(278.0f), N.dpToPx(279.0f)));
        arrayList.add(new C6419a("0063", "진주", true, N.dpToPx(118.0f), N.dpToPx(318.0f)));
        arrayList.add(new C6419a("0056", "진영", false, N.dpToPx(262.0f), N.dpToPx(318.0f)));
        arrayList.add(new C6419a("0059", "마산", true, N.dpToPx(154.0f), N.dpToPx(357.0f)));
        arrayList.add(new C6419a("0512", "창원중앙", true, N.dpToPx(229.0f), N.dpToPx(357.0f)));
        arrayList.add(new C6419a("0506", "서대구", true, N.dpToPx(135.0f), N.dpToPx(239.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}
