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

