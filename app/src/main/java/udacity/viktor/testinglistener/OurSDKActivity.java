package udacity.viktor.testinglistener;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class OurSDKActivity extends AppCompatActivity {
    private static final String TAG = "OurSdk";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AuthentificationResult authentificationResult = AuthentificationResult.ERROR;
        authentificationResult.message ="result";
        AuthenticationController.getInstance().mListener.onAutentification(authentificationResult);
        setContentView(R.layout.activity_sdk);
    }
}
