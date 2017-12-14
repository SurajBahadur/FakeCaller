package fakecaller.com.fakecaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by sys-roid on 14/12/17.
 */

public class FakeCallReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String getFakeName = intent.getStringExtra("FAKENAME");
        String getFakePhoneNumber = intent.getStringExtra("FAKENUMBER");

        Intent intentObject = new Intent(context.getApplicationContext(), FakeRingingActivity.class);
        intentObject.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentObject.putExtra("myfakename", getFakeName);
        intentObject.putExtra("myfakenumber", getFakePhoneNumber);
        context.startActivity(intentObject);
    }
}
