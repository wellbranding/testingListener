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

//provide settings in this singleton class
    public void initialize(@NonNull AuthenticationSettings settings1, @Nullable AuthenticationListener listener) {
        this.settings = settings1;
        //save this listener to use it in all activities and notify MainActivity
        mListener = listener;
    }

    public void startAutentification(@NonNull Context context) {
        if (settings == null) {
            throw new IllegalStateException("call IdenfyContoller.getInstance().initialize(...) first");
        } else {
            //Open our SDK activity
            Intent intent = new Intent(context, OurSDKActivity.class);
            context.startActivity(intent);
        }

    }


    private static AuthenticationController instance;

}
