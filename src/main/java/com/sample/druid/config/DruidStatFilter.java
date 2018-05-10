package com.sample.druid.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by daiqiang on 18-5-10.
 * alibaba-druid
 */
@WebFilter(filterName = "druidStatFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter {
}
