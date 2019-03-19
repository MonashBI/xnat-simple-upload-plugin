package edu.monash.xnat.plugin;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;


@XnatPlugin(value = "simpleUploadPlugin", name = "Simple Upload Plugin")

public class SimpleUploadPlugin {

    @Bean
    public String simpleUploadPluginMessage(){
        return "hello from simple Upload plugin";
    }
}
