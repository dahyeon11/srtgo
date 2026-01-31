package com.korail.talk.view.payment.point;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.korail.talk.network.dao.gifticket.GifticketListDao;
import com.korail.talk.viewGroup.DropDownSelector;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6542b;
import z4.C;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;

/* loaded from: classes.dex */
public class GifticketView extends C6542b implements View.OnClickListener, DropDownSelector.b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29484a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f29485b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29486c;

    /* renamed from: d, reason: collision with root package name */
    private int f29487d;

    /* renamed from: e, reason: collision with root package name */
    private List f29488e;

    /* renamed from: f, reason: collision with root package name */
    private String f29489f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f29490g;

    /* renamed from: h, reason: collision with root package name */
    private a f29491h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f29492i;

    /* renamed from: j, reason: collision with root package name */
    private DropDownSelector f29493j;

    public interface a {
        void onRequestAllApply(int i8, Bundle bundle);

        void onRequestApply(int i8, Bundle bundle);
    }

    public GifticketView(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
        j();
        i();
    }

    private Bundle getApplyPointData() {
        Bundle bundle = new Bundle();
        bundle.putInt("USE_POINT", getInputPoints());
        return bundle;
    }

    private void h() {
        this.f29490g = new Bundle();
    }

    private void i() {
        this.f29492i = (EditText) findViewById(AbstractC5955f.usePointsEdit);
        findViewById(AbstractC5955f.applyBtn).setOnClickListener(this);
        findViewById(AbstractC5955f.allApplyBtn).setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.view_gifticket, this);
        this.f29493j = (DropDownSelector) findViewById(AbstractC5955f.gifticketSelector);
    }

    public int getApplyPoint() {
        return this.f29490g.getInt("USE_POINT", 0);
    }

    public int getInputPoints() {
        if (e(this.f29492i).isEmpty()) {
            return 0;
        }
        return Integer.parseInt(C.getNumber(e(this.f29492i)));
    }

    public String getSelectedTicketId() {
        return this.f29489f;
    }

    public boolean isApplyPoint() {
        return this.f29485b;
    }

    public boolean isApplyRequest() {
        return this.f29484a;
    }

    public boolean isIsListLoaded() {
        return this.f29486c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.applyBtn == id) {
            if (C6630d.isNotNull(this.f29491h)) {
                Bundle bundle = new Bundle();
                bundle.putInt("INPUT_POINT", getInputPoints());
                bundle.putInt("ENABLE_POINT", this.f29487d);
                this.f29491h.onRequestApply(6, bundle);
                return;
            }
            return;
        }
        if (AbstractC5955f.allApplyBtn == id && C6630d.isNotNull(this.f29491h)) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ENABLE_POINT", this.f29487d);
            this.f29491h.onRequestAllApply(6, bundle2);
        }
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        if (C6630d.isNotNull(this.f29488e.get(i8))) {
            this.f29489f = ((GifticketListDao.GifticketInfo) this.f29488e.get(i8)).getTkId();
            this.f29487d = Integer.parseInt(((GifticketListDao.GifticketInfo) this.f29488e.get(i8)).getNowPontValNum());
        }
    }

    public void setApplyPoint(boolean z8) {
        if (z8) {
            this.f29490g = getApplyPointData();
        } else {
            this.f29490g.clear();
        }
        this.f29485b = z8;
    }

    public void setApplyRequest(boolean z8) {
        this.f29484a = z8;
        setApplyPoint(false);
        setUsePointsEdit();
    }

    public void setApplyUsePoints() {
        setUsePointsEdit(this.f29490g.getInt("USE_POINT", 0));
    }

    public void setIsLoaded(boolean z8) {
        this.f29486c = z8;
    }

    public void setOnActionListener(a aVar) {
        this.f29491h = aVar;
    }

    public void setSelectorEntry(List<GifticketListDao.GifticketInfo> list) {
        this.f29488e = list;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (size == 0) {
            arrayList.add(b(AbstractC5959j.payment_choice_gifticket_none));
            this.f29493j.setClickable(false);
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(Integer.parseInt(list.get(i8).getNowPontValNum()) + "원(" + C6634h.convertFormat(list.get(i8).getUseClsDt(), "yyyyMMdd", "yyyy.MM.dd") + ")");
            }
            this.f29493j.setOnSelectorItemClickListener(this);
        }
        this.f29493j.setEntries(C6625A.toArray(arrayList), (String[]) null, 0);
        this.f29487d = Integer.parseInt(list.get(0).getNowPontValNum());
    }

    public void setUsePointsEdit(int i8) {
        this.f29492i.setText(String.valueOf(i8));
    }

    public void setUsePointsEdit() {
        this.f29492i.setText((CharSequence) null);
    }

    public GifticketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
