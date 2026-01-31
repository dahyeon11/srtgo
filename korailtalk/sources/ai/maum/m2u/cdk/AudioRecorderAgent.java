package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.MicrophoneDTO;
import ai.maum.m2u.cdk.utils.LogUtil;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.AsyncTask;
import j3.AbstractC5820b;

/* loaded from: classes.dex */
public class AudioRecorderAgent extends AsyncTask<Void, Void, Void> {
    private static final String TAG = "AudioRecorderAgent";
    private AudioRecord audioRecord;
    byte[] buffer;
    CdkNative cdkNative;
    private AcousticEchoCanceler echoCanceler;
    String encoding;
    String model;
    MicrophoneDTO.MicrophoneParam param;
    private final int sampleRate;
    String operationSyncId = "";
    String streamId = "";
    private NoiseSuppressor noiseSuppressor = null;

    public AudioRecorderAgent(CdkNative cdkNative, MicrophoneDTO.MicrophoneParam microphoneParam) {
        this.cdkNative = cdkNative;
        this.param = microphoneParam;
        this.sampleRate = microphoneParam.getSpeechParam().getSampleRate();
        this.encoding = microphoneParam.getSpeechParam().getEncoding();
        this.model = microphoneParam.getSpeechParam().getModel();
    }

    private AudioRecord createAudioRecord() {
        int i8 = !this.encoding.equals("LINEAR16") ? 3 : 2;
        int minBufferSize = AudioRecord.getMinBufferSize(this.sampleRate, 16, i8);
        if (minBufferSize == -2 || minBufferSize == -1 || androidx.core.content.a.checkSelfPermission(this.cdkNative.activity, "android.permission.RECORD_AUDIO") != 0) {
            return null;
        }
        AudioRecord audioRecord = new AudioRecord(7, this.sampleRate, 16, i8, minBufferSize);
        if (audioRecord.getState() == 1) {
            if (NoiseSuppressor.isAvailable()) {
                NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(audioRecord.getAudioSessionId());
                this.noiseSuppressor = noiseSuppressorCreate;
                if (noiseSuppressorCreate == null) {
                    LogUtil.d(TAG, "NoiseSuppressor: failed");
                } else {
                    LogUtil.d(TAG, "NoiseSuppressor: ON");
                }
            }
            if (AcousticEchoCanceler.isAvailable()) {
                AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
                this.echoCanceler = acousticEchoCancelerCreate;
                if (acousticEchoCancelerCreate == null) {
                    LogUtil.e(TAG, "echo canceller: failed");
                }
            }
            getOneSampleSize(i8);
            this.buffer = new byte[AbstractC5820b.max(0, minBufferSize)];
            LogUtil.d(TAG, "instance.getState() = INITIALIZED");
        } else {
            audioRecord.release();
            LogUtil.d(TAG, "instance.getState() = UNINITIALIZED");
        }
        return audioRecord;
    }

    static int getOneSampleSize(int i8) {
        if (i8 == 2) {
            return 2;
        }
        if (i8 != 3) {
            return i8 != 4 ? 3 : 4;
        }
        return 1;
    }

    public void clear() throws IllegalStateException {
        if (this.audioRecord != null) {
            NoiseSuppressor noiseSuppressor = this.noiseSuppressor;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
            }
            AcousticEchoCanceler acousticEchoCanceler = this.echoCanceler;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
            }
            this.audioRecord.stop();
            this.audioRecord = null;
        }
    }

    public String getOperationSyncId() {
        return this.operationSyncId;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public boolean isAudioRecordExist() {
        return this.audioRecord != null;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        this.audioRecord = createAudioRecord();
        LogUtil.d(TAG, "onPreExecute : audioRecord = " + this.audioRecord);
        if (this.audioRecord == null) {
            this.cdkNative.notifyMicrophoneStatus(MicrophoneDTO.MicrophoneEvent.STARTING_RECORD, false, false, "Unknown error", "마이크를 열지 못했습니다.", this.operationSyncId);
        }
    }

    public void setStreamOperationIds(String str, String str2) {
        this.streamId = str;
        this.operationSyncId = str2;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) throws IllegalStateException {
        if (this.audioRecord == null) {
            LogUtil.d(TAG, "audioRecord is null");
            this.cdkNative.notifyMicrophoneStatus(MicrophoneDTO.MicrophoneEvent.STARTING_RECORD, true, false, "녹음이 중지되었습니다.", "", this.operationSyncId);
            return null;
        }
        LogUtil.d(TAG, "audioRecord doInBackground");
        try {
            this.audioRecord.startRecording();
            this.cdkNative.notifyMicrophoneStatus(MicrophoneDTO.MicrophoneEvent.STARTING_RECORD, true, false, "", "", this.operationSyncId);
            while (true) {
                if (this.audioRecord.getRecordingState() != 3) {
                    break;
                }
                isCancelled();
                AudioRecord audioRecord = this.audioRecord;
                byte[] bArr = this.buffer;
                int i8 = audioRecord.read(bArr, 0, bArr.length);
                byte[] bArr2 = new byte[i8];
                System.arraycopy(this.buffer, 0, bArr2, 0, i8);
                if (!this.cdkNative.sendStreamBytes(bArr2)) {
                    LogUtil.e(TAG, "cannot send stream, has exception!!");
                    break;
                }
                this.cdkNative.reportStreamSent(this.streamId, this.operationSyncId, i8);
            }
            return null;
        } catch (Exception e8) {
            LogUtil.e(TAG, e8.getMessage());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r42) throws IllegalStateException {
        super.onPostExecute((AudioRecorderAgent) r42);
        LogUtil.d(TAG, "audio recorder onPostExecute");
        if (this.audioRecord != null) {
            NoiseSuppressor noiseSuppressor = this.noiseSuppressor;
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
            }
            AcousticEchoCanceler acousticEchoCanceler = this.echoCanceler;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
            }
            this.audioRecord.stop();
            this.audioRecord = null;
        }
        this.cdkNative.sendStreamEnd();
        this.cdkNative.reportStreamSent(this.streamId, this.operationSyncId, 0);
    }
}
