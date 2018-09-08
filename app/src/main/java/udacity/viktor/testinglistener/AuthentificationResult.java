package udacity.viktor.testinglistener;

import android.support.annotation.Nullable;

public enum AuthentificationResult {
    SUCCESS,
    ERROR,
    LOADING,
    CANCEL;

    public @Nullable
    String message = null;
}
