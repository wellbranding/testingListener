package udacity.viktor.testinglistener;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class AuthenticationController {



    private AuthenticationSettings settings;

    public interface AuthenticationListener {
        void onAutentification(AuthentificationResult result);
    }

    private AuthenticationController() {

    }

    public AuthenticationListener mListener;

    public static AuthenticationController getInstance() {

        if (instance == null) {
            instance = new AuthenticationController();
        }

        return instance;
    }


    public void initialize(@NonNull AuthenticationSettings settings1, @Nullable AuthenticationListener listener) {
        this.settings = settings1;
        mListener = listener;
    }

    public void startAutentification(@NonNull Context context) {
        if (settings == null) {
            throw new IllegalStateException("call IdenfyContoller.getInstance().initialize(...) first");
        } else {
            Intent intent = new Intent(context, OurSDKActivity.class);
            context.startActivity(intent);
        }

    }


    private static AuthenticationController instance;

}
