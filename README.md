# Getting Started

- Install Java 21 on your local 
- Install Claude Desktop
- Create config file: /Users/{USER_NAME}/Library/Application Support/Claude/claude_desktop_config.json
- Add mcp server configs:
```json 
{
  "mcpServers": {
    "kook-mcp": {
      "command": "/Users/{USER_NAME}/.sdkman/candidates/java/current/bin/java",
      "args": [
        "-jar",
         "/Users/{USER_NAME}/root/projects/ai/mcp/hello-mcp/build/libs/hello-mcp-0.0.1-SNAPSHOT.jar"
      ],
      "env": {
        "KOOK_MCP_ENV": "example"
      }
    }
  }
}
```
- Run Claude Desktop and ask questions like 'give me a list of kook announcements'

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.5/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.5/gradle-plugin/packaging-oci-image.html)
* [Model Context Protocol Server](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-server-boot-starter-docs.html)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

