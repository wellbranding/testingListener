package udacity.viktor.testinglistener;

import android.support.annotation.Nullable;
//result of our SDK authentication
public enum AuthentificationResult {
    SUCCESS,
    ERROR,
    LOADING,
    CANCEL;

    public @Nullable
    String message = null;
}
