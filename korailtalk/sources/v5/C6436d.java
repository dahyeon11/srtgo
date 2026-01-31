package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* renamed from: v5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6436d extends m {
    public static final String TAG = "HonamLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new C6436d();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_02;
    }

    @Override // v5.m
    protected String F0() {
        return "map_02.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_02;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0921", "인천공항T1", false, N.dpToPx(18.0f), N.dpToPx(16.0f)));
        arrayList.add(new C6419a("0390", "행신", false, N.dpToPx(156.0f), N.dpToPx(42.0f)));
        arrayList.add(new C6419a("0923", "인천공항T2", false, N.dpToPx(5.0f), N.dpToPx(56.0f)));
        arrayList.add(new C6419a("0001", "서울", false, N.dpToPx(155.0f), N.dpToPx(82.0f)));
        arrayList.add(new C6419a("0501", "광명", true, N.dpToPx(18.0f), N.dpToPx(115.0f)));
        arrayList.add(new C6419a("0104", "용산", true, N.dpToPx(156.0f), N.dpToPx(121.0f)));
        arrayList.add(new C6419a("0502", "천안아산", false, N.dpToPx(30.0f), N.dpToPx(157.0f)));
        arrayList.add(new C6419a("0297", "오송", false, N.dpToPx(155.0f), N.dpToPx(161.0f)));
        arrayList.add(new C6419a("0514", "공주", false, N.dpToPx(38.0f), N.dpToPx(200.0f)));
        arrayList.add(new C6419a("0025", "서대전", false, N.dpToPx(220.0f), N.dpToPx(186.0f)));
        arrayList.add(new C6419a("0030", "익산", true, N.dpToPx(27.0f), N.dpToPx(240.0f)));
        arrayList.add(new C6419a("0218", "계룡", false, N.dpToPx(218.0f), N.dpToPx(224.0f)));
        arrayList.add(new C6419a("0033", "정읍", false, N.dpToPx(18.0f), N.dpToPx(281.0f)));
        arrayList.add(new C6419a("0027", "논산", false, N.dpToPx(144.0f), N.dpToPx(245.0f)));
        arrayList.add(new C6419a("0031", "김제", false, N.dpToPx(132.0f), N.dpToPx(284.0f)));
        arrayList.add(new C6419a("0035", "장성", false, N.dpToPx(7.0f), N.dpToPx(321.0f)));
        arrayList.add(new C6419a("0036", "광주송정", true, N.dpToPx(110.0f), N.dpToPx(324.0f)));
        arrayList.add(new C6419a("0037", "나주", false, N.dpToPx(91.0f), N.dpToPx(364.0f)));
        arrayList.add(new C6419a("0041", "목포", true, N.dpToPx(21.0f), N.dpToPx(380.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}
