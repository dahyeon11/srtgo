package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* renamed from: v5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6437e extends m {
    public static final String TAG = "JeonlaLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new C6437e();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_04;
    }

    @Override // v5.m
    protected String F0() {
        return "map_04.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_04;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0921", "인천공항T1", false, N.dpToPx(18.0f), N.dpToPx(15.0f)));
        arrayList.add(new C6419a("0390", "행신", false, N.dpToPx(157.0f), N.dpToPx(42.0f)));
        arrayList.add(new C6419a("0923", "인천공항T2", false, N.dpToPx(5.0f), N.dpToPx(57.0f)));
        arrayList.add(new C6419a("0001", "서울", false, N.dpToPx(155.0f), N.dpToPx(81.0f)));
        arrayList.add(new C6419a("0501", "광명", true, N.dpToPx(17.0f), N.dpToPx(115.0f)));
        arrayList.add(new C6419a("0104", "용산", true, N.dpToPx(155.0f), N.dpToPx(120.0f)));
        arrayList.add(new C6419a("0502", "천안아산", false, N.dpToPx(31.0f), N.dpToPx(157.0f)));
        arrayList.add(new C6419a("0297", "오송", false, N.dpToPx(212.0f), N.dpToPx(153.0f)));
        arrayList.add(new C6419a("0025", "서대전", false, N.dpToPx(153.0f), N.dpToPx(187.0f)));
        arrayList.add(new C6419a("0514", "공주", false, N.dpToPx(38.0f), N.dpToPx(200.0f)));
        arrayList.add(new C6419a("0218", "계룡", false, N.dpToPx(218.0f), N.dpToPx(213.0f)));
        arrayList.add(new C6419a("0027", "논산", false, N.dpToPx(140.0f), N.dpToPx(234.0f)));
        arrayList.add(new C6419a("0030", "익산", true, N.dpToPx(27.0f), N.dpToPx(240.0f)));
        arrayList.add(new C6419a("0048", "남원", false, N.dpToPx(148.0f), N.dpToPx(274.0f)));
        arrayList.add(new C6419a("0045", "전주", true, N.dpToPx(57.0f), N.dpToPx(280.0f)));
        arrayList.add(new C6419a("0050", "구례구", false, N.dpToPx(164.0f), N.dpToPx(314.0f)));
        arrayList.add(new C6419a("0049", "곡성", false, N.dpToPx(57.0f), N.dpToPx(320.0f)));
        arrayList.add(new C6419a("0139", "여천", false, N.dpToPx(181.0f), N.dpToPx(353.0f)));
        arrayList.add(new C6419a("0051", "순천", true, N.dpToPx(73.0f), N.dpToPx(360.0f)));
        arrayList.add(new C6419a("0053", "여수EXPO", true, N.dpToPx(133.0f), N.dpToPx(392.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}
