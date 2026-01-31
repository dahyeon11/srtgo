package ai.maum.m2u.cdk;

import B7.a;
import ai.maum.m2u.cdk.utils.LogUtil;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class AudioPlayAgent {
    private static final String TAG = "AudioPlayAgent";
    private byte[] ab_byte;
    private BlockingQueue<byte[]> audioQueue;
    public AudioTrack audioTrack;
    private int bufferSize;
    private final CdkNative cdkNative;
    private a.EnumC0009a encoding;
    private final AtomicLong isPlaying = new AtomicLong(0);
    private String operationSyncId = "";
    private Thread playingThread;
    private int prevHeadPosition_;
    private int sampleRate;
    private int writePosition_;

    /* renamed from: ai.maum.m2u.cdk.AudioPlayAgent$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            AudioPlayAgent.this.playLoop();
        }
    }

    public AudioPlayAgent(CdkNative cdkNative) {
        a.EnumC0009a enumC0009a = a.EnumC0009a.LINEAR16;
        this.encoding = enumC0009a;
        this.playingThread = null;
        this.audioQueue = new LinkedBlockingQueue();
        this.prevHeadPosition_ = 0;
        this.cdkNative = cdkNative;
        init(16000, enumC0009a);
    }

    public void playLoop() throws InterruptedException {
        long id = Thread.currentThread().getId();
        while (this.isPlaying.get() == id) {
            try {
                byte[] bArrTake = this.audioQueue.take();
                StringBuilder sb = new StringBuilder();
                sb.append("audio session:");
                sb.append(this.audioTrack.getAudioSessionId());
                sb.append(", thread: ");
                sb.append(id);
                sb.append(", buffer::");
                sb.append(bArrTake.length);
                this.audioTrack.write(bArrTake, 0, bArrTake.length, 0);
            } catch (InterruptedException unused) {
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("end of playing thread!! isPlaying thread::");
        sb2.append(this.isPlaying.get());
        this.cdkNative.notifySpeakerClose(this.operationSyncId);
    }

    void enqueueAudio(byte[] bArr) {
        for (byte b9 : bArr) {
            byte[] bArr2 = this.ab_byte;
            int i8 = this.writePosition_;
            int i9 = i8 + 1;
            this.writePosition_ = i9;
            bArr2[i8] = b9;
            if (i9 == this.bufferSize) {
                this.writePosition_ = 0;
                this.audioQueue.offer(bArr2);
                this.ab_byte = new byte[this.bufferSize];
            }
        }
    }

    public void init(int i8, a.EnumC0009a enumC0009a) {
        this.encoding = enumC0009a;
        this.sampleRate = i8;
        this.bufferSize = AudioTrack.getMinBufferSize(i8, 4, 2) * 2;
        LogUtil.d(TAG, "> init : buffersize = " + this.bufferSize);
        this.audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i8).setChannelMask(4).build()).setBufferSizeInBytes(this.bufferSize).setTransferMode(1).build();
        this.ab_byte = new byte[this.bufferSize];
    }

    public boolean isExistAudioTrackInstance() {
        return this.audioTrack != null;
    }

    public synchronized void release() {
        stop();
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    void sleep(long j8) throws InterruptedException {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
    }

    public synchronized void start(String str) {
        try {
            if (this.audioTrack == null) {
                init(16000, a.EnumC0009a.LINEAR16);
            }
            this.operationSyncId = str;
            this.audioTrack.play();
            StringBuilder sb = new StringBuilder();
            sb.append("STARTING with ");
            sb.append(str);
            Thread thread = new Thread(new Runnable() { // from class: ai.maum.m2u.cdk.AudioPlayAgent.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() throws InterruptedException {
                    AudioPlayAgent.this.playLoop();
                }
            }, "AudioPlay Thread");
            this.playingThread = thread;
            thread.start();
            this.isPlaying.set(this.playingThread.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop() {
        try {
            this.isPlaying.set(0L);
            this.audioQueue.clear();
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                audioTrack.stop();
            }
            Thread thread = this.playingThread;
            if (thread != null) {
                thread.interrupt();
                this.playingThread = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
