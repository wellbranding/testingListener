package udacity.viktor.testinglistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

//MainActivity it is activity of apps, which use our SDK
public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivityOtherApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AuthenticationSettings authenticationSettings = new AuthenticationSettings("token", this);
        AuthenticationController authenticationController = AuthenticationController.getInstance();

        authenticationController.initialize(authenticationSettings, new AuthenticationController.AuthenticationListener() {
            @Override
            public void onAutentification(AuthentificationResult result) {
                switch (result){
                    case ERROR:
                        Log.d(TAG,"ERROR: " + result.message);
                        break;
                    case CANCEL:
                        Log.d(TAG,"CANCEL");
                        break;
                    case SUCCESS:
                        Log.d(TAG,"SUCCESS");
                        break;
                }
            }});
        authenticationController.startAutentification(this);
    }
}
