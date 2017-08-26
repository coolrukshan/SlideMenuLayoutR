package com.jkb.slidemenu;

/**
 * Created by Rukshan on 8/26/2017.
 */

public interface SlideMenuListener {

    public enum MenuType {
        LEFT(1 << 2),
        RIGHT(1 << 3);

        private final int mValue;
        MenuType(int i) {
            mValue = i;
        }

        public int getValue() {
            return mValue;
        }
    }
    void onSlideMenuFinishChanging(MenuType menuType, boolean status);
}
