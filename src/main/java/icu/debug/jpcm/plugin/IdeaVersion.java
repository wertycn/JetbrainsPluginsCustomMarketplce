package icu.debug.jpcm.plugin;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "idea-version")
@XmlAccessorType(XmlAccessType.FIELD)
public class IdeaVersion {
    @XmlElement(name = "since-build")
    private String sinceBuild;

    @XmlElement(name = "until_build")
    private String untilBuild;
}
