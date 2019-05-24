package com.amd.ScanView_Services;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ScanView_ServicesApplication extends Application<ScanView_ServicesConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ScanView_ServicesApplication().run(args);
    }

    @Override
    public String getName() {
        return "ScanView_Services";
    }

    @Override
    public void initialize(final Bootstrap<ScanView_ServicesConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ScanView_ServicesConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
