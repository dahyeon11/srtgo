package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.grpclib.constants.Const;

/* loaded from: classes.dex */
public class MicrophoneDTO {

    public static class Lang {
        public static String en_US = "en_US";
        public static String ko_KR = "ko_KR";
    }

    public static class MicrophoneEvent {
        public static String CLOSE_FAILURE = "CLOSE_FAILURE";
        public static String CLOSE_SUCCESS = "CLOSE_SUCCESS";
        public static String OPEN_FAILURE = "OPEN_FAILURE";
        public static String OPEN_SUCCESS = "OPEN_SUCCESS";
        public static String STARTING_RECORD = "STARTING_RECORD";
        public static String UNKNOWN = "UNKNOWN";
    }

    public static class MicrophoneFailure {
        public static String MICROPHONE_CLOSE_ERROR = "MICROPHONE_CLOSE_ERROR";
        public static String MICROPHONE_ERROR_UNKNOWN = "MICROPHONE_ERROR_UNKNOWN";
        public static String MICROPHONE_OPEN_ERROR = "MICROPHONE_OPEN_ERROR";
        public static String MICROPHONE_PERMISSION_DENIED = "MICROPHONE_PERMISSION_DENIED";
        public static String MICROPHONE_TIMER_EXPIRED = "MICROPHONE_TIMER_EXPIRED";
        public static String MICROPHONE_UNDER_USE = "MICROPHONE_UNDER_USE";
    }

    public static class MicrophoneParam {
        public SpeechRecognitionParam speechParam = new SpeechRecognitionParam();
        private boolean expectMode = false;
        private int timeoutInMilliseconds = 10000;
        private float miceGain = 0.5f;
        private String operationSyncId = "";

        public static class SpeechRecognitionParam {
            public String encoding = "LINEAR16";
            public int sampleRate = 16000;
            public String lang = Lang.ko_KR;
            public String model = "baseline";
            public boolean singleUtterance = false;

            public String getEncoding() {
                return this.encoding;
            }

            public String getLang() {
                return this.lang;
            }

            public String getModel() {
                return this.model;
            }

            public int getSampleRate() {
                return this.sampleRate;
            }

            public boolean getSingleUtterance() {
                return this.singleUtterance;
            }

            public void setEncoding(String str) {
                this.encoding = str;
            }

            public void setLang(String str) {
                this.lang = str;
            }

            public void setModel(String str) {
                this.model = str;
            }

            public void setSampleRate(int i8) {
                this.sampleRate = i8;
            }

            public void setSingleUtterance(boolean z8) {
                this.singleUtterance = z8;
            }
        }

        public float getMiceGain() {
            return this.miceGain;
        }

        public String getOperationSyncId() {
            return this.operationSyncId;
        }

        public SpeechRecognitionParam getSpeechParam() {
            return this.speechParam;
        }

        public int getTimeoutInMilliseconds() {
            return this.timeoutInMilliseconds;
        }

        public boolean isExpectMode() {
            return this.expectMode;
        }

        public void setExpectMode(boolean z8) {
            this.expectMode = z8;
        }

        public void setMiceGain(float f8) {
            this.miceGain = f8;
        }

        public void setOperationSyncId(String str) {
            this.operationSyncId = str;
        }

        public void setSpeechParam(SpeechRecognitionParam speechRecognitionParam) {
            this.speechParam = speechRecognitionParam;
        }

        public void setTimeoutInMilliseconds(int i8) {
            this.timeoutInMilliseconds = i8;
        }
    }

    public static class MicrophoneStatus {
        private String message;
        private String operationSyncId;
        private String eventType = MicrophoneEvent.UNKNOWN;
        private boolean expectMode = false;
        private boolean hasReason = false;
        private String failure = MicrophoneFailure.MICROPHONE_ERROR_UNKNOWN;

        public MicrophoneStatus() {
            String str = Const.EMPTY_STRING;
            this.message = str;
            this.operationSyncId = str;
        }

        public String getEventType() {
            return this.eventType;
        }

        public String getFailure() {
            return this.failure;
        }

        public String getMessage() {
            return this.message;
        }

        public String getOperationSyncId() {
            return this.operationSyncId;
        }

        public boolean isExpectMode() {
            return this.expectMode;
        }

        public boolean isHasReason() {
            return this.hasReason;
        }

        public void setEventType(String str) {
            this.eventType = str;
        }

        public void setExpectMode(boolean z8) {
            this.expectMode = z8;
        }

        public void setFailure(String str) {
            this.failure = str;
        }

        public void setHasReason(boolean z8) {
            this.hasReason = z8;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setOperationSyncId(String str) {
            this.operationSyncId = str;
        }
    }
}
