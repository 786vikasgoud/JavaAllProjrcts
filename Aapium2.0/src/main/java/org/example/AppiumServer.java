package org.example;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class AppiumServer {
    static AppiumDriverLocalService server;
    public static void start(){
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withAppiumJS(new File("/home/vikas/.nvm/versions/node/v21.2.0/lib/node_modules/appium/build/lib/appium.js"))
                .usingDriverExecutable(new File("/home/vikas/.nvm/versions/node/v21.2.0/bin/node"))
                .usingPort(4723)
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE);
        server = AppiumDriverLocalService.buildService(builder);
        server.start();
        System.out.println(server.getUrl());
        System.out.println(server.isRunning());
        server.stop();
        System.out.println(server.isRunning());
    }

    public static void main(String[] args) {
        AppiumServer.start();
    }
}
