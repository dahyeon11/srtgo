package u5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f37143a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f37144b;

    /* renamed from: c, reason: collision with root package name */
    private int f37145c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f37146d;

    /* renamed from: e, reason: collision with root package name */
    private View f37147e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f37148f;

    public int getArrivalIndex() {
        return this.f37145c;
    }

    public TextView getArrivalMarker() {
        return this.f37146d;
    }

    public ArrayList<Button> getButtonList() {
        return this.f37148f;
    }

    public TextView getDepartMarker() {
        return this.f37144b;
    }

    public int getDepartureIndex() {
        return this.f37143a;
    }

    public View getSelectBox() {
        return this.f37147e;
    }

    public void setArrivalIndex(int i8) {
        this.f37145c = i8;
    }

    public void setArrivalMarker(TextView textView) {
        this.f37146d = textView;
    }

    public void setButtonList(ArrayList<Button> arrayList) {
        this.f37148f = arrayList;
    }

    public void setDepartMarker(TextView textView) {
        this.f37144b = textView;
    }

    public void setDepartureIndex(int i8) {
        this.f37143a = i8;
    }

    public void setSelectBox(View view) {
        this.f37147e = view;
    }
}
