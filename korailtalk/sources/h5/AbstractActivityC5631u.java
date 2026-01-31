package h5;

import Q7.X;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.trainsInfo.FresScarDao;
import com.korail.talk.network.dao.trainsInfo.FresScarDao.FresScarRequest;
import com.korail.talk.network.dao.trainsInfo.TrainSelectStationDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.price.PriceFareActivity;
import com.korail.talk.ui.web.TrainServiceInfoWebViewActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import com.korail.talk.viewGroup.manager.CLinearLayoutManager;
import java.util.ArrayList;
import n4.AbstractC5952c;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import s4.DialogC6224h;
import v4.c;
import v4.d;
import z4.C6625A;
import z4.C6627a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.H;
import z4.J;
import z4.K;
import z4.N;
import z4.O;

/* renamed from: h5.u */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5631u extends AbstractActivityC5617g implements DropDownSelector.b, g5.c {

    /* renamed from: F */
    protected boolean f31612F;

    /* renamed from: G */
    protected ObjectAnimator f31613G;

    /* renamed from: H */
    private ImageButton f31614H;

    /* renamed from: I */
    private TextView f31615I;

    /* renamed from: J */
    private Button f31616J;

    /* renamed from: K */
    private Button f31617K;

    /* renamed from: L */
    private LinearLayout f31618L;

    /* renamed from: M */
    protected Button f31619M;

    /* renamed from: N */
    protected Button f31620N;

    /* renamed from: O */
    private View f31621O;

    /* renamed from: P */
    protected DropDownSelector f31622P;

    /* renamed from: Q */
    private RecyclerView f31623Q;

    /* renamed from: R */
    private CLinearLayoutManager f31624R;

    /* renamed from: S */
    protected g5.e f31625S;

    /* renamed from: T */
    private ViewGroup f31626T;

    /* renamed from: U */
    private ImageView f31627U;

    /* renamed from: V */
    private ViewGroup f31628V;

    /* renamed from: W */
    private s4.m f31629W;

    /* renamed from: w */
    private r4.s f31633w;

    /* renamed from: x */
    private r4.s f31634x;

    /* renamed from: y */
    private int f31635y;

    /* renamed from: z */
    private String f31636z;

    /* renamed from: t */
    private final int f31630t = 0;

    /* renamed from: u */
    private final int f31631u = 1;

    /* renamed from: v */
    private final int f31632v = 2;

    /* renamed from: A */
    protected int f31607A = 0;

    /* renamed from: B */
    protected final int f31608B = 0;

    /* renamed from: C */
    protected final int f31609C = 1;

    /* renamed from: D */
    protected final int f31610D = 2;

    /* renamed from: E */
    protected final int f31611E = 3;

    /* renamed from: h5.u$a */
    class a extends RecyclerView.u {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            super.onScrollStateChanged(recyclerView, i8);
            if (C6630d.isNotNull(AbstractActivityC5631u.this.f31623Q) && C6630d.isNotNull(AbstractActivityC5631u.this.f31623Q.getAdapter()) && AbstractActivityC5631u.this.f31623Q.getAdapter().getItemCount() > 0 && i8 == 1) {
                AbstractActivityC5631u.this.h2(3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            super.onScrolled(recyclerView, i8, i9);
            AbstractActivityC5631u abstractActivityC5631u = AbstractActivityC5631u.this;
            if (abstractActivityC5631u.f31583i && C6630d.isNotNull(abstractActivityC5631u.f31623Q) && C6630d.isNotNull(AbstractActivityC5631u.this.f31623Q.getAdapter()) && AbstractActivityC5631u.this.f31623Q.getAdapter().getItemCount() > 0 && !AbstractActivityC5631u.this.f31623Q.canScrollVertically(1)) {
                AbstractActivityC5631u.this.f31623Q.stopScroll();
                AbstractActivityC5631u.this.e2(false);
                AbstractActivityC5631u.this.B1();
            }
        }
    }

    /* renamed from: h5.u$c */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC6224h f31640a;

        c(DialogC6224h dialogC6224h) {
            this.f31640a = dialogC6224h;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC5631u.this.v0();
            TrainSelectStationDao.TransferStationInfo stationInfo = this.f31640a.getStationInfo();
            int trainTypeInfo = this.f31640a.getTrainTypeInfo();
            r4.s[] sVarArrValues = r4.s.values();
            int i8 = 0;
            while (true) {
                if (i8 >= sVarArrValues.length) {
                    break;
                }
                if (trainTypeInfo == i8) {
                    AbstractActivityC5631u.this.f31634x = sVarArrValues[i8];
                    break;
                }
                i8++;
            }
            Intent intent = new Intent();
            intent.putExtra("IS_DIRECT", false);
            intent.putExtra("IS_SELECT_TRANSFER", true);
            intent.putExtra("ROUTE_DATE", AbstractActivityC5631u.this.y0() + AbstractActivityC5631u.this.C1());
            intent.putExtra("TRANSFER_CHTNRSSTNCD", stationInfo.getChtnRsStnCd());
            intent.putExtra("TRANSFER_TRNGPCD", AbstractActivityC5631u.this.f31634x.getCode());
            intent.putExtra("SEAT_OPTION_INDEX", AbstractActivityC5631u.this.f31635y);
            intent.putExtra("SEAT_OPTION_CODE", AbstractActivityC5631u.this.f31636z);
            AbstractActivityC5631u.this.setResult(-1, intent);
            AbstractActivityC5631u.this.finish();
        }
    }

    /* renamed from: h5.u$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractActivityC5631u.this.f31622P.setOnSelectorItemClickListener(null);
            AbstractActivityC5631u abstractActivityC5631u = AbstractActivityC5631u.this;
            abstractActivityC5631u.f31622P.setDropDownIndex(!abstractActivityC5631u.f31591q ? 1 : 0);
            AbstractActivityC5631u abstractActivityC5631u2 = AbstractActivityC5631u.this;
            abstractActivityC5631u2.f31622P.setOnSelectorItemClickListener(abstractActivityC5631u2);
        }
    }

    public /* synthetic */ void G1() {
        C6627a.actionAccessibilityFocus(this.f31626T);
    }

    public /* synthetic */ void H1(DropDownSelector dropDownSelector, int i8, r4.p pVar, DialogInterface dialogInterface, int i9) {
        if (100 == i9) {
            dropDownSelector.setDropDownIndex(this.f31635y);
        } else if (102 == i9) {
            this.f31635y = i8;
            this.f31636z = pVar.getCode();
            f2(pVar);
        }
    }

    public /* synthetic */ void I1(FresScarDao.FresScarResponse fresScarResponse, DialogInterface dialogInterface, int i8) {
        if (i8 == 200) {
            this.f31629W.setInfoContent(fresScarResponse.getFresTtl(), fresScarResponse.getFresCont());
        }
    }

    public /* synthetic */ void J1(View view, int i8) {
        z1(E0()[i8]);
    }

    public /* synthetic */ void K1(View view, int i8) {
        if (this.f31585k > -1) {
            R1(B4.a.getTrainInfoData(E0(), i8));
        }
    }

    public /* synthetic */ void L1(View view, int i8) {
        if (this.f31585k > -1) {
            RsvInquiryResponse.TrainInfo[] trainInfoArrE0 = E0();
            P1(i8, trainInfoArrE0[0], trainInfoArrE0.length == 1 ? null : trainInfoArrE0[1]);
        }
    }

    public /* synthetic */ void M1(View view, int i8) {
        if (this.f31585k > -1) {
            Q1(i8);
        }
    }

    public /* synthetic */ void N1(View view, int i8, Bundle bundle) {
        if (this.f31585k > -1) {
            this.f31625S.onCustomClick(null, this.f31585k, i8, bundle.getInt(g5.e.KEY_SELECTED_SEAT_TYPE, -1));
        }
    }

    public /* synthetic */ void O1() {
        h2(2);
    }

    private void P1(int i8, RsvInquiryResponse.TrainInfo trainInfo, RsvInquiryResponse.TrainInfo trainInfo2) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PriceFareActivity.class);
        intent.putExtra("JRNY_COUNT", (this.f31591q ? r4.d.DIRECT_SQ_NO : r4.d.TRANSFER_SQ_NO).getCode());
        intent.putExtra("MENU_ID", A0());
        intent.putExtra("TRAIN_SELECT_INDEX", i8);
        intent.putExtra("FIRST_TRAIN_INFO", trainInfo);
        intent.putExtra("LAST_TRAIN_INFO", trainInfo2);
        startActivity(intent);
    }

    private void R1(RsvInquiryResponse.TrainInfo trainInfo) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TrainServiceInfoWebViewActivity.class);
        intent.putExtra("TRAIN_INFO", trainInfo);
        startActivity(intent);
    }

    private void z1(RsvInquiryResponse.TrainInfo trainInfo) {
        FresScarDao fresScarDao = new FresScarDao();
        FresScarDao.FresScarRequest fresScarRequest = fresScarDao.new FresScarRequest();
        fresScarRequest.setRunDt(trainInfo.getH_run_dt());
        fresScarRequest.setTrnNo(trainInfo.getH_trn_no());
        fresScarRequest.setDptStnConsOrdr(trainInfo.getH_dpt_stn_cons_ordr());
        fresScarRequest.setArvStnConsOrdr(trainInfo.getH_arv_stn_cons_ordr());
        fresScarRequest.setDptStnRunOrdr(trainInfo.getH_dpt_stn_run_ordr());
        fresScarRequest.setArvStnRunOrdr(trainInfo.getH_arv_stn_run_ordr());
        fresScarDao.setRequest(fresScarRequest);
        executeDao(fresScarDao);
    }

    protected abstract String A1();

    protected abstract void B1();

    protected abstract String C1();

    protected boolean D1() {
        return true;
    }

    protected boolean E1(RsvInquiryResponse.TrainInfo trainInfo, int i8) {
        String h_rd_seat_map_flg = trainInfo.getH_rd_seat_map_flg();
        try {
            if (!G0() && (!N.isNotNull(h_rd_seat_map_flg) || h_rd_seat_map_flg.charAt(i8) != 'N')) {
                String h_gen_rsv_cd = i8 == 0 ? trainInfo.getH_gen_rsv_cd() : trainInfo.getH_spe_rsv_cd();
                if (!"13".equals(h_gen_rsv_cd)) {
                    if (!"12".equals(h_gen_rsv_cd)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (StringIndexOutOfBoundsException e8) {
            z4.t.e(e8.getMessage());
            return true;
        }
    }

    protected abstract boolean F1();

    protected abstract void Q1(int i8);

    protected void S1() {
        this.f31625S.notifyDataSetChanged();
    }

    protected abstract void T1();

    protected void U1() {
        if (this.f31585k == -1 || !C6630d.isNotNull(this.f31587m)) {
            return;
        }
        boolean z8 = true;
        boolean z9 = true;
        for (Bundle bundle : B4.a.getTrainInfoBundleListData(D0())) {
            int i8 = bundle.getInt(g5.e.KEY_SELECTED_SEAT_TYPE, -1);
            if (-1 != i8) {
                Bundle bundle2 = bundle.getBundle(i8 == 0 ? g5.e.KEY_SEAT_STANDARD : g5.e.KEY_SEAT_SUITE);
                if (z9) {
                    z9 = (bundle2.getString("state").equals("매진") || bundle2.getString("state").equals("좌석부족")) ? false : true;
                }
            } else if (z8) {
                z8 = false;
            }
        }
        RsvInquiryResponse.TrainInfo[] trainInfoArrE0 = E0();
        boolean z10 = false;
        boolean z11 = false;
        int integer = 0;
        int integer2 = 0;
        for (int i9 = 0; i9 < trainInfoArrE0.length; i9++) {
            String selectSeatTypeCode = B4.a.getSelectSeatTypeCode(D0(), i9);
            RsvInquiryResponse.TrainInfo trainInfo = trainInfoArrE0[i9];
            if (J.isMixedSeat(selectSeatTypeCode, trainInfo.getH_yms_apl_flg())) {
                z10 = true;
            }
            if (G0()) {
                z11 = true;
            }
            if (i9 == 0) {
                integer2 = N.getInteger(trainInfo.getH_expct_dlay_hr());
                integer = N.getInteger(trainInfo.getH_expn_dpt_dlay_tnum());
            }
        }
        this.f31621O.setVisibility((z10 || z11) ? 0 : 8);
        this.f31620N.setVisibility((z10 || z11) ? 0 : 8);
        if (!z8) {
            this.f31619M.setEnabled(false);
            this.f31619M.setText(getString(AbstractC5959j.inquiry_select_transfer_train));
            this.f31619M.setTextColor(androidx.core.content.a.getColor(getApplicationContext(), AbstractC5953d.ocean_blue));
            this.f31619M.setTextSize(1, 15.0f);
            return;
        }
        if (!z9) {
            this.f31619M.setEnabled(false);
            this.f31619M.setText(getString(AbstractC5959j.common_reservation));
            this.f31619M.setTextColor(androidx.core.content.a.getColor(getApplicationContext(), AbstractC5953d.selector_btn_text_blue));
            this.f31619M.setTextSize(1, 21.0f);
            return;
        }
        if (z10 || z11) {
            this.f31619M.setTag("1202");
            this.f31619M.setEnabled(z10);
            this.f31619M.setText(getString(AbstractC5959j.common_standing_seat));
            this.f31619M.setTextColor(z10 ? -16303262 : androidx.core.content.a.getColor(getApplicationContext(), AbstractC5953d.selector_btn_text_blue));
            this.f31619M.setTextSize(1, 18.0f);
            this.f31620N.setEnabled(z11);
            this.f31620N.setText(getString(AbstractC5959j.title_reservation_wait));
            this.f31620N.setTextColor(z11 ? -16303262 : androidx.core.content.a.getColor(getApplicationContext(), AbstractC5953d.selector_btn_text_blue));
            this.f31620N.setTextSize(1, 18.0f);
            return;
        }
        this.f31619M.setTag("1101");
        this.f31619M.setEnabled(true);
        this.f31619M.setTextColor(-16303262);
        this.f31619M.setTextSize(1, 21.0f);
        this.f31619M.setText(getString(AbstractC5959j.common_reservation));
        if (integer > 0) {
            String str = getString(AbstractC5959j.common_reservation) + X.SPACE + getString(AbstractC5959j.common_expect_delay_time, Integer.valueOf(integer));
            N.setSpanRedFontText(str, this.f31619M, 15, getString(AbstractC5959j.common_reservation).length() + 1, str.length(), getApplicationContext());
            return;
        }
        if (integer2 > 0) {
            String str2 = getString(AbstractC5959j.common_reservation) + X.SPACE + getString(AbstractC5959j.common_actual_delay_time, Integer.valueOf(integer2));
            N.setSpanRedFontText(str2, this.f31619M, 15, getString(AbstractC5959j.common_reservation).length() + 1, str2.length(), getApplicationContext());
        }
    }

    protected void V1() {
        this.f31615I.setText(A1());
    }

    @Override // h5.AbstractActivityC5617g
    protected void W0() {
        new Handler().postDelayed(new Runnable() { // from class: h5.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f31601a.G1();
            }
        }, 600L);
    }

    protected void W1() {
        this.f31627U.setOnClickListener(this);
        this.f31619M.setOnClickListener(this);
        this.f31620N.setOnClickListener(this);
        this.f31614H.setOnClickListener(this);
        this.f31616J.setOnClickListener(this);
        this.f31617K.setOnClickListener(this);
        this.f31623Q.addOnScrollListener(new a());
    }

    protected void X1(int i8) {
        this.f31617K.setVisibility(i8);
    }

    protected void Y1() {
        Bundle bundle = new Bundle();
        bundle.putInt(g5.e.ITEM_TYPE, 1);
        bundle.putString(g5.e.KEY_NEXT_DAY, C6634h.convertFormat(C6634h.addDay(y0(), "yyyyMMdd", 1), "yyyyMMdd", "MM월 dd일"));
        this.f31587m.add(bundle);
    }

    protected void Z1() {
        this.f31616J.setEnabled(!F1());
    }

    protected void a2(int i8) {
        this.f31616J.setVisibility(i8);
    }

    protected void b2(int i8) {
        this.f31614H.setVisibility(i8);
    }

    protected void c2(String str, String str2) {
        ((ViewGroup) findViewById(AbstractC5955f.routebar)).removeAllViews();
        if (N.isNull(str) && N.isNull(str2)) {
            View viewInflate = View.inflate(getApplicationContext(), AbstractC5957h.direct_two_stations_name, (ViewGroup) findViewById(AbstractC5955f.routebar));
            ((TextView) viewInflate.findViewById(AbstractC5955f.departureTxt)).setText(z0());
            ((TextView) viewInflate.findViewById(AbstractC5955f.arrivalTxt)).setText(x0());
        } else {
            if (N.isNull(str2)) {
                View.inflate(this, AbstractC5957h.direct_three_stations_name, (ViewGroup) findViewById(AbstractC5955f.routebar));
                ((TextView) findViewById(AbstractC5955f.departureTxt)).setText(z0());
                ((TextView) findViewById(AbstractC5955f.stopTxt)).setText(str);
                ((TextView) findViewById(AbstractC5955f.arrivalTxt)).setText(x0());
                return;
            }
            View.inflate(this, AbstractC5957h.direct_four_stations_name, (ViewGroup) findViewById(AbstractC5955f.routebar));
            ((TextView) findViewById(AbstractC5955f.departureTxt)).setText(z0());
            ((TextView) findViewById(AbstractC5955f.stopTxt0)).setText(str);
            ((TextView) findViewById(AbstractC5955f.stopTxt1)).setText(str2);
            ((TextView) findViewById(AbstractC5955f.arrivalTxt)).setText(x0());
        }
    }

    @Override // g5.c
    public void changeItem(int i8, int i9, int i10) {
        this.f31585k = i8;
        N0(E0());
        i2(D0());
        h2(0);
        U1();
    }

    protected void d2() {
        DropDownSelector dropDownSelector = (DropDownSelector) findViewById(AbstractC5955f.trainRouteFilter);
        this.f31622P = dropDownSelector;
        dropDownSelector.changeResourceId(AbstractC5954e.bg_drop_down_selector_pop_dark, AbstractC5954e.ic_unfold_dropdown_big);
        this.f31622P.setEnabled(this.f31592r);
        this.f31622P.setOnSelectorItemClickListener(this);
        this.f31622P.setEntries(getResources().getStringArray(AbstractC5952c.route_trans), (String[]) null, !this.f31591q ? 1 : 0);
        if (this.f31593s) {
            this.f31622P.setmSelectIndex(2);
        }
    }

    public void e2(boolean z8) {
        this.f31624R.setScrollEnabled(z8);
    }

    protected abstract void f2(r4.p pVar);

    protected void g2(boolean z8, ArrayList arrayList) {
        Bundle extras = getIntent().getExtras();
        this.f31635y = extras.getInt("SEAT_OPTION_INDEX", 0);
        this.f31636z = extras.getString("SEAT_OPTION_CODE", r4.p.DEFAULT.getCode());
        z4.t.e("mPrevSeatOptionIndex : " + this.f31635y + ", mPrevSeatOptionCode : " + this.f31636z);
        DropDownSelector dropDownSelector = (DropDownSelector) findViewById(AbstractC5955f.seatOptionFilter);
        dropDownSelector.changeResourceId(AbstractC5954e.bg_drop_down_selector_pop_dark, AbstractC5954e.ic_unfold_dropdown_big);
        dropDownSelector.setEnabled(z8);
        dropDownSelector.setOnSelectorItemClickListener(this);
        dropDownSelector.setEntries(C6625A.toArray(arrayList), (String[]) null, this.f31635y);
    }

    @Override // g5.c
    public int getSelectedIndex() {
        return this.f31585k;
    }

    protected void h2(int i8) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfFloat2;
        if (C6630d.isNotNull(this.f31613G) && !this.f31612F) {
            this.f31613G.cancel();
        }
        if (i8 == 0 && !this.f31612F) {
            this.f31626T.setVisibility(0);
            this.f31628V.setVisibility(0);
            this.f31618L.setVisibility(0);
            this.f31619M.setVisibility(0);
            this.f31626T.setAlpha(0.0f);
            this.f31626T.measure(0, 0);
            this.f31626T.setTranslationY(r4.getMeasuredHeight());
            propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f);
            propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f);
        } else if (1 == i8) {
            propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f);
            propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.f31626T.getHeight());
        } else if (2 == i8) {
            propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f);
            propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f);
        } else if (3 == i8) {
            propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f);
            propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.f31628V.getHeight());
        } else {
            propertyValuesHolderOfFloat = null;
            propertyValuesHolderOfFloat2 = null;
        }
        if (C6630d.isNotNull(propertyValuesHolderOfFloat) && C6630d.isNotNull(propertyValuesHolderOfFloat2)) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f31626T, propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
            this.f31613G = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.setDuration(400L);
            this.f31613G.addListener(new b(i8));
            this.f31613G.start();
        }
    }

    protected void i2(Bundle bundle) {
        int i8;
        Bundle[] bundleArr;
        int i9;
        if (C6630d.isNotNull(bundle)) {
            this.f31628V.removeAllViews();
            int i10 = 0;
            this.f31607A = 0;
            Bundle[] trainInfoBundleListData = B4.a.getTrainInfoBundleListData(bundle);
            int i11 = 1;
            int i12 = 0;
            boolean zE1 = true;
            while (true) {
                i8 = -1;
                if (i12 < trainInfoBundleListData.length) {
                    int i13 = trainInfoBundleListData[i12].getInt(g5.e.KEY_SELECTED_SEAT_TYPE, -1);
                    if (i13 != -1) {
                        if (!zE1) {
                            break;
                        }
                        zE1 = E1(B4.a.getTrainInfoData(E0(), i12), i13);
                        i12++;
                    } else {
                        zE1 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            int i14 = 0;
            int i15 = 0;
            while (i14 < trainInfoBundleListData.length) {
                Bundle bundle2 = trainInfoBundleListData[i14];
                if (bundle2.getString(g5.e.KEY_TRAIN_NAME).contains(r4.s.SRT.getName())) {
                    this.f31607A += i11;
                } else {
                    if (bundle2.getInt(g5.e.KEY_SELECTED_SEAT_TYPE, i8) != i8) {
                        i15++;
                        ViewGroup viewGroup = (ViewGroup) View.inflate(this, AbstractC5957h.item_inquiry_slide, null);
                        this.f31628V.addView(viewGroup);
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_divider).setVisibility(i15 > i11 ? i10 : 8);
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_jrny).setVisibility(trainInfoBundleListData.length == i11 ? 8 : i10);
                        ((ImageView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_jrny)).setImageResource(i14 == 0 ? AbstractC5954e.bg_round_1_a : AbstractC5954e.bg_round_2_a);
                        TextView textView = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_psrm);
                        textView.setText(B4.a.getSelectSeatTypeName(bundle2, i14));
                        String string = bundle2.getString(g5.e.KEY_SEAT_STANDING_FREE_INFO);
                        String string2 = bundle2.getString(g5.e.KEY_RUN_TIME);
                        TextView textView2 = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_info);
                        if (!N.isNull(string)) {
                            string2 = string2 + ", ";
                        }
                        textView2.setText(string2);
                        TextView textView3 = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_free_car);
                        textView3.setText(string + " > ");
                        textView3.setVisibility(N.isNull(string) ? 8 : 0);
                        textView3.setOnClickListener(new v4.c(new c.a() { // from class: h5.p
                            @Override // v4.c.a
                            public final void onCustomClick(View view, int i16) {
                                this.f31602a.J1(view, i16);
                            }
                        }, i14));
                        String string3 = bundle2.getString(g5.e.KEY_TRAIN_STOP_STATION);
                        TextView textView4 = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_d_tour);
                        if (N.isNotNull(string3)) {
                            bundleArr = trainInfoBundleListData;
                            i9 = 0;
                        } else {
                            bundleArr = trainInfoBundleListData;
                            i9 = 8;
                        }
                        textView4.setVisibility(i9);
                        textView4.setText(string3);
                        sb.append(textView.getText());
                        sb.append(", ");
                        sb.append(textView2.getText());
                        sb.append(", ");
                        if (N.isNotNull(string)) {
                            sb.append(textView3.getText());
                            sb.append(", ");
                        }
                        if (N.isNotNull(string3)) {
                            sb.append(textView4.getText());
                            sb.append(", ");
                        }
                        this.f31626T.setContentDescription(sb.toString());
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_time).setOnClickListener(new v4.c(new c.a() { // from class: h5.q
                            @Override // v4.c.a
                            public final void onCustomClick(View view, int i16) {
                                this.f31603a.K1(view, i16);
                            }
                        }, i14));
                        TextView textView5 = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_fare);
                        textView5.setEnabled(D1());
                        textView5.setTextColor(D1() ? androidx.core.content.a.getColor(this, AbstractC5953d.white_two) : 872415231);
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_fare).setOnClickListener(new v4.c(new c.a() { // from class: h5.r
                            @Override // v4.c.a
                            public final void onCustomClick(View view, int i16) {
                                this.f31604a.L1(view, i16);
                            }
                        }, i14));
                        TextView textView6 = (TextView) viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_seat);
                        textView6.setEnabled(zE1);
                        textView6.setTextColor(zE1 ? androidx.core.content.a.getColor(this, AbstractC5953d.white_two) : 872415231);
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_seat).setOnClickListener(new v4.c(new c.a() { // from class: h5.s
                            @Override // v4.c.a
                            public final void onCustomClick(View view, int i16) {
                                this.f31605a.M1(view, i16);
                            }
                        }, i14));
                        viewGroup.findViewById(AbstractC5955f.item_inquiry_slide_close).setOnClickListener(new v4.d(new d.a() { // from class: h5.t
                            @Override // v4.d.a
                            public final void onCustomClick(View view, int i16, Bundle bundle3) {
                                this.f31606a.N1(view, i16, bundle3);
                            }
                        }, i14, bundle2));
                        C6627a.setAccessibilityTraversalAfter(getApplicationContext(), this.f31619M, AbstractC5955f.item_inquiry_slide_seat);
                    }
                    i14++;
                    trainInfoBundleListData = bundleArr;
                    i10 = 0;
                    i11 = 1;
                    i8 = -1;
                }
                bundleArr = trainInfoBundleListData;
                i14++;
                trainInfoBundleListData = bundleArr;
                i10 = 0;
                i11 = 1;
                i8 = -1;
            }
        }
    }

    protected abstract void j2(r4.s sVar);

    protected void k2(boolean z8) {
        l2(z8, O.getTrainGroupFilterIndex(O.getTrainGroupCode(getApplicationContext())));
    }

    protected void l2(boolean z8, int i8) {
        DropDownSelector dropDownSelector = (DropDownSelector) findViewById(AbstractC5955f.trainFilter);
        dropDownSelector.changeResourceId(AbstractC5954e.bg_drop_down_selector_pop_dark, AbstractC5954e.ic_unfold_dropdown_big);
        dropDownSelector.setEnabled(z8);
        dropDownSelector.setOnSelectorItemClickListener(this);
        dropDownSelector.setEntries(O.getTrainGroupFilterData(), (String[]) null, i8);
    }

    protected void m2() {
        n0(false);
        this.f31615I = (TextView) findViewById(AbstractC5955f.departureDateTxt);
        this.f31614H = (ImageButton) findViewById(AbstractC5955f.refreshBtn);
        this.f31616J = (Button) findViewById(AbstractC5955f.prevDayBtn);
        this.f31617K = (Button) findViewById(AbstractC5955f.nextDayBtn);
        this.f31619M = (Button) findViewById(AbstractC5955f.bookingBtn);
        this.f31620N = (Button) findViewById(AbstractC5955f.bookingBtn1);
        this.f31621O = findViewById(AbstractC5955f.btnDivider);
        this.f31618L = (LinearLayout) findViewById(AbstractC5955f.bottomButtonView);
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC5955f.trainSlide);
        this.f31626T = viewGroup;
        this.f31627U = (ImageView) viewGroup.findViewById(AbstractC5955f.slideHandler);
        this.f31628V = (ViewGroup) this.f31626T.findViewById(AbstractC5955f.slideItemView);
        this.f31624R = new CLinearLayoutManager(getApplicationContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.trainList);
        this.f31623Q = recyclerView;
        recyclerView.setLayoutManager(this.f31624R);
        this.f31623Q.setHasFixedSize(true);
        g5.e bVar = this.f31591q ? new g5.b(this, this.f31587m, this) : new g5.f(this, this.f31587m, this);
        this.f31625S = bVar;
        this.f31623Q.setAdapter(bVar);
    }

    protected abstract void n2();

    protected abstract void o2();

    @Override // h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.refreshBtn == id) {
            v0();
            T1();
            return;
        }
        if (AbstractC5955f.prevDayBtn == id) {
            o2();
            return;
        }
        if (AbstractC5955f.nextDayBtn == id) {
            n2();
        } else if (AbstractC5955f.slideHandler != id) {
            super.onClick(view);
        } else if (this.f31585k > -1) {
            h2(this.f31612F ? 3 : 2);
        }
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(final DropDownSelector dropDownSelector, final int i8) {
        String string;
        String selectItem = dropDownSelector.getSelectItem();
        int i9 = 0;
        if (AbstractC5955f.trainFilter == dropDownSelector.getId()) {
            if (N.isNotNull(selectItem)) {
                r4.s[] sVarArrValues = r4.s.values();
                int length = sVarArrValues.length;
                while (i9 < length) {
                    r4.s sVar = sVarArrValues[i9];
                    if (selectItem.equals(sVar.getName()) && this.f31633w != sVar) {
                        this.f31633w = sVar;
                        H.putString(getApplicationContext(), "TrainType", sVar.getName());
                        j2(sVar);
                        return;
                    }
                    i9++;
                }
                return;
            }
            return;
        }
        if (AbstractC5955f.seatOptionFilter == dropDownSelector.getId()) {
            if (!N.isNotNull(selectItem) || this.f31635y == i8) {
                return;
            }
            for (final r4.p pVar : r4.p.values()) {
                if (selectItem.equals(pVar.getName())) {
                    if (r4.p.EVACUATION_HELPER.equals(pVar)) {
                        this.f31635y = i8;
                        this.f31636z = pVar.getCode();
                        f2(pVar);
                    } else {
                        String string2 = getString(AbstractC5959j.dialog_title);
                        int i10 = 1002;
                        if (r4.p.WHEELCHAIR.equals(pVar)) {
                            string2 = getString(AbstractC5959j.reservation_check_title_wheelchair);
                            string = getString(AbstractC5959j.reservation_check_message_wheelchair);
                        } else if (r4.p.AUTO_WHEELCHAIR.equals(pVar)) {
                            string2 = getString(AbstractC5959j.reservation_check_title_auto_wheelchair);
                            string = getString(AbstractC5959j.reservation_check_message_auto_wheelchair);
                        } else {
                            if (r4.p.BICYCLE.equals(pVar)) {
                                string = getString(AbstractC5959j.normal_booking_bicycle_warning);
                            } else if (r4.p.NORMAL_FREE.equals(pVar)) {
                                string = getString(AbstractC5959j.dialog_free_seat_select_msg);
                            } else {
                                string = r4.p.OLDER.equals(pVar) ? getString(AbstractC5959j.reservation_check_message_older) : null;
                            }
                            i10 = 1001;
                        }
                        if (N.isNull(string)) {
                            this.f31635y = i8;
                            this.f31636z = pVar.getCode();
                            f2(pVar);
                        } else {
                            C6637k.getCDialog(K(), i10, 0, string2).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.n
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    this.f31597a.H1(dropDownSelector, i8, pVar, dialogInterface, i11);
                                }
                            }).showDialog();
                        }
                    }
                }
            }
            return;
        }
        if (AbstractC5955f.trainRouteFilter == dropDownSelector.getId()) {
            if (i8 == 2) {
                DialogC6224h dialogC6224h = new DialogC6224h(this);
                c cVar = new c(dialogC6224h);
                d dVar = new d();
                dialogC6224h.setStationData(C6111b.getInstance().getStationDataByName(z0()), C6111b.getInstance().getStationDataByName(x0()));
                String string3 = H.getString(getApplicationContext(), "TrainType");
                r4.s[] sVarArrValues2 = r4.s.values();
                int length2 = sVarArrValues2.length;
                int i11 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    }
                    if (string3.equals(sVarArrValues2[i9].getName())) {
                        dialogC6224h.setTrainTypePosition(i11);
                        break;
                    } else {
                        i11++;
                        i9++;
                    }
                }
                dialogC6224h.setButtonListener(cVar, dVar);
                dialogC6224h.show();
                return;
            }
            boolean z8 = this.f31591q;
            if (!(z8 && i8 == 1) && (z8 || i8 != 0)) {
                if (this.f31593s && i8 == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("IS_DIRECT", false);
                    intent.putExtra("ROUTE_DATE", y0() + C1());
                    intent.putExtra("SEAT_OPTION_INDEX", this.f31635y);
                    intent.putExtra("SEAT_OPTION_CODE", this.f31636z);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                return;
            }
            if (this.f31588n != r4.c.RSV_INCOMING) {
                Intent intent2 = new Intent();
                intent2.putExtra("IS_DIRECT", !this.f31591q);
                intent2.putExtra("ROUTE_DATE", y0() + C1());
                intent2.putExtra("SEAT_OPTION_INDEX", this.f31635y);
                intent2.putExtra("SEAT_OPTION_CODE", this.f31636z);
                setResult(-1, intent2);
                finish();
                return;
            }
            Intent intent3 = new Intent();
            intent3.putExtra("IS_DIRECT", !this.f31591q);
            intent3.putExtra("ROUTE_DATE", y0() + C1());
            intent3.putExtra("SEAT_OPTION_INDEX", this.f31635y);
            intent3.putExtra("SEAT_OPTION_CODE", this.f31636z);
            intent3.putExtra("RESERVATION_TYPE", this.f31588n);
            intent3.putExtra("RESERVATION_RESPONSE", this.f31589o);
            setResult(-1, intent3);
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_fres_scar == iBaseDao.getId()) {
            final FresScarDao.FresScarResponse fresScarResponse = (FresScarDao.FresScarResponse) iBaseDao.getResponse();
            s4.m mVar = new s4.m(K());
            this.f31629W = mVar;
            mVar.setType(1001);
            this.f31629W.setTheme(0);
            this.f31629W.setTitle(getString(AbstractC5959j.common_free_car_info));
            this.f31629W.setContent(fresScarResponse.getFresScarNo());
            this.f31629W.setButtonListener(new DialogInterface.OnClickListener() { // from class: h5.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f31594a.I1(fresScarResponse, dialogInterface, i8);
                }
            });
            this.f31629W.showDialog();
        }
    }

    @Override // g5.c
    public void selectItem(int i8, int i9, int i10) {
        if (I4.b.getInstance().isCorpTransfer()) {
            I4.b.getInstance().setCorpTransfer(false);
        }
        this.f31585k = i8;
        Bundle bundleD0 = D0();
        Bundle trainInfoBundleData = B4.a.getTrainInfoBundleData(bundleD0, i9);
        N0(E0());
        i2(bundleD0);
        h2(0);
        if (C6630d.isNotNull(trainInfoBundleData) && !trainInfoBundleData.getBoolean(g5.e.KEY_TRAIN_HAS_SNACKCART, true)) {
            K.showSnackBar(getApplicationContext(), getWindow().getDecorView(), getString(AbstractC5959j.msg_no_snackbar_message), -1);
        }
        if (!g1(trainInfoBundleData)) {
            W0();
        }
        if (!this.f31591q) {
            int i11 = i8 * 2;
            String h_arv_rs_stn_nm = ((RsvInquiryResponse.TrainInfo) this.f31586l.get(i11)).getH_arv_rs_stn_nm();
            String h_dpt_rs_stn_nm = ((RsvInquiryResponse.TrainInfo) this.f31586l.get(i11 + 1)).getH_dpt_rs_stn_nm();
            if (h_arv_rs_stn_nm.equals(h_dpt_rs_stn_nm)) {
                h_dpt_rs_stn_nm = null;
            }
            c2(h_arv_rs_stn_nm, h_dpt_rs_stn_nm);
        }
        U1();
    }

    @Override // g5.c
    public void setSelectedIndex(int i8) {
        this.f31585k = i8;
    }

    protected void setText() {
        V1();
    }

    @Override // g5.c
    public void showNextDay() {
        n2();
    }

    @Override // g5.c
    public boolean unSelectItem(int i8, int i9, int i10) {
        int i11;
        Bundle bundleD0 = D0();
        Bundle[] trainInfoBundleListData = B4.a.getTrainInfoBundleListData(bundleD0);
        int length = trainInfoBundleListData.length;
        boolean z8 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i11 = -1;
                break;
            }
            Bundle bundle = trainInfoBundleListData[i12];
            if (bundle.getInt(g5.e.KEY_SELECTED_SEAT_TYPE, -1) > -1) {
                i11 = bundle.getInt(g5.e.KEY_SELECTED_SEAT_TYPE, -1);
                break;
            }
            i12++;
        }
        if (i11 == -1) {
            this.f31585k = -1;
            z8 = true;
            h2(1);
            if (!this.f31591q) {
                c2(getString(AbstractC5959j.common_transfer), null);
            }
        } else {
            i2(bundleD0);
            if (this.f31612F) {
                new Handler().post(new Runnable() { // from class: h5.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31596a.O1();
                    }
                });
            }
        }
        U1();
        return z8;
    }

    @Override // h5.AbstractActivityC5621k
    protected void v0() {
        super.v0();
        this.f31583i = true;
        this.f31625S.clear();
        this.f31625S.notifyDataSetChanged();
        h2(1);
    }

    /* renamed from: h5.u$b */
    class b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ int f31638a;

        b(int i8) {
            this.f31638a = i8;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractActivityC5631u.this.f31626T.clearAnimation();
            if (1 == this.f31638a) {
                AbstractActivityC5631u.this.f31618L.setVisibility(8);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i8 = this.f31638a;
            if (i8 == 0 || 2 == i8) {
                AbstractActivityC5631u.this.f31627U.setImageResource(AbstractC5954e.ic_cart_fold);
                C6627a.setDescription(AbstractActivityC5631u.this.f31627U, AbstractActivityC5631u.this.getString(AbstractC5959j.common_close_btn), "버튼");
            } else if (3 == i8) {
                AbstractActivityC5631u.this.f31627U.setImageResource(AbstractC5954e.ic_cart_unfold);
                C6627a.setDescription(AbstractActivityC5631u.this.f31627U, AbstractActivityC5631u.this.getString(AbstractC5959j.common_open_btn), "버튼");
            }
            AbstractActivityC5631u abstractActivityC5631u = AbstractActivityC5631u.this;
            int i9 = this.f31638a;
            abstractActivityC5631u.f31612F = i9 == 0 || 2 == i9;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    public void moveToSRT(Bundle bundle) {
    }
}
