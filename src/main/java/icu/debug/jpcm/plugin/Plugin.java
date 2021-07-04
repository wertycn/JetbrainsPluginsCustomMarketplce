package icu.debug.jpcm.plugin;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.InputStream;

/**
 * idea  插件jar包中的plugin.xml 文件映射对象
 */
@Getter
@Setter
@XmlRootElement(name = "idea-plugin")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plugin {

    /**
     * 插件名称
     */
    private String name;

    /**
     * plugin.xml 中的id，用于IDE识别插件的唯一ID
     */
    private String id;

    /**
     * 插件版本
     */
    private String version;

    @XmlElement(name = "idea-version")
    private IdeaVersion ideaVersion;

    /**
     * 插件介绍
     */
    private String description;

    @XmlElement(name = "vendor")
    private Vendor vendor;

    /**
     * 更新日志
     */
    @XmlElement(name = "change-note")
    private String change;

    /**
     * 插件下载地址
     */
    private String url;

    /**
     * 解析xml文本流为对象
     * https://www.w3cschool.cn/jaxb2/jaxb2-7s9m2zog.html
     *
     * @param inputStream
     * @return
     */
    @SneakyThrows
    public static Plugin parse(InputStream inputStream) {
        JAXBContext context = JAXBContext.newInstance(Plugin.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Plugin) unmarshaller.unmarshal(inputStream);
    }
}
