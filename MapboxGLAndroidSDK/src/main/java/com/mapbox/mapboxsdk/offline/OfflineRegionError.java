package com.mapbox.mapboxsdk.offline;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An Offline Region error
 */
public class OfflineRegionError {

    /**
     * Error code, as a string, self-explanatory.
     */
    @StringDef({REASON_SUCCESS, REASON_NOT_FOUND, REASON_SERVER, REASON_CONNECTION, REASON_OTHER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorReason {}

    public static final String REASON_SUCCESS = "REASON_SUCCESS";
    public static final String REASON_NOT_FOUND = "REASON_NOT_FOUND";
    public static final String REASON_SERVER = "REASON_SERVER";
    public static final String REASON_CONNECTION = "REASON_CONNECTION";
    public static final String REASON_OTHER = "REASON_OTHER";

    private @ErrorReason String reason;

    /**
    /* An error message from the request handler, e.g. a server message or a system message
    /* informing the user about the reason for the failure.
     */
    private String message;

    /*
     * Constructors
     */

    private OfflineRegionError() {
        // For JNI use only
    }

    /*
     * Getters
     */

    public @ErrorReason String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }
}
