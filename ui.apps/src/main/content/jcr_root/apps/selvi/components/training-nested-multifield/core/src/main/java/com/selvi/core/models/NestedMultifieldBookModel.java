package com.selvi.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

@Model(adaptables = {Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NestedMultifieldBookModel {

    Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    void init() {
        logger.info("Inside Book model Post Construct Method");
    }

    @ValueMapValue
    private String bookname;

    @ValueMapValue
    private String bookdesc;

    public String getBookname() {
        return bookname;
    }

    public String getBookdesc() {
        return bookdesc;
    }

}

