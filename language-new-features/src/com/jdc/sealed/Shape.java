package com.jdc.sealed;

import com.jdc.app.Circle;
import com.jdc.app.Rectangle;
import com.jdc.app.Triangle;

public abstract sealed class Shape permits Rectangle, Circle, Triangle {

}
