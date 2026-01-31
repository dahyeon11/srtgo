package X4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.korail.talk.viewGroup.DropDownSelector;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import r4.f;
import r4.s;
import y6.C6541a;
import z4.C;
import z4.t;

/* loaded from: classes.dex */
public class a extends C6541a implements DropDownSelector.b, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private String f5455a;

    /* renamed from: b, reason: collision with root package name */
    private int f5456b;

    /* renamed from: c, reason: collision with root package name */
    private int f5457c;

    /* renamed from: d, reason: collision with root package name */
    private int f5458d;

    /* renamed from: e, reason: collision with root package name */
    private DropDownSelector f5459e;

    /* renamed from: f, reason: collision with root package name */
    private DropDownSelector f5460f;

    public a(Context context) {
        super(context);
        this.f5455a = s.KTX.getCode();
        this.f5456b = f.MEMBERONE;
        this.f5457c = f.DATETWOMONTH;
        this.f5458d = f.SECTIONONE;
        d();
    }

    private void d() {
        e();
        h();
        g();
        f();
    }

    private void f() {
        this.f5459e.setOnSelectorItemClickListener(this);
        this.f5460f.setOnSelectorItemClickListener(this);
    }

    private void g() {
        this.f5459e.setEntries(getResources().getStringArray(AbstractC5952c.select_date_of_usage_period), (String[]) null, 0);
        this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member1_month2), (String[]) null, 1);
    }

    private void h() {
        View.inflate(getContext(), AbstractC5957h.view_select_number_of_usage_version2, this);
        this.f5459e = (DropDownSelector) findViewById(AbstractC5955f.dds_select_date_of_usage);
        this.f5460f = (DropDownSelector) findViewById(AbstractC5955f.dds_select_count_of_usage);
    }

    public String getDiscountTypeNumber() {
        String str;
        t.d("mMemberType : " + this.f5456b + ", mSectionType : " + this.f5458d + ", mDateType : " + this.f5457c);
        if (this.f5456b == f.MEMBERONE) {
            int i8 = this.f5458d;
            str = i8 == f.SECTIONONE ? this.f5457c == f.DATETWOMONTH ? "B2N23100501" : "B2N23100502" : i8 == f.SECTIONTWO ? this.f5457c == f.DATETWOMONTH ? "B2N23100503" : "B2N23100504" : this.f5457c == f.DATETWOMONTH ? "B2N23100505" : "B2N23100506";
        } else {
            int i9 = this.f5458d;
            str = i9 == f.SECTIONONE ? this.f5457c == f.DATETWOMONTH ? "B2N23100507" : "B2N23100508" : i9 == f.SECTIONTWO ? this.f5457c == f.DATETWOMONTH ? "B2N23100509" : "B2N23100510" : this.f5457c == f.DATETWOMONTH ? "B2N23100511" : "B2N23100512";
        }
        t.d("discountType : " + str);
        return str;
    }

    public String getNumberOfDate() {
        return C.getNumber(this.f5459e.getSelectItem());
    }

    public String getNumberOfUses() {
        return C.getNumber(this.f5460f.getSelectItem());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        if (dropDownSelector.getId() == AbstractC5955f.dds_select_date_of_usage) {
            int selectIndex = this.f5459e.getSelectIndex();
            if (selectIndex == 0) {
                this.f5457c = f.DATETWOMONTH;
            } else {
                this.f5457c = f.DATETHREEMONTH;
            }
            if (f.MEMBERONE == this.f5456b) {
                if (selectIndex == 0) {
                    this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member1_month2), (String[]) null, 0);
                    return;
                } else {
                    this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member1_month3), (String[]) null, 0);
                    return;
                }
            }
            if (selectIndex == 0) {
                this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member2_month2), (String[]) null, 0);
            } else {
                this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member2_month3), (String[]) null, 0);
            }
        }
    }

    public void setNCardMemberType(String str, int i8) {
        t.d("trnGpCd : " + str + ", memberType : " + i8);
        this.f5455a = str;
        this.f5456b = i8;
        if (i8 == f.MEMBERONE) {
            this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member1_month2), (String[]) null, 0);
        } else if (i8 == f.MEMBERTWO) {
            this.f5460f.setEntries(getResources().getStringArray(AbstractC5952c.select_count_of_usage_period_member2_month2), (String[]) null, 0);
        }
    }

    public void setNCardSectionType(int i8) {
        t.d("sectionType : " + i8);
        this.f5458d = i8;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5455a = s.KTX.getCode();
        this.f5456b = f.MEMBERONE;
        this.f5457c = f.DATETWOMONTH;
        this.f5458d = f.SECTIONONE;
        d();
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f5455a = s.KTX.getCode();
        this.f5456b = f.MEMBERONE;
        this.f5457c = f.DATETWOMONTH;
        this.f5458d = f.SECTIONONE;
        d();
    }

    private void e() {
    }
}
