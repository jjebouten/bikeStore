package com.BikeStore.Controllers;

import com.github.fxrouter.FXRouter;

import java.io.IOException;

public class HomeController {

    public void openBikes() throws IOException {
        FXRouter.goTo("bikes");
    }
}
