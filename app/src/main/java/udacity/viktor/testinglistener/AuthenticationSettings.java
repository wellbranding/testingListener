package udacity.viktor.testinglistener;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class AuthenticationSettings {


    private @NonNull
    String token;
    Context context;

    //creating class with provided settings
    public AuthenticationSettings(@NonNull String token, @NonNull Context context){
        this.token = token;
        this.context  = context;
    }


}
