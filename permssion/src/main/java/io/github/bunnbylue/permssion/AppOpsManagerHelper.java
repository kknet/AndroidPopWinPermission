package io.github.bunnbylue.permssion;

import java.lang.reflect.Field;

/**
 * Created by BunnyBlue on 4/6/16.
 */
public class AppOpsManagerHelper {
    public static int OP_SYSTEM_ALERT_WINDOW = 0;

    public static  void init() {
        try {
            Class AppOpsManager = Class.forName("android.app.AppOpsManager");
            Field field = AppOpsManager.getDeclaredField("OP_SYSTEM_ALERT_WINDOW");
            field.setAccessible(true);
            OP_SYSTEM_ALERT_WINDOW = field.getInt(null);
        } catch (ClassNotFoundException e2) {

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
