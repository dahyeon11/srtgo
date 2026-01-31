package v5;

import Q7.X;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import k0.AbstractC5837a;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import t5.InterfaceC6365a;
import u5.C6419a;
import v4.c;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class m extends com.korail.talk.view.base.a {
    public static final String TAG = "KTXMapFragment";

    /* renamed from: d0, reason: collision with root package name */
    private final int f37265d0 = -1;

    /* renamed from: e0, reason: collision with root package name */
    private final int f37266e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    private final int f37267f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    protected InterfaceC6365a f37268g0;

    /* renamed from: h0, reason: collision with root package name */
    private ArrayList f37269h0;

    /* renamed from: i0, reason: collision with root package name */
    private u5.b f37270i0;

    /* renamed from: j0, reason: collision with root package name */
    private FrameLayout f37271j0;

    private void B0() {
        ArrayList<Button> buttonList = this.f37270i0.getButtonList();
        boolean z8 = false;
        for (int i8 = 0; i8 < buttonList.size(); i8++) {
            if (this.f37270i0.getDepartureIndex() != i8 && this.f37270i0.getArrivalIndex() != i8) {
                buttonList.get(i8).setSelected(false);
            }
        }
        this.f37270i0.getSelectBox().setVisibility(8);
        InterfaceC6365a interfaceC6365a = this.f37268g0;
        if (this.f37270i0.getDepartureIndex() > -1 && this.f37270i0.getArrivalIndex() > -1) {
            z8 = true;
        }
        interfaceC6365a.setConfirm(z8);
    }

    private void C0(int i8, int i9) {
        if (i8 == 0) {
            this.f37270i0.setDepartureIndex(-1);
            this.f37270i0.getDepartMarker().setVisibility(8);
        } else if (1 == i8) {
            this.f37270i0.setArrivalIndex(-1);
            this.f37270i0.getArrivalMarker().setVisibility(8);
        }
        this.f37270i0.getButtonList().get(i9).setSelected(false);
        this.f37270i0.getSelectBox().setVisibility(8);
        this.f37268g0.setConfirm(false);
    }

    private void D0() {
        ArrayList<Button> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.f37269h0;
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            arrayList.add(P0((C6419a) arrayList2.get(i8), i8));
        }
        this.f37270i0.setButtonList(arrayList);
        this.f37270i0.setSelectBox(p0(AbstractC5955f.select_box));
        this.f37270i0.setDepartMarker((TextView) p0(AbstractC5955f.depart_marker));
        this.f37270i0.setArrivalMarker((TextView) p0(AbstractC5955f.arrival_marker));
    }

    private boolean I0(C6419a c6419a) {
        return "인천공항T1".equals(c6419a.getStationName()) || "인천공항T2".equals(c6419a.getStationName()) || "0921".equals(c6419a.getStationCode()) || "0923".equals(c6419a.getStationCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(View view, int i8) {
        B0();
        int departureIndex = this.f37270i0.getDepartureIndex();
        int arrivalIndex = this.f37270i0.getArrivalIndex();
        if (departureIndex == i8) {
            C0(0, i8);
        } else if (arrivalIndex == i8) {
            C0(1, i8);
        } else {
            view.setSelected(true ^ view.isSelected());
            S0(this.f37270i0, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(View view, int i8) {
        C0(0, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(View view, int i8) {
        C0(1, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(View view, int i8) {
        R0(0, this.f37270i0.getDepartureIndex(), i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(View view, int i8) {
        R0(1, this.f37270i0.getArrivalIndex(), i8);
    }

    private void O0() throws IOException {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37271j0.getLayoutParams();
        try {
            InputStream inputStreamOpen = getResources().getAssets().open(F0());
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(inputStreamOpen, null, options), layoutParams.width, layoutParams.height, true);
            ImageView imageView = new ImageView(getActivity());
            imageView.setImageBitmap(bitmapCreateScaledBitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_START);
            this.f37271j0.addView(imageView);
        } catch (IOException e8) {
            t.e(e8.getMessage());
        }
    }

    private Button P0(C6419a c6419a, int i8) {
        LinearLayout linearLayout = (LinearLayout) View.inflate(getApplicationContext(), AbstractC5957h.view_ktx_map_button, null);
        Button button = (Button) linearLayout.findViewById(AbstractC5955f.station_button);
        if (c6419a.isMainStation()) {
            I4.a.getInstance();
            I4.a.setFont(getApplicationContext(), button, 1);
        }
        if (I0(c6419a)) {
            button.setBackground(getResources().getDrawable(G0()));
        } else {
            button.setBackground(getResources().getDrawable(E0()));
        }
        if (c6419a.getStationName().length() == 2) {
            button.setText(c6419a.getStationName().charAt(0) + X.SPACE + c6419a.getStationName().charAt(1));
        } else {
            button.setText(c6419a.getStationName());
        }
        button.setOnClickListener(new v4.c(new c.a() { // from class: v5.h
            @Override // v4.c.a
            public final void onCustomClick(View view, int i9) {
                this.f37260a.J0(view, i9);
            }
        }, i8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(button.getLayoutParams().width, button.getLayoutParams().height);
        layoutParams.topMargin = c6419a.getTopMargin();
        layoutParams.leftMargin = c6419a.getLeftMargin();
        button.setLayoutParams(layoutParams);
        this.f37271j0.addView(linearLayout);
        return button;
    }

    private void Q0() {
        this.f37269h0 = H0();
        u5.b bVar = new u5.b();
        this.f37270i0 = bVar;
        bVar.setDepartureIndex(-1);
        this.f37270i0.setArrivalIndex(-1);
    }

    private void R0(int i8, int i9, int i10) {
        if (i9 > -1 && i10 != i9) {
            C0(i8, i9);
        }
        C6419a c6419a = (C6419a) this.f37269h0.get(i10);
        if (i8 == 0) {
            this.f37270i0.setDepartureIndex(i10);
            TextView departMarker = this.f37270i0.getDepartMarker();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) departMarker.getLayoutParams();
            layoutParams.leftMargin = c6419a.getMarkerLeftMargin();
            layoutParams.topMargin = c6419a.getMarkerTopMargin();
            departMarker.setLayoutParams(layoutParams);
            this.f37270i0.getDepartMarker().setOnClickListener(new v4.c(new c.a() { // from class: v5.k
                @Override // v4.c.a
                public final void onCustomClick(View view, int i11) {
                    this.f37263a.K0(view, i11);
                }
            }, i10));
            this.f37270i0.getDepartMarker().setVisibility(0);
        } else if (1 == i8) {
            this.f37270i0.setArrivalIndex(i10);
            TextView arrivalMarker = this.f37270i0.getArrivalMarker();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) arrivalMarker.getLayoutParams();
            layoutParams2.leftMargin = c6419a.getMarkerLeftMargin();
            layoutParams2.topMargin = c6419a.getMarkerTopMargin();
            arrivalMarker.setLayoutParams(layoutParams2);
            arrivalMarker.setOnClickListener(new v4.c(new c.a() { // from class: v5.l
                @Override // v4.c.a
                public final void onCustomClick(View view, int i11) {
                    this.f37264a.L0(view, i11);
                }
            }, i10));
            this.f37270i0.getArrivalMarker().setVisibility(0);
        }
        this.f37270i0.getSelectBox().setVisibility(8);
        if (this.f37270i0.getDepartureIndex() <= -1 || this.f37270i0.getArrivalIndex() <= -1) {
            return;
        }
        this.f37268g0.setConfirm(true);
    }

    private void S0(u5.b bVar, int i8) {
        C6419a c6419a = (C6419a) this.f37269h0.get(i8);
        View selectBox = bVar.getSelectBox();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) selectBox.getLayoutParams();
        layoutParams.leftMargin = c6419a.getSelectLeftMargin();
        layoutParams.topMargin = c6419a.getSelectTopMargin();
        selectBox.setLayoutParams(layoutParams);
        selectBox.setVisibility(0);
        selectBox.findViewById(AbstractC5955f.start_button).setOnClickListener(new v4.c(new c.a() { // from class: v5.i
            @Override // v4.c.a
            public final void onCustomClick(View view, int i9) {
                this.f37261a.M0(view, i9);
            }
        }, i8));
        selectBox.findViewById(AbstractC5955f.end_button).setOnClickListener(new v4.c(new c.a() { // from class: v5.j
            @Override // v4.c.a
            public final void onCustomClick(View view, int i9) {
                this.f37262a.N0(view, i9);
            }
        }, i8));
    }

    private void T0() throws IOException {
        this.f37271j0 = (FrameLayout) p0(AbstractC5955f.fl_ktp_map);
        O0();
    }

    public static com.korail.talk.view.base.a newInstance() {
        return new m();
    }

    protected int E0() {
        return 0;
    }

    protected String F0() {
        return null;
    }

    protected int G0() {
        return 0;
    }

    protected ArrayList H0() {
        return null;
    }

    public void clearAllMap() {
        ArrayList<Button> buttonList = this.f37270i0.getButtonList();
        for (int i8 = 0; i8 < buttonList.size(); i8++) {
            buttonList.get(i8).setSelected(false);
        }
        this.f37270i0.getSelectBox().setVisibility(8);
        this.f37270i0.getDepartMarker().setVisibility(8);
        this.f37270i0.getArrivalMarker().setVisibility(8);
        this.f37270i0.setDepartureIndex(-1);
        this.f37270i0.setArrivalIndex(-1);
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public String[] getSelectStationNm() {
        ArrayList arrayList = this.f37269h0;
        return new String[]{((C6419a) arrayList.get(this.f37270i0.getDepartureIndex())).getStationName(), ((C6419a) arrayList.get(this.f37270i0.getArrivalIndex())).getStationName()};
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws IOException {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            Q0();
            T0();
            D0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f37268g0 = (InterfaceC6365a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_ktx_map, viewGroup, false);
    }
}
