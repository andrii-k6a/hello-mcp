package dev.kook.hello.mcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;

@Service
public class AnnouncementsService {

    private static final Logger log = LoggerFactory.getLogger(AnnouncementsService.class);

    private final Map<Integer, String> announcements = Map.of(
            1, "announcement 1",
            2, "announcement 2",
            3, "announcement 3",
            4, "announcement 4",
            5, "announcement 5"
    );

    @Tool(name = "get_kook_announcements", description = "Get all announcements from Kook")
    public Collection<String> getAnnouncements() {
        return announcements.values();
    }

    @Tool(name = "get_kook_announcement", description = "Get announcement from Kook by id")
    public String getAnnouncement(Integer id) {
        return announcements.getOrDefault(id, "No announcement by id " + id);
    }

}
