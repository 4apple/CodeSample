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
