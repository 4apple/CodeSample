/**
**2018-7-4
**Use runOnUiThread() method to execute the UI action from a Non-UI thread.
**/
private class ReceiverThread extends Thread {
@Override
public void run() { 
Activity_name.this.runOnUiThread(new Runnable() {

        @Override
        public void run() {
             mAdapter.notifyDataSetChanged();
        }
    });
}




/**
* find apk location in phone by adb shell
* adb shell pm list packages -f | grep "com.XXX.gallery3d"
**/

/**
*   Debug Code，only print when enable value changed

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static int status = 0;

    public void enableScroll(Boolean enable) {
        int curr = enable?1:-1;
        if (status == 0 || curr != status) {
            Log.d(TAG,"enableScroll:" + enable);
            Log.d(TAG,Log.getStackTraceString(new Throwable()));
        }
        mViewPager.enableScroll(enable);
    }
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/




/**
@2017-11-17
How to disable scrolling of AppBarLayout in CoordinatorLayout?
https://stackoverflow.com/questions/34108501/how-to-disable-scrolling-of-appbarlayout-in-coordinatorlayout
Problem

    AppBarLayout scrolls even if the scroll content fits the screen.
    It is because by default we can drag AppBarLayout by touching & dragging AppBarLayout.

Solution

    We will disable "Dragging" behaviour for AppBarLayout.
*/
// Disable "Drag" for AppBarLayout (i.e. User can't scroll appBarLayout by directly touching appBarLayout - User can only scroll appBarLayout by only using scrollContent)
@Override
protected void onCreate(Bundle savedInstanceState) {
    //Activity.onCreate()
    if (appBarLayout.getLayoutParams() != null) {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams();
        AppBarLayout.Behavior appBarLayoutBehaviour = new AppBarLayout.Behavior();
        appBarLayoutBehaviour.setDragCallback(new AppBarLayout.Behavior.DragCallback() {
            @Override
            public boolean canDrag(@NonNull AppBarLayout appBarLayout) {
                return false;
            }
        });
        layoutParams.setBehavior(appBarLayoutBehaviour);
    }
}

/**
*change status bar background style 
*/
 private void setLightStatusBar(boolean lightStatusBar) {
        int vis = getWindow().getDecorView().getSystemUiVisibility();
        if (lightStatusBar) {
            vis |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        } else {
            vis &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        }
        getWindow().getDecorView().setSystemUiVisibility(vis);
    }


/**
* get method name
*/
String name = new Object(){}.getClass().getEnclosingMethod().getName();

/**
*https://stackoverflow.com/questions/15874117/how-to-set-delay-in-android
*/
final Handler handler = new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {
        // Do something after 5s = 5000ms
        buttons[inew][jnew].setBackgroundColor(Color.BLACK);
    }
}, 5000);


/*
* print duration time for show a activity
* adb logcat | grep "Displayed"
11-02 10:36:11.557 1272-1334/? I/ActivityManager: Displayed com.xxx.gallery/.view.album.AlbumDetailActivity: +291ms
11-02 10:36:21.613 1272-1334/? I/ActivityManager: Displayed com.xxx.gallery/.view.album.AlbumDetailActivity: +457ms
*
*/
