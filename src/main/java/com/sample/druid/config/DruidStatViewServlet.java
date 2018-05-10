package com.sample.druid.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by daiqiang on 18-5-10.
 * alibaba-druid
 */
@WebServlet(urlPatterns = "/druid/*", initParams = {
        @WebInitParam(name="allow", value = ""),
        @WebInitParam(name="deny", value = ""),
        @WebInitParam(name="loginUsername", value = ""),
        @WebInitParam(name="loginPassword", value = ""),
        @WebInitParam(name="resetEnable", value = "false")
})
public class DruidStatViewServlet extends StatViewServlet {
}
