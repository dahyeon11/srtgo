package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i {
    public static final int UNSET = -1;

    /* renamed from: b */
    static HashMap f8166b;

    /* renamed from: a */
    private HashMap f8167a = new HashMap();

    static {
        HashMap map = new HashMap();
        f8166b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            f8166b.put("KeyPosition", j.class.getConstructor(null));
            f8166b.put("KeyCycle", g.class.getConstructor(null));
            f8166b.put("KeyTimeCycle", l.class.getConstructor(null));
            f8166b.put("KeyTrigger", m.class.getConstructor(null));
        } catch (NoSuchMethodException e8) {
            Log.e("KeyFrames", "unable to load", e8);
        }
    }

    public i(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Exception e8;
        d dVar;
        HashMap map;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f8166b.containsKey(name)) {
                        try {
                            dVar = (d) ((Constructor) f8166b.get(name)).newInstance(null);
                            try {
                                dVar.load(context, Xml.asAttributeSet(xmlPullParser));
                                a(dVar);
                            } catch (Exception e9) {
                                e8 = e9;
                                Log.e("KeyFrames", "unable to create ", e8);
                                dVar2 = dVar;
                                eventType = xmlPullParser.next();
                            }
                        } catch (Exception e10) {
                            d dVar3 = dVar2;
                            e8 = e10;
                            dVar = dVar3;
                        }
                        dVar2 = dVar;
                    } else if (name.equalsIgnoreCase("CustomAttribute") && dVar2 != null && (map = dVar2.f8102e) != null) {
                        androidx.constraintlayout.widget.a.parse(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    private void a(d dVar) {
        if (!this.f8167a.containsKey(Integer.valueOf(dVar.f8099b))) {
            this.f8167a.put(Integer.valueOf(dVar.f8099b), new ArrayList());
        }
        ((ArrayList) this.f8167a.get(Integer.valueOf(dVar.f8099b))).add(dVar);
    }

    public void addFrames(o oVar) {
        ArrayList arrayList = (ArrayList) this.f8167a.get(Integer.valueOf(oVar.f8252b));
        if (arrayList != null) {
            oVar.b(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f8167a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.a(((ConstraintLayout.b) oVar.f8251a.getLayoutParams()).constraintTag)) {
                    oVar.a(dVar);
                }
            }
        }
    }

    public ArrayList<d> getKeyFramesForView(int i8) {
        return (ArrayList) this.f8167a.get(Integer.valueOf(i8));
    }

    public Set<Integer> getKeys() {
        return this.f8167a.keySet();
    }
}
