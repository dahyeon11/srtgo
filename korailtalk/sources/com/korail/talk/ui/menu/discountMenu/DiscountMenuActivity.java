package com.korail.talk.ui.menu.discountMenu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
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
import com.korail.talk.ui.booking.nCard.NCard2SectionBookingActivity;
import com.korail.talk.ui.booking.nCard.NCard3SectionBookingActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.DiscountMenuGrid;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6637k;
import z4.N;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class DiscountMenuActivity extends BaseViewActivity implements ExpandableListView.OnGroupClickListener, AdapterView.OnItemClickListener {
    public static final String DETAIL_TYPE_FOUR_SEAT = "fourSeater";
    public static final String DETAIL_TYPE_GANGNEUNG_PASS = "gangneungPass";
    public static final String DETAIL_TYPE_GIFTICKET = "gifticket";
    public static final String DETAIL_TYPE_N_CARD = "nCard";
    public static final String DETAIL_TYPE_N_CARD_2_SEATER = "nCard2Seater";
    public static final String DETAIL_TYPE_N_CARD_3_SECTION = "nCard3Section";
    public static final String DETAIL_TYPE_PNP_PASS = "pnp";
    public static final String DETAIL_TYPE_THREE_SEAT = "threeSeater";
    public static final String DETAIL_TYPE_TWO_SEAT = "twoSeater";
    public static final String MENU_DISCOUNT = "1";
    public static final String MENU_THEME = "2";
    public static final String TYPE_A_PASS = "aPass";
    public static final String TYPE_GOODS = "goods";
    public static final String TYPE_NATIVE = "native";
    public static final String TYPE_NCARD_MENU_EXPAND = "C";
    public static final String TYPE_NCARD_MENU_SUB = "subcategory";
    public static final String TYPE_PASS = "pass";
    public static final String TYPE_PERIOD_PASS = "period_pass";
    public static final String TYPE_WEB = "web";

    /* renamed from: i, reason: collision with root package name */
    private String f28281i;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f28282j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap f28283k;

    /* renamed from: l, reason: collision with root package name */
    private ExpandableListView f28284l;

    /* renamed from: m, reason: collision with root package name */
    private b f28285m;

    /* JADX INFO: Access modifiers changed from: private */
    class b extends BaseExpandableListAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f28286a;

        private class a extends e {

            /* renamed from: b, reason: collision with root package name */
            private DiscountMenuGrid f28288b;

            private a() {
                super();
            }
        }

        /* renamed from: com.korail.talk.ui.menu.discountMenu.DiscountMenuActivity$b$b, reason: collision with other inner class name */
        private class C0241b extends BaseAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final ArrayList f28290a;

            /* renamed from: b, reason: collision with root package name */
            private final LayoutInflater f28291b;

            @Override // android.widget.Adapter
            public int getCount() {
                if (C6630d.isNull(this.f28290a)) {
                    return 0;
                }
                return this.f28290a.size();
            }

            @Override // android.widget.Adapter
            public long getItemId(int i8) {
                return 0L;
            }

            @Override // android.widget.Adapter
            public View getView(int i8, View view, ViewGroup viewGroup) {
                View viewInflate;
                c cVar;
                if (C6630d.isNull(view)) {
                    cVar = new c();
                    viewInflate = this.f28291b.inflate(AbstractC5957h.row_grid_discount_menu, viewGroup, false);
                    cVar.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_grid_discount_menu_title);
                    cVar.mIvInformation = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_grid_discount_menu_information);
                    viewInflate.setTag(cVar);
                } else {
                    viewInflate = view;
                    cVar = (c) view.getTag();
                }
                b.this.g(getItem(i8), cVar);
                return viewInflate;
            }

            public void update() {
                notifyDataSetChanged();
            }

            private C0241b(ArrayList arrayList) {
                this.f28291b = DiscountMenuActivity.this.getLayoutInflater();
                this.f28290a = arrayList;
            }

            @Override // android.widget.Adapter
            public DiscountMenuDao.DiscountMenu getItem(int i8) {
                return (DiscountMenuDao.DiscountMenu) this.f28290a.get(i8);
            }
        }

        private class c extends e {
            private c() {
                super();
            }
        }

        private class d extends e {

            /* renamed from: b, reason: collision with root package name */
            private ImageView f28294b;

            private d() {
                super();
            }
        }

        private class e {
            public ImageView mIvInformation;
            public TextView mTvTitle;

            private e() {
            }
        }

        private String d(DiscountMenuDao.DiscountMenu discountMenu) {
            return discountMenu.getInformation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e(DiscountMenuDao.DiscountMenu discountMenu) {
            return discountMenu.getEnable().equals("Y");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, String str2, View view) {
            C6637k.getCDialog(DiscountMenuActivity.this.K(), 1001, 0, str).setContent(str2).showDialog();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(DiscountMenuDao.DiscountMenu discountMenu, e eVar) {
            boolean zE = e(discountMenu);
            final String strD = d(discountMenu);
            final String title = discountMenu.getTitle();
            eVar.mTvTitle.setText(discountMenu.getTitle());
            eVar.mTvTitle.setTextColor(Color.parseColor(zE ? "#000000" : "#c8c8c8"));
            if ("subcategory".equals(discountMenu.getType())) {
                eVar.mTvTitle.setEnabled(false);
                eVar.mTvTitle.setTextColor(Color.parseColor("#2c71b7"));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) eVar.mIvInformation.getLayoutParams();
                layoutParams.setMargins(0, 0, 10, 0);
                eVar.mIvInformation.setLayoutParams(layoutParams);
            }
            if (C6630d.isNotNull(discountMenu.getTrnGpCd())) {
                eVar.mIvInformation.setVisibility(8);
                eVar.mTvTitle.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
            } else {
                eVar.mIvInformation.setVisibility(N.isNull(strD) ? 4 : 0);
            }
            if (eVar.mIvInformation.getVisibility() == 0) {
                eVar.mIvInformation.setOnClickListener(new View.OnClickListener() { // from class: com.korail.talk.ui.menu.discountMenu.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28396a.f(title, strD, view);
                    }
                });
            }
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i8, int i9) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i8, int i9, boolean z8, View view, ViewGroup viewGroup) {
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a();
                DiscountMenuDao.DiscountMenu group = getGroup(i8);
                t.d("item - " + group.getId() + ", discountMenu.getIsExpand() - " + group.getIsExpand() + ", title - " + group.getTitle());
                View viewInflate = this.f28286a.inflate(AbstractC5957h.row_child_discount_menu, viewGroup, false);
                aVar.f28288b = (DiscountMenuGrid) viewInflate.findViewById(AbstractC5955f.gv_child_discount_menu);
                if ("C".equals(group.getIsExpand())) {
                    aVar.f28288b.setNumColumns(4);
                }
                viewInflate.setTag(aVar);
                view = viewInflate;
            } else {
                aVar = (a) view.getTag();
            }
            C0241b c0241b = new C0241b(getChild(i8, i9));
            aVar.f28288b.setOnItemClickListener(DiscountMenuActivity.this);
            aVar.f28288b.setAdapter((ListAdapter) c0241b);
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i8) {
            return DiscountMenuActivity.this.f28283k.containsKey(((DiscountMenuDao.DiscountMenu) DiscountMenuActivity.this.f28282j.get(i8)).getId()) ? 1 : 0;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            if (C6630d.isNull(DiscountMenuActivity.this.f28282j)) {
                return 0;
            }
            return DiscountMenuActivity.this.f28282j.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i8) {
            return 0L;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i8, boolean z8, View view, ViewGroup viewGroup) {
            View viewInflate;
            d dVar;
            if (C6630d.isNull(view)) {
                dVar = new d();
                viewInflate = this.f28286a.inflate(AbstractC5957h.row_group_discount_menu, viewGroup, false);
                dVar.mTvTitle = (TextView) viewInflate.findViewById(AbstractC5955f.tv_group_discount_menu_title);
                dVar.mIvInformation = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_group_discount_menu_information);
                dVar.f28294b = (ImageView) viewInflate.findViewById(AbstractC5955f.iv_group_discount_menu_arrow);
                viewInflate.setTag(dVar);
            } else {
                viewInflate = view;
                dVar = (d) view.getTag();
            }
            DiscountMenuDao.DiscountMenu group = getGroup(i8);
            dVar.f28294b.setVisibility(getChildrenCount(i8) > 0 && group.getEnable().equals("Y") ? 0 : 4);
            if (dVar.f28294b.getVisibility() == 0) {
                dVar.f28294b.setBackgroundResource(z8 ? AbstractC5954e.up : AbstractC5954e.down);
            }
            if (group != null) {
                g(group, dVar);
            } else {
                t.e("setView(discountMenu == null");
            }
            return viewInflate;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i8, int i9) {
            return false;
        }

        private b() {
            this.f28286a = DiscountMenuActivity.this.getLayoutInflater();
        }

        @Override // android.widget.ExpandableListAdapter
        public ArrayList<DiscountMenuDao.DiscountMenu> getChild(int i8, int i9) {
            return ((DiscountMenuDao.DiscountMenu) DiscountMenuActivity.this.f28282j.get(i8)).getEnable().equals("Y") ? (ArrayList) DiscountMenuActivity.this.f28283k.get(((DiscountMenuDao.DiscountMenu) DiscountMenuActivity.this.f28282j.get(i8)).getId()) : new ArrayList<>();
        }

        @Override // android.widget.ExpandableListAdapter
        public DiscountMenuDao.DiscountMenu getGroup(int i8) {
            if (C6630d.isNull(DiscountMenuActivity.this.f28282j)) {
                return null;
            }
            return (DiscountMenuDao.DiscountMenu) DiscountMenuActivity.this.f28282j.get(i8);
        }
    }

    private void A0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DiscountGoodsBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void B0(DiscountMenuDao.DiscountMenu discountMenu, Class cls) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) cls);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void C0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) CommutationBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void D0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PeriodCommutationBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void E0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) GifticketBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void F0(DiscountMenuDao.DiscountMenu discountMenu) {
        String url = discountMenu.getWebData().getUrl();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", z.getWebHost() + url);
        startActivity(intent);
    }

    private void G0() {
        this.f28282j = new ArrayList();
        this.f28283k = new HashMap();
        this.f28281i = getIntent().getStringExtra("DISCOUNT_MENU_NO");
    }

    private void H0() {
        this.f28284l.setOnGroupClickListener(this);
    }

    private void I0() {
        m0();
        this.f28284l = (ExpandableListView) findViewById(AbstractC5955f.elv);
        b bVar = new b();
        this.f28285m = bVar;
        this.f28284l.setAdapter(bVar);
    }

    private void setText() {
        if (this.f28281i.equals("1")) {
            setAppTitle(AbstractC5959j.title_discount_menu);
        } else {
            setAppTitle(AbstractC5959j.title_theme_menu);
        }
    }

    private void v0() {
        this.f28282j.clear();
        this.f28283k.clear();
        DiscountMenuDao discountMenuDao = new DiscountMenuDao();
        DiscountMenuDao.DiscountMenuRequest discountMenuRequest = discountMenuDao.new DiscountMenuRequest();
        discountMenuRequest.setMenuNo(this.f28281i);
        discountMenuDao.setRequest(discountMenuRequest);
        executeDao(discountMenuDao);
    }

    private void w0(DiscountMenuDao.DiscountMenu discountMenu) {
        if (this.f28285m.e(discountMenu)) {
            String type = discountMenu.getType();
            if ("pass".equals(type)) {
                C0(discountMenu);
                return;
            }
            if ("aPass".equals(type)) {
                y0(discountMenu);
                return;
            }
            if ("period_pass".equals(type)) {
                D0(discountMenu);
                return;
            }
            if ("goods".equals(type)) {
                A0(discountMenu);
                return;
            }
            if ("web".equals(type)) {
                F0(discountMenu);
                return;
            }
            if ("native".equals(type)) {
                String detailType = discountMenu.getDetailType();
                if ("fourSeater".equals(detailType) || ("threeSeater".equals(detailType) || "twoSeater".equals(detailType))) {
                    x0(discountMenu);
                    return;
                }
                if ("gangneungPass".equals(detailType)) {
                    z0(discountMenu);
                    return;
                }
                if ("nCard".equalsIgnoreCase(detailType)) {
                    B0(discountMenu, NCard1SectionBookingActivity.class);
                    return;
                }
                if ("nCard2Seater".equalsIgnoreCase(detailType)) {
                    B0(discountMenu, NCard2SectionBookingActivity.class);
                    return;
                }
                if ("nCard3Section".equalsIgnoreCase(detailType)) {
                    B0(discountMenu, NCard3SectionBookingActivity.class);
                } else if ("pnp".equalsIgnoreCase(detailType)) {
                    y0(discountMenu);
                } else if (DETAIL_TYPE_GIFTICKET.equalsIgnoreCase(detailType)) {
                    E0(discountMenu);
                }
            }
        }
    }

    private void x0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) FamilyBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void y0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) APassBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    private void z0(DiscountMenuDao.DiscountMenu discountMenu) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) GangneungPassBookingActivity.class);
        intent.putExtra("DISCOUNT_MENU_DATA", discountMenu);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_discount_menu);
        if (C6630d.isNull(bundle)) {
            G0();
            I0();
            setText();
            H0();
            v0();
        }
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i8, long j8) {
        DiscountMenuDao.DiscountMenu group = ((b) expandableListView.getExpandableListAdapter()).getGroup(i8);
        if (group != null) {
            w0(group);
            return false;
        }
        t.e("discountMenu == null");
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
        DiscountMenuDao.DiscountMenu item = ((b.C0241b) adapterView.getAdapter()).getItem(i8);
        if (item != null) {
            w0(item);
        } else {
            t.e("discountMenu == null");
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_discount_menu == iBaseDao.getId()) {
            List<DiscountMenuDao.DiscountMenu> list = ((DiscountMenuDao.DiscountMenuResponse) iBaseDao.getResponse()).getList();
            for (DiscountMenuDao.DiscountMenu discountMenu : list) {
                String parentId = discountMenu.getParentId();
                if (N.isNull(parentId)) {
                    this.f28282j.add(discountMenu);
                } else {
                    ArrayList arrayList = this.f28283k.containsKey(parentId) ? (ArrayList) this.f28283k.get(parentId) : new ArrayList();
                    arrayList.add(discountMenu);
                    this.f28283k.put(parentId, arrayList);
                }
            }
            if (list.isEmpty()) {
                return;
            }
            this.f28285m.notifyDataSetChanged();
            for (int i8 = 0; i8 < this.f28285m.getGroupCount(); i8++) {
                String isExpand = this.f28285m.getGroup(i8).getIsExpand();
                if (isExpand.equals("Y") || isExpand.equals("C")) {
                    this.f28284l.expandGroup(i8);
                }
            }
        }
    }
}
