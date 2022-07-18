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

@Model(adaptables = {Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NestedMultifiedAuthorInfoModel {

    Logger logger = LoggerFactory.getLogger(getClass());

    @ValueMapValue
    private String authorname;

    @ChildResource
    private List<NestedMultifieldBookModel> books;

    @PostConstruct
    void init() {
        logger.info("Inside AuthorInfo model Post Construct Method");
    }

    public String getAuthorname() {
        return authorname;
    }

    public List<NestedMultifieldBookModel> getBooks() {
        return books;
    }
}
