package H;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.r;
import java.util.List;
import java.util.Map;
import z.D0;

/* loaded from: classes.dex */
public interface n {
    D0 createSessionProcessor(Context context);

    Range<Long> getEstimatedCaptureLatencyRange(Size size);

    List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions();

    List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions();

    Size[] getSupportedYuvAnalysisResolutions();

    void init(r rVar);

    boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map);
}
