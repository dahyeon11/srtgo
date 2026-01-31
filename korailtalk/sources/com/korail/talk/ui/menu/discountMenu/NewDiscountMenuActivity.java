package com.korail.talk.ui.menu.discountMenu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import com.korail.talk.network.dao.pass.DiscountMenuDao.DiscountMenuRequest;
import com.korail.talk.ui.booking.discountBooking.commutation.CommutationBookingActivity;
import com.korail.talk.ui.booking.discountBooking.commutation.PeriodCommutationBookingActivity;
import com.korail.talk.ui.booking.discountBooking.goods.DiscountGoodsBookingActivity;
import com.korail.talk.ui.booking.discountBooking.goods.FamilyBookingActivity;
import com.korail.talk.ui.booking.discountBooking.pass.APassBookingActivity;
import com.korail.talk.ui.booking.discountBooking.pass.GangneungPassBookingActivity;
import com.korail.talk.ui.booking.gifticket.GifticketBookingActivity;
import com.korail.talk.ui.booking.nCard.NCard1SectionBookingActivity;
import com.korail.talk.ui.booking.nCard.NCard1SectionBookingVersion2Activity;
import com.korail.talk.ui.booking.nCard.NCard2SectionBookingActivity;
import com.korail.talk.ui.booking.nCard.NCard2SectionBookingVersion2Activity;
import com.korail.talk.ui.booking.nCard.NCard3SectionBookingActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.CCheckBox;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.s;
import v4.c;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class NewDiscountMenuActivity extends BaseViewActivity {
    public static final String DETAIL_TYPE_FOUR_SEAT = "fourSeater";
    public static final String DETAIL_TYPE_GANGNEUNG_PASS = "gangneungPass";
    public static final String DETAIL_TYPE_GIFTICKET = "giftic ket";
    public static final String DETAIL_TYPE_N_CARD = "nCard";
    public static final String DETAIL_TYPE_N_CARD_2_SEATER = "nCard2Seater";
    public static final String DETAIL_TYPE_N_CARD_3_SECTION = "nCard3Section";
    public static final String DETAIL_TYPE_PNP_PASS = "pnp";
    public static final String DETAIL_TYPE_THREE_SEAT = "threeSeater";
    public static final String DETAIL_TYPE_TWO_SEAT = "twoSeater";
    public static final String MENU_DISCOUNT = "1";
    public static final String TYPE_A_PASS = "aPass";
    public static final String TYPE_GOODS = "goods";
    public static final String TYPE_NATIVE = "native";
    public static final String TYPE_PASS = "pass";
    public static final String TYPE_PERIOD_PASS = "period_pass";
    public static final String TYPE_SUBCATEGORY = "subcategory";
    public static final String TYPE_WEB = "web";

    /* renamed from: m */
    private List f28301m;

    /* renamed from: n */
    private List f28302n;

    /* renamed from: o */
    private d f28303o;

    /* renamed from: p */
    private RecyclerView f28304p;

    /* renamed from: q */
    private RecyclerView.A f28305q;

    /* renamed from: r */
    private CButton f28306r;

    /* renamed from: s */
    private CButton f28307s;

    /* renamed from: t */
    private CButton f28308t;

    /* renamed from: i */
    private final String f28297i = "17";

    /* renamed from: j */
    private final String f28298j = "0";

    /* renamed from: k */
    private final String f28299k = "8";

    /* renamed from: l */
    private final int f28300l = 2;

    /* renamed from: u */
    private int f28309u = 0;

    /* renamed from: v */
    private boolean f28310v = false;

    /* renamed from: w */
    private boolean f28311w = true;

    /* renamed from: x */
    Runnable f28312x = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            NewDiscountMenuActivity.this.f28311w = false;
            try {
                Thread.sleep(500L);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            NewDiscountMenuActivity.this.f28311w = true;
        }
    }

    class b extends GridLayoutManager.c {
        b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i8) {
            return "17".equals(NewDiscountMenuActivity.this.f28303o.c(i8).getParentId()) ? 1 : 2;
        }
    }

    class c extends h {
        c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.h
        protected int p() {
            return -1;
        }
    }

    private void B0() {
        DiscountMenuDao discountMenuDao = new DiscountMenuDao();
        DiscountMenuDao.DiscountMenuRequest discountMenuRequest = discountMenuDao.new DiscountMenuRequest();
        discountMenuRequest.setMenuNo("1");
        discountMenuDao.setRequest(discountMenuRequest);
        executeDao(discountMenuDao);
    }

    public /* synthetic */ void C0(View view, int i8, int i9, int i10, int i11) {
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) this.f28304p.getLayoutManager()).findFirstVisibleItemPosition();
        if (this.f28311w) {
            int i12 = this.f28309u;
            if (iFindFirstVisibleItemPosition < i12 - 2) {
                this.f28306r.setSelected(true);
                this.f28307s.setSelected(false);
                this.f28308t.setSelected(false);
            } else if (iFindFirstVisibleItemPosition <= i12) {
                this.f28306r.setSelected(false);
                this.f28307s.setSelected(true);
                this.f28308t.setSelected(false);
            } else {
                this.f28306r.setSelected(false);
                this.f28307s.setSelected(false);
                this.f28308t.setSelected(true);
            }
        }
    }

    public void D0(DiscountMenuDao.DiscountMenu discountMenu) {
        String type = discountMenu.getType();
        t.d("type : " + type);
        if ("pass".equals(type)) {
            J0(discountMenu);
            return;
        }
        if ("aPass".equals(type)) {
            F0(discountMenu);
            return;
        }
        if ("period_pass".equals(type)) {
            K0(discountMenu);
            return;
        }
        if ("goods".equals(type)) {
            H0(discountMenu);
            return;
        }
        if ("web".equals(type)) {
            M0(discountMenu);
            return;
        }
        if ("native".equals(type)) {
            String detailType = discountMenu.getDetailType();
            t.d("detailType : " + detailType);
            if ("fourSeater".equals(detailType) || ("threeSeater".equals(detailType) || "twoSeater".equals(detailType))) {
                E0(discountMenu);
                return;
            }
            if ("gangneungPass".equals(detailType)) {
                G0(discountMenu);
                return;
            } else if ("pnp".equalsIgnoreCase(detailType)) {
                F0(discountMenu);
                return;
            } else {
                if (DETAIL_TYPE_GIFTICKET.equalsIgnoreCase(detailType)) {
                    L0(discountMenu);
                    return;
                }
                return;
            }
        }
        if ("subcategory".equals(type)) {
            String detailType2 = discountMenu.getDetailType();
            t.d("title : " + discountMenu.getTitle() + ", detailType : " + detailType2 + ", trnGpCd : " + discountMenu.getTrnGpCd());
            s sVar = s.KTX;
            if (sVar.getName().equals(discountMenu.getTitle())) {
                discountMenu.setTrnGpCd(sVar.getCode());
            } else {
                s sVar2 = s.ITX_YOUTH;
                if (sVar2.getName().equals(discountMenu.getTitle())) {
                    discountMenu.setTrnGpCd(sVar2.getCode());
                } else {
                    s sVar3 = s.SAEMAUL;
                    if (sVar3.getName().contains(discountMenu.getTitle())) {
                        discountMenu.setTrnGpCd(sVar3.getCode());
                    } else {
                        s sVar4 = s.MUGUNGHWA;
                        if (sVar4.getName().equals(discountMenu.getTitle())) {
                            discountMenu.setTrnGpCd(sVar4.getCode());
                        }
                    }
                }
            }
            if ("nCard".equalsIgnoreCase(detailType2)) {
                if (s.ITX_YOUTH.getCode().equals(discountMenu.getTrnGpCd())) {
                    discountMenu.setTitle(getString(AbstractC5959j.common_ncard_1));
                    I0(discountMenu, NCard1SectionBookingActivity.class);
                } else {
                    discountMenu.setTitle(getString(AbstractC5959j.common_ncard_1_title));
                    I0(discountMenu, NCard1SectionBookingVersion2Activity.class);
                }
            } else if ("nCard2Seater".equalsIgnoreCase(detailType2)) {
                if (s.ITX_YOUTH.getCode().equals(discountMenu.getTrnGpCd())) {
                    discountMenu.setTitle(getString(AbstractC5959j.common_ncard_2));
                    I0(discountMenu, NCard2SectionBookingActivity.class);
                } else {
                    discountMenu.setTitle(getString(AbstractC5959j.common_ncard_2_title));
                    I0(discountMenu, NCard2SectionBookingVersion2Activity.class);
                }
            } else if ("nCard3Section".equalsIgnoreCase(detailType2)) {
                discountMenu.setTitle(getString(AbstractC5959j.common_ncard_3));
                I0(discountMenu, NCard3SectionBookingActivity.class);
            }
            t.d("trnGpCd : " + discountMenu.getTrnGpCd());
        }
    }

    private void E0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) FamilyBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void F0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) APassBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void G0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) GangneungPassBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void H0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DiscountGoodsBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void I0(DiscountMenuDao.DiscountMenu discountMenu, Class cls) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) cls);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void J0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CommutationBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void K0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PeriodCommutationBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void L0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) GifticketBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void M0(DiscountMenuDao.DiscountMenu discountMenu) {
        String url = discountMenu.getWebData().getUrl();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", z.getWebHost() + url);
        startActivity(intent);
    }

    private void N0() {
    }

    private void O0() {
        this.f28306r.setOnClickListener(this);
        this.f28307s.setOnClickListener(this);
        this.f28308t.setOnClickListener(this);
        this.f28304p.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: y5.a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i8, int i9, int i10, int i11) {
                this.f37618a.C0(view, i8, i9, i10, i11);
            }
        });
    }

    private void P0(List list) {
        if (list.isEmpty()) {
            t.e("할인,정기권 메뉴 못 받아옴");
            return;
        }
        this.f28302n = new ArrayList();
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            DiscountMenuDao.DiscountMenu discountMenu = (DiscountMenuDao.DiscountMenu) it.next();
            if (!"8".equals(discountMenu.getParentId()) || !"native".equals(discountMenu.getType())) {
                if (!this.f28310v || "Y".equals(discountMenu.getEnable())) {
                    this.f28302n.add(discountMenu);
                    t.d("(List 추가) title : " + discountMenu.getTitle() + ", enable : " + discountMenu.getEnable());
                    if ("0".equals(discountMenu.getId())) {
                        t.d("정기승차권 i : " + i8);
                        this.f28309u = i8;
                    }
                    i8++;
                }
            }
        }
        this.f28303o.notifyDataSetChanged();
    }

    private void Q0() {
        m0();
        this.f28306r = (CButton) findViewById(AbstractC5955f.btn_type_1);
        this.f28307s = (CButton) findViewById(AbstractC5955f.btn_type_2);
        this.f28308t = (CButton) findViewById(AbstractC5955f.btn_type_3);
        this.f28304p = (RecyclerView) findViewById(AbstractC5955f.list_discount_menu);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new b());
        this.f28304p.setLayoutManager(gridLayoutManager);
        this.f28305q = new c(getApplicationContext());
        d dVar = new d(this, null);
        this.f28303o = dVar;
        this.f28304p.setAdapter(dVar);
    }

    public void R0() {
        this.f28302n.clear();
        P0(this.f28301m);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_discount_menu);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_type_1 == id) {
            this.f28305q.setTargetPosition(0);
            this.f28304p.getLayoutManager().startSmoothScroll(this.f28305q);
            this.f28306r.setSelected(true);
            this.f28307s.setSelected(false);
            this.f28308t.setSelected(false);
            new Thread(this.f28312x).start();
            return;
        }
        if (AbstractC5955f.btn_type_2 == id) {
            this.f28305q.setTargetPosition(this.f28309u);
            this.f28304p.getLayoutManager().startSmoothScroll(this.f28305q);
            this.f28306r.setSelected(false);
            this.f28307s.setSelected(true);
            this.f28308t.setSelected(false);
            new Thread(this.f28312x).start();
            return;
        }
        if (AbstractC5955f.btn_type_3 != id) {
            super.onClick(view);
            return;
        }
        this.f28305q.setTargetPosition(C6630d.isNotNull(this.f28302n) ? this.f28302n.size() - 1 : this.f28309u);
        this.f28304p.getLayoutManager().startSmoothScroll(this.f28305q);
        this.f28306r.setSelected(false);
        this.f28307s.setSelected(false);
        this.f28308t.setSelected(true);
        new Thread(this.f28312x).start();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_discount_menu_new);
        if (C6630d.isNull(bundle)) {
            N0();
            Q0();
            setText();
            O0();
            B0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_discount_menu == iBaseDao.getId()) {
            DiscountMenuDao.DiscountMenuResponse discountMenuResponse = (DiscountMenuDao.DiscountMenuResponse) iBaseDao.getResponse();
            this.f28301m = discountMenuResponse.getList();
            P0(discountMenuResponse.getList());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    private class d extends RecyclerView.h implements c.a {

        /* renamed from: d */
        final int f28316d;

        /* renamed from: e */
        final int f28317e;

        /* renamed from: f */
        final int f28318f;

        /* renamed from: g */
        final int f28319g;

        private class a extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28321t;

            /* renamed from: u */
            private TextView f28322u;

            /* renamed from: v */
            private CCheckBox f28323v;

            public a(View view) {
                super(view);
                this.f28321t = (TextView) view.findViewById(AbstractC5955f.tv_header_title);
                this.f28322u = (TextView) view.findViewById(AbstractC5955f.tv_header_detail);
                this.f28323v = (CCheckBox) view.findViewById(AbstractC5955f.cb_header_enable);
            }
        }

        private class b extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28325t;

            /* renamed from: u */
            private TextView f28326u;

            /* renamed from: v */
            private ImageView f28327v;

            /* renamed from: w */
            private ImageView f28328w;

            /* renamed from: x */
            private CButton f28329x;

            /* synthetic */ b(d dVar, View view, a aVar) {
                this(view);
            }

            private b(View view) {
                super(view);
                this.f28325t = (TextView) view.findViewById(AbstractC5955f.tv_item_title);
                this.f28326u = (TextView) view.findViewById(AbstractC5955f.tv_item_detail);
                this.f28327v = (ImageView) view.findViewById(AbstractC5955f.iv_item_information);
                this.f28328w = (ImageView) view.findViewById(AbstractC5955f.iv_icon);
                this.f28329x = (CButton) view.findViewById(AbstractC5955f.btn_bottom);
            }
        }

        private class c extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28331t;

            /* renamed from: u */
            private TextView f28332u;

            /* renamed from: v */
            private ImageView f28333v;

            /* renamed from: w */
            private CButton f28334w;

            /* renamed from: x */
            private CButton f28335x;

            /* renamed from: y */
            private CButton f28336y;

            /* synthetic */ c(d dVar, View view, a aVar) {
                this(view);
            }

            private c(View view) {
                super(view);
                this.f28331t = (TextView) view.findViewById(AbstractC5955f.tv_item_title);
                this.f28332u = (TextView) view.findViewById(AbstractC5955f.tv_item_detail);
                this.f28333v = (ImageView) view.findViewById(AbstractC5955f.iv_item_information);
                this.f28334w = (CButton) view.findViewById(AbstractC5955f.bottom_btn_left);
                this.f28335x = (CButton) view.findViewById(AbstractC5955f.bottom_btn_mid);
                this.f28336y = (CButton) view.findViewById(AbstractC5955f.bottom_btn_right);
            }
        }

        /* renamed from: com.korail.talk.ui.menu.discountMenu.NewDiscountMenuActivity$d$d */
        private class C0242d extends RecyclerView.E {

            /* renamed from: t */
            private TextView f28338t;

            /* renamed from: u */
            private TextView f28339u;

            /* renamed from: v */
            private ImageView f28340v;

            /* renamed from: w */
            private CButton f28341w;

            /* renamed from: x */
            private CButton f28342x;

            /* renamed from: y */
            private CButton f28343y;

            /* synthetic */ C0242d(d dVar, View view, a aVar) {
                this(view);
            }

            private C0242d(View view) {
                super(view);
                this.f28338t = (TextView) view.findViewById(AbstractC5955f.tv_item_title);
                this.f28339u = (TextView) view.findViewById(AbstractC5955f.tv_item_detail);
                this.f28340v = (ImageView) view.findViewById(AbstractC5955f.iv_item_information);
                this.f28341w = (CButton) view.findViewById(AbstractC5955f.bottom_btn_left);
                this.f28342x = (CButton) view.findViewById(AbstractC5955f.bottom_btn_mid);
                this.f28343y = (CButton) view.findViewById(AbstractC5955f.bottom_btn_right);
            }
        }

        private d() {
            this.f28316d = 1;
            this.f28317e = 11;
            this.f28318f = 12;
            this.f28319g = 13;
        }

        public DiscountMenuDao.DiscountMenu c(int i8) {
            return (DiscountMenuDao.DiscountMenu) NewDiscountMenuActivity.this.f28302n.get(i8);
        }

        private int d(int i8) {
            switch (i8) {
                case 18:
                    return AbstractC5954e.bg_dream;
                case 19:
                    return AbstractC5954e.bg_young;
                case 20:
                    return AbstractC5954e.bg_mom;
                case 21:
                    return AbstractC5954e.bg_nuri;
                case 22:
                    return AbstractC5954e.bg_kids;
                case 23:
                    return AbstractC5954e.bg_four;
                case 24:
                    return AbstractC5954e.bg_sale;
                default:
                    return AbstractC5954e.bg_sale;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(NewDiscountMenuActivity.this.f28302n)) {
                return 0;
            }
            return NewDiscountMenuActivity.this.f28302n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            String parentId = c(i8).getParentId();
            if (N.isNull(parentId)) {
                return 1;
            }
            if ("8".equals(parentId)) {
                return c(i8).getTitle().equals(s.ITX_YOUTH.getName()) ? 13 : 12;
            }
            return 11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.E e8, int i8) {
            if (e8 instanceof a) {
                a aVar = (a) e8;
                DiscountMenuDao.DiscountMenu discountMenuC = c(i8);
                aVar.f28321t.setText(discountMenuC.getTitle());
                aVar.f28322u.setText(discountMenuC.getDtlDsc());
                if (!"17".equals(NewDiscountMenuActivity.this.f28303o.c(i8).getId())) {
                    aVar.f28323v.setVisibility(8);
                    return;
                } else {
                    aVar.f28323v.setVisibility(0);
                    aVar.f28323v.setOnClickListener(new v4.c(this, i8));
                    return;
                }
            }
            if (e8 instanceof b) {
                b bVar = (b) e8;
                DiscountMenuDao.DiscountMenu discountMenuC2 = c(i8);
                bVar.f28325t.setText(discountMenuC2.getTitle());
                bVar.f28326u.setText(discountMenuC2.getDtlDsc());
                bVar.f28327v.setContentDescription(NewDiscountMenuActivity.this.getString(AbstractC5959j.common_guide));
                bVar.f28327v.setOnClickListener(new v4.c(this, i8));
                if ("17".equals(NewDiscountMenuActivity.this.f28303o.c(i8).getParentId())) {
                    bVar.f28328w.setVisibility(0);
                    bVar.f28328w.setImageResource(d(N.getInteger(c(i8).getId())));
                } else {
                    bVar.f28328w.setVisibility(8);
                }
                bVar.f28329x.setEnabled("Y".equals(discountMenuC2.getEnable()));
                bVar.f28329x.setOnClickListener(new v4.c(this, i8));
                return;
            }
            if (e8 instanceof C0242d) {
                C0242d c0242d = (C0242d) e8;
                DiscountMenuDao.DiscountMenu discountMenuC3 = c(i8);
                c0242d.f28338t.setText(discountMenuC3.getTitle());
                c0242d.f28339u.setText(discountMenuC3.getDtlDsc());
                c0242d.f28340v.setContentDescription(c(i8).getInformation());
                c0242d.f28340v.setOnClickListener(new v4.c(this, i8));
                c0242d.f28341w.setOnClickListener(new v4.c(this, i8));
                c0242d.f28342x.setOnClickListener(new v4.c(this, i8));
                c0242d.f28343y.setVisibility(8);
                if ("Y".equals(discountMenuC3.getEnable())) {
                    c0242d.f28341w.setEnabled(true);
                    c0242d.f28342x.setEnabled(true);
                    return;
                } else {
                    c0242d.f28341w.setEnabled(false);
                    c0242d.f28342x.setEnabled(false);
                    return;
                }
            }
            if (e8 instanceof c) {
                c cVar = (c) e8;
                DiscountMenuDao.DiscountMenu discountMenuC4 = c(i8);
                cVar.f28331t.setText(discountMenuC4.getTitle());
                cVar.f28332u.setText(discountMenuC4.getDtlDsc());
                cVar.f28333v.setContentDescription(c(i8).getInformation());
                cVar.f28333v.setOnClickListener(new v4.c(this, i8));
                cVar.f28334w.setOnClickListener(new v4.c(this, i8));
                cVar.f28335x.setOnClickListener(new v4.c(this, i8));
                cVar.f28336y.setOnClickListener(new v4.c(this, i8));
                if ("Y".equals(discountMenuC4.getEnable())) {
                    cVar.f28334w.setEnabled(true);
                    cVar.f28335x.setEnabled(true);
                    cVar.f28336y.setEnabled(true);
                } else {
                    cVar.f28334w.setEnabled(false);
                    cVar.f28335x.setEnabled(false);
                    cVar.f28336y.setEnabled(false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.E onCreateViewHolder(ViewGroup viewGroup, int i8) {
            RecyclerView.E bVar;
            if (i8 == 1) {
                return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.discount_menu_list_header, viewGroup, false));
            }
            switch (i8) {
                case 11:
                    bVar = new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.discount_menu_list_item, viewGroup, false), null);
                    break;
                case 12:
                    bVar = new C0242d(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.discount_menu_list_item_ncard, viewGroup, false), null);
                    break;
                case 13:
                    bVar = new c(this, LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.discount_menu_list_item_ncard, viewGroup, false), null);
                    break;
                default:
                    return null;
            }
            return bVar;
        }

        @Override // v4.c.a
        public void onCustomClick(View view, int i8) {
            int id = view.getId();
            if (AbstractC5955f.iv_item_information == id) {
                t.d("" + c(i8).getInformation());
                C6637k.getCDialog(NewDiscountMenuActivity.this.K(), 1001, 0, NewDiscountMenuActivity.this.getString(AbstractC5959j.dialog_title)).setContent(c(i8).getInformation()).showDialog();
                return;
            }
            if (AbstractC5955f.btn_bottom == id) {
                NewDiscountMenuActivity.this.D0(c(i8));
                return;
            }
            if (AbstractC5955f.bottom_btn_left == id) {
                ((DiscountMenuDao.DiscountMenu) NewDiscountMenuActivity.this.f28302n.get(i8)).setDetailType("nCard");
                NewDiscountMenuActivity.this.D0(c(i8));
                return;
            }
            if (AbstractC5955f.bottom_btn_mid == id) {
                ((DiscountMenuDao.DiscountMenu) NewDiscountMenuActivity.this.f28302n.get(i8)).setDetailType("nCard2Seater");
                NewDiscountMenuActivity.this.D0(c(i8));
            } else if (AbstractC5955f.bottom_btn_right == id) {
                ((DiscountMenuDao.DiscountMenu) NewDiscountMenuActivity.this.f28302n.get(i8)).setDetailType("nCard3Section");
                NewDiscountMenuActivity.this.D0(c(i8));
            } else if (AbstractC5955f.cb_header_enable == id) {
                NewDiscountMenuActivity.this.f28310v = !r4.f28310v;
                NewDiscountMenuActivity.this.R0();
            }
        }

        /* synthetic */ d(NewDiscountMenuActivity newDiscountMenuActivity, a aVar) {
            this();
        }
    }
}
