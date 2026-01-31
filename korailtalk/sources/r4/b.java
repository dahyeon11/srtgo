package R4;

import R4.a;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6542b;
import z4.C6630d;

/* loaded from: classes.dex */
public class b extends C6542b implements a.InterfaceC0070a {

    /* renamed from: a, reason: collision with root package name */
    private a f4445a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f4446b;

    public interface a {
        void scrollToBottom();

        void scrollToView(int i8);
    }

    public b(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
        i();
        setText();
    }

    private void i() {
        View.inflate(getContext(), AbstractC5957h.item_companion_view, this);
        this.f4446b = (ViewGroup) findViewById(AbstractC5955f.v_companion_container);
    }

    private void setText() {
        ((TextView) findViewById(AbstractC5955f.tv_companion_title)).setText(c(AbstractC5959j.common_companion_information, getContext().getString(AbstractC5959j.common_information)));
    }

    public ArrayList<R4.a> getCompanionData() {
        ArrayList<R4.a> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < this.f4446b.getChildCount(); i8++) {
            arrayList.add((R4.a) this.f4446b.getChildAt(i8));
        }
        return arrayList;
    }

    public boolean isValid() {
        for (int i8 = 0; i8 < this.f4446b.getChildCount(); i8++) {
            R4.a aVar = (R4.a) this.f4446b.getChildAt(i8);
            if (!aVar.isValid()) {
                if (!C6630d.isNotNull(this.f4445a)) {
                    return false;
                }
                this.f4445a.scrollToView(getTop() + aVar.getTop());
                return false;
            }
        }
        return true;
    }

    @Override // R4.a.InterfaceC0070a
    public void scrollToView(int i8) {
        if (C6630d.isNotNull(this.f4445a)) {
            this.f4445a.scrollToView(getTop() + i8);
        }
    }

    public void setCompanionDetailView(Bundle bundle, int i8, String str) {
        int i9 = bundle.getInt("TOTAL_PERSON_COUNT");
        int childCount = this.f4446b.getChildCount();
        if (i9 <= 1) {
            this.f4446b.removeAllViews();
            setVisibility(8);
            return;
        }
        if (i9 > childCount) {
            R4.a aVar = new R4.a(getContext());
            aVar.setPersonType(i8);
            aVar.setICompanionDetailView(this);
            aVar.setTitle(c(AbstractC5959j.common_companion_information, String.valueOf(this.f4446b.getChildCount() + 1) + " (" + str + ")"));
            this.f4446b.addView(aVar);
            if (C6630d.isNotNull(this.f4445a)) {
                this.f4445a.scrollToBottom();
            }
        } else {
            int childCount2 = this.f4446b.getChildCount() - 1;
            while (true) {
                if (childCount2 < 0) {
                    break;
                }
                if (i8 == ((R4.a) this.f4446b.getChildAt(childCount2)).getPersonType()) {
                    this.f4446b.removeViewAt(childCount2);
                    break;
                }
                childCount2--;
            }
        }
        setVisibility(0);
    }

    public void setICompanionView(a aVar) {
        this.f4445a = aVar;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g();
    }

    private void h() {
    }
}
