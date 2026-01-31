package Q1;

import Q1.c;
import android.view.View;
import java.util.List;
import y1.o;

/* loaded from: classes.dex */
public interface f {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    public interface a {
        void setView(View view);

        boolean start();
    }

    public interface b {
    }

    public interface c {
    }

    void destroy();

    List<String> getAvailableAssetNames();

    String getCustomFormatId();

    a getDisplayOpenMeasurement();

    c.b getImage(String str);

    o getMediaContent();

    CharSequence getText(String str);

    void performClick(String str);

    void recordImpression();
}
