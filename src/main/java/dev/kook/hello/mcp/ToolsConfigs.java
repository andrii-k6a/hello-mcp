package dev.kook.hello.mcp;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ToolsConfigs {

    @Bean
    public List<ToolCallback> kookTools(AnnouncementsService announcementsService) {
        return List.of(ToolCallbacks.from(announcementsService));
    }

}
