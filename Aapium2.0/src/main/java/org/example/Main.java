package org.example;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import java.io.File;

public class Main {

    public static void main(String[] args) {
//        AppiumServer.start();
    }
}

//package org.example;
//
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;
//import io.appium.java_client.service.local.flags.GeneralServerFlag;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//public class Main {
//    static AppiumDriverLocalService server;
//    public static void main(String[] args) {
//        AppiumServiceBuilder builder = new AppiumServiceBuilder()
//                .withAppiumJS(new File("/home/vikas/.nvm/versions/node/v21.2.0/lib/node_modules/appium/build/lib/appium.js"))
//                .usingDriverExecutable(new File("/home/vikas/.nvm/versions/node/v21.2.0/bin/node"))
//                .usingAnyFreePort()
//                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//                .withStartUpTimeout(60, TimeUnit.SECONDS);// Adjust the timeout as needed
//        server = AppiumDriverLocalService.buildService(builder);
//        server.start();
//
//
////        AppiumServiceBuilder builder = new AppiumServiceBuilder()
////                .withAppiumJS(new File("/home/vikas/.nvm/versions/node/v21.2.0/lib/node_modules/appium/build/lib/appium.js"))
////                .usingDriverExecutable(new File("/home/vikas/.nvm/versions/node/v21.2.0/bin/node"))
////                .usingAnyFreePort();
////                server =  AppiumDriverLocalService.buildService(builder);
////                server.start();
////        System.out.println(server.getUrl());
////        System.out.println(server.isRunning());
//
////        if (server.isRunning()) {
////            System.out.println("Appium server started successfully!");
////        } else {
////            System.out.println("Failed to start Appium server.");
////        }
//        server.stop();
//    }
//}