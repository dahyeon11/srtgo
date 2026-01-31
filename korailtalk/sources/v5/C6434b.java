package v5;

import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5954e;
import u5.C6419a;
import z4.N;

/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6434b extends m {
    public static final String TAG = "GyeongbuLineFragment";

    public static com.korail.talk.view.base.a newInstance() {
        return new C6434b();
    }

    @Override // v5.m
    protected int E0() {
        return AbstractC5954e.circle_border_station_01;
    }

    @Override // v5.m
    protected String F0() {
        return "map_01.png";
    }

    @Override // v5.m
    protected int G0() {
        return AbstractC5954e.square_border_station_01;
    }

    @Override // v5.m
    protected ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6419a("0390", "행신", false, N.dpToPx(119.0f), N.dpToPx(35.0f)));
        arrayList.add(new C6419a("0921", "인천공항T1", false, N.dpToPx(6.0f), N.dpToPx(51.0f)));
        arrayList.add(new C6419a("0001", "서울", true, N.dpToPx(124.0f), N.dpToPx(76.0f)));
        arrayList.add(new C6419a("0923", "인천공항T2", false, N.dpToPx(6.0f), N.dpToPx(117.0f)));
        arrayList.add(new C6419a("0002", "영등포", false, N.dpToPx(202.0f), N.dpToPx(102.0f)));
        arrayList.add(new C6419a("0003", "수원", false, N.dpToPx(140.0f), N.dpToPx(134.0f)));
        arrayList.add(new C6419a("0501", "광명", true, N.dpToPx(6.0f), N.dpToPx(157.0f)));
        arrayList.add(new C6419a("0515", "포항", false, N.dpToPx(284.0f), N.dpToPx(140.0f)));
        arrayList.add(new C6419a("0502", "천안아산", false, N.dpToPx(6.0f), N.dpToPx(196.0f)));
        arrayList.add(new C6419a("0507", "김천구미", false, N.dpToPx(165.0f), N.dpToPx(173.0f)));
        arrayList.add(new C6419a("0508", "경주", false, N.dpToPx(250.0f), N.dpToPx(176.0f)));
        arrayList.add(new C6419a("0297", "오송", false, N.dpToPx(6.0f), N.dpToPx(236.0f)));
        arrayList.add(new C6419a("0010", "대전", true, N.dpToPx(70.0f), N.dpToPx(264.0f)));
        arrayList.add(new C6419a("0015", "동대구", true, N.dpToPx(215.0f), N.dpToPx(213.0f)));
        arrayList.add(new C6419a("0024", "경산", false, N.dpToPx(162.0f), N.dpToPx(292.0f)));
        arrayList.add(new C6419a("0509", "울산(통도사)", false, N.dpToPx(284.0f), N.dpToPx(320.0f)));
        arrayList.add(new C6419a("0017", "밀양", false, N.dpToPx(164.0f), N.dpToPx(332.0f)));
        arrayList.add(new C6419a("0019", "구포", false, N.dpToPx(228.0f), N.dpToPx(405.0f)));
        arrayList.add(new C6419a("0020", "부산", true, N.dpToPx(272.0f), N.dpToPx(361.0f)));
        arrayList.add(new C6419a("0506", "서대구", true, N.dpToPx(142.0f), N.dpToPx(254.0f)));
        arrayList.add(new C6419a("0224", "물금", false, N.dpToPx(164.0f), N.dpToPx(371.0f)));
        return arrayList;
    }

    @Override // v5.m, com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }
}
