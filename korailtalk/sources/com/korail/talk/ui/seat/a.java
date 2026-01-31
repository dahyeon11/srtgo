package com.korail.talk.ui.seat;

import S5.f;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.gridlayout.widget.GridLayout;
import com.korail.talk.network.dao.research.SearchSeatListDao;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.l;
import r4.p;
import v4.c;
import y6.C6543c;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class a extends C6543c implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private float f28658a;

    /* renamed from: b, reason: collision with root package name */
    private int f28659b;

    /* renamed from: c, reason: collision with root package name */
    private int f28660c;

    /* renamed from: d, reason: collision with root package name */
    private SearchSeatListDao.SearchSeatListResponse f28661d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f28662e;

    /* renamed from: f, reason: collision with root package name */
    private TreeMap f28663f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0245a f28664g;

    /* renamed from: h, reason: collision with root package name */
    private GridLayout f28665h;
    public float mSeatH;

    /* renamed from: com.korail.talk.ui.seat.a$a, reason: collision with other inner class name */
    public interface InterfaceC0245a {
        void onSeatSelectionChanged();
    }

    public a(Context context) {
        super(context);
        this.mSeatH = 0.0f;
        this.f28658a = 0.0f;
    }

    private boolean e() {
        return this.f28659b >= getSelectedSeatCount() + 1;
    }

    private GridLayout.o f(f fVar) {
        GridLayout.o oVar = (GridLayout.o) fVar.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) oVar).width = 0;
        ((ViewGroup.MarginLayoutParams) oVar).height = (int) this.mSeatH;
        int i8 = this.f28660c;
        if (i8 == 0) {
            oVar.columnSpec = GridLayout.spec(1, 1.0f);
        } else if (3 == i8) {
            oVar.columnSpec = GridLayout.spec(3, 1.0f);
        } else {
            oVar.columnSpec = GridLayout.spec(2, 1.0f);
        }
        oVar.setMargins(0, 0, 0, (int) this.f28658a);
        oVar.setGravity(112);
        return oVar;
    }

    private GridLayout.o g(f fVar) {
        GridLayout.o oVar = (GridLayout.o) fVar.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) oVar).height = (int) this.mSeatH;
        return oVar;
    }

    private void h() throws NumberFormatException {
        s();
        o();
    }

    private void i() {
        int layout_type = this.f28661d.getLayout_type();
        this.f28660c = layout_type;
        View.inflate(getContext(), layout_type == 0 ? AbstractC5957h.seats_3_columns_1_2_container : 1 == layout_type ? AbstractC5957h.seats_3_columns_2_1_container : 2 == layout_type ? AbstractC5957h.seats_4_columns_container : AbstractC5957h.seats_6_set_container, this);
    }

    private void j() throws NumberFormatException {
        i();
        n();
        r();
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i8, boolean z8, DialogInterface dialogInterface, int i9) {
        if (102 == i9) {
            m(i8, z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(int i8, boolean z8, DialogInterface dialogInterface, int i9) {
        m(i8, z8);
    }

    private void m(int i8, boolean z8) {
        p(i8, z8);
        q(i8, z8);
        if (C6630d.isNotNull(this.f28664g)) {
            this.f28664g.onSeatSelectionChanged();
        }
    }

    private void n() {
        this.f28662e = new ArrayList();
        this.f28663f = new TreeMap();
        float intrinsicHeight = androidx.core.content.a.getDrawable(getContext(), AbstractC5954e.seat_forward_nor).getIntrinsicHeight();
        this.mSeatH = intrinsicHeight;
        this.f28658a = intrinsicHeight / 9.0f;
    }

    private void o() throws NumberFormatException {
        int i8;
        GridLayout.o oVarG;
        List<SearchSeatListDao.Seat> seatList = getSeatList();
        String seat_ary_cd = this.f28661d.getSeat_ary_cd();
        if (seat_ary_cd != null) {
            try {
                i8 = Integer.parseInt(seat_ary_cd);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } else {
            i8 = 4;
        }
        boolean z8 = false;
        for (int i9 = 0; i9 < seatList.size(); i9++) {
            SearchSeatListDao.Seat seat = seatList.get(i9);
            if (i9 % 5 == 0 && i9 < seatList.size() - 5 && !z8) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 5) {
                        break;
                    }
                    if (p.SECOND_FLOOR.getCode().equals(seatList.get(i9 + i10).getRq_seat_att_cd())) {
                        z8 = true;
                        break;
                    }
                    i10++;
                }
                int i11 = i9 + 2;
                if (E4.a.isArrowView(seatList.get(i11)) && z8) {
                    seatList.get(i11).setFloor("BBB");
                }
            }
            f fVar = new f(getContext(), seat);
            fVar.setOnClickListener(new c(this, i9));
            StringBuilder sb = new StringBuilder();
            if (l.RIGHT.getCode().equals(seat.getDir_seat_att_cd())) {
                sb.append(b(AbstractC5959j.seat_select_forward_direct));
            } else {
                sb.append(b(AbstractC5959j.seat_select_backward_direct));
            }
            int i12 = i9 % (i8 + 1);
            if (i12 == 0 || i12 == i8) {
                sb.append(b(AbstractC5959j.seat_select_window_side));
            } else {
                sb.append(b(AbstractC5959j.seat_select_inside));
            }
            sb.append(seat.getSeat_spec());
            this.f28665h.addView(fVar);
            this.f28662e.add(fVar);
            if (E4.a.isArrowView(seat)) {
                sb = new StringBuilder();
                sb.append("▲");
                oVarG = f(fVar);
            } else {
                oVarG = g(fVar);
            }
            fVar.setContentDescription(sb.toString());
            oVarG.setMargins(0, 0, 0, (int) this.f28658a);
            fVar.setLayoutParams(oVarG);
        }
    }

    private void p(int i8, boolean z8) {
        if (z8) {
            this.f28663f.put(Integer.valueOf(i8), getSeatList().get(i8));
        } else {
            this.f28663f.remove(Integer.valueOf(i8));
        }
        ((View) this.f28662e.get(i8)).setSelected(z8);
    }

    private void q(int i8, boolean z8) {
        List<SearchSeatListDao.Seat> seatList = getSeatList();
        SearchSeatListDao.Seat seat = seatList.get(i8);
        if (E4.a.isSpecialRoom(seat)) {
            String sqr_no = seat.getSqr_no();
            for (int i9 = 0; i9 < seatList.size(); i9++) {
                if (sqr_no.equals(seatList.get(i9).getSqr_no())) {
                    p(i9, z8);
                }
            }
        }
    }

    private void r() {
        this.f28665h = (GridLayout) findViewById(AbstractC5955f.seatsGrid);
    }

    private void s() {
        List<SearchSeatListDao.Window> windowList = this.f28661d.getWindowList();
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC5955f.leftWinContainer);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(AbstractC5955f.rightWinContainer);
        float f8 = this.mSeatH / 9.0f;
        for (SearchSeatListDao.Window window : windowList) {
            float st_loc_rt = window.getSt_loc_rt() - 1.0f;
            float f9 = st_loc_rt * 10.0f * f8;
            float cls_loc_rt = ((window.getCls_loc_rt() - 1.0f) - st_loc_rt) * f8 * 10.0f;
            View viewInflate = View.inflate(getContext(), AbstractC5957h.window, null);
            viewGroup.addView(viewInflate);
            int i8 = (int) cls_loc_rt;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i8);
            int i9 = (int) f9;
            layoutParams.setMargins(0, i9, 0, 0);
            viewInflate.setLayoutParams(layoutParams);
            View viewInflate2 = View.inflate(getContext(), AbstractC5957h.window, null);
            viewGroup2.addView(viewInflate2);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i8);
            layoutParams2.setMargins(0, i9, 0, 0);
            viewInflate2.setLayoutParams(layoutParams2);
        }
    }

    private void t(SearchSeatListDao.Seat seat, final int i8, final boolean z8) {
        C6637k.getCDialog(getContext(), 1002, 0, b(AbstractC5959j.dialog_seat_map_select)).setContent(seat.getIntg_msg()).setButtonListener(new DialogInterface.OnClickListener() { // from class: S5.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f4655a.k(i8, z8, dialogInterface, i9);
            }
        }).showDialog();
    }

    private void u(SearchSeatListDao.Seat seat, final int i8, final boolean z8) {
        C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_seat_map_select)).setContent(seat.getIntg_msg()).setButtonListener(new DialogInterface.OnClickListener() { // from class: S5.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f4658a.l(i8, z8, dialogInterface, i9);
            }
        }).showDialog();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v(int r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.getSeatList()
            java.lang.Object r0 = r0.get(r6)
            com.korail.talk.network.dao.research.SearchSeatListDao$Seat r0 = (com.korail.talk.network.dao.research.SearchSeatListDao.Seat) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L2c
            java.lang.String r3 = r0.getVz_msg_dv_cd()
            java.lang.String r4 = "M"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L1f
            r5.u(r0, r6, r7)
            r0 = r1
            goto L2d
        L1f:
            java.lang.String r4 = "Q"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L2c
            r5.t(r0, r6, r7)
            r0 = 2
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 != 0) goto L30
            goto L31
        L30:
            r1 = r2
        L31:
            com.korail.talk.ui.seat.a$a r0 = r5.f28664g
            boolean r0 = z4.C6630d.isNotNull(r0)
            if (r1 != r0) goto L3c
            r5.m(r6, r7)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.seat.a.v(int, boolean):void");
    }

    public List<SearchSeatListDao.Seat> getSeatList() {
        return this.f28661d.getSeatList();
    }

    public int getSelectedSeatCount() {
        return this.f28663f.values().size();
    }

    public ArrayList<SearchSeatListDao.Seat> getSelectedSeatList() {
        return new ArrayList<>(this.f28663f.values());
    }

    @Override // v4.c.a
    public void onCustomClick(View view, int i8) {
        if (e() || view.isSelected()) {
            v(i8, !view.isSelected());
        }
    }

    public void setOnSeatSelectChangeListener(InterfaceC0245a interfaceC0245a) {
        this.f28664g = interfaceC0245a;
    }

    public a(Context context, SearchSeatListDao.SearchSeatListResponse searchSeatListResponse, int i8) throws NumberFormatException {
        super(context);
        this.mSeatH = 0.0f;
        this.f28658a = 0.0f;
        this.f28661d = searchSeatListResponse;
        this.f28659b = i8;
        j();
    }
}
