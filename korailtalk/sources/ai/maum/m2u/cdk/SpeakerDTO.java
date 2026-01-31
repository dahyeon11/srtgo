package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.grpclib.constants.Const;

/* loaded from: classes.dex */
public class SpeakerDTO {

    public static class SpeakerEvent {
        public static String CLOSED = "CLOSED";
        public static String MUTE = "MUTE";
        public static String UNMUTE = "UNMUTE";
    }

    public static class SpeakerFailure {
        public static String SPAEKER_CLOSE_FAILED = "SPAEKER_CLOSE_FAILED";
        public static String SPAEKER_PERMISSION_DENIED = "SPAEKER_PERMISSION_DENIED";
        public static String UNKNOWN = "UNKNOWN";
    }

    public static class SpeakerStatus {
        private String message;
        private String operationSyncId;
        private String eventType = SpeakerEvent.MUTE;
        private boolean speechSynthesizing = false;
        private boolean hasReason = false;
        private String failure = SpeakerFailure.UNKNOWN;

        public SpeakerStatus() {
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

        public boolean isHasReason() {
            return this.hasReason;
        }

        public boolean isSpeechSynthesizing() {
            return this.speechSynthesizing;
        }

        public void setEventType(String str) {
            this.eventType = str;
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

        public void setSpeechSynthesizing(boolean z8) {
            this.speechSynthesizing = z8;
        }
    }
}
