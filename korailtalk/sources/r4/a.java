package R4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.korail.talk.viewGroup.DropDownSelector;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import y6.C6542b;
import z4.C;
import z4.C6630d;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class a extends C6542b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private int f4436a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f4437b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0070a f4438c;

    /* renamed from: d, reason: collision with root package name */
    private View f4439d;

    /* renamed from: e, reason: collision with root package name */
    private View f4440e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f4441f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f4442g;

    /* renamed from: h, reason: collision with root package name */
    private EditText f4443h;

    /* renamed from: i, reason: collision with root package name */
    private DropDownSelector f4444i;

    /* renamed from: R4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0070a {
        void scrollToView(int i8);
    }

    public a(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
        j();
        setText();
        i();
    }

    private void h() {
        this.f4437b = getContext().getResources().getStringArray(AbstractC5952c.gender);
    }

    private void i() {
        this.f4439d.setOnClickListener(this);
    }

    private void j() {
        View.inflate(getContext(), AbstractC5957h.item_companion_detail_view, this);
        this.f4439d = findViewById(AbstractC5955f.v_companion_detail_header);
        this.f4440e = findViewById(AbstractC5955f.v_companion_detail_body);
        this.f4441f = (TextView) findViewById(AbstractC5955f.tv_companion_detail_title);
        this.f4442g = (EditText) findViewById(AbstractC5955f.et_companion_detail_name);
        this.f4443h = (EditText) findViewById(AbstractC5955f.et_companion_detail_birth_date);
        this.f4444i = (DropDownSelector) findViewById(AbstractC5955f.dds_companion_detail_gender);
    }

    private void setText() {
        this.f4444i.setEntries(this.f4437b, (String[]) null, 0);
    }

    public void expand() {
        if (this.f4439d.isSelected()) {
            this.f4439d.setSelected(false);
            this.f4440e.setVisibility(0);
            if (C6630d.isNotNull(this.f4438c)) {
                this.f4438c.scrollToView(getTop());
            }
        }
    }

    public String getCompanionBirthDate() {
        return N.getText(this.f4443h);
    }

    public String getCompanionName() {
        return N.getText(this.f4442g);
    }

    public String getGender() {
        return this.f4444i.getSelectIndex() == 0 ? "M" : "F";
    }

    public int getPersonType() {
        return this.f4436a;
    }

    public boolean isValid() {
        String strB;
        EditText editText;
        String text = N.getText(this.f4442g);
        String text2 = N.getText(this.f4443h);
        if (text.isEmpty()) {
            strB = b(AbstractC5959j.companion_do_not_input_name);
            editText = this.f4442g;
        } else if (!C.isInvalidName(text)) {
            strB = b(AbstractC5959j.nonmember_check_name_message2);
            editText = this.f4442g;
        } else if (text2.isEmpty() || text2.length() < 8) {
            strB = b(AbstractC5959j.companion_do_not_input_birth_date);
            editText = this.f4443h;
        } else {
            strB = null;
            editText = null;
        }
        if (!N.isNotNull(strB)) {
            return true;
        }
        expand();
        editText.requestFocus();
        C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(strB).showDialog();
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.v_companion_detail_header == view.getId()) {
            boolean zIsSelected = this.f4439d.isSelected();
            this.f4439d.setSelected(!zIsSelected);
            this.f4440e.setVisibility(zIsSelected ? 0 : 8);
            if (zIsSelected && C6630d.isNotNull(this.f4438c)) {
                this.f4438c.scrollToView(getTop());
            }
        }
    }

    public void setICompanionDetailView(InterfaceC0070a interfaceC0070a) {
        this.f4438c = interfaceC0070a;
    }

    public void setPersonType(int i8) {
        this.f4436a = i8;
    }

    public void setTitle(String str) {
        this.f4441f.setText(str);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g();
    }
}
