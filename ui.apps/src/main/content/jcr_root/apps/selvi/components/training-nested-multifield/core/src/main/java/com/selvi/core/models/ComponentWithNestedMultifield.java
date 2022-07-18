package com.selvi.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ComponentWithNestedMultifield {

    Logger logger = LoggerFactory.getLogger(getClass());

    @ValueMapValue
    private String title;

    @ChildResource
    private List<NestedMultifiedAuthorInfoModel> authors;

    @PostConstruct
    void init() {
        logger.info("Inside Component with nested multifield model Post Construct Method");
    }

    public String getTitle() {
        return title;
    }

    public List<NestedMultifiedAuthorInfoModel> getAuthors() {
        return authors;
    }
}
