package u4;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;
import z4.C6630d;
import z4.C6634h;
import z4.t;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6418b {

    /* renamed from: a, reason: collision with root package name */
    private final String f37121a = "date";

    /* renamed from: b, reason: collision with root package name */
    private a f37122b;

    /* renamed from: c, reason: collision with root package name */
    private DatePickerDialog f37123c;

    /* renamed from: u4.b$a */
    public interface a {
        void onDateSet(DatePicker datePicker, JSONObject jSONObject);
    }

    public C6418b(Context context, final JSONObject jSONObject) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        Calendar calendarFromString = C6634h.getCalendarFromString(jSONObject.optString("date"), "yyyyMMdd");
        this.f37123c = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() { // from class: u4.a
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i8, int i9, int i10) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f37119a.b(jSONObject, datePicker, i8, i9, i10);
            }
        }, calendarFromString.get(1), calendarFromString.get(2), calendarFromString.get(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(JSONObject jSONObject, DatePicker datePicker, int i8, int i9, int i10) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (C6630d.isNotNull(this.f37122b)) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                Calendar calendar = Calendar.getInstance();
                calendar.set(i8, i9, i10);
                jSONObject.put("date", simpleDateFormat.format(calendar.getTime()));
                this.f37122b.onDateSet(datePicker, jSONObject);
            } catch (JSONException e8) {
                t.e(e8.getMessage());
            }
        }
    }

    public void setOnDatePickerSetListener(a aVar) {
        this.f37122b = aVar;
    }

    public void show() {
        if (C6630d.isNotNull(this.f37123c)) {
            this.f37123c.show();
        }
    }
}
