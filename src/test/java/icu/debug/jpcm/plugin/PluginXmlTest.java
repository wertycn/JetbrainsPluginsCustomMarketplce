package icu.debug.jpcm.plugin;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

class PluginXmlTest {
    @Test
    @DisplayName("实例化时接收一段xml文本")
    void testIns() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("mock/plugin.xml");
        InputStream inputStream = classPathResource.getInputStream();
        Plugin plugin = Plugin.parse(inputStream);
        Assertions.assertEquals("IdeaVim",plugin.getName());
    }

    @Test
    @DisplayName("应该有一个插件值对象")
    void shouldHavePluginValueObject() {


    }


    public static String getTestXml() {
        return "<idea-plugin url=\"https://plugins.jetbrains.com/plugin/164\">\n" +
            "  <name>IdeaVim</name>\n" +
            "  <id>IdeaVIM</id>\n" +
            "  <change-notes>\n" +
            "change log  \n" +
            "  </change-notes>\n" +
            "  <description>   \n" +
            "desc   \n" +
            "   </description>\n" +
            "  <version>0.65</version>\n" +
            "  <vendor>JetBrains</vendor>\n" +
            "  <idea-version since-build=\"202.5103.13\"/>\n" +
            "  <depends>com.intellij.modules.lang</depends>\n" +
            "  <resource-bundle>messages.IdeaVimBundle</resource-bundle>\n" +
            " \n" +
            "</idea-plugin>\n";
    }
}