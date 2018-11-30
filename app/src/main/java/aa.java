import android.app.Application;

import com.mob.MobSDK;

/**
 * Created by Administrator on 2018/11/29 0029.
 */

public class aa extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
    }
}
