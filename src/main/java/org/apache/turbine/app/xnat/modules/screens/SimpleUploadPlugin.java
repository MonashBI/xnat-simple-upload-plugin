package org.apache.turbine.app.xnat.modules.screens;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.screens.SecureScreen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleUploadPlugin extends SecureScreen {
    @Override
    protected void doBuildTemplate(RunData runData, Context context) throws Exception {
        context.put("dateTime", DATE_FORMAT.format(new Date()));
    }
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd_hhmmss");
}
